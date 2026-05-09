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
    private final NlmcRegistrar nlmcRegistrar;
    private final Locales locale;
    
    public NlmcTranslationProvider(NlmcRegistrar nlmcRegistrar, Locales locale, PackOutput output) {
        super(output, nlmcRegistrar.getModNamespace(), locale.getCode().toLowerCase());
        this.nlmcRegistrar = nlmcRegistrar;
        this.locale = locale;
        this.translations = new HashMap<>();
    }
    
    public Locales getLocale() {
        return this.locale;
    }
    
    @Override
    protected void addTranslations() {
        this.translations.forEach(this::add);
    }
    
    public void registerTranslation(String translationKey, String translationValue) {
        this.translations.put(translationKey, translationValue);
    }
}
