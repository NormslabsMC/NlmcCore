/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 02:42
 */

package net.normslabs.nlmc_core.items.properties;


import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.loot.LootModifierDescriptor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemLootProperties extends AbstractBuildable<ItemLootProperties, ItemLootProperties.Builder> {
    private final ItemDescriptor<?,?,?> parentDescriptor;
    private Set<LootModifierDescriptor<?>> descriptors;
    
    public ItemLootProperties(ItemDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
        this.descriptors = new HashSet<>();
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
    
    public Set<LootModifierDescriptor<?>> getDescriptors() {
        return this.descriptors;
    }
    
    public void setDescriptors(Set<LootModifierDescriptor<?>> descriptors) {
        this.descriptors = descriptors;
    }
    
    public class Builder extends AbstractBuilder<Builder, ItemLootProperties> {
        
        public Builder(ItemLootProperties initialBuildable) {
            super(initialBuildable);
        }
        
        
        
    }
    
}
