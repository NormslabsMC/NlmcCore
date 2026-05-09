/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 22:43
 */

package net.normslabs.nlmc_core.translations;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractManager;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class NlmcTranslationRegistrar extends AbstractManager {
    private final TranslationDictionary globalDictionary;
    private final Map<Locales, NlmcTranslationProvider> translationProviders;
    
    public NlmcTranslationRegistrar(NlmcRegistrar parentRegistrar) {
        super(parentRegistrar);
        this.globalDictionary = new TranslationDictionary();
        this.translationProviders = new HashMap<>();
    }
    
    
    @Override
    public void initialize(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(this::onDatagen);
    }
    
    public void registerTranslations(TranslationDictionary dictionary) {
        this.globalDictionary.merge(dictionary);
    }
    
    public void registerIndividualTranslation(Locales locale, String translationKey, String translationValue) {
        this.globalDictionary.addTranslation(locale, translationKey, translationValue);
    }
    
    protected void onDatagen(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        
        this.globalDictionary.getTranslations().forEach((key, translations) -> {
            translations.forEach((locale, value) -> {
                if (!this.translationProviders.containsKey(locale)) {
                    this.translationProviders.put(locale, new NlmcTranslationProvider(this.nlmcRegistrar, locale, packOutput));
                }
                this.translationProviders.get(locale).registerTranslation(key, value);
            });
        });
        
        this.translationProviders.forEach((locale, translationProvider) -> {
            gen.addProvider(event.includeClient(), translationProvider);
        });
    }
}
