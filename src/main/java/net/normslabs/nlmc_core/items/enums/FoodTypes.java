/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 04:06
 */

package net.normslabs.nlmc_core.items.enums;


import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.NlmcTags;

import java.util.ArrayList;
import java.util.List;

public enum FoodTypes {
    RAW_MEAT(NlmcTags.Items.Foods.ALL_RAW_MEATS),
    
    ;
    
    private List<TagKey<Item>> foodTypeTags;
    @SafeVarargs
    private FoodTypes(TagKey<Item>... foodTypeTags) {
        this.foodTypeTags = new ArrayList<>(List.of(foodTypeTags));
    }
    
    public List<TagKey<Item>> getTags() {
        return this.foodTypeTags;
    }
}
