/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:44
 */

package net.normslabs.nlmc_core.blocks.models;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.blocks.models.abstracts.BlockModel;
import net.normslabs.nlmc_core.exceptions.ValidationException;
import net.normslabs.nlmc_core.items.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.models.abstracts.ItemModel;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class UniformCubeBlockModel extends
        BlockModel<UniformCubeBlockModel, UniformCubeBlockModel.UniformCubeBlockModelBuilder> {
    
    public UniformCubeBlockModel() {
        super(NlmcItemModelManager.MC_CUBEALL_ITEM_MODEL_LOC);
    }
    
    @Override
    public void validateForBuild() {
        if (this.getRenderer() == null) {
            throw new ValidationException("UniformCubeItemModel must have a renderer set.");
        }
        if (this.getTextureMap().isEmpty()) {
            throw new ValidationException("UniformCubeItemModel must have at least one texture layer.");
        }
    }
    
    @Override
    public UniformCubeBlockModelBuilder getBuilder() {
        return new UniformCubeBlockModelBuilder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    protected void addTextureLayer(String textureKey, ResourceLocation textureLocation) {
        this.addTextureLayer(textureKey, textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void addTextureLayer(String textureKey, ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.addTextureLayer(textureKey, textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor) {
        Texture texture = new Texture(textureKey, textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
        this.addTextureLayer(texture);
    }
    
    protected void addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    public class UniformCubeBlockModelBuilder extends BlockModel<UniformCubeBlockModel, UniformCubeBlockModelBuilder>.BlockModelBuilder {
        
        public UniformCubeBlockModelBuilder(UniformCubeBlockModel blankModel) {
            super(blankModel);
        }
        
        public UniformCubeBlockModelBuilder addTextureLayer(String textureKey, ResourceLocation textureLocation) {
            this.buildable.addTextureLayer(textureKey, textureLocation);
            return this;
        }
        
        public UniformCubeBlockModelBuilder addTextureLayer(String textureKey, ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.addTextureLayer(textureKey, textureLocation, blockLightEmissivity, skyLightEmissivity);
            return this;
        }
        
        public UniformCubeBlockModelBuilder addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor) {
            this.buildable.addTextureLayer(textureKey, textureLocation, layerColor);
            return this;
        }
        
        public UniformCubeBlockModelBuilder addTextureLayer(String textureKey, ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.addTextureLayer(textureKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            return this;
        }
    }
}
