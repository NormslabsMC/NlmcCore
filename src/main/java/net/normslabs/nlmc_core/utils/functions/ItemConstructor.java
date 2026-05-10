/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-25 22:47
 */

package net.normslabs.nlmc_core.utils.functions;


import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.items.ItemDescriptor;

@FunctionalInterface
public interface ItemConstructor<TItem extends Item, TItemDescriptor extends ItemDescriptor<?, ?, TItem>> {
    TItem create(TItemDescriptor arg1);
}
