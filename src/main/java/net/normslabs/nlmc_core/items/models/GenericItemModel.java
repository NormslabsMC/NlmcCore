/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:45
 */

package net.normslabs.nlmc_core.items.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.exceptions.ValidationException;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.models.abstracts.ItemModel;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class GenericItemModel extends ItemModel<GenericItemModel, GenericItemModel.GenericItemModelBuilder> {
    
    public GenericItemModel() {
        super(NlmcItemModelManager.MC_ITEM_GENERATED_MODEL_LOC);
    }
    
    @Override
    public void validateForBuild() {
        if (this.getRenderer() == null) {
            throw new ValidationException("GenericItemModel must have a renderer set.");
        }
        if (this.getTextureMap().isEmpty()) {
            throw new ValidationException("GenericItemModel must have at least one texture layer.");
        }
    }
    
    @Override
    public GenericItemModelBuilder getBuilder() {
        return new GenericItemModelBuilder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    protected void addTextureLayer(ResourceLocation textureLocation) {
        this.addTextureLayer(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void addTextureLayer(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.addTextureLayer(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void addTextureLayer(ResourceLocation textureLocation, Color layerColor) {
        this.addTextureLayer(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void addTextureLayer(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        if (this.getNextTextureLayer() > 4) {
            throw new RuntimeException("Cannot add texture layer to SimpleItemModel: Too many texture layers: maximum is 5.");
        }
        String textureKey = "layer" + this.getNextTextureLayer();
        Texture texture = new Texture(textureKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    public class GenericItemModelBuilder extends ItemModel<GenericItemModel, GenericItemModelBuilder>.ItemModelBuilder {
        
        public GenericItemModelBuilder(GenericItemModel model) {
            super(model);
        }
        
        public GenericItemModelBuilder addTextureLayer(ResourceLocation textureLocation) {
            this.buildable.addTextureLayer(textureLocation);
            return this.self();
        }
        
        public GenericItemModelBuilder addTextureLayer(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.addTextureLayer(textureLocation, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public GenericItemModelBuilder addTextureLayer(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.addTextureLayer(textureLocation, layerColor);
            return this.self();
        }
        
        public GenericItemModelBuilder addTextureLayer(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.addTextureLayer(textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
    }
}
