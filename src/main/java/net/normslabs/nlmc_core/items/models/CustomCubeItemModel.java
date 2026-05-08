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

public class CustomCubeItemModel extends
        ItemModel<CustomCubeItemModel, CustomCubeItemModel.CustomCubeItemModelBuilder> {
    
    private static final String textureTopKey = "top";
    private static final String textureBottomKey = "bottom";
    private static final String textureNorthKey = "north";
    private static final String textureSouthKey = "south";
    private static final String textureEastKey = "east";
    private static final String textureWestKey = "west";
    
    public CustomCubeItemModel() {
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
    public CustomCubeItemModelBuilder getBuilder() {
        return new CustomCubeItemModelBuilder(this);
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
    
    
    public class CustomCubeItemModelBuilder extends ItemModel<CustomCubeItemModel, CustomCubeItemModel.CustomCubeItemModelBuilder>.ItemModelBuilder {
        
        public CustomCubeItemModelBuilder(CustomCubeItemModel initialBuildable) {
            super(initialBuildable);
        }
        
        
        public CustomCubeItemModelBuilder setTopTexture(ResourceLocation textureLocation) {
            this.buildable.setTopTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setTopTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setTopTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setTopTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setTopTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setTopTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureTopKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeItemModelBuilder setBottomTexture(ResourceLocation textureLocation) {
            this.buildable.setBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setBottomTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setBottomTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeItemModelBuilder setNorthTexture(ResourceLocation textureLocation) {
            this.buildable.setNorthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setNorthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setNorthTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setNorthTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setNorthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setNorthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeItemModelBuilder setSouthTexture(ResourceLocation textureLocation) {
            this.buildable.setSouthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setSouthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setSouthTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setSouthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setSouthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeItemModelBuilder setEastTexture(ResourceLocation textureLocation) {
            this.buildable.setEastTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setEastTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setEastTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setEastTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setEastTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setEastTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
        
        
        
        public CustomCubeItemModelBuilder setWestTexture(ResourceLocation textureLocation) {
            this.buildable.setWestTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setWestTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
            this.buildable.setWestTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setWestTexture(ResourceLocation textureLocation, Color layerColor) {
            this.buildable.setWestTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
            return this.self();
        }
        
        public CustomCubeItemModelBuilder setWestTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
            Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
            this.buildable.addTextureLayer(texture);
            return this.self();
        }
    }
}
