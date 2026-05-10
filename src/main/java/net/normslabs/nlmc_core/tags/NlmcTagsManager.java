/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 10:43
 */

package net.normslabs.nlmc_core.tags;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.normslabs.nlmc_core.datagen.NlmcBlockTagsProvider;
import net.normslabs.nlmc_core.datagen.NlmcFluidTagsProvider;
import net.normslabs.nlmc_core.datagen.NlmcItemTagsProvider;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractManager;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.utils.TagUtils;
import net.normslabs.nlmc_core.utils.UniqueSupplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class NlmcTagsManager extends AbstractManager {
    private final Map<Supplier<? extends Item>, List<TagKey<Item>>> itemTagAssociations;
    private final Map<TagKey<Item>, List<TagKey<Item>>> tagItemTagAssociations;
    
    private final Map<Supplier<? extends Block>, List<TagKey<Block>>> blockTagAssociations;
    private final Map<TagKey<Block>, List<TagKey<Block>>> tagBlockTagAssociations;
    
    private final Map<Supplier<? extends Fluid>, List<TagKey<Fluid>>> fluidTagAssociations;
    private final Map<TagKey<Fluid>, List<TagKey<Fluid>>> tagFluidTagAssociations;
    
    private final Map<ResourceKey<Biome>, List<TagKey<Biome>>> biomeTagAssociations;
    private final Map<TagKey<Biome>, List<TagKey<Biome>>> tagBiomeTagAssociations;
    
    private final Map<ResourceKey<Enchantment>, List<TagKey<Enchantment>>> enchantmentTagAssociations;
    private final Map<TagKey<Enchantment>, List<TagKey<Enchantment>>> tagEnchantmentTagAssociations;
    
    private final Map<ResourceKey<Potion>, List<TagKey<Potion>>> potionTagAssociations;
    private final Map<TagKey<Potion>, List<TagKey<Potion>>> tagPotionTagAssociations;
    
    private final Map<Supplier<? extends EntityType<?>>, List<TagKey<EntityType<?>>>> entityTypeTagAssociations;
    private final Map<TagKey<EntityType<?>>, List<TagKey<EntityType<?>>>> tagEntityTypeTagAssociations;
    
    public NlmcTagsManager(NlmcRegistrar nlmcRegistrar) {
        super(nlmcRegistrar);
        this.itemTagAssociations = new HashMap<>();
        this.tagItemTagAssociations = new HashMap<>();
        this.blockTagAssociations = new HashMap<>();
        this.tagBlockTagAssociations = new HashMap<>();
        this.fluidTagAssociations = new HashMap<>();
        this.tagFluidTagAssociations = new HashMap<>();
        this.biomeTagAssociations = new HashMap<>();
        this.tagBiomeTagAssociations = new HashMap<>();
        this.enchantmentTagAssociations = new HashMap<>();
        this.tagEnchantmentTagAssociations = new HashMap<>();
        this.potionTagAssociations = new HashMap<>();
        this.tagPotionTagAssociations = new HashMap<>();
        this.entityTypeTagAssociations = new HashMap<>();
        this.tagEntityTypeTagAssociations = new HashMap<>();
        
    }
    
    @Override
    public void initialize(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(this::onDatagen);
    }
    
    public Map<Supplier<? extends Block>, List<TagKey<Block>>> getBlockTagAssociations() {
        return this.blockTagAssociations;
    }
    public Map<Supplier<? extends Fluid>, List<TagKey<Fluid>>> getFluidTagAssociations() {
        return this.fluidTagAssociations;
    }
    public Map<Supplier<? extends Item>, List<TagKey<Item>>> getItemTagAssociations() {
        return this.itemTagAssociations;
    }
    public Map<ResourceKey<Biome>, List<TagKey<Biome>>> getBiomeTagAssociations() {
        return this.biomeTagAssociations;
    }
    public Map<ResourceKey<Enchantment>, List<TagKey<Enchantment>>> getEnchantmentTagAssociations() {
        return this.enchantmentTagAssociations;
    }
    public Map<ResourceKey<Potion>, List<TagKey<Potion>>> getPotionTagAssociations() {
        return this.potionTagAssociations;
    }
    public Map<Supplier<? extends EntityType<?>>, List<TagKey<EntityType<?>>>> getEntityTypeTagAssociations() {
        return this.entityTypeTagAssociations;
    }
    
    public Map<TagKey<Biome>, List<TagKey<Biome>>> getTagBiomeTagAssociations() {
        return this.tagBiomeTagAssociations;
    }
    public Map<TagKey<Enchantment>, List<TagKey<Enchantment>>> getTagEnchantmentTagAssociations() {
        return this.tagEnchantmentTagAssociations;
    }
    public Map<TagKey<Potion>, List<TagKey<Potion>>> getTagPotionTagAssociations() {
        return this.tagPotionTagAssociations;
    }
    public Map<TagKey<EntityType<?>>, List<TagKey<EntityType<?>>>> getTagEntityTypeTagAssociations() {
        return this.tagEntityTypeTagAssociations;
    }
    public Map<TagKey<Block>, List<TagKey<Block>>> getTagBlockTagAssociations() {
        return this.tagBlockTagAssociations;
    }
    public Map<TagKey<Fluid>, List<TagKey<Fluid>>> getTagFluidTagAssociations() {
        return this.tagFluidTagAssociations;
    }
    public Map<TagKey<Item>, List<TagKey<Item>>> getTagItemTagAssociations() {
        return this.tagItemTagAssociations;
    }
    
    
    public NlmcTagsManager addItemToTag(Item item, TagKey<Item> targetTag) {
        List<TagKey<Item>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.itemTagAssociations.computeIfAbsent(new UniqueSupplier<>(item), k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addItemToTag(Supplier<? extends Item> itemSupplier, TagKey<Item> targetTag) {
        List<TagKey<Item>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.itemTagAssociations.computeIfAbsent(itemSupplier, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addItemTagToTag(TagKey<Item> tagToAdd, TagKey<Item> targetTag) {
        List<TagKey<Item>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagItemTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addBlockToTag(Block block, TagKey<Block> targetTag) {
        List<TagKey<Block>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.blockTagAssociations.computeIfAbsent(new UniqueSupplier<>(block), k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addBlockToTag(Supplier<? extends Block> blockSupplier, TagKey<Block> targetTag) {
        List<TagKey<Block>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.blockTagAssociations.computeIfAbsent(blockSupplier, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addBlockTagToTag(TagKey<Block> tagToAdd, TagKey<Block> targetTag) {
        List<TagKey<Block>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagBlockTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addFluidToTag(Fluid fluid, TagKey<Fluid> targetTag) {
        List<TagKey<Fluid>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.fluidTagAssociations.computeIfAbsent(new UniqueSupplier<>(fluid), k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addFluidToTag(Supplier<? extends Fluid> fluidSupplier, TagKey<Fluid> targetTag) {
        List<TagKey<Fluid>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.fluidTagAssociations.computeIfAbsent(fluidSupplier, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addFluidTagToTag(TagKey<Fluid> tagToAdd, TagKey<Fluid> targetTag) {
        List<TagKey<Fluid>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagFluidTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addBiomeToTag(ResourceKey<Biome> biomeKey, TagKey<Biome> targetTag) {
        List<TagKey<Biome>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.biomeTagAssociations.computeIfAbsent(biomeKey, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addBiomeTagToTag(TagKey<Biome> tagToAdd, TagKey<Biome> targetTag) {
        List<TagKey<Biome>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagBiomeTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addEnchantmentToTag(ResourceKey<Enchantment> enchantmentKey, TagKey<Enchantment> targetTag) {
        List<TagKey<Enchantment>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.enchantmentTagAssociations.computeIfAbsent(enchantmentKey, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addEnchantmentTagToTag(TagKey<Enchantment> tagToAdd, TagKey<Enchantment> targetTag) {
        List<TagKey<Enchantment>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagEnchantmentTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addPotionToTag(ResourceKey<Potion> potionKey, TagKey<Potion> targetTag) {
        List<TagKey<Potion>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.potionTagAssociations.computeIfAbsent(potionKey, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addPotionTagToTag(TagKey<Potion> tagToAdd, TagKey<Potion> targetTag) {
        List<TagKey<Potion>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagPotionTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public NlmcTagsManager addEntityTypeToTag(EntityType<?> entityType, TagKey<EntityType<?>> targetTag) {
        List<TagKey<EntityType<?>>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.entityTypeTagAssociations.computeIfAbsent(new UniqueSupplier<>(entityType), k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addEntityTypeToTag(Supplier<? extends EntityType<?>> entityTypeSupplier, TagKey<EntityType<?>> targetTag) {
        List<TagKey<EntityType<?>>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.entityTypeTagAssociations.computeIfAbsent(entityTypeSupplier, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    public NlmcTagsManager addEntityTypeTagToTag(TagKey<EntityType<?>> tagToAdd, TagKey<EntityType<?>> targetTag) {
        List<TagKey<EntityType<?>>> tagList = TagUtils.getTagHierarchy(targetTag);
        tagList.forEach(tag -> {
            this.tagEntityTypeTagAssociations.computeIfAbsent(tagToAdd, k -> new ArrayList<>()).add(tag);
        });
        return this;
    }
    
    public void onDatagen(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
    
        NlmcBlockTagsProvider blockTagProvider = new NlmcBlockTagsProvider(this, packOutput, lookupProvider, fileHelper);
        gen.addProvider(event.includeServer(), blockTagProvider);
        NlmcItemTagsProvider itemTagsProvider = new NlmcItemTagsProvider(this, packOutput, lookupProvider, blockTagProvider.contentsGetter(), fileHelper);
        gen.addProvider(event.includeServer(), itemTagsProvider);
        NlmcFluidTagsProvider fluidTagProvider = new NlmcFluidTagsProvider(this, packOutput, lookupProvider, fileHelper);
        gen.addProvider(event.includeServer(), fluidTagProvider);
        
    }
}
