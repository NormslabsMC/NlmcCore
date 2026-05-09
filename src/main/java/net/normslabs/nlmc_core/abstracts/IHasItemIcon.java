/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 16:47
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public interface IHasItemIcon {
    
    Supplier<ItemStack> getItemIcon();
    
    void setItemIcon(Supplier<Item> iconItemSupplier);
    
}
