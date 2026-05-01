/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:47
 */

package net.normslabs.nlmc_core.rendering;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.utils.Color;

public class Texture {
    public static final int DEFAULT_EMISSIVITY_VALUE = 0;
    
    private final String textureKey;
    private final ResourceLocation textureLocation;
    private Color layerColor = null;
    private int blockLightEmissivity = DEFAULT_EMISSIVITY_VALUE;
    private int skyLightEmissivity = DEFAULT_EMISSIVITY_VALUE;
    private int tintIndex;
    
    public Texture(String textureKey, ResourceLocation textureLocation) {
        this.textureKey = textureKey;
        this.textureLocation = textureLocation;
    }
    
    public Texture(String textureKey, ResourceLocation textureLocation, int blockLightEmissivity, int skyLightEmissivity) {
        this.textureKey = textureKey;
        this.textureLocation = textureLocation;
        this.blockLightEmissivity = blockLightEmissivity;
        this.skyLightEmissivity = skyLightEmissivity;
    }
    
    public Texture(String textureKey, ResourceLocation textureLocation, Color layerColor) {
        this(textureKey, textureLocation);
        this.layerColor = layerColor;
    }
    
    public Texture(String textureKey, ResourceLocation textureLocation, Color layerColor, int blockLightEmissivity, int skyLightEmissivity) {
        this(textureKey, textureLocation, blockLightEmissivity, skyLightEmissivity);
        this.layerColor = layerColor;
    }
    
    public String getTextureKey() {
        return this.textureKey;
    }
    
    public ResourceLocation getTextureLocation() {
        return this.textureLocation;
    }
    
    public Color getLayerColor() {
        return this.layerColor;
    }
    
    public int getBlockLightEmissivity() {
        return this.blockLightEmissivity;
    }
    
    public int getSkyLightEmissivity() {
        return this.skyLightEmissivity;
    }
    
    public int getTintIndex() {
        return this.tintIndex;
    }
    
    public void setTintIndex(int tintIndex) {
        this.tintIndex = tintIndex;
    }
    
    public void setBlockLightEmissivity(int blockLightEmissivity) {
        this.blockLightEmissivity = blockLightEmissivity;
    }
    
    public void setSkyLightEmissivity(int skyLightEmissivity) {
        this.skyLightEmissivity = skyLightEmissivity;
    }
    
    public boolean hasColor() {
        return this.layerColor != null;
    }
}
