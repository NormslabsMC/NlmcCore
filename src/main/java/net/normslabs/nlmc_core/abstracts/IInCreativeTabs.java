/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 03:15
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

import java.util.List;
import java.util.Set;

/**
 * Interface for descriptor objects that can be displayed in creative mode tabs.
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 02:35
 */
public interface IInCreativeTabs {
    
    /**
     * Returns the set of creative tabs the object should be added to.
     *
     * @return the set of creative tabs the object should be added to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:36
     */
    Set<ResourceKey<CreativeModeTab>> getCreativeTabs();
    
    /**
     * Add the object to a creative mode tab.
     *
     * @param creativeTab The creative mode tab to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:36
     */
    void addToCreativeTab(ResourceKey<CreativeModeTab> creativeTab);
    
    /**
     * Adds to object to a list of creative mode tabs.
     *
     * @param creativeTabs The list of creative mode tabs to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:44
     */
    void addToCreativeTabs(List<ResourceKey<CreativeModeTab>> creativeTabs);
    
}
