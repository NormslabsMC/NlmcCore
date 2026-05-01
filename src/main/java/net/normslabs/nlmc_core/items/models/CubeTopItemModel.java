/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 01:10
 */

package net.normslabs.nlmc_core.items.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.abstracts.ItemModelDescriptor;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class CubeTopItemModel extends ItemModelDescriptor {
    private static final String textureTopBottomKey = "topBottom";
    private static final String textureSideKey = "side";
    
    public CubeTopItemModel() {
        super(NlmcItemModelManager.MC_CUSTOM_CUBE_ITEM_MODEL_LOC);
    }
    
    public Texture getTopBottomTexture() {
        return this.getTextureMap().get(textureTopBottomKey);
    }
    
    public CubeTopItemModel setTopBottomTexture(ResourceLocation textureLocation) {
        return this.setTopBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CubeTopItemModel setTopBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setTopBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CubeTopItemModel setTopBottomTexture(ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
        return this;
    }
    
    public CubeTopItemModel setTopBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    public Texture getSideTexture() {
        return this.getTextureMap().get(textureSideKey);
    }
    
    public CubeTopItemModel setSideTexture(ResourceLocation textureLocation) {
        return this.setSideTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CubeTopItemModel setSideTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setSideTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CubeTopItemModel setSideTexture(ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureSideKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
        return this;
    }
    
    public CubeTopItemModel setSideTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureSideKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
}
