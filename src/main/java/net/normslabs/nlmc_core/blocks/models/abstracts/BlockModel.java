/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:31
 */

package net.normslabs.nlmc_core.blocks.models.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.items.models.abstracts.ItemModel;
import net.normslabs.nlmc_core.rendering.NlmcBlockColor;
import net.normslabs.nlmc_core.rendering.RendererTypes;
import net.normslabs.nlmc_core.rendering.Texture;

import java.util.HashMap;
import java.util.Map;

public abstract class BlockModel<
        TSelf extends BlockModel<TSelf, TBuilder, TItemModel, TItemModelBuilder>,
        TBuilder extends BlockModel<TSelf, TBuilder, TItemModel, TItemModelBuilder>.BlockModelBuilder,
        TItemModel extends ItemModel<TItemModel, TItemModelBuilder>,
        TItemModelBuilder extends ItemModel<TItemModel, TItemModelBuilder>.ItemModelBuilder>
        extends AbstractBuildable<TSelf, TBuilder>
        implements IBlockModel<TSelf, TBuilder, TItemModel, TItemModelBuilder> {
    
    private int nextTextureLayer = 0;
    private RendererTypes renderer;
    private ResourceLocation parentModel;
    private final Map<String, Texture> textureMap;
    private final NlmcBlockColor blockColorDescriptor;
    
    protected BlockModel() {
        this.textureMap = new HashMap<>();
        this.blockColorDescriptor = new NlmcBlockColor();
    }
    
    protected BlockModel(ResourceLocation parentModel) {
        this();
        this.parentModel = parentModel;
    }
    
    
    public RendererTypes getRenderer() {
        return this.renderer;
    }
    
    @Override
    public NlmcBlockColor getColorDescriptor() {
        return this.blockColorDescriptor;
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
    
    protected void setRenderer(RendererTypes renderer) {
        this.renderer = renderer;
    }
    
    protected void addTextureLayer(Texture texture) {
        if (texture.hasColor()) {
            texture.setTintIndex(this.nextTextureLayer);
            this.blockColorDescriptor.addTintColor(this.nextTextureLayer, texture.getLayerColor());
        }
        this.textureMap.put(texture.getTextureKey(), texture);
        this.nextTextureLayer++;
    }
    
    public class BlockModelBuilder extends AbstractBuilder<TBuilder, TSelf> {
        
        public BlockModelBuilder(TSelf initialBuildable) {
            super(initialBuildable);
        }
        
        public TBuilder setRendererType(RendererTypes rendererType) {
            this.buildable.setRenderer(rendererType);
            return this.self();
        }
    }
}
