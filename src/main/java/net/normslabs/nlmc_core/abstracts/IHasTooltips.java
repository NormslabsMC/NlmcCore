/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 03:58
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.translations.Locales;

import java.util.List;
import java.util.Map;

/**
 * Interface for object descriptors that have on-screen translatable tooltips.
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 03:32
 */
public interface IHasTooltips extends ITranslatable {
    
    /**
     * Returns the next tooltip index. This is only used to generate different
     * translation keys when adding multiple tooltips.
     *
     * @return the next tooltip index.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:33
     */
    int getNextTooltipIndex();
    
    /**
     * Returns the list of tooltips translation keys that were added to the
     * object.
     *
     * @return the list of tooltips translation keys of the object.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:34
     */
    List<String> getTooltipDictionaryKeys();
    
    /**
     * Adds a translatable tooltip for the object. All translations for that
     * tooltip must be provided in a single map of locale => translation value
     * associations.
     *
     * @param tooltipTranslations The map of translation values for the tooltip
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:35
     */
    void addTooltip(Map<Locales, String> tooltipTranslations);
    
    /**
     * Adds a list of translatable tooltips for the object. The translations for a
     * single tooltip must be provided in a map of locale => translation value
     * associations.
     *
     * @param tooltips The list og tooltips to add
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-07 23:26
     */
    void addTooltips(List<Map<Locales, String>> tooltips);
    
}
