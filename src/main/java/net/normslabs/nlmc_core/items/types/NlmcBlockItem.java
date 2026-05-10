/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 01:57
 */

package net.normslabs.nlmc_core.items.types;


import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NlmcBlockItem extends BlockItem {
    
    private final ItemDescriptor<?,?,?> itemDescriptor;
    
    
    public NlmcBlockItem(BlockDescriptor<?,?,?,?,? extends Block> blockDescriptor) {
        super(blockDescriptor.get(), blockDescriptor.getBlockItemProperties().getItemDescriptor().getMcItemProperties());
        this.itemDescriptor = blockDescriptor.getBlockItemProperties().getItemDescriptor();
    }
    
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level worldLevel, List<Component> tooltipsList,
                                TooltipFlag tooltipFlag) {
        this.itemDescriptor.getTooltipDictionaryKeys().forEach((key) -> {
            tooltipsList.add(Component.translatable(key));
        });
        super.appendHoverText(itemStack, worldLevel, tooltipsList, tooltipFlag);
    }
    
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if (this.itemDescriptor.isFuel()) {
            return this.itemDescriptor.getFuelProperties().getBurnTimeInTicks();
        }
        return 0;
    }
}
