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

public class CustomCubeItemModel extends ItemModelDescriptor {
    private static final String textureTopKey = "top";
    private static final String textureBottomKey = "bottom";
    private static final String textureNorthKey = "north";
    private static final String textureSouthKey = "south";
    private static final String textureEastKey = "east";
    private static final String textureWestKey = "west";
    
    public CustomCubeItemModel() {
        super(NlmcItemModelManager.MC_CUSTOM_CUBE_ITEM_MODEL_LOC);
    }
    
    public Texture getTopTexture() {
        return this.getTextureMap().get(textureTopKey);
    }
    
    public CustomCubeItemModel setTopTexture(ResourceLocation textureLocation) {
        return this.setTopTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setTopTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setTopTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setTopTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setTopTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setTopTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureTopKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    
    
    public Texture getBottomTexture() {
        return this.getTextureMap().get(textureBottomKey);
    }
    
    public CustomCubeItemModel setBottomTexture(ResourceLocation textureLocation) {
        return this.setBottomTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setBottomTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setBottomTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setBottomTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setBottomTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    
    
    public Texture getNorthTexture() {
        return this.getTextureMap().get(textureNorthKey);
    }
    
    public CustomCubeItemModel setNorthTexture(ResourceLocation textureLocation) {
        return this.setNorthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setNorthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setNorthTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setNorthTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setNorthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setNorthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    
    
    public Texture getSouthTexture() {
        return this.getTextureMap().get(textureSouthKey);
    }
    
    public CustomCubeItemModel setSouthTexture(ResourceLocation textureLocation) {
        return this.setSouthTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setSouthTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setBottomTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setSouthTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setSouthTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setSouthTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    
    
    public Texture getEastTexture() {
        return this.getTextureMap().get(textureEastKey);
    }
    
    public CustomCubeItemModel setEastTexture(ResourceLocation textureLocation) {
        return this.setEastTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setEastTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setEastTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setEastTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setEastTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setEastTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
    
    
    
    public Texture getWestTexture() {
        return this.getTextureMap().get(textureWestKey);
    }
    
    public CustomCubeItemModel setWestTexture(ResourceLocation textureLocation) {
        return this.setWestTexture(textureLocation, null, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setWestTexture(ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        return this.setWestTexture(textureLocation, null, blockLightEmissivity, skyLightEmissivity);
    }
    
    public CustomCubeItemModel setWestTexture(ResourceLocation textureLocation, Color layerColor) {
        return this.setWestTexture(textureLocation, layerColor, Texture.DEFAULT_EMISSIVITY_VALUE, Texture.DEFAULT_EMISSIVITY_VALUE);
    }
    
    public CustomCubeItemModel setWestTexture(ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        Texture texture = new Texture(textureBottomKey, textureLocation, layerColor, blockLightEmissivity, skyLightEmissivity);
        this.addTextureLayer(texture);
        return this;
    }
}
