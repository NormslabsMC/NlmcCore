/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:11
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.rendering.RendererTypes;
import net.normslabs.nlmc_core.rendering.Texture;

import java.util.Map;

/**
 * Interface for buildable descriptor objects representing models (block or item models).
 * Model descriptor objects are buildable, and thus have a builder type associated.
 *
 * @param <TObjectColor> A specific type for model layer coloring registration.
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 01:56
 */
public interface IModelV2<
        TSelf extends IModelV2<TSelf, TBuilder, TObjectColor>,
        TBuilder extends IBuilderV3<TBuilder, TSelf>,
        TObjectColor extends IObjectColor> extends IBuildableV3<TSelf, TBuilder> {
    
    /**
     * Returns the renderer type for the model as an {@link RendererTypes} enum value.
     *
     * @return The renderer type.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:03
     */
    RendererTypes getRenderer();
    
    /**
     * Returns the resource location of the parent model, if one is set.
     *
     * @return the {@link ResourceLocation} of the parent model
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:06
     */
    ResourceLocation getParentModel();
    
    /**
     * Returns the map of the model's textures.<br>
     * <code>Map format: { String: textureKey, Texture: textureObject }</code>
     *
     * @return the {@link Map} of the model's textures
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:09
     */
    Map<String, Texture> getTextureMap();
    
    /**
     * Returns the tint color descriptor of the model.
     *
     * @return the tint color descriptor object
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:12
     */
    TObjectColor getColorDescriptor();

}
