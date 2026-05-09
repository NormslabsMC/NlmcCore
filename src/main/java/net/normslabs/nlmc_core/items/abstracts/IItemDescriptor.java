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
import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.items.models.abstracts.IHasItemModel;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModel;
import net.normslabs.nlmc_core.items.properties.ItemArmorProperties;
import net.normslabs.nlmc_core.items.properties.ItemFoodProperties;
import net.normslabs.nlmc_core.items.properties.ItemFuelProperties;
import net.normslabs.nlmc_core.items.properties.ItemToolProperties;

public interface IItemDescriptor<
        TSelf extends IItemDescriptor<TSelf, TBuilder, TModel, TModelBuilder, TNlmcType, TRegistrar>,
        TBuilder extends IBuilder<TBuilder, TSelf>,
        TModel extends IItemModel<TModel, TModelBuilder>,
        TModelBuilder extends IBuilder<TModelBuilder, TModel>,
        TNlmcType extends Item,
        TRegistrar extends IDeferredRegistrar<? super TSelf, Item>>
        extends IDescriptor<TSelf, TBuilder>,
        IMcRegistrable<TSelf, TRegistrar, TNlmcType, Item>,
        IHasItemModel<TModel, TModelBuilder>,
        IHasDisplayedName,
        IHasTooltips,
        ITaggable<Item>,
        IBuildable<TSelf, TBuilder>,
        IInCreativeTabs {
    
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
