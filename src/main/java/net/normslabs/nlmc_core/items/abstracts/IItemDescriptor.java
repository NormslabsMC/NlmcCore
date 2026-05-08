/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:58
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.normslabs.nlmc_core.abstracts.*;
import net.normslabs.nlmc_core.items.models.abstracts.IHasItemModelV2;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModelV2;
import net.normslabs.nlmc_core.items.properties.ItemArmorProperties;
import net.normslabs.nlmc_core.items.properties.ItemFoodProperties;
import net.normslabs.nlmc_core.items.properties.ItemFuelProperties;
import net.normslabs.nlmc_core.items.properties.ItemToolProperties;

public interface IItemDescriptor<
        TSelf extends IItemDescriptor<TSelf, TBuilder, TModel, TModelBuilder, TNlmcType>,
        TBuilder extends IBuilderV3<TBuilder, TSelf>,
        TModel extends IItemModelV2<TModel, TModelBuilder>,
        TModelBuilder extends IBuilderV3<TModelBuilder, TModel>,
        TNlmcType extends Item>
        extends IDescriptor<TSelf, TBuilder>,
        IRegistrable<TNlmcType>,
        IHasItemModelV2<TModel, TModelBuilder>,
        IHasDisplayedName,
        IHasTooltips,
        ITaggable<Item>,
        IBuildableV3<TSelf, TBuilder>,
        IInCreativeTabsV2 {
    
    boolean isFood();
    boolean isFuel();
    boolean isTool();
    boolean isArmor();
    
    boolean isFireResistant();
    int getMaxStackSize();
    Rarity getRarity();
    int getDurability();
    
    ItemFoodProperties getFoodProperties();
    ItemFuelProperties getFuelProperties();
    ItemToolProperties getToolProperties();
    ItemArmorProperties getArmorProperties();
    
    Item.Properties getMcItemProperties();
    
}
