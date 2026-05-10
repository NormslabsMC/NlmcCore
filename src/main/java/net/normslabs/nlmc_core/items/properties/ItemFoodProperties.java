/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:32
 */

package net.normslabs.nlmc_core.items.properties;


import net.minecraft.world.effect.MobEffectInstance;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemFoodProperties extends AbstractBuildable<ItemFoodProperties, ItemFoodProperties.Builder> {
    private final ItemDescriptor<?,?,?> parentDescriptor;
    private int nutrition;
    private float saturationModifier;
    private boolean isAlwaysEatable;
    private boolean isMeat;
    private boolean isFast;
    private final List<Supplier<MobEffectInstance>> effects;
    
    public ItemFoodProperties(ItemDescriptor<?,?,?> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
        this.nutrition = Integer.MIN_VALUE;
        this.saturationModifier = Float.MIN_VALUE;
        this.isMeat = false;
        this.isFast = false;
        this.isAlwaysEatable = true;
        this.effects = new ArrayList<>();
    }
    
    @Override
    public void validateForBuild() {
        if (this.nutrition == Integer.MIN_VALUE) {
            throw new ValidationException("ItemFoodProperties nutrition value must be set.");
        }
        if (this.saturationModifier == Float.MIN_VALUE) {
            throw new ValidationException("ItemFoodProperties saturation modifier value must be set.");
        }
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    
    public int getNutrition() {
        return this.nutrition;
    }
    
    public float getSaturationModifier() {
        return this.saturationModifier;
    }
    
    public boolean alwaysEatable() {
        return this.isAlwaysEatable;
    }
    
    public boolean isFast() {
        return this.isFast;
    }
    
    public boolean isMeat() {
        return this.isMeat;
    }
    
    public List<Supplier<MobEffectInstance>> getEffects() {
        return this.effects;
    }
    
    
    protected void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }
    
    protected void setSaturationModifier(float saturationModifier) {
        this.saturationModifier = saturationModifier;
    }
    
    protected void setAlwaysEatable(boolean alwaysEatable) {
        this.isAlwaysEatable = alwaysEatable;
    }
    
    protected void setIsFast(boolean fast) {
        this.isFast = fast;
    }
    
    protected void setIsMeat(boolean meat) {
        this.isMeat = meat;
    }
    
    protected void addEffect(Supplier<MobEffectInstance> effect) {
        this.effects.add(effect);
    }
    
    
    public class Builder extends AbstractBuilder<Builder, ItemFoodProperties> {
        
        public Builder(ItemFoodProperties initialBuildable) {
            super(initialBuildable);
        }
        
        
        public Builder setNutrition(int nutrition) {
            this.buildable.nutrition = nutrition;
            return this.self();
        }
        
        public Builder setSaturationModifier(float saturationModifier) {
            this.buildable.saturationModifier = saturationModifier;
            return this.self();
        }
        
        public Builder setAlwaysEatable(boolean alwaysEatable) {
            this.buildable.isAlwaysEatable = alwaysEatable;
            return this.self();
        }
        
        public Builder setIsFast(boolean fast) {
            this.buildable.isFast = fast;
            return this.self();
        }
        
        public Builder setIsMeat(boolean meat) {
            this.buildable.isMeat = meat;
            return this.self();
        }
        
        public Builder addEffect(Supplier<MobEffectInstance> effect) {
            this.buildable.effects.add(effect);
            return this.self();
        }
    }
}
