/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:43
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.abstracts.IModelDescriptor;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;
import net.normslabs.nlmc_core.rendering.RendererTypes;
import net.normslabs.nlmc_core.rendering.Texture;

import java.util.Map;

public interface IItemModelDescriptor extends IModelDescriptor<Item, NlmcItemColor> {
    
    RendererTypes getRenderer();
    
    ResourceLocation getParentModel();
    
    Map<String, Texture> getTextureMap();
    
    NlmcItemColor getColorDescriptor();
    
}
