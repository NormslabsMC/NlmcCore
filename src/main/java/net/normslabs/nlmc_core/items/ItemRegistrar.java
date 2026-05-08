/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:53
 */

package net.normslabs.nlmc_core.items;


import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.items.abstracts.ItemDescriptorV2;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractDeferredRegistrar;
import net.normslabs.nlmc_core.items.enums.ToolTypes;
import net.normslabs.nlmc_core.items.models.CubeTopItemModel;
import net.normslabs.nlmc_core.items.models.CustomCubeItemModel;
import net.normslabs.nlmc_core.items.models.GenericItemModel;
import net.normslabs.nlmc_core.items.models.UniformCubeItemModel;
import net.normslabs.nlmc_core.items.types.*;
import net.normslabs.nlmc_core.rendering.DynamicTextures;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.utils.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ItemRegistrar extends AbstractDeferredRegistrar<Item, ItemDescriptorV2<?, ?, ?>> {
    private final HashMap<NlmcItemColor, List<ItemDescriptorV2<?, ?, ?>>> ITEM_COLOR_MAP = new HashMap<>();
    
    public ItemRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar, Registries.ITEM);
        modRegistrar.getModEventBus().addListener(this::onCreativeModeTabContentBuild);
        modRegistrar.getModEventBus().addListener(this::onRegisterItemColorHandlers);
    }
    
    @Override
    public <T extends ItemDescriptorV2<?, ?, ?>> T register(T descriptor) {
        this.registerItemColor(descriptor);
        descriptor.getTags().forEach((tag) -> {
            this.getNlmcRegistrar().TAGS.addItemToTag(descriptor, tag);
        });
        descriptor.getCreativeTabs().forEach((creativeTab) -> {
        
        });
        return super.register(descriptor);
    }
    
    // <editor-fold defaultstate="collapsed" desc="ItemCreation functions">
    
    /**
     * Returns a builder object for a generic 2D item.
     * <p>
     * Generic items are simple 2D items with no associated block and no specialized properties.
     * Examples from vanilla minecraft are paper, leather and bones.
     * </p>
     *
     * @param itemIdentifier The identifier (unique name) of the generic item to register
     * @return The item builder.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-02 19:26
     */
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcGenericItem>.Builder createCustomGenericItem(String itemIdentifier) {
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcGenericItem> descriptor
                = new ItemDescriptorV2<>(
                        this.getNlmcRegistrar().getModNamespace(),
                        itemIdentifier,
                        new GenericItemModel(),
                        NlmcGenericItem::new);
        return descriptor.getBuilder();
    }
    
    public ItemDescriptorV2<UniformCubeItemModel, UniformCubeItemModel.UniformCubeItemModelBuilder, NlmcGenericItem>.Builder createCustomUniformCubeItem(String itemIdentifier) {
        ItemDescriptorV2<UniformCubeItemModel, UniformCubeItemModel.UniformCubeItemModelBuilder, NlmcGenericItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new UniformCubeItemModel(),
                NlmcGenericItem::new);
        return descriptor.getBuilder();
    }
    
    public ItemDescriptorV2<CubeTopItemModel, CubeTopItemModel.CubeTopItemModelBuilder, NlmcGenericItem>.Builder createCustomCubeTopBottomItem(String itemIdentifier) {
        ItemDescriptorV2<CubeTopItemModel, CubeTopItemModel.CubeTopItemModelBuilder, NlmcGenericItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new CubeTopItemModel(),
                NlmcGenericItem::new);
        return descriptor.getBuilder();
    }
    
    public ItemDescriptorV2<CustomCubeItemModel, CustomCubeItemModel.CustomCubeItemModelBuilder, NlmcGenericItem>.Builder createCustomCubeItem(String itemIdentifier) {
        ItemDescriptorV2<CustomCubeItemModel, CustomCubeItemModel.CustomCubeItemModelBuilder, NlmcGenericItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new CustomCubeItemModel(),
                NlmcGenericItem::new);
        return descriptor.getBuilder();
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcAxeItem> createAxeItem(
            String itemIdentifier,
            Color materialColor,
            Tier toolTier,
            Rarity rarity,
            boolean isFireproof,
            float baseAttackDamage,
            float baseAttackSpeed,
            int baseDurability,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcAxeItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new GenericItemModel(),
                NlmcAxeItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> modelBuilder.addTextureLayer(DynamicTextures.Tools.AXE_HANDLE)
                                                    .addTextureLayer(DynamicTextures.Tools.AXE_HEAD, materialColor)
                                                    .build()
                ).isTool(
                        toolBuilder -> toolBuilder.setToolType(ToolTypes.AXE)
                                                  .setToolTier(toolTier)
                                                  .setAttackDamage(baseAttackDamage)
                                                  .setBaseAttackSpeed(baseAttackSpeed)
                                                  .setDefaultDurability(baseDurability)
                                                  .build())
                .setRarity(rarity)
                .setFireResistant(isFireproof)
                .addTags(ToolTypes.AXE.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcPickaxeItem> createPickaxeItem(
            String itemIdentifier,
            Color materialColor,
            Tier toolTier,
            Rarity rarity,
            boolean isFireproof,
            float baseAttackDamage,
            float baseAttackSpeed,
            int baseDurability,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcPickaxeItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new GenericItemModel(),
                NlmcPickaxeItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> modelBuilder.addTextureLayer(DynamicTextures.Tools.PICKAXE_HANDLE)
                                                    .addTextureLayer(DynamicTextures.Tools.PICKAXE_HEAD, materialColor)
                                                    .build()
                ).isTool(
                        toolBuilder -> toolBuilder.setToolType(ToolTypes.PICKAXE)
                                                  .setToolTier(toolTier)
                                                  .setAttackDamage(baseAttackDamage)
                                                  .setBaseAttackSpeed(baseAttackSpeed)
                                                  .setDefaultDurability(baseDurability)
                                                  .build())
                .setRarity(rarity)
                .setFireResistant(isFireproof)
                .addTags(ToolTypes.PICKAXE.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcShovelItem> createShovelItem(
            String itemIdentifier,
            Color materialColor,
            Tier toolTier,
            Rarity rarity,
            boolean isFireproof,
            float baseAttackDamage,
            float baseAttackSpeed,
            int baseDurability,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcShovelItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new GenericItemModel(),
                NlmcShovelItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> modelBuilder.addTextureLayer(DynamicTextures.Tools.SHOVEL_HANDLE)
                                                    .addTextureLayer(DynamicTextures.Tools.SHOVEL_HEAD, materialColor)
                                                    .build()
                ).isTool(
                        toolBuilder -> toolBuilder.setToolType(ToolTypes.SHOVEL)
                                                  .setToolTier(toolTier)
                                                  .setAttackDamage(baseAttackDamage)
                                                  .setBaseAttackSpeed(baseAttackSpeed)
                                                  .setDefaultDurability(baseDurability)
                                                  .build())
                .setRarity(rarity)
                .setFireResistant(isFireproof)
                .addTags(ToolTypes.SHOVEL.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcHoeItem> createHoeItem(
            String itemIdentifier,
            Color materialColor,
            Tier toolTier,
            Rarity rarity,
            boolean isFireproof,
            float baseAttackDamage,
            float baseAttackSpeed,
            int baseDurability,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcHoeItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new GenericItemModel(),
                NlmcHoeItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> modelBuilder.addTextureLayer(DynamicTextures.Tools.HOE_HANDLE)
                                                    .addTextureLayer(DynamicTextures.Tools.HOE_HEAD, materialColor)
                                                    .build()
                ).isTool(
                        toolBuilder -> toolBuilder.setToolType(ToolTypes.HOES)
                                                  .setToolTier(toolTier)
                                                  .setAttackDamage(baseAttackDamage)
                                                  .setBaseAttackSpeed(baseAttackSpeed)
                                                  .setDefaultDurability(baseDurability)
                                                  .build())
                .setRarity(rarity)
                .setFireResistant(isFireproof)
                .addTags(ToolTypes.HOES.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcSwordItem> createSwordItem(
            String itemIdentifier,
            Color materialColor,
            Tier toolTier,
            Rarity rarity,
            boolean isFireproof,
            float baseAttackDamage,
            float baseAttackSpeed,
            int baseDurability,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcSwordItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                itemIdentifier,
                new GenericItemModel(),
                NlmcSwordItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> modelBuilder.addTextureLayer(DynamicTextures.Tools.SWORD_HILT)
                                                    .addTextureLayer(DynamicTextures.Tools.SWORD_BLADE, materialColor)
                                                    .build()
                ).isTool(
                        toolBuilder -> toolBuilder.setToolType(ToolTypes.SWORD)
                                                  .setToolTier(toolTier)
                                                  .setAttackDamage(baseAttackDamage)
                                                  .setBaseAttackSpeed(baseAttackSpeed)
                                                  .setDefaultDurability(baseDurability)
                                                  .build())
                .setRarity(rarity)
                .setFireResistant(isFireproof)
                .addTags(ToolTypes.SWORD.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    public ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcGenericItem> createRawOreItem(
            String materialName,
            Color materialColor,
            int randomSeed,
            Rarity rarity,
            boolean isFireproof,
            Map<Locales, String> displayNameTranslationsMap,
            List<Map<Locales, String>> tooltips) {
        
        ItemDescriptorV2<GenericItemModel, GenericItemModel.GenericItemModelBuilder, NlmcGenericItem> descriptor
                = new ItemDescriptorV2<>(
                this.getNlmcRegistrar().getModNamespace(),
                "raw_"+materialName.toLowerCase()+"_ore",
                new GenericItemModel(),
                NlmcGenericItem::new)
                .getBuilder().configureModel(
                        modelBuilder -> {
                            ResourceLocation textureLocation = switch (randomSeed % 4) {
                                case 1 -> DynamicTextures.Ores.RAW_ORE_1;
                                case 2 -> DynamicTextures.Ores.RAW_ORE_2;
                                case 3 -> DynamicTextures.Ores.RAW_ORE_3;
                                default -> DynamicTextures.Ores.RAW_ORE_0;
                            };
                            return modelBuilder.addTextureLayer(textureLocation, materialColor).build();
                        }
                ).addTags(ToolTypes.SWORD.getTags())
                .addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .addDisplayNameTranslations(displayNameTranslationsMap)
                .addTooltips(tooltips)
                .build();
        return this.register(descriptor);
    }
    
    // </editor-fold>
    
    @Override
    protected void onRegister(final RegisterEvent event) {
    
    }
    
    protected void onCreativeModeTabContentBuild(final BuildCreativeModeTabContentsEvent event) {
        this.nlmcRegistry.forEach((resourceLocation, registryEntry) -> {
            if (registryEntry.getCreativeTabs().contains(event.getTabKey())) {
                event.accept(registryEntry);
            }
        });
    }
    
    protected void onRegisterItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        this.ITEM_COLOR_MAP.forEach((itemColor, itemSupplierList) -> {
            Item[] itemArray = itemSupplierList.stream().map(Supplier::get).toArray(Item[]::new);
            event.register(itemColor, itemArray);
        });
    }
    
    @Override
    protected void onDatagen(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        
        // Item models generator
        NlmcItemModelManager itemModelProvider = new NlmcItemModelManager(this, packOutput, fileHelper);
        gen.addProvider(event.includeClient(), itemModelProvider);
    }
    
    private void registerItemColor(ItemDescriptorV2<?, ?, ?> descriptor) {
        if (descriptor.getModelDescriptor().getColorDescriptor().needsRegistration()) {
            NlmcItemColor matchingExistingItemColor = null;
            for (NlmcItemColor itemColor : this.ITEM_COLOR_MAP.keySet()) {
                if (itemColor.equals(descriptor.getModelDescriptor().getColorDescriptor())) {
                    matchingExistingItemColor = itemColor;
                    break;
                }
            }
            if (matchingExistingItemColor != null) {
                this.ITEM_COLOR_MAP.get(matchingExistingItemColor).add(descriptor);
            } else {
                List<ItemDescriptorV2<?, ?, ?>> itemColorDescriptors = new ArrayList<>();
                itemColorDescriptors.add(descriptor);
                this.ITEM_COLOR_MAP.put(descriptor.getModelDescriptor().getColorDescriptor(), itemColorDescriptors);
            }
        }
    }
}
