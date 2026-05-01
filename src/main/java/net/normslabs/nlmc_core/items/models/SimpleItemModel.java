/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:45
 */

package net.normslabs.nlmc_core.items.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.abstracts.ItemModelDescriptor;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class SimpleItemModel extends ItemModelDescriptor {
    
    public SimpleItemModel() {
        super(NlmcItemModelManager.MC_ITEM_GENERATED_MODEL_LOC);
    }
    
    public SimpleItemModel addTextureLayer(ResourceLocation textureLocation) {
        return this.addTextureLayer(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public SimpleItemModel addTextureLayer(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.addTextureLayer(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public SimpleItemModel addTextureLayer(ResourceLocation textureLocation, Color layerColor) {
        return this.addTextureLayer(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public SimpleItemModel addTextureLayer(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        if (this.getNextTextureLayer() > 4) {
            throw new RuntimeException("Cannot add texture layer to SimpleItemModel: Too many texture layers: maximum is 5.");
        }
        String textureKey = "layer" + this.getNextTextureLayer();
        Texture texture = new Texture(textureKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
}
