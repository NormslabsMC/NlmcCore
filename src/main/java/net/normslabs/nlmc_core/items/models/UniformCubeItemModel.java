/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:44
 */

package net.normslabs.nlmc_core.items.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.abstracts.ItemModelDescriptor;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class UniformCubeItemModel extends ItemModelDescriptor {
    
    public UniformCubeItemModel() {
        super(NlmcItemModelManager.MC_CUBEALL_ITEM_MODEL_LOC);
    }
    
    public UniformCubeItemModel addTextureLayer(String textureKey, ResourceLocation textureLocation) {
        return this.addTextureLayer(textureKey, textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public UniformCubeItemModel addTextureLayer(String textureKey, ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.addTextureLayer(textureKey, textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public UniformCubeItemModel addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
        return this;
    }
    
    public UniformCubeItemModel addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
}
