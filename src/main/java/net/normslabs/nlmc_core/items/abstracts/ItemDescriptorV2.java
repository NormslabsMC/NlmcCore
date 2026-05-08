/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:54
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.abstracts.BuildableV3;
import net.normslabs.nlmc_core.abstracts.BuilderV3;
import net.normslabs.nlmc_core.abstracts.IBuilderV3;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModelV2;
import net.normslabs.nlmc_core.items.properties.*;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.translations.TranslationDictionaryV2;
import net.normslabs.nlmc_core.utils.TagUtils;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class ItemDescriptorV2<
        TModel extends IItemModelV2<TModel, TModelBuilder>,
        TModelBuilder extends IBuilderV3<TModelBuilder, TModel>,
        TNlmcType extends Item>
        extends BuildableV3<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>, ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>.Builder>
        implements IItemDescriptor<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>, ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>.Builder, TModel, TModelBuilder, TNlmcType> {
    
    private boolean isBuilt;
    private boolean isRegistered;
    private boolean isFood;
    private boolean isFuel;
    private boolean isTool;
    private boolean isArmor;
    protected final String objectNamespace;
    protected final String objectIdentifier;
    protected final ResourceLocation objectResourceLocation;
    protected final TranslationDictionaryV2 translations;
    private final Function<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>, TNlmcType> objectCreator;
    private final Queue<Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>>> preBuildActions;
    private final Queue<Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>>> postBuildActions;
    private final List<ResourceKey<CreativeModeTab>> creativeTabs;
    protected final List<TagKey<Item>> tags;
    private final ItemFoodProperties itemFoodProperties;
    private final ItemFuelProperties itemFuelProperties;
    private final ItemToolProperties itemToolProperties;
    private final ItemArmorProperties itemArmorProperties;
    protected TNlmcType createdMcObject;
    private TModel modelDescriptor;
    private int nextTooltipIndex = 0;
    private int maxStackSize = 64;
    private int durability = Integer.MIN_VALUE;
    private Rarity rarity = Rarity.COMMON;
    private boolean isFireResistant = false;
    private Item.Properties mcItemProperties;
    
    
    public ItemDescriptorV2(String objectNamespace, String objectIdentifier, TModel initialModel,
                            Function<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>, TNlmcType> objectCreator) {
        this.objectIdentifier = objectIdentifier;
        this.objectNamespace = objectNamespace;
        this.objectResourceLocation = ResourceLocation.fromNamespaceAndPath(objectNamespace, objectIdentifier);
        this.modelDescriptor = initialModel;
        this.objectCreator = objectCreator;
        this.translations = new TranslationDictionaryV2();
        this.preBuildActions = new ArrayDeque<>();
        this.postBuildActions = new ArrayDeque<>();
        this.creativeTabs = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.itemFoodProperties = new ItemFoodProperties(this);
        this.itemFuelProperties = new ItemFuelProperties(this);
        this.itemToolProperties = new ItemToolProperties(this);
        this.itemArmorProperties = new ItemArmorProperties(this);
        this.isFood = false;
        this.isFuel = false;
        this.isTool = false;
        this.isArmor = false;
    }
    
    
    @Override
    public boolean isFood() {
        return this.isFood;
    }
    
    @Override
    public boolean isFuel() {
        return this.isFuel;
    }
    
    @Override
    public boolean isTool() {
        return this.isTool;
    }
    
    @Override
    public boolean isArmor() {
        return this.isArmor;
    }
    
    @Override
    public boolean isFireResistant() {
        return this.isFireResistant;
    }
    
    @Override
    public int getMaxStackSize() {
        return this.maxStackSize;
    }
    
    @Override
    public Rarity getRarity() {
        return this.rarity;
    }
    
    @Override
    public int getDurability() {
        return this.durability;
    }
    
    @Override
    public ItemFoodProperties getFoodProperties() {
        return this.itemFoodProperties;
    }
    
    @Override
    public ItemFuelProperties getFuelProperties() {
        return this.itemFuelProperties;
    }
    
    @Override
    public ItemToolProperties getToolProperties() {
        return this.itemToolProperties;
    }
    
    @Override
    public ItemArmorProperties getArmorProperties() {
        return this.itemArmorProperties;
    }
    
    @Override
    public Item.Properties getMcItemProperties() {
        if (!this.isBuilt) {
            throw new IllegalStateException("Cannot create MC item properties before its descriptor is built.");
        }
        if (this.mcItemProperties == null) {
            Item.Properties itemProperties = new Item.Properties();
            if (this.isFood) {
                FoodProperties.Builder builder = new FoodProperties.Builder()
                        .nutrition(this.itemFoodProperties.getNutrition())
                        .saturationMod(this.itemFoodProperties.getSaturationModifier());
                if (this.itemFoodProperties.alwaysEatable()) {
                    builder.alwaysEat();
                }
                if (this.itemFoodProperties.isFast()) {
                    builder.fast();
                }
                if (this.itemFoodProperties.isMeat()) {
                    builder.meat();
                }
                itemProperties.food(builder.build());
            }
            if (this.isTool) {
                itemProperties.defaultDurability(this.itemToolProperties.getDefaultDurability());
            } else if (this.isArmor) {
                itemProperties.defaultDurability(this.itemArmorProperties.getDefaultDurability());
            } else if (this.durability != Integer.MIN_VALUE) {
                itemProperties.durability(this.durability);
            }
            itemProperties.stacksTo(this.maxStackSize);
            itemProperties.rarity(this.rarity);
            if (this.isFireResistant) {
                itemProperties.fireResistant();
            }
            this.mcItemProperties = itemProperties;
        }
        return this.mcItemProperties;
    }
    
    @Override
    public boolean isBuilt() {
        return this.isBuilt;
    }
    
    @Override
    public void setIsBuilt(boolean isBuilt) {
        this.isBuilt = isBuilt;
    }
    
    @Override
    public boolean isRegistered() {
        return this.isRegistered;
    }
    
    @Override
    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
    
    @Override
    public String getNamespace() {
        return this.objectNamespace;
    }
    
    @Override
    public String getIdentifier() {
        return this.objectIdentifier;
    }
    
    @Override
    public ResourceLocation getResourceLocation() {
        return this.objectResourceLocation;
    }
    
    @Override
    public Queue<Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>>> getPreBuildActions() {
        return this.preBuildActions;
    }
    
    @Override
    public void registerPreBuildAction(Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>> buildableConsumer) {
        this.preBuildActions.add(buildableConsumer);
    }
    
    @Override
    public Queue<Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>>> getPostBuildActions() {
        return this.postBuildActions;
    }
    
    @Override
    public void registerPostBuildAction(Consumer<ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>> buildableConsumer) {
        this.postBuildActions.add(buildableConsumer);
    }
    
    @Override
    public void validateForBuild() {
        // TODO: validation
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public String getDisplayNameDictionaryKey() {
        return "items."+this.objectNamespace+":"+this.objectIdentifier;
    }
    
    @Override
    public TModel getModelDescriptor() {
        return this.modelDescriptor;
    }
    
    @Override
    public int getNextTooltipIndex() {
        return this.nextTooltipIndex;
    }
    
    @Override
    public List<String> getTooltipDictionaryKeys() {
        List<String> tooltipDictionaryKeys = new ArrayList<>();
        for (int i = 0; i < this.nextTooltipIndex; i++) {
            tooltipDictionaryKeys.add("items.tooltips."+this.objectNamespace+"."+this.objectIdentifier+"."+i);
        }
        return tooltipDictionaryKeys;
    }
    
    @Override
    public List<ResourceKey<CreativeModeTab>> getCreativeTabs() {
        return this.creativeTabs;
    }
    
    @Override
    public List<TagKey<Item>> getTags() {
        return this.tags;
    }
    
    @Override
    public TranslationDictionaryV2 getTranslations() {
        return this.translations;
    }
    
    @Override
    public TNlmcType get() {
        if (!this.isBuilt) {
            throw new IllegalStateException("Cannot create MC object ["+this.objectNamespace+":"+this.objectIdentifier+"] from descriptor before it is built.");
        }
        if (this.createdMcObject == null) {
            this.validateForBuild();
            this.createdMcObject = this.objectCreator.apply(this.self());
        }
        return this.createdMcObject;
    }
    
    @Override
    public RegistryObject<TNlmcType> registerIn(DeferredRegister<? super TNlmcType> forgeRegistry) {
        // TODO: schmeh
        return null;
    }
    
    @Override
    public void onBuild() {
        // TODO: schmeh
    }
    
    
    
    @Override
    public void addDisplayNameTranslation(Locales locale, String translation) {
        this.translations.addTranslation(locale, this.getDisplayNameDictionaryKey(), translation);
    }
    
    @Override
    public void addDisplayNameTranslations(Map<Locales, String> translationsMap) {
        translationsMap.forEach((locale, translation)
                                        -> this.translations.addTranslation(locale, this.getDisplayNameDictionaryKey(), translation));
    }
    
    @Override
    public void addTooltip(Map<Locales, String> tooltipTranslations) {
        String key = "items.tooltips."+this.objectNamespace+"."+this.objectIdentifier+"."+this.nextTooltipIndex;
        tooltipTranslations.forEach((locale, translation) -> this.translations.addTranslation(locale, key, translation));
        this.nextTooltipIndex++;
    }
    
    @Override
    public void addTooltips(List<Map<Locales, String>> tooltips) {
        tooltips.forEach(this::addTooltip);
    }
    
    @Override
    public void setModelDescriptor(TModel modelDescriptor) {
        this.modelDescriptor = modelDescriptor;
    }
    
    @Override
    public void addToCreativeTab(ResourceKey<CreativeModeTab> creativeTab) {
        this.creativeTabs.add(creativeTab);
    }
    
    @Override
    public void addToCreativeTabs(List<ResourceKey<CreativeModeTab>> creativeTabs) {
        this.creativeTabs.addAll(creativeTabs);
    }
    
    @Override
    public void addTag(ResourceLocation tagLocation) {
        this.tags.add(TagUtils.createItemTag(tagLocation));
    }
    
    @Override
    public void addTag(TagKey<Item> tagKey) {
        this.tags.add(tagKey);
    }
    
    @Override
    public void addTags(List<TagKey<Item>> tagList) {
        this.tags.addAll(tagList);
    }
    
    @Override
    public void addTranslation(Locales locale, String translationKey, String translationValue) {
        this.translations.addTranslation(locale, translationKey, translationValue);
    }
    
    @Override
    public void addTranslations(Locales locale, Map<String, String> translations) {
        this.translations.addTranslations(locale, translations);
    }
    
    @Override
    public void addTranslations(Map<String, Map<Locales, String>> translationsMap) {
        this.translations.addTranslations(translationsMap);
    }
    
    @Override
    public void addTranslations(TranslationDictionaryV2 translationsDictionary) {
        this.translations.merge(translationsDictionary);
    }
    
    protected void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    
    protected void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }
    
    protected void setFireResistant(boolean fireResistant) {
        isFireResistant = fireResistant;
    }
    
    protected void setDurability(int durability) {
        this.durability = durability;
    }
    
    public class Builder extends BuilderV3<Builder, ItemDescriptorV2<TModel, TModelBuilder, TNlmcType>> {
        
        protected Builder(ItemDescriptorV2<TModel, TModelBuilder, TNlmcType> initialBuildable) {
            super(initialBuildable);
        }
        
        
        public Builder setRarity(Rarity rarity) {
            this.buildable.rarity = rarity;
            return this.self();
        }
        
        public Builder setMaxStackSize(int maxStackSize) {
            this.buildable.maxStackSize = maxStackSize;
            return this.self();
        }
        
        public Builder setFireResistant(boolean fireResistant) {
            this.buildable.isFireResistant = fireResistant;
            return this.self();
        }
        
        public Builder setDurability(int durability) {
            this.buildable.durability = durability;
            return this.self();
        }
        
        public Builder addDisplayNameTranslation(Locales locale, String translation) {
            this.buildable.addDisplayNameTranslation(locale, translation);
            return this.self();
        }
        
        public Builder addDisplayNameTranslations(Map<Locales, String> translationsMap) {
            this.buildable.addDisplayNameTranslations(translationsMap);
            return this.self();
        }
        
        public Builder addTooltip(Map<Locales, String> tooltipTranslations) {
            this.buildable.addTooltip(tooltipTranslations);
            return this.self();
        }
        
        public Builder addTooltips(List<Map<Locales, String>> tooltips) {
            this.buildable.addTooltips(tooltips);
            return this.self();
        }
        
        public Builder addTranslation(Locales locale, String translationKey, String translationValue) {
            this.buildable.addTranslation(locale, translationKey, translationValue);
            return this.self();
        }
        
        public Builder addTranslations(Locales locale, Map<String, String> translations) {
            this.buildable.addTranslations(locale, translations);
            return this.self();
        }
        
        public Builder addTranslations(Map<String, Map<Locales, String>> translationsMap) {
            this.buildable.addTranslations(translationsMap);
            return this.self();
        }
        
        public Builder addTranslations(TranslationDictionaryV2 translationsDictionary) {
            this.buildable.addTranslations(translationsDictionary);
            return this.self();
        }
        
        public Builder addToCreativeTab(ResourceKey<CreativeModeTab> creativeTab) {
            this.buildable.addToCreativeTab(creativeTab);
            return this.self();
        }
        
        public Builder addToCreativeTabs(List<ResourceKey<CreativeModeTab>> creativeTabs) {
            this.buildable.addToCreativeTabs(creativeTabs);
            return this.self();
        }
        
        public Builder addTag(ResourceLocation tagLocation) {
            this.buildable.addTag(tagLocation);
            return this.self();
        }
        
        public Builder addTag(TagKey<Item> tagKey) {
            this.buildable.addTag(tagKey);
            return this.self();
        }
        
        public Builder addTags(List<TagKey<Item>> tagList) {
            this.buildable.addTags(tagList);
            return this.self();
        }
        
        public Builder configureModel(Function<TModelBuilder, TModel> buildFunction) {
            buildFunction.apply(this.buildable.getModelDescriptor().getBuilder());
            return this.self();
        }
        
        public Builder isFood(Function<ItemFoodProperties.Builder, ItemFoodProperties> buildFunction) {
            buildFunction.apply(this.buildable.getFoodProperties().getBuilder()
                                              .registerPostBuildAction((foodProps) -> this.buildable.isFood = true));
            return this.self();
        }
        
        public Builder isFuel(Function<ItemFuelProperties.Builder, ItemFuelProperties> buildFunction) {
            buildFunction.apply(this.buildable.getFuelProperties().getBuilder()
                                              .registerPostBuildAction((fuelProps) -> this.buildable.isFuel = true));
            return this.self();
        }
        
        public Builder isTool(Function<ItemToolProperties.Builder, ItemToolProperties> buildFunction) {
            buildFunction.apply(this.buildable.getToolProperties().getBuilder()
                                              .registerPostBuildAction((toolProps) -> this.buildable.isTool = true));
            return this.self();
        }
        
        public Builder isArmor(Function<ItemArmorProperties.Builder, ItemArmorProperties> buildFunction) {
            buildFunction.apply(this.buildable.getArmorProperties().getBuilder()
                                              .registerPostBuildAction((armorProps) -> this.buildable.isArmor = true));
            return this.self();
        }
        
    }
    
}
