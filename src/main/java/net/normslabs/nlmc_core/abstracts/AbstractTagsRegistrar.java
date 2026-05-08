/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 07:10
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.object.Item;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public abstract class AbstractTagsRegistrar<TMcObject> extends AbstractRegistrar {
    protected CompletableFuture<TagsProvider.TagLookup<TMcObject>> provider;
    private final Map<Supplier<TMcObject>, List<TagKey<TMcObject>>> objectTagAssociations = new HashMap<>();
    private final Map<Supplier<TagKey<TMcObject>>, List<Supplier<TagKey<TMcObject>>>> tagTagAssociations = new HashMap<>();
    
    protected AbstractTagsRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
    }
    
    protected abstract TagKey<TMcObject> createTag(ResourceLocation tagResourceLocation);
    
    public CompletableFuture<TagsProvider.TagLookup<TMcObject>> getProvider() {
        return this.provider;
    }
    
    public Map<Supplier<TMcObject>, List<TagKey<TMcObject>>> getObjectTagAssociations() {
        return this.objectTagAssociations;
    }
    
    public Map<Supplier<TagKey<TMcObject>>, List<Supplier<TagKey<TMcObject>>>> getTagTagAssociations() {
        return this.tagTagAssociations;
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param object The object to add.
     * @param tagNamespace The namespace of the tag to add the object to.
     * @param tagIdentifier The identifier/path of the tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:07
     */
    public void addObjectToTag(TMcObject object, String tagNamespace, String tagIdentifier) {
        this.addObjectToTag(object, ResourceLocation.fromNamespaceAndPath(tagNamespace, tagIdentifier));
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param objectSupplier A supplier of the object to add.
     * @param tagNamespace The namespace of the tag to add the object to.
     * @param tagIdentifier The identifier/path of the tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:06
     */
    public void addObjectToTag(Supplier<TMcObject> objectSupplier, String tagNamespace, String tagIdentifier) {
        this.addObjectToTag(objectSupplier, ResourceLocation.fromNamespaceAndPath(tagNamespace, tagIdentifier));
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param object The object to add.
     * @param tagResourceLocation The resource location of the tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:07
     */
    public void addObjectToTag(TMcObject object, ResourceLocation tagResourceLocation) {
        TagKey<TMcObject> tag = this.createTag(tagResourceLocation);
        Supplier<TMcObject> objectSupplier = () -> object;
        this.addObjectToTag(objectSupplier, tag);
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param objectSupplier A supplier of the object to add.
     * @param tagResourceLocation The resource location of the tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:04
     */
    public void addObjectToTag(Supplier<TMcObject> objectSupplier, ResourceLocation tagResourceLocation) {
        TagKey<TMcObject> tag = this.createTag(tagResourceLocation);
        this.addObjectToTag(objectSupplier, tag);
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param object The object to add.
     * @param tag The tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:03
     */
    public void addObjectToTag(TMcObject object, TagKey<TMcObject> tag) {
        Supplier<TMcObject> objectSupplier = () -> object;
        this.addObjectToTag(objectSupplier, tag);
    }
    
    /**
     * Adds an object to a tag.
     *
     * @param objectSupplier A supplier of the object to add.
     * @param tag The tag to add the object to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:03
     */
    public void addObjectToTag(Supplier<TMcObject> objectSupplier, TagKey<TMcObject> tag) {
        if (!this.objectTagAssociations.containsKey(objectSupplier)) {
            this.objectTagAssociations.put(objectSupplier, List.of(tag));
        } else {
            this.objectTagAssociations.get(objectSupplier).add(tag);
        }
    }
    
    
    
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddNamespace The namespace of the tag to add.
     * @param tagToAddIdentifier The identifier/path of the tag to add.
     * @param targetTagNamespace The namespace of the target tag to add the tag to.
     * @param targetTagIdentifier The identifier/path of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(String tagToAddNamespace, String tagToAddIdentifier, String targetTagNamespace, String targetTagIdentifier) {
        this.addTagToTag(ResourceLocation.fromNamespaceAndPath(tagToAddNamespace, tagToAddIdentifier), ResourceLocation.fromNamespaceAndPath(targetTagNamespace, targetTagIdentifier));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddNamespace The namespace of the tag to add.
     * @param tagToAddIdentifier The identifier/path of the tag to add.
     * @param targetTagResourceLocation The resource location of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(String tagToAddNamespace, String tagToAddIdentifier, ResourceLocation targetTagResourceLocation) {
        this.addTagToTag(ResourceLocation.fromNamespaceAndPath(tagToAddNamespace, tagToAddIdentifier), this.createTag(targetTagResourceLocation));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddNamespace The namespace of the tag to add.
     * @param tagToAddIdentifier The identifier/path of the tag to add.
     * @param targetTag The target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(String tagToAddNamespace, String tagToAddIdentifier, TagKey<TMcObject> targetTag) {
        this.addTagToTag(ResourceLocation.fromNamespaceAndPath(tagToAddNamespace, tagToAddIdentifier), () -> targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddNamespace The namespace of the tag to add.
     * @param tagToAddIdentifier The identifier/path of the tag to add.
     * @param targetTag The supplier of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(String tagToAddNamespace, String tagToAddIdentifier, Supplier<TagKey<TMcObject>> targetTag) {
        this.addTagToTag(ResourceLocation.fromNamespaceAndPath(tagToAddNamespace, tagToAddIdentifier), targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddResourceLocation The resource location of the tag to add.
     * @param targetTagNamespace The namespace of the target tag to add the tag to.
     * @param targetTagIdentifier The identifier/path of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(ResourceLocation tagToAddResourceLocation, String targetTagNamespace, String targetTagIdentifier) {
        this.addTagToTag(this.createTag(tagToAddResourceLocation), ResourceLocation.fromNamespaceAndPath(targetTagNamespace, targetTagIdentifier));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddResourceLocation The resource location of the tag to add.
     * @param targetTagResourceLocation The resource location of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(ResourceLocation tagToAddResourceLocation, ResourceLocation targetTagResourceLocation) {
        this.addTagToTag(this.createTag(tagToAddResourceLocation), this.createTag(targetTagResourceLocation));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddResourceLocation The resource location of the tag to add.
     * @param targetTag The target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(ResourceLocation tagToAddResourceLocation, TagKey<TMcObject> targetTag) {
        this.addTagToTag(this.createTag(tagToAddResourceLocation), () -> targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAddResourceLocation The resource location of the tag to add.
     * @param targetTag The supplier of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:45
     */
    public void addTagToTag(ResourceLocation tagToAddResourceLocation, Supplier<TagKey<TMcObject>> targetTag) {
        this.addTagToTag(this.createTag(tagToAddResourceLocation), targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd The tag to add.
     * @param targetTagNamespace The namespace of the target tag to add the tag to.
     * @param targetTagIdentifier The identifier/path of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(TagKey<TMcObject> tagToAdd, String targetTagNamespace, String targetTagIdentifier) {
        this.addTagToTag(tagToAdd, ResourceLocation.fromNamespaceAndPath(targetTagNamespace, targetTagIdentifier));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd The tag to add.
     * @param targetTagResourceLocation The resource location of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(TagKey<TMcObject> tagToAdd, ResourceLocation targetTagResourceLocation) {
        this.addTagToTag(tagToAdd, this.createTag(targetTagResourceLocation));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd The tag to add.
     * @param targetTag The target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(TagKey<TMcObject> tagToAdd, TagKey<TMcObject> targetTag) {
        this.addTagToTag(tagToAdd, () -> targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd The tag to add.
     * @param targetTag The supplier of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:19
     */
    public void addTagToTag(TagKey<TMcObject> tagToAdd, Supplier<TagKey<TMcObject>> targetTag) {
        this.addTagToTag(() -> tagToAdd, targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd A supplier of the tag to add.
     * @param targetTagNamespace The namespace of the target tag to add the tag to.
     * @param targetTagIdentifier The identifier/path of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(Supplier<TagKey<TMcObject>> tagToAdd, String targetTagNamespace, String targetTagIdentifier) {
        this.addTagToTag(tagToAdd, ResourceLocation.fromNamespaceAndPath(targetTagNamespace, targetTagIdentifier));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd A supplier of the tag to add.
     * @param targetTagResourceLocation The resource location of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(Supplier<TagKey<TMcObject>> tagToAdd, ResourceLocation targetTagResourceLocation) {
        this.addTagToTag(tagToAdd, this.createTag(targetTagResourceLocation));
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd A supplier of the tag to add.
     * @param targetTag The target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:20
     */
    public void addTagToTag(Supplier<TagKey<TMcObject>> tagToAdd, TagKey<TMcObject> targetTag) {
        this.addTagToTag(tagToAdd, () -> targetTag);
    }
    
    /**
     * Adds a tag to another tag.
     *
     * @param tagToAdd A supplier of the tag to add.
     * @param targetTag The supplier of the target tag to add the tag to.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 18:19
     */
    public void addTagToTag(Supplier<TagKey<TMcObject>> tagToAdd, Supplier<TagKey<TMcObject>> targetTag) {
        if (!this.tagTagAssociations.containsKey(targetTag)) {
            this.tagTagAssociations.put(targetTag, List.of(tagToAdd));
        } else {
            this.tagTagAssociations.get(targetTag).add(tagToAdd);
        }
    }
}
