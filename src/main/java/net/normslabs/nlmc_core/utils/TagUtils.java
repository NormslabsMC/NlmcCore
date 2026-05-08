/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 04:37
 */

package net.normslabs.nlmc_core.utils;


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.*;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.tags.ITag;

import java.util.ArrayList;
import java.util.List;

public class TagUtils {
    
    public static TagKey<Item> createItemTag(String namespace, String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Item> createItemTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.ITEM, tagLocation);
    }
    
    public static TagKey<Block> createBlockTag(String namespace, String path) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Block> createBlockTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.BLOCK, tagLocation);
    }
    
    public static TagKey<Fluid> createFluidTag(String namespace, String path) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Fluid> createFluidTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.FLUID, tagLocation);
    }
    
    public static TagKey<Biome> createBiomeTag(String namespace, String path) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Biome> createBiomeTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.BIOME, tagLocation);
    }
    
    public static TagKey<EntityType<?>> createEntityTypeTag(String namespace, String path) {
        return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<EntityType<?>> createEntityTypeTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.ENTITY_TYPE, tagLocation);
    }
    
    public static TagKey<Structure> createStructureTag(String namespace, String path) {
        return TagKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Structure> createStructureTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.STRUCTURE, tagLocation);
    }
    
    public static TagKey<Enchantment> createEnchantmentTag(String namespace, String path) {
        return TagKey.create(Registries.ENCHANTMENT, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<Enchantment> createEnchantmentTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.ENCHANTMENT, tagLocation);
    }
    
    public static TagKey<DamageType> createDamageTypeTag(String namespace, String path) {
        return TagKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(namespace, path));
    }
    public static TagKey<DamageType> createDamageTypeTag(ResourceLocation tagLocation) {
        return TagKey.create(Registries.DAMAGE_TYPE, tagLocation);
    }
    
    public static String appendPath(ITag<?> tag, String pathToAppend) {
        return appendPath(tag.getKey(), pathToAppend);
    }
    
    public static String appendPath(TagKey<?> key, String pathToAppend) {
        return ResLocUtils.appendPaths(key.location(), pathToAppend);
    }
    
    public static String appendPath(ITag<?> tag, String... pathPartsToAppend) {
        return appendPath(tag.getKey(), pathPartsToAppend);
    }
    
    public static String appendPath(TagKey<?> key, String... pathPartsToAppend) {
        return ResLocUtils.appendPaths(key.location(), pathPartsToAppend);
    }
    
    public static <T> TagKey<T> tagAppendPath(TagKey<T> tag, String... pathPartsToAppend) {
        String namespace = tag.location().getNamespace();
        return TagKey.create(tag.registry(), ResourceLocation.fromNamespaceAndPath(namespace, ResLocUtils.appendPaths(tag.location().getPath(), pathPartsToAppend)));
    }
    
    
    public static <T> List<TagKey<T>> getTagHierarchy(TagKey<T> initialTag) {
        List<TagKey<T>> hierarchy = new ArrayList<>();
        ResourceLocation location = initialTag.location();
        String namespace = location.getNamespace();
        String path = location.getPath();
        
        // Split the path by the forward slash
        String[] parts = path.split("/");
        StringBuilder currentPath = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            // Append slash if not the first segment
            if (i > 0) {
                currentPath.append("/");
            }
            currentPath.append(parts[i]);
            
            // Create a new TagKey with the partial path
            hierarchy.add(TagKey.create(initialTag.registry(),
                                        ResourceLocation.fromNamespaceAndPath(namespace, currentPath.toString())));
        }
        
        return hierarchy;
    }
    
    public static boolean checkTagEquality(TagKey<?> key1, TagKey<?> key2) {
        return key1.location().getNamespace().equals(key2.location().getNamespace())
               && key1.location().getPath().equals(key2.location().getPath())
               && key1.registry().equals(key2.registry());
    }
    public static boolean checkTagEquality(ITag<?> key1, ITag<?> key2) {
        return checkTagEquality(key1.getKey(), key2.getKey());
    }
    public static boolean checkTagEquality(ITag<?> key1, TagKey<?> key2) {
        return checkTagEquality(key1.getKey(), key2);
    }
    public static boolean checkTagEquality(TagKey<?> key1, ITag<?> key2) {
        return checkTagEquality(key1, key2.getKey());
    }
    
}
