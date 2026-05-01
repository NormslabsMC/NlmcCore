/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:31
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.normslabs.nlmc_core.abstracts.IModelDescriptor;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;
import net.normslabs.nlmc_core.rendering.RendererTypes;
import net.normslabs.nlmc_core.rendering.Texture;

import java.util.HashMap;
import java.util.Map;

public abstract class ItemModelDescriptor implements IModelDescriptor<Item, NlmcItemColor> {
    
    private int nextTextureLayer = 0;
    private RendererTypes renderer;
    private ResourceLocation parentModel;
    private final Map<String, Texture> textureMap;
    private final NlmcItemColor itemColorDescriptor;
    
    protected ItemModelDescriptor() {
        this.textureMap = new HashMap<>();
        this.itemColorDescriptor = new NlmcItemColor();
    }
    
    protected ItemModelDescriptor(ResourceLocation parentModel) {
        this();
        this.parentModel = parentModel;
    }
    
    
    public RendererTypes getRenderer() {
        return this.renderer;
    }
    
    @Override
    public NlmcItemColor getColorDescriptor() {
        return this.itemColorDescriptor;
    }
    
    @Override
    public ResourceLocation getParentModel() {
        return this.parentModel;
    }
    
    @Override
    public Map<String, Texture> getTextureMap() {
        return this.textureMap;
    }
    
    protected int getNextTextureLayer() {
        return this.nextTextureLayer;
    }
    
    protected void addTextureLayer(Texture texture) {
        if (texture.hasColor()) {
            texture.setTintIndex(this.nextTextureLayer);
            this.itemColorDescriptor.addTintColor(this.nextTextureLayer, texture.getLayerColor());
        }
        this.textureMap.put(texture.getTextureKey(), texture);
        this.nextTextureLayer++;
    }
}
