/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 01:10
 */

package net.normslabs.nlmc_core.items.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.exceptions.ValidationException;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.models.abstracts.ItemModel;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class CubeTopItemModel extends ItemModel<CubeTopItemModel, CubeTopItemModel.CubeTopItemModelBuilder> {
    
    private static final String textureTopBottomKey = "topBottom";
    private static final String textureSideKey = "side";
    
    public CubeTopItemModel() {
        super(NlmcItemModelManager.MC_CUSTOM_CUBE_ITEM_MODEL_LOC);
    }
    
    @Override
    public void validateForBuild() {
        if (this.getRenderer() == null) {
            throw new ValidationException("CubeTopItemModel must have a renderer set.");
        }
        if (this.getTextureMap().containsKey(textureTopBottomKey)) {
            throw new ValidationException("CubeTopItemModel requires a texture named ["+textureTopBottomKey+"].");
        }
        if (this.getTextureMap().containsKey(textureSideKey)) {
            throw new ValidationException("CubeTopItemModel requires a texture named ["+textureSideKey+"].");
        }
    }
    
    @Override
    public CubeTopItemModelBuilder getBuilder() {
        return new CubeTopItemModelBuilder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public Texture getTopBottomTexture() {
        return this.getTextureMap().get(textureTopBottomKey);
    }
    
    public Texture getSideTexture() {
        return this.getTextureMap().get(textureSideKey);
    }
    
    
    protected void setTopBottomTexture(ResourceLocation textureLocation) {
        this.setTopBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setTopBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setTopBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setTopBottomTexture(ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
    }
    
    protected void setTopBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    protected void setSideTexture(ResourceLocation textureLocation) {
        this.setSideTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setSideTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setSideTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setSideTexture(ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureSideKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
    }
    
    protected void setSideTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureSideKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    public class CubeTopItemModelBuilder extends ItemModel<CubeTopItemModel, CubeTopItemModel.CubeTopItemModelBuilder>.ItemModelBuilder {
        
        public CubeTopItemModelBuilder(CubeTopItemModel initialBuildable) {
            super(initialBuildable);
        }
        
        
        public CubeTopItemModelBuilder setTopBottomTexture(ResourceLocation textureLocation) {
            this.buildable.setTopBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this;
        }
        
        public CubeTopItemModelBuilder setTopBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setTopBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this;
        }
        
        public CubeTopItemModelBuilder setTopBottomTexture(ResourceLocation textureLocation, Color layerColor) {
            Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            this.buildable.addTextureLayer(texture);
            return this;
        }
        
        public CubeTopItemModelBuilder setTopBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureTopBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this;
        }
        
        public CubeTopItemModelBuilder setSideTexture(ResourceLocation textureLocation) {
            this.buildable.setSideTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this;
        }
        
        public CubeTopItemModelBuilder setSideTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setSideTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this;
        }
        
        public CubeTopItemModelBuilder setSideTexture(ResourceLocation textureLocation, Color layerColor) {
            Texture texture = new Texture(textureSideKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            this.buildable.addTextureLayer(texture);
            return this;
        }
        
        public CubeTopItemModelBuilder setSideTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureSideKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this;
        }
        
    }
    
}
