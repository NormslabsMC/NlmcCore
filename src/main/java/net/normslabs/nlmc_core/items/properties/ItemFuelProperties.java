/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 02:42
 */

package net.normslabs.nlmc_core.items.properties;


import net.normslabs.nlmc_core.abstracts.BuildableV3;
import net.normslabs.nlmc_core.abstracts.BuilderV3;
import net.normslabs.nlmc_core.items.abstracts.ItemDescriptorV2;

public class ItemFuelProperties extends BuildableV3<ItemFuelProperties, ItemFuelProperties.Builder> {
    private final ItemDescriptorV2<?,?,?> parentDescriptor;
    private int burnTimeInTicks;
    
    public ItemFuelProperties(ItemDescriptorV2<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
        this.burnTimeInTicks = Integer.MIN_VALUE;
    }
    
    @Override
    public void validateForBuild() {
        if (this.burnTimeInTicks == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("ItemFuelProperties burnTimeInTicks value must be set.");
        }
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    public int getBurnTimeInTicks() {
        return this.burnTimeInTicks;
    }
    
    protected void setBurnTimeInTicks(int burnTimeInTicks) {
        this.burnTimeInTicks = burnTimeInTicks;
    }
    
    public class Builder extends BuilderV3<Builder, ItemFuelProperties> {
        
        public Builder(ItemFuelProperties initialBuildable) {
            super(initialBuildable);
        }
        
        public Builder setBurnTimeInTicks(int burnTimeInTicks) {
            this.buildable.burnTimeInTicks = burnTimeInTicks;
            return this.self();
        }
        
    }
    
}
