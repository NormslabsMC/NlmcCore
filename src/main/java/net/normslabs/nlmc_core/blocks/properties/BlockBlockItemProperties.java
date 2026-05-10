/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 22:25
 */

package net.normslabs.nlmc_core.blocks.properties;


import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModel;
import net.normslabs.nlmc_core.items.types.NlmcBlockItem;

public class BlockBlockItemProperties<
        TItemModel extends IItemModel<TItemModel, TItemModelBuilder>,
        TItemModelBuilder extends IBuilder<TItemModelBuilder, TItemModel>> {
    
    private final BlockDescriptor<?,?, TItemModel, TItemModelBuilder, ? extends Block> parentDescriptor;
    private final ItemDescriptor<TItemModel, TItemModelBuilder, NlmcBlockItem> itemDescriptor;
    
    public  BlockBlockItemProperties(BlockDescriptor<?, ?, TItemModel, TItemModelBuilder, ? extends Block> parentDescriptor,
                                     ItemDescriptor<TItemModel, TItemModelBuilder, NlmcBlockItem> itemDescriptor) {
        this.parentDescriptor = parentDescriptor;
        this.itemDescriptor = itemDescriptor;
    }
    
    public ItemDescriptor<TItemModel, TItemModelBuilder, NlmcBlockItem> getItemDescriptor() {
        return itemDescriptor;
    }
}
