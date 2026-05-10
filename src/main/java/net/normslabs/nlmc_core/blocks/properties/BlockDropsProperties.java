/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 22:21
 */

package net.normslabs.nlmc_core.blocks.properties;


import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;

import java.util.Map;
import java.util.function.Supplier;

public class BlockDropsProperties extends AbstractBuildable<BlockDropsProperties, BlockDropsProperties.Builder> {
    
    private final BlockDescriptor<?,?,?> parentDescriptor;
    private int experienceAmount = 0;
    private Map<Supplier<Item>, Integer> onBreakDrops;
    
    public BlockDropsProperties(BlockDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
    
    @Override
    public void validateForBuild() {
    
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public class Builder extends AbstractBuilder<Builder, BlockDropsProperties> {
        
        protected Builder(BlockDropsProperties initialBuildable) {
            super(initialBuildable);
        }
    }
}
