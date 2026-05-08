/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 04:02
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.translations.Locales;

import java.util.Map;

/**
 * Interface for object descriptors that have an on-screen translatable display name.
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 03:30
 */
public interface IHasDisplayedName extends ITranslatable {
    
    /**
     * Returns the translation key of the object's display name
     *
     * @return the translation key of the object's display name
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:30
     */
    String getDisplayNameDictionaryKey();
    
    /**
     * Adds a translation value for the object's display name for a specific
     * locale.
     *
     * @param locale the locale the translation value is for.
     * @param translation the translation value.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:31
     */
    void addDisplayNameTranslation(Locales locale, String translation);
    
    /**
     * Adds translation values for the object's display name.
     *
     * @param translationsMap The map of locales and their translation values to add.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-07 23:08
     */
    void addDisplayNameTranslations(Map<Locales, String> translationsMap);
    
}
