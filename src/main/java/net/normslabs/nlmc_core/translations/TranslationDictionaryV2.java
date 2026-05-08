/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 23:09
 */

package net.normslabs.nlmc_core.translations;


import java.util.HashMap;
import java.util.Map;

public class TranslationDictionaryV2 {
    private final Map<String, Map<Locales, String>> internalMap;
    
    public TranslationDictionaryV2() {
        this.internalMap = new HashMap<>();
    }
    
    public void addTranslation(Locales locale, String translationKey, String translationValue) {
        if (!this.internalMap.containsKey(translationKey)) {
            this.internalMap.put(translationKey, new HashMap<>());
        }
        this.internalMap.get(translationKey).put(locale, translationValue);
    }
    
    public void addTranslations(Locales locale, Map<String, String> translations) {
        translations.forEach((key, value) -> this.addTranslation(locale, key, value));
    }
    
    public void addTranslations(Map<String, Map<Locales, String>> map) {
        map.forEach((key, subMap) ->
                            subMap.forEach((locale, value) -> this.addTranslation(locale, key, value)));
    }
    
    public void merge(TranslationDictionaryV2 dictionary) {
        this.addTranslations(dictionary.getTranslations());
    }
    
    public Map<String, Map<Locales, String>> getTranslations() {
        return this.internalMap;
    }
}
