/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 03:42
 */

package net.normslabs.nlmc_core.items.enums;


import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.normslabs.nlmc_core.NlmcTags;

import java.util.ArrayList;
import java.util.List;

public class ItemTypes {
    public static ItemTypes METAL_ORE_BLOCK = new ItemTypes(NlmcTags.Items.Ores.ALL_ORES);
    public static ItemTypes METAL_RAW_ORE = new ItemTypes(NlmcTags.Items.RawOres.ALL_RAW_ORES);
    public static ItemTypes METAL_RAW_STORAGE_BLOCK = new ItemTypes(ItemTags.PICKAXES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_CRUSHED_RAW_ORE = new ItemTypes(ItemTags.SHOVELS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_PULVERIZED_RAW_ORE = new ItemTypes(ItemTags.HOES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_INGOT = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_NUGGET = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_STORAGE_BLOCK = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_REFINED_POWDER = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_CHEMI = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes METAL_REFINED_POWDER = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    
    public static ItemTypes STONE_BLOCK = new ItemTypes(Tags.Items.SHEARS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes CRUSHED_STONE = new ItemTypes(ItemTags.SHOVELS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes PULVERIZED_STONE = new ItemTypes(ItemTags.HOES, ItemTags.TOOLS, Tags.Items.TOOLS);
    
    public static ItemTypes GEM_ORE_BLOCK = new ItemTypes(Tags.Items.SHEARS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes RAW_GEM = new ItemTypes(ItemTags.SHOVELS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes POLISHED_GEM = new ItemTypes(ItemTags.HOES, ItemTags.TOOLS, Tags.Items.TOOLS);
    
    public static ItemTypes SWORD = new ItemTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes SHIELD = new ItemTypes(Tags.Items.TOOLS_SHIELDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes BOW = new ItemTypes(Tags.Items.TOOLS_BOWS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes CROSSBOW = new ItemTypes(Tags.Items.TOOLS_CROSSBOWS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes FISHING_ROD = new ItemTypes(Tags.Items.TOOLS_FISHING_RODS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes TRIDENT = new ItemTypes(Tags.Items.TOOLS_TRIDENTS, ItemTags.TOOLS, Tags.Items.TOOLS);
    
    private final List<TagKey<Item>> toolTypeTags;
    @SafeVarargs
    protected ItemTypes(TagKey<Item>... toolTypeTags) {
        this.toolTypeTags = new ArrayList<>(List.of(toolTypeTags));
    }
    
    public List<TagKey<Item>> getTags() {
        return this.toolTypeTags;
    }
}
