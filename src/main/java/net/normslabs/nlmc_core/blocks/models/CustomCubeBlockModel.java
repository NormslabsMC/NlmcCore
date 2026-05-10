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
import net.normslabs.nlmc_core.datagen.NlmcItemModelManager;
import net.normslabs.nlmc_core.items.models.CustomCubeItemModel;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.Color;

public class CustomCubeBlockModel extends
        BlockModel<CustomCubeBlockModel,
                CustomCubeBlockModel.CustomCubeBlockModelBuilder,
                CustomCubeItemModel,
                CustomCubeItemModel.CustomCubeItemModelBuilder> {
    
    private static final String textureTopKey = "top";
    private static final String textureBottomKey = "bottom";
    private static final String textureNorthKey = "north";
    private static final String textureSouthKey = "south";
    private static final String textureEastKey = "east";
    private static final String textureWestKey = "west";
    
    public CustomCubeBlockModel() {
        super(NlmcItemModelManager.MC_CUSTOM_CUBE_ITEM_MODEL_LOC);
    }
    
    @Override
    public void validateForBuild() {
        if (this.getRenderer() == null) {
            throw new ValidationException("CustomCubeItemModel must have a renderer set.");
        }
        if (this.getTextureMap().containsKey(textureTopKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureTopKey+"].");
        }
        if (this.getTextureMap().containsKey(textureBottomKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureBottomKey+"].");
        }
        if (this.getTextureMap().containsKey(textureNorthKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureNorthKey+"].");
        }
        if (this.getTextureMap().containsKey(textureSouthKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureSouthKey+"].");
        }
        if (this.getTextureMap().containsKey(textureEastKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureEastKey+"].");
        }
        if (this.getTextureMap().containsKey(textureWestKey)) {
            throw new ValidationException("CustomCubeItemModel requires a texture named ["+textureWestKey+"].");
        }
        if (this.getTextureMap().size() > 6) {
            throw new ValidationException("CustomCubeItemModel cannot have more than 6 textures.");
        }
    }
    
    @Override
    public CustomCubeBlockModelBuilder getBuilder() {
        return new CustomCubeBlockModelBuilder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public Texture getTopTexture() {
        return this.getTextureMap().get(textureTopKey);
    }
    
    public Texture getBottomTexture() {
        return this.getTextureMap().get(textureBottomKey);
    }
    
    public Texture getNorthTexture() {
        return this.getTextureMap().get(textureNorthKey);
    }
    
    public Texture getSouthTexture() {
        return this.getTextureMap().get(textureSouthKey);
    }
    
    public Texture getEastTexture() {
        return this.getTextureMap().get(textureEastKey);
    }
    
    public Texture getWestTexture() {
        return this.getTextureMap().get(textureWestKey);
    }
    
    
    
    protected void setTopTexture(ResourceLocation textureLocation) {
        this.setTopTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setTopTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setTopTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setTopTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setTopTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setTopTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureTopKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    
    protected void setBottomTexture(ResourceLocation textureLocation) {
        this.setBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setBottomTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setBottomTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    
    protected void setNorthTexture(ResourceLocation textureLocation) {
        this.setNorthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setNorthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setNorthTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setNorthTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setNorthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setNorthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    
    protected void setSouthTexture(ResourceLocation textureLocation) {
        this.setSouthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setSouthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setSouthTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setSouthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setSouthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    
    protected void setEastTexture(ResourceLocation textureLocation) {
        this.setEastTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setEastTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setEastTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setEastTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setEastTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setEastTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    
    
    protected void setWestTexture(ResourceLocation textureLocation) {
        this.setWestTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setWestTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.setWestTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    protected void setWestTexture(ResourceLocation textureLocation, Color layerColor) {
        this.setWestTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    protected void setWestTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
    }
    
    @Override
    public CustomCubeItemModel toItemModel() {
        return CustomCubeItemModel.createFromBlockModel(this);
    }
    
    public class CustomCubeBlockModelBuilder extends BlockModel<
            CustomCubeBlockModel,
            CustomCubeBlockModelBuilder,
            CustomCubeItemModel,
            CustomCubeItemModel.CustomCubeItemModelBuilder>.BlockModelBuilder {
        
        public CustomCubeBlockModelBuilder(CustomCubeBlockModel blankModel) {
            super(blankModel);
        }
        
        
        public CustomCubeBlockModelBuilder setTopTexture(ResourceLocation textureLocation) {
            this.buildable.setTopTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setTopTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setTopTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setTopTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setTopTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setTopTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureTopKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeBlockModelBuilder setBottomTexture(ResourceLocation textureLocation) {
            this.buildable.setBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setBottomTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setBottomTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeBlockModelBuilder setNorthTexture(ResourceLocation textureLocation) {
            this.buildable.setNorthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setNorthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setNorthTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setNorthTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setNorthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setNorthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeBlockModelBuilder setSouthTexture(ResourceLocation textureLocation) {
            this.buildable.setSouthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setSouthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setSouthTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setSouthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setSouthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeBlockModelBuilder setEastTexture(ResourceLocation textureLocation) {
            this.buildable.setEastTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setEastTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setEastTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setEastTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setEastTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setEastTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeBlockModelBuilder setWestTexture(ResourceLocation textureLocation) {
            this.buildable.setWestTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setWestTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setWestTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setWestTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setWestTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeBlockModelBuilder setWestTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
    }
}
