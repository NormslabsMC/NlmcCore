/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 21:28
 */

package net.normslabs.nlmc_core.blocks;


import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.normslabs.nlmc_core.abstracts.AbstractTooltippedRegistrable;
import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.blocks.abstracts.IBlockDescriptor;
import net.normslabs.nlmc_core.blocks.models.abstracts.IBlockModel;
import net.normslabs.nlmc_core.blocks.properties.*;
import net.normslabs.nlmc_core.items.ItemDescriptor;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModel;
import net.normslabs.nlmc_core.items.types.NlmcBlockItem;
import net.normslabs.nlmc_core.utils.MatterPhases;
import net.normslabs.nlmc_core.utils.TagUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class BlockDescriptor<
        TModel extends IBlockModel<TModel, TModelBuilder, TItemModel, TItemModelBuilder>,
        TModelBuilder extends IBuilder<TModelBuilder, TModel>,
        TItemModel extends IItemModel<TItemModel, TItemModelBuilder>,
        TItemModelBuilder extends IBuilder<TItemModelBuilder, TItemModel>,
        TNlmcType extends Block>
        extends AbstractTooltippedRegistrable<
        BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>,
        BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>.Builder,
        BlockRegistrar, TNlmcType, Block>
        implements IBlockDescriptor<
        BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>,
        BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>.Builder,
        TModel, TModelBuilder, TNlmcType, BlockRegistrar> {
    
    
    private final List<ResourceKey<CreativeModeTab>> creativeTabs;
    protected final List<TagKey<Block>> tags;
    private TModel modelDescriptor;
    private boolean generatesInWorld = false;
    private boolean isBlockItem = false;
    private BlockBehaviour.Properties mcBlockProperties;
    private final BlockBehaviour parentBlockProperties;
    private final BlockPhysicsProperties physicsProperties;
    private final BlockRenderingProperties renderingProperties;
    private final BlockDropsProperties dropsProperties;
    private final BlockBlockItemProperties<TItemModel, TItemModelBuilder> blockItemProperties;
    private final BlockWorldgenProperties worldgenProperties;
    
    public BlockDescriptor(String objectNamespace, String objectIdentifier, TModel initialModel,
                           Function<BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>, TNlmcType> objectCreatorFunction,
                           String displayNameDictionaryKeyPrefix, BlockBehaviour parentBlockProperties) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction, displayNameDictionaryKeyPrefix);
        this.modelDescriptor = initialModel;
        this.parentBlockProperties = parentBlockProperties;
        this.creativeTabs = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.physicsProperties = new BlockPhysicsProperties(this);
        this.renderingProperties = new BlockRenderingProperties(this);
        this.dropsProperties = new BlockDropsProperties(this);
        this.blockItemProperties = new BlockBlockItemProperties<>(
                this,
                new ItemDescriptor<>(
                        objectNamespace,
                        objectIdentifier,
                        initialModel.toItemModel(),
                        descriptor -> new NlmcBlockItem(this)));
        this.worldgenProperties = new BlockWorldgenProperties(this);
        
    }
    
    public BlockDescriptor(String objectNamespace, String objectIdentifier, TModel initialModel,
                           Function<BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>, TNlmcType> objectCreatorFunction,
                           String displayNameDictionaryKeyPrefix) {
        this(objectNamespace, objectIdentifier, initialModel, objectCreatorFunction, displayNameDictionaryKeyPrefix, null);
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public boolean isBlockItem() {
        return this.isBlockItem;
    }
    
    public boolean generatesInWorld() {
        return this.generatesInWorld;
    }
    
    public BlockBlockItemProperties<TItemModel, TItemModelBuilder> getBlockItemProperties() {
        return this.blockItemProperties;
    }
    
    public BlockDropsProperties getDropsProperties() {
        return this.dropsProperties;
    }
    
    public BlockBehaviour getParentBlockProperties() {
        return this.parentBlockProperties;
    }
    
    public BlockPhysicsProperties getPhysicsProperties() {
        return this.physicsProperties;
    }
    
    public BlockRenderingProperties getRenderingProperties() {
        return this.renderingProperties;
    }
    
    public BlockWorldgenProperties getWorldgenProperties() {
        return this.worldgenProperties;
    }
    
    @Override
    public TModel getModelDescriptor() {
        return this.modelDescriptor;
    }
    
    @Override
    public List<TagKey<Block>> getTags() {
        return this.tags;
    }
    
    @Override
    public BlockBehaviour.Properties getMcBlockProperties() {
        if (!this.isBuilt) {
            throw new IllegalStateException("Cannot create MC block properties before its descriptor is built.");
        }
        if (this.mcBlockProperties == null) {
            BlockBehaviour.Properties blockProperties;
            if (this.parentBlockProperties != null) {
                blockProperties = BlockBehaviour.Properties.copy(this.parentBlockProperties);
            } else {
                blockProperties = BlockBehaviour.Properties.of();
            }
            blockProperties.explosionResistance(this.physicsProperties.getExplosionResistance())
                           .destroyTime(this.physicsProperties.getHardness())
                           .friction(this.physicsProperties.getFrictionCoefficient())
                           .jumpFactor(this.physicsProperties.getJumpHeightMultiplier())
                           .speedFactor(this.physicsProperties.getSpeedFactor())
                           .isRedstoneConductor(this.physicsProperties.getConductsRedstoneOn());
            if (this.physicsProperties.isFlammable()) {
                blockProperties.ignitedByLava();
            }
            if (this.physicsProperties.getPhaseAtSTP() == MatterPhases.LIQUID) {
                blockProperties.liquid();
            } else if (this.physicsProperties.getPhaseAtSTP() == MatterPhases.GAS) {
                blockProperties.air();
            }
            blockProperties.lightLevel((blockState) -> this.renderingProperties.getLightEmission())
                           .isSuffocating((state, world, pos) -> this.renderingProperties.isSuffocating())
                           .isViewBlocking((blockState, reader, pos) -> this.renderingProperties.isViewBlocking())
                           .mapColor(this.renderingProperties.getMapColor())
                           .sound(this.renderingProperties.getSoundType());
            if (!this.renderingProperties.hasCollision()) {
                blockProperties.noCollission();
            }
            if (!this.renderingProperties.occludesNeighboringBlocks()) {
                blockProperties.noOcclusion();
            }
            if (!this.renderingProperties.emitsParticlesOnBreak()) {
                blockProperties.noParticlesOnBreak();
            }
            // TODO: finish this
            
            this.mcBlockProperties = blockProperties;
        }
        return this.mcBlockProperties;
    }
    
    @Override
    public void addTag(ResourceLocation tagLocation) {
        this.tags.add(TagUtils.createBlockTag(tagLocation));
    }
    
    @Override
    public void addTag(TagKey<Block> tagKey) {
        this.tags.add(tagKey);
    }
    
    @Override
    public void addTags(List<TagKey<Block>> tagList) {
        this.tags.addAll(tagList);
    }
    
    @Override
    public void setModelDescriptor(TModel modelDescriptor) {
        this.modelDescriptor = modelDescriptor;
    }
    
    protected void setGeneratesInWorld(boolean generatesInWorld) {
        this.generatesInWorld = generatesInWorld;
    }
    
    protected void setIsBlockItem(boolean blockItem) {
        isBlockItem = blockItem;
    }
    
    public class Builder extends AbstractTooltippedRegistrable<
            BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>,
            BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType>.Builder,
            BlockRegistrar,
            TNlmcType,
            Block>.Builder {
        
        protected Builder(BlockDescriptor<TModel, TModelBuilder, TItemModel, TItemModelBuilder, TNlmcType> initialBuildable) {
            super(initialBuildable);
            this.registerPreBuildAction((descriptor) -> {
                if (descriptor.isBlockItem()) {
                    descriptor.getBlockItemProperties().getItemDescriptor().setModelDescriptor(
                            descriptor.modelDescriptor.toItemModel().getBuilder().build());
                    if (!descriptor.getBlockItemProperties().getItemDescriptor().isBuilt()) {
                        descriptor.getBlockItemProperties().getItemDescriptor().getBuilder().build();
                    }
                }
            });
        }
        
        public Builder configureModel(Consumer<TModelBuilder> builderFunction) {
            builderFunction.accept(this.buildable.modelDescriptor.getBuilder());
            return this.self();
        }
        
        public Builder configurePhysics(Consumer<BlockPhysicsProperties.Builder> builderFunction) {
            builderFunction.accept(this.buildable.physicsProperties.getBuilder());
            return this.self();
        }
        
        public Builder configureRendering(Consumer<BlockRenderingProperties.Builder> builderFunction) {
            builderFunction.accept(this.buildable.renderingProperties.getBuilder());
            return this.self();
        }
        
        public Builder isBlockItem(Consumer<ItemDescriptor<TItemModel, TItemModelBuilder, NlmcBlockItem>.Builder> builderFunction) {
            this.buildable.isBlockItem = true;
            builderFunction.accept(this.buildable.getBlockItemProperties().getItemDescriptor().getBuilder());
            return this.self();
        }
        
        
    }
}
