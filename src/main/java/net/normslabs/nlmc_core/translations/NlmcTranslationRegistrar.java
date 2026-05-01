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
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.abstracts.AbstractRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class NlmcTranslationRegistrar extends AbstractRegistrar {
    private final TranslationDictionary globalDictionary;
    private final Map<Locales, NlmcTranslationProvider> translationProviders;
    
    public NlmcTranslationRegistrar(NlmcRegistrar parentRegistrar) {
        super(parentRegistrar);
        this.globalDictionary = new TranslationDictionary();
        this.translationProviders = new HashMap<>();
    }
    
    
    public void registerTranslations(TranslationDictionary dictionary) {
        this.globalDictionary.merge(dictionary);
    }
    
    public void registerIndividualTranslation(Locales locale, String translationKey, String translationValue) {
        this.globalDictionary.addTranslation(locale, translationKey, translationValue);
    }
    
    @Override
    protected void onRegister(final RegisterEvent event) {
    
    }
    
    @Override
    protected void onDatagen(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        
        this.translationProviders.forEach((locale, translationProvider) -> {
            gen.addProvider(event.includeClient(), translationProvider);
        });
    }
    
}
