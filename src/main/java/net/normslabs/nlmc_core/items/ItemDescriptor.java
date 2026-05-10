/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:54
 */

package net.normslabs.nlmc_core.items;


import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.normslabs.nlmc_core.abstracts.AbstractTooltippedRegistrable;
import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.items.abstracts.IItemDescriptor;
import net.normslabs.nlmc_core.items.enums.ToolTypes;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModel;
import net.normslabs.nlmc_core.items.properties.*;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.utils.StringUtils;
import net.normslabs.nlmc_core.utils.TagUtils;

import java.util.*;
import java.util.function.Function;

public class ItemDescriptor<
        TModel extends IItemModel<TModel, TModelBuilder>,
        TModelBuilder extends IBuilder<TModelBuilder, TModel>,
        TNlmcType extends Item>
        extends AbstractTooltippedRegistrable<
        ItemDescriptor<TModel, TModelBuilder, TNlmcType>,
                                ItemDescriptor<TModel, TModelBuilder, TNlmcType>.Builder,
                                ItemRegistrar, TNlmcType, Item>
        implements
        IItemDescriptor<ItemDescriptor<TModel, TModelBuilder, TNlmcType>,
                ItemDescriptor<TModel, TModelBuilder, TNlmcType>.Builder,
                TModel, TModelBuilder, TNlmcType, ItemRegistrar> {
    
    //private boolean isBuilt;
    private boolean isFood;
    private boolean isFuel;
    private boolean isTool;
    private boolean isArmor;
    private final Set<ResourceKey<CreativeModeTab>> creativeTabs;
    protected final Set<TagKey<Item>> tags;
    private final ItemFoodProperties itemFoodProperties;
    private final ItemFuelProperties itemFuelProperties;
    private final ItemToolProperties itemToolProperties;
    private final ItemArmorProperties itemArmorProperties;
    protected TNlmcType createdMcObject;
    private TModel modelDescriptor;
    private int maxStackSize = 64;
    private int durability = Integer.MIN_VALUE;
    private Rarity rarity = Rarity.COMMON;
    private boolean isFireResistant = false;
    private Item.Properties mcItemProperties;
    
    
    public ItemDescriptor(String objectNamespace, String objectIdentifier, TModel initialModel,
                          Function<ItemDescriptor<TModel, TModelBuilder, TNlmcType>, TNlmcType> objectCreator) {
        super(objectNamespace, objectIdentifier, objectCreator, "items");
        this.addDisplayNameTranslation(Locales.ENGLISH_US, StringUtils.identifierToDisplayName(objectIdentifier));
        this.modelDescriptor = initialModel;
        this.creativeTabs = new HashSet<>();
        this.tags = new HashSet<>();
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
    public void validateForBuild() {
        super.validateForBuild();
        if (!this.modelDescriptor.isBuilt()) {
            throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build item descriptor ["
                                            +this.objectIdentifier+"] with a non-built model.");
        }
        if (this.isTool && this.isArmor) {
            throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build item descriptor ["
                                            +this.objectIdentifier+"] with both tool and armor properties.");
        }
        if (this.isTool) {
            if (!this.itemToolProperties.isBuilt()) {
                throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build tool item descriptor ["
                                                +this.objectIdentifier+"] with non-built tool properties.");
            }
            this.itemToolProperties.validateForBuild();
        }
        if (this.isArmor) {
            if (!this.itemArmorProperties.isBuilt()) {
                throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build armor item descriptor ["
                                                +this.objectIdentifier+"] with non-built armor properties.");
            }
            this.itemArmorProperties.validateForBuild();
        }
        if (this.isFuel && !this.itemFuelProperties.isBuilt()) {
            if (!this.itemToolProperties.isBuilt()) {
                throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build fuel item descriptor ["
                                                +this.objectIdentifier+"] with non-built fuel properties.");
            }
            this.itemFuelProperties.validateForBuild();
        }
        if (this.isFood && !this.itemFoodProperties.isBuilt()) {
            if (!this.itemToolProperties.isBuilt()) {
                throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build armor item descriptor ["
                                                +this.objectIdentifier+"] with non-built armor properties.");
            }
            this.itemFoodProperties.validateForBuild();
        }
        if (this.creativeTabs.isEmpty()) {
            throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build item descriptor ["
                                            +this.objectIdentifier+"] with no creative tab registered.");
        }
    }
    
    @Override
    public ItemDescriptor<TModel, TModelBuilder, TNlmcType>.Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public TModel getModelDescriptor() {
        return this.modelDescriptor;
    }
    
    @Override
    public Set<ResourceKey<CreativeModeTab>> getCreativeTabs() {
        return this.creativeTabs;
    }
    
    @Override
    public Set<TagKey<Item>> getTags() {
        return this.tags;
    }
    
    @Override
    public void onBuild() {
        // TODO: schmeh
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
    
    public class Builder extends AbstractTooltippedRegistrable<
            ItemDescriptor<TModel, TModelBuilder, TNlmcType>,
                Builder,
                ItemRegistrar,
                TNlmcType,
                Item>.Builder {
        
        
        protected Builder(ItemDescriptor<TModel, TModelBuilder, TNlmcType> initialBuildable) {
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
            this.buildable.isFood = true;
            buildFunction.apply(this.buildable.getFoodProperties().getBuilder());
            this.addToCreativeTab(CreativeModeTabs.FOOD_AND_DRINKS);
            return this.self();
        }
        
        public Builder isFuel(Function<ItemFuelProperties.Builder, ItemFuelProperties> buildFunction) {
            this.buildable.isFuel = true;
            buildFunction.apply(this.buildable.getFuelProperties().getBuilder());
            return this.self();
        }
        
        public Builder isTool(Function<ItemToolProperties.Builder, ItemToolProperties> buildFunction) {
            this.buildable.isTool = true;
            buildFunction.apply(this.buildable.getToolProperties().getBuilder());
            if (ToolTypes.COMBAT_TOOL_TYPES.contains(this.buildable.getToolProperties().getToolType())) {
                this.addToCreativeTab(CreativeModeTabs.COMBAT);
            } else {
                this.addToCreativeTab(CreativeModeTabs.TOOLS_AND_UTILITIES);
            }
            return this.self();
        }
        
        public Builder isArmor(Function<ItemArmorProperties.Builder, ItemArmorProperties> buildFunction) {
            this.buildable.isArmor = true;
            buildFunction.apply(this.buildable.getArmorProperties().getBuilder());
            this.addToCreativeTab(CreativeModeTabs.COMBAT);
            return this.self();
        }
        
    }
    
}
