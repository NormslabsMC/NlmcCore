/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 02:54
 */

package net.normslabs.nlmc_core.items.types;


import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NlmcAxeItem extends AxeItem {
    
    private final ItemDescriptor<?,?,?> descriptor;
    
    public NlmcAxeItem(ItemDescriptor<?,?,?> descriptor) {
        super(descriptor.getToolProperties().getToolTier(),
              descriptor.getToolProperties().getAttackDamage(),
              descriptor.getToolProperties().getBaseAttackSpeed(),
              descriptor.getMcItemProperties());
        this.descriptor = descriptor;
    }
    
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level worldLevel, List<Component> tooltipsList,
                                TooltipFlag tooltipFlag) {
        this.descriptor.getTooltipDictionaryKeys().forEach((key) -> {
            tooltipsList.add(Component.translatable(key));
        });
        super.appendHoverText(itemStack, worldLevel, tooltipsList, tooltipFlag);
    }
    
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if (this.descriptor.isFuel()) {
            return this.descriptor.getFuelProperties().getBurnTimeInTicks();
        }
        return 0;
    }
}
