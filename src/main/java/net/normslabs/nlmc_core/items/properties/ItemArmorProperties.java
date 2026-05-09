/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 02:42
 */

package net.normslabs.nlmc_core.items.properties;


import net.minecraft.world.item.Tier;
import net.normslabs.nlmc_core.abstracts.Buildable;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.items.enums.ArmorTypes;

public class ItemArmorProperties extends Buildable<ItemArmorProperties, ItemArmorProperties.Builder> {
    private final ItemDescriptor<?,?,?> parentDescriptor;
    private ArmorTypes armorType;
    private Tier armorTier;
    private int defaultDurability = Integer.MIN_VALUE;
    
    public ItemArmorProperties(ItemDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
    
    @Override
    public void validateForBuild() {
        if (this.armorType == null) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemArmorProperties armorType value must be set.");
        }
        if (this.armorTier == null) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemArmorProperties armorTier value must be set.");
        }
        if (this.defaultDurability == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemArmorProperties defaultDurability value must be set.");
        }
    }
    
    public Tier getArmorTier() {
        return this.armorTier;
    }
    
    public ArmorTypes getArmorType() {
        return this.armorType;
    }
    
    public int getDefaultDurability() {
        return this.defaultDurability;
    }
    
    public ItemDescriptor<?, ?, ?> getParentDescriptor() {
        return this.parentDescriptor;
    }
    
    protected void setArmorTier(Tier armorTier) {
        this.armorTier = armorTier;
    }
    
    protected void setArmorType(ArmorTypes armorType) {
        this.armorType = armorType;
    }
    
    protected void setDefaultDurability(int defaultDurability) {
        this.defaultDurability = defaultDurability;
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
        // nothing special to do here
    }
    
    public class Builder extends net.normslabs.nlmc_core.abstracts.Builder<Builder, ItemArmorProperties> {
        
        public Builder(ItemArmorProperties initialBuildable) {
            super(initialBuildable);
        }
        
        public Builder setArmorTier(Tier armorTier) {
            this.buildable.armorTier = armorTier;
            return this.self();
        }
        
        public Builder setArmorType(ArmorTypes armorType) {
            this.buildable.armorType = armorType;
            return this.self();
        }
        
        public Builder setDefaultDurability(int defaultDurability) {
            this.buildable.defaultDurability = defaultDurability;
            return this.self();
        }
        
    }
    
}
