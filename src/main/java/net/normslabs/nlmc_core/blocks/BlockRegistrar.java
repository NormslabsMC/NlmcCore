/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:52
 */

package net.normslabs.nlmc_core.blocks;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.normslabs.nlmc_core.blocks.abstracts.IBlockDescriptor;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractDeferredRegistrar;
import net.normslabs.nlmc_core.rendering.NlmcBlockColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockRegistrar extends AbstractDeferredRegistrar<BlockDescriptor<?,?,?,?,? extends Block>, Block> {
    private final HashMap<NlmcBlockColor, List<BlockDescriptor<?,?,?,?,? extends Block>>> BLOCK_COLOR_MAP = new HashMap<>();
    
    public BlockRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar, Registries.BLOCK);
    }
    
    protected void registerBlockItem(BlockItemDescriptor descriptor) {
    
    }
    
    
    public void onCreativeModeTabContentBuild(final BuildCreativeModeTabContentsEvent event) {
    
    }
    
    public void onRegisterBlockColorHandlers(final RegisterColorHandlersEvent.Block event) {
    
    }
    
    public void onDatagen(GatherDataEvent event) {
    
    }
    
    private void registerItemColor(BlockDescriptor<?,?,?,?,? extends Block> descriptor) {
        if (descriptor.getModelDescriptor().getColorDescriptor().needsRegistration()) {
            NlmcBlockColor matchingExistingBlockColor = null;
            for (NlmcBlockColor blockColor : this.BLOCK_COLOR_MAP.keySet()) {
                if (blockColor.equals(descriptor.getModelDescriptor().getColorDescriptor())) {
                    matchingExistingBlockColor = blockColor;
                    break;
                }
            }
            if (matchingExistingBlockColor != null) {
                this.BLOCK_COLOR_MAP.get(matchingExistingBlockColor).add(descriptor);
            } else {
                List<BlockDescriptor<?,?,?,?,? extends Block>> blockColorDescriptors = new ArrayList<>();
                blockColorDescriptors.add(descriptor);
                this.BLOCK_COLOR_MAP.put(descriptor.getModelDescriptor().getColorDescriptor(), blockColorDescriptors);
            }
        }
    }
}
