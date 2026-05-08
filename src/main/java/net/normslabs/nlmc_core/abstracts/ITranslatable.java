/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 03:15
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.translations.TranslationDictionary;
import net.normslabs.nlmc_core.translations.TranslationDictionaryV2;

import java.util.Map;

/**
 * Interface for objects that have translation values to register and process
 * during data-generation.
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 01:45
 */
public interface ITranslatable {
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> The registration process
     * is handled automatically by the NLMC platform.
     * <p>
     * Returns the object's translation values in the form of a {@link TranslationDictionaryV2}.
     * Used by the language provider to generate the language data.
     *
     * @return the object's translation values.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:25
     */
    TranslationDictionaryV2 getTranslations();
    
    /**
     * Adds a generic translation value to the object based on the locale, key and value.
     * These translations have no effect in and of themselves and need to be handled manually.<br>
     * <strong>For item/block name translations, use
     * {@link IHasDisplayedName#addDisplayNameTranslation(Locales, String) addDisplayNameTranslation(Locales, String)}
     * instead.</strong><br>
     * <strong>For item/block tooltips translations, use {@link IHasTooltips#addTooltip(Map) addTooltip(Map&lt;Locales, String&gt;)}
     * instead.</strong>
     *
     * @param locale the {@link Locales Locale} the translation is in.
     * @param translationKey the translation key.
     * @param translationValue the translation value.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:29
     */
    void addTranslation(Locales locale, String translationKey, String translationValue);
    
    /**
     * Adds generic translation values to the object based on locale and map of keys and values.<br>
     * <code>Map format: { String: translationKey, String: translationValue }</code><br>
     * These translations have no effect in and of themselves and need to be handled manually.<br>
     * <strong>For item/block name translations, use
     * {@link IHasDisplayedName#addDisplayNameTranslation(Locales, String) addDisplayNameTranslation(Locales, String)}
     * instead.</strong><br>
     * <strong>For item/block tooltips translations, use {@link IHasTooltips#addTooltip(Map) addTooltip(Map&lt;Locales, String&gt;)}
     * instead.</strong>
     *
     * @param locale the {@link Locales Locale} the translations are in.
     * @param translations the map of the translation values.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:37
     */
    void addTranslations(Locales locale, Map<String, String> translations);
    
    /**
     * Adds generic translation values to the object based on a map of locales, keys and values.<br>
     * <code>Map format: { String: translationKey, Map: { Locales: locale, String: translationValue } }</code><br>
     * These translations have no effect in and of themselves and need to be handled manually.<br>
     * <strong>For item/block name translations, use
     * {@link IHasDisplayedName#addDisplayNameTranslation(Locales, String) addDisplayNameTranslation(Locales, String)}
     * instead.</strong><br>
     * <strong>For item/block tooltips translations, use {@link IHasTooltips#addTooltip(Map) addTooltip(Map&lt;Locales, String&gt;)}
     * instead.</strong>
     *
     * @param translationsMap The map of translations to add.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:41
     */
    void addTranslations(Map<String, Map<Locales, String>> translationsMap);
    
    /**
     * Adds generic translation values to the object based on a {@link TranslationDictionaryV2} object.<br>
     * These translations have no effect in and of themselves and need to be handled manually.<br>
     * <strong>For item/block name translations, use
     * {@link IHasDisplayedName#addDisplayNameTranslation(Locales, String) addDisplayNameTranslation(Locales, String)}
     * instead.</strong><br>
     * <strong>For item/block tooltips translations, use {@link IHasTooltips#addTooltip(Map) addTooltip(Map&lt;Locales, String&gt;)}
     * instead.</strong>
     *
     * @param translationsDictionary The translation dictionary of the translations to add.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:43
     */
    void addTranslations(TranslationDictionaryV2 translationsDictionary);
    
}
