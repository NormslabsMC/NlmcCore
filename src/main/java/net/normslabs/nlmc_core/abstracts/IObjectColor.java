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

public interface IObjectColor {
    
    boolean needsRegistration();
    
    List<TintColor> getLayerColors();
    
    void addTintColor(int tintIndex, Color color);
    
    boolean equals(IObjectColor other);
    
}
