/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-20 03:07
 */

package net.normslabs.nlmc_core.utils;

import net.minecraft.resources.ResourceLocation;

public class ResLocUtils {
    
    public static final String FORGE_NAMESPACE = "forge";
    public static final String MC_NAMESPACE = "minecraft";
    
    public static final String LOC_PATH_SEPARATOR = "/";
    public static final String LOC_NAMESPACE_SEPARATOR = ":";
    
    public static ResourceLocation newLocationFrom(ResourceLocation resourceLocation, String... pathsToAppend) {
        StringBuilder pathBuilder = new StringBuilder(resourceLocation.getPath());
        for (String pathPart : pathsToAppend) {
            pathBuilder.append(LOC_PATH_SEPARATOR).append(pathPart);
        }
        return ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(), pathBuilder.toString());
    }
    
    public static String appendPath(ResourceLocation resourceLocation, String pathToAppend) {
        return appendPath(resourceLocation.getPath(), pathToAppend);
    }
    
    public static String appendPaths(ResourceLocation resourceLocation, String... pathPartsToAppend) {
        return appendPaths(resourceLocation.getPath(), pathPartsToAppend);
    }
    
    public static String appendPath(String path, String pathToAppend) {
        return path + LOC_PATH_SEPARATOR + pathToAppend;
    }
    
    public static String appendPaths(String path, String... pathPartsToAppend) {
        StringBuilder pathBuilder = new StringBuilder(path);
        for (String pathPart : pathPartsToAppend) {
            pathBuilder.append(LOC_PATH_SEPARATOR).append(pathPart);
        }
        return pathBuilder.toString();
    }
    
    public static String getPathLastPart(ResourceLocation resourceLocation) {
        String[] parts = resourceLocation.getPath().split(LOC_PATH_SEPARATOR);
        return parts[parts.length - 1];
    }
}