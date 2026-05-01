/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:58
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.translations.Locales;

import java.util.List;

public interface IItemDescriptor extends IRegistrable<Item>, IHasItemModelDescriptor {
    
    Item.Properties buildProperties();
    
    List<ResourceKey<CreativeModeTab>> getCreativeTabs();
    
    void addItemNameTranslation(Locales locale, String translationValue);
    
    void addItemTooltipTranslation(Locales locale, String translationValue);
    
    void addItemCreativeModeTab(ResourceKey<CreativeModeTab> creativeModeTab);

}
