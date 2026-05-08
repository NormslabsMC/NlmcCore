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
    public static ItemTypes ORE_BLOCK = new ItemTypes(NlmcTags.Items.Ores., ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes RAW_ORE = new ItemTypes(ItemTags.AXES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes RAW_ORE_BLOCK = new ItemTypes(ItemTags.PICKAXES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes SHOVEL = new ItemTypes(ItemTags.SHOVELS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes HOES = new ItemTypes(ItemTags.HOES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ItemTypes SHEARS = new ItemTypes(Tags.Items.SHEARS, ItemTags.TOOLS, Tags.Items.TOOLS);
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
