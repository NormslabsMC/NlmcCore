/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 05:39
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.Set;

/**
 * Interface for objects that support tags.
 * Supports that addition of those objects to tag values.
 *
 * @param <TMcTagType> The type of the minecraft object that supports tags (Item, Block, ...)
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 01:46
 */
public interface ITaggable<TMcTagType> {
    
    /**
     * Returns the set of tags as their {@link ResourceLocation} the object
     * currently is set to be added to.
     *
     * @return the {@link Set} of the current tags to add.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:50
     */
    Set<TagKey<TMcTagType>> getTags();
    
    /**
     * Adds a tag to add the taggable object to.
     *
     * @param tagLocation The {@link ResourceLocation} of the tag.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:52
     */
    void addTag(ResourceLocation tagLocation);
    
    /**
     * Adds a tag to add the taggable object to.
     *
     * @param tagKey The {@link TagKey TagKet&lt;TMcTagType&gt;} of the tag.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 01:53
     */
    void addTag(TagKey<TMcTagType> tagKey);
    
    /**
     * Adds multiple tags to add the taggable object to.
     *
     * @param tagList the list of tags.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-07 23:01
     */
    void addTags(List<TagKey<TMcTagType>> tagList);
    
}
