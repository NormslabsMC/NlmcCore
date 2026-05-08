/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 04:04
 */

package net.normslabs.nlmc_core.items.enums;


import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

import java.util.ArrayList;
import java.util.List;

public class ArmorTypes {
    public static ArmorTypes HELMET = new ArmorTypes(ArmorItem.Type.HELMET, Tags.Items.ARMORS, Tags.Items.ARMORS_HELMETS);
    public static ArmorTypes CHESTPLATE = new ArmorTypes(ArmorItem.Type.CHESTPLATE, Tags.Items.ARMORS, Tags.Items.ARMORS_CHESTPLATES);
    public static ArmorTypes LEGGINGS = new ArmorTypes(ArmorItem.Type.LEGGINGS, Tags.Items.ARMORS, Tags.Items.ARMORS_LEGGINGS);
    public static ArmorTypes BOOTS = new ArmorTypes(ArmorItem.Type.BOOTS, Tags.Items.ARMORS, Tags.Items.ARMORS_BOOTS);
    
    
    private final List<TagKey<Item>> armorTypeTags;
    private final ArmorItem.Type type;
    @SafeVarargs
    protected ArmorTypes(ArmorItem.Type type, TagKey<Item>... armorTypeTags) {
        this.type = type;
        this.armorTypeTags = new ArrayList<>(List.of(armorTypeTags));
    }
    
    public ArmorItem.Type getType() {
        return this.type;
    }
    
    public List<TagKey<Item>> getTags() {
        return this.armorTypeTags;
    }
}
