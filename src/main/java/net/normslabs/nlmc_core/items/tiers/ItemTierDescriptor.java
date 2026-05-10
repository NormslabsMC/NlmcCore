/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 03:10
 */

package net.normslabs.nlmc_core.items.tiers;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.utils.BooleanUtils;

import java.util.*;
import java.util.function.Supplier;

public class ItemTierDescriptor extends AbstractBuildable<ItemTierDescriptor, ItemTierDescriptor.Builder> implements Supplier<Tier> {
    private final String tierName;
    private final int miningLevel;
    private final int durability;
    private final float miningSpeed;
    private final float damageBonus;
    private final int enchantability;
    private final TagKey<Block> requiredToolBlockTag;
    private final Supplier<Ingredient> repairIngredient;
    private final Set<Object> lowerTiers;
    private final Set<Object> higherTiers;
    private Tier createdTier = null;
    
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
    
    public ItemTierDescriptor(String tierName, int miningLevel, int durability, float miningSpeed, float damageBonus,
                              int enchantability, TagKey<Block> requiredToolBlockTag, Supplier<Ingredient> repairIngredient) {
        super();
        this.tierName = tierName;
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.damageBonus = damageBonus;
        this.enchantability = enchantability;
        this.requiredToolBlockTag = requiredToolBlockTag;
        this.repairIngredient = repairIngredient;
        this.lowerTiers = new HashSet<>();
        this.higherTiers = new HashSet<>();
    }
    
    public ItemTierDescriptor(String tierName, Tier tier) {
        super();
        this.tierName = tierName;
        this.miningLevel = tier.getLevel();
        this.durability = tier.getUses();
        this.miningSpeed = tier.getSpeed();
        this.damageBonus = tier.getAttackDamageBonus();
        this.enchantability = tier.getEnchantmentValue();
        this.requiredToolBlockTag = tier.getTag();
        this.repairIngredient = tier::getRepairIngredient;
        this.lowerTiers = new HashSet<>();
        this.higherTiers = new HashSet<>();
    }
    
    public String getTierName() {
        return this.tierName;
    }
    
    public float getDamageBonus() {
        return this.damageBonus;
    }
    
    public int getDurability() {
        return this.durability;
    }
    
    public int getEnchantability() {
        return this.enchantability;
    }
    
    public Set<Object> getHigherTiers() {
        return this.higherTiers;
    }
    
    public Set<Object> getLowerTiers() {
        return this.lowerTiers;
    }
    
    public int getMiningLevel() {
        return this.miningLevel;
    }
    
    public float getMiningSpeed() {
        return this.miningSpeed;
    }
    
    public Supplier<Ingredient> getRepairIngredient() {
        return this.repairIngredient;
    }
    
    public TagKey<Block> getRequiredToolBlockTag() {
        return this.requiredToolBlockTag;
    }
    
    @Override
    public Tier get() {
        if (this.createdTier == null) {
            this.createdTier = new ForgeTier(
                    this.miningLevel,
                    this.durability,
                    this.miningSpeed,
                    this.damageBonus,
                    this.enchantability,
                    this.requiredToolBlockTag,
                    this.repairIngredient);
        }
        return this.createdTier;
    }
    
    public ItemTierDescriptor addLowerTier(Tier lowerTier) {
        this.lowerTiers.add(lowerTier);
        return this;
    }
    
    public ItemTierDescriptor addHigherTier(Tier higherTier) {
        this.higherTiers.add(higherTier);
        return this;
    }
    
    public ItemTierDescriptor addLowerTiers(Collection<Tier> lowerTiers) {
        this.lowerTiers.addAll(lowerTiers);
        return this;
    }
    
    public ItemTierDescriptor addHigherTiers(Collection<Tier> higherTiers) {
        this.higherTiers.addAll(higherTiers);
        return this;
    }
    
    
    
    public int hashCode() {
        return this.tierName.hashCode();
    }
    
    public boolean equals(Object other) {
        if (!(other instanceof ItemTierDescriptor otherDescriptor)) {
            return false;
        } else if (other == this) {
            return true;
        } else {
            return BooleanUtils.and(
                    Objects.equals(this.tierName, otherDescriptor.tierName),
                    this.miningLevel == otherDescriptor.miningLevel,
                    this.durability == otherDescriptor.durability,
                    this.miningSpeed == otherDescriptor.miningSpeed,
                    this.damageBonus == otherDescriptor.damageBonus,
                    this.enchantability == otherDescriptor.enchantability,
                    this.requiredToolBlockTag == otherDescriptor.requiredToolBlockTag,
                    this.repairIngredient == otherDescriptor.repairIngredient
            );
        }
    }
    
    public class Builder extends AbstractBuilder<Builder, ItemTierDescriptor> {
        
        protected Builder(ItemTierDescriptor initialBuildable) {
            super(initialBuildable);
        }
    }
    
}
