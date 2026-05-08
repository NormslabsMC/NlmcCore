/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:14
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.rendering.TintColor;
import net.normslabs.nlmc_core.utils.Color;

import java.util.List;

/**
 * Interface for tint color management objects of models.
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 03:42
 */
public interface IObjectColor {
    
    /**
     * Returns whether the tint color management object needs to be registered
     * or not. It needs to be registered if the model has texture layers with
     * configured tints.
     *
     * @return whether the tint color management object needs to be registered.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:42
     */
    boolean needsRegistration();
    
    /**
     * Returns the list of texture layer tint color descriptors.
     *
     * @return the list of texture layer tint color descriptors
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:44
     */
    List<TintColor> getLayerColors();
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> This process
     * is handled automatically by the NLMC platform.
     * <p>
     * Adds a texture layer tint color descriptor for a given tint index and color.
     * This is handled automatically when a texture layer is added to a model descriptor.
     *
     * @param tintIndex The tint index of the texture layer
     * @param color The tint color that will be applied to the layer.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:45
     */
    void addTintColor(int tintIndex, Color color);
    
    /**
     * Equality comparison function for tint color descriptor objects.
     * This is used to optimize the number of different tint colors handled by
     * the Minecraft engine. If multiple objects have the same colors applied on the same
     * tint indexes, then the same descriptor will be used for all of them.
     * <p>
     * Returns true if both tint color descriptors have the same count of colored layers and
     * if each layer has the same tint index and color. Returns false otherwise.
     *
     * @param other the other descriptor to compare to
     * @return True if both tint color descriptors are considered equal, False otherwise.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:49
     */
    boolean equals(IObjectColor other);
    
}
