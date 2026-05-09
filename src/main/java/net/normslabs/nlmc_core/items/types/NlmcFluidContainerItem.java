/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-02 05:42
 */

package net.normslabs.nlmc_core.items.types;


import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NlmcFluidContainerItem extends Item {
    protected final ItemDescriptor<?,?> descriptor;
    private final int capacity;
    
    public NlmcFluidContainerItem(ItemDescriptor<?,?> descriptor, int capacity) {
        super(descriptor.getMcItemProperties());
        this.descriptor = descriptor;
        this.capacity = capacity;
    }
    
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        
        // Raytrace to find fluid in the world (like a water bottle)
        BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
        
        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos pos = hitResult.getBlockPos();
            // FluidUtil handles the complex logic of filling/draining from the world or a tank
            if (FluidUtil.interactWithFluidHandler(player, hand, level, pos, hitResult.getDirection())) {
                return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
            }
        }
        return InteractionResultHolder.pass(stack);
    }
    
    @Override
    public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        return new FluidHandlerItemStack(stack, capacity);
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
    
    @Override
    public boolean isBarVisible(ItemStack stack) {
        // Only show the bar if there is actually fluid inside
        return FluidUtil.getFluidContained(stack).map(fluidStack -> fluidStack.getAmount() > 0).orElse(false);
    }
    
    @Override
    public int getBarWidth(ItemStack stack) {
        // Calculate the percentage filled (standard bar is 13 pixels wide)
        return FluidUtil.getFluidContained(stack)
                        .map(fluidStack -> Math.round(13.0F * (float) fluidStack.getAmount() / (float) this.capacity))
                        .orElse(0);
    }
    
    @Override
    public int getBarColor(ItemStack stack) {
        // You can make the bar blue for water, or keep it standard
        // Hex code: 0x3F76E4 is a nice water blue
        return 0x3F76E4;
    }
    
}
