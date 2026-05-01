/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:58
 */

package net.normslabs.nlmc_core.translations;


import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.HashMap;
import java.util.Map;

public class NlmcTranslationProvider extends LanguageProvider {
    private final Map<String, String> translations;
    private final NlmcRegistrar parentRegistrar;
    private final String locale;
    
    public NlmcTranslationProvider(NlmcRegistrar parentRegistrar, PackOutput output, String modid, String locale) {
        super(output, modid, locale.toLowerCase());
        this.parentRegistrar = parentRegistrar;
        this.locale = locale.toLowerCase();
        this.translations = new HashMap<>();
    }
    
    @Override
    protected void addTranslations() {
    
    }
    
    public void registerTranslation(String translationKey, String translationValue) {
        this.translations.put(translationKey, translationValue);
    }
}
