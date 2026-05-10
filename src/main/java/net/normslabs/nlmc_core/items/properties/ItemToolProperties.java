/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:41
 */

package net.normslabs.nlmc_core.items.properties;


import net.minecraft.world.item.Tier;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.items.enums.ToolTypes;

public class ItemToolProperties extends AbstractBuildable<ItemToolProperties, ItemToolProperties.Builder> {
    private final ItemDescriptor<?,?,?> parentDescriptor;
    private ToolTypes toolType;
    private Tier toolTier;
    private int defaultDurability = Integer.MIN_VALUE;
    private float attackDamage = Float.MIN_VALUE;
    private float baseAttackSpeed = Float.MIN_VALUE;
    
    public ItemToolProperties(ItemDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
    
    @Override
    public void validateForBuild() {
        if (this.toolType == null) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemToolProperties toolType value must be set.");
        }
        if (this.toolTier == null) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemToolProperties toolTier value must be set.");
        }
        if (this.defaultDurability == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemToolProperties defaultDurability value must be set.");
        }
        if (this.attackDamage == Float.MIN_VALUE) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemToolProperties attackDamage value must be set.");
        }
        if (this.baseAttackSpeed == Float.MIN_VALUE) {
            throw new IllegalArgumentException(this.parentDescriptor.getIdentifier()+": ItemToolProperties baseAttackSpeed value must be set.");
        }
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public ToolTypes getToolType() {
        return this.toolType;
    }
    
    public Tier getToolTier() {
        return this.toolTier;
    }
    
    public int getDefaultDurability() {
        return this.defaultDurability;
    }
    
    public float getAttackDamage() {
        return this.attackDamage;
    }
    
    public float getBaseAttackSpeed() {
        return this.baseAttackSpeed;
    }
    
    
    protected void setToolType(ToolTypes toolType) {
        this.toolType = toolType;
    }
    
    protected void setToolTier(Tier toolTier) {
        this.toolTier = toolTier;
    }
    
    protected void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }
    
    protected void setBaseAttackSpeed(float baseAttackSpeed) {
        this.baseAttackSpeed = baseAttackSpeed;
    }
    
    protected void setDefaultDurability(int defaultDurability) {
        this.defaultDurability = defaultDurability;
    }
    
    
    public class Builder extends AbstractBuilder<Builder, ItemToolProperties> {
        
        public Builder(ItemToolProperties initialBuildable) {
            super(initialBuildable);
        }
        
        
        public Builder setToolType(ToolTypes toolType) {
            this.buildable.toolType = toolType;
            return this.self();
        }
        
        public Builder setToolTier(Tier toolTier) {
            this.buildable.toolTier = toolTier;
            return this.self();
        }
        
        public Builder setAttackDamage(float attackDamage) {
            this.buildable.attackDamage = attackDamage;
            return this.self();
        }
        
        public Builder setBaseAttackSpeed(float baseAttackSpeed) {
            this.buildable.baseAttackSpeed = baseAttackSpeed;
            return this.self();
        }
        
        public Builder setDefaultDurability(int defaultDurability) {
            this.buildable.defaultDurability = defaultDurability;
            return this.self();
        }
        
    }
    
}
