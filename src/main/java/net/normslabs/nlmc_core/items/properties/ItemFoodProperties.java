/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:32
 */

package net.normslabs.nlmc_core.items.properties;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ItemFoodProperties {
    private int nutrition;
    private float saturationModifier;
    private boolean isAlwaysEatable;
    private boolean isMeat;
    private boolean isFast;
    
    public Item.Properties applyTo(Item.Properties properties) {
        FoodProperties.Builder builder = new FoodProperties.Builder();
        builder.nutrition(this.nutrition);
        builder.saturationMod(this.saturationModifier);
        if (this.isAlwaysEatable) {
            builder.alwaysEat();
        }
        if (this.isMeat) {
            builder.meat();
        }
        if (this.isFast) {
            builder.fast();
        }
        properties.food(builder.build());
        return properties;
    }
}
