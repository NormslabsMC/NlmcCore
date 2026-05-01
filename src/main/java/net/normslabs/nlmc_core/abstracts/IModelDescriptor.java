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

public interface IModelDescriptor<TMcObject, TObjectColor extends IObjectColor> {
    
    RendererTypes getRenderer();
    
    ResourceLocation getParentModel();
    
    Map<String, Texture> getTextureMap();
    
    TObjectColor getColorDescriptor();

}
