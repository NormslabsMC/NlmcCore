/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 23:09
 */

package net.normslabs.nlmc_core.translations;


import java.util.HashMap;
import java.util.Map;

public class TranslationDictionary {
    private final Map<Locales, Map<String, String>> internalMap;
    
    public TranslationDictionary() {
        this.internalMap = new HashMap<>();
    }
    
    public void addTranslation(Locales locale, String translationKey, String translationValue) {
        if (!this.internalMap.containsKey(locale)) {
            this.internalMap.put(locale, new HashMap<>());
        }
        this.internalMap.get(locale).put(translationKey, translationValue);
    }
    
    public void addTranslations(Locales locale, Map<String, String> translations) {
        translations.forEach((key, value) -> this.addTranslation(locale, key, value));
    }
    
    public void addTranslations(Map<Locales, Map<String, String>> map) {
        map.forEach((locale, subMap) ->
                            subMap.forEach((key, value) -> this.addTranslation(locale, key, value)));
    }
    
    public void merge(TranslationDictionary dictionary) {
        this.addTranslations(dictionary.getTranslations());
    }
    
    public Map<Locales, Map<String, String>> getTranslations() {
        return this.internalMap;
    }
}
