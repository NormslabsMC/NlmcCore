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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemTierDescriptor {
    private final String tierName;
    private final int miningLevel;
    private final int durability;
    private final float miningSpeed;
    private final float damageBonus;
    private final int enchantability;
    private final TagKey<Block> requiredToolBlockTag;
    private final Supplier<Ingredient> repairIngredient;
    private final List<Object> lowerTiers;
    private final List<Object> higherTiers;
    private Tier createdTier = null;
    
    public ItemTierDescriptor(String tierName, int miningLevel, int durability, float miningSpeed, float damageBonus,
                              int enchantability, TagKey<Block> requiredToolBlockTag, Supplier<Ingredient> repairIngredient) {
        this.tierName = tierName;
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.damageBonus = damageBonus;
        this.enchantability = enchantability;
        this.requiredToolBlockTag = requiredToolBlockTag;
        this.repairIngredient = repairIngredient;
        this.lowerTiers = new ArrayList<>();
        this.higherTiers = new ArrayList<>();
    }
    
    public ItemTierDescriptor(String tierName, Tier tier) {
        this.tierName = tierName;
        this.miningLevel = tier.getLevel();
        this.durability = tier.getUses();
        this.miningSpeed = tier.getSpeed();
        this.damageBonus = tier.getAttackDamageBonus();
        this.enchantability = tier.getEnchantmentValue();
        this.requiredToolBlockTag = tier.getTag();
        this.repairIngredient = tier::getRepairIngredient;
        this.lowerTiers = new ArrayList<>();
        this.higherTiers = new ArrayList<>();
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
    
    public List<Object> getHigherTiers() {
        return this.higherTiers;
    }
    
    public List<Object> getLowerTiers() {
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
    
    public Tier buildTier() {
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
    
    public ItemTierDescriptor addLowerTiers(List<Tier> lowerTiers) {
        this.lowerTiers.addAll(lowerTiers);
        return this;
    }
    
    public ItemTierDescriptor addHigherTiers(List<Tier> higherTiers) {
        this.higherTiers.addAll(higherTiers);
        return this;
    }
    
}
