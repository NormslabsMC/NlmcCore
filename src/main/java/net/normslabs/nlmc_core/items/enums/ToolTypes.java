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

import java.util.ArrayList;
import java.util.List;

public class ToolTypes {
    public static ToolTypes AXE = new ToolTypes(ItemTags.AXES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes PICKAXE = new ToolTypes(ItemTags.PICKAXES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes SHOVEL = new ToolTypes(ItemTags.SHOVELS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes HOES = new ToolTypes(ItemTags.HOES, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes SHEARS = new ToolTypes(Tags.Items.SHEARS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes SWORD = new ToolTypes(ItemTags.SWORDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes SHIELD = new ToolTypes(Tags.Items.TOOLS_SHIELDS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes BOW = new ToolTypes(Tags.Items.TOOLS_BOWS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes CROSSBOW = new ToolTypes(Tags.Items.TOOLS_CROSSBOWS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes FISHING_ROD = new ToolTypes(Tags.Items.TOOLS_FISHING_RODS, ItemTags.TOOLS, Tags.Items.TOOLS);
    public static ToolTypes TRIDENT = new ToolTypes(Tags.Items.TOOLS_TRIDENTS, ItemTags.TOOLS, Tags.Items.TOOLS);
    
    private final List<TagKey<Item>> toolTypeTags;
    @SafeVarargs
    protected ToolTypes(TagKey<Item>... toolTypeTags) {
        this.toolTypeTags = new ArrayList<>(List.of(toolTypeTags));
    }
    
    public List<TagKey<Item>> getTags() {
        return this.toolTypeTags;
    }
}
