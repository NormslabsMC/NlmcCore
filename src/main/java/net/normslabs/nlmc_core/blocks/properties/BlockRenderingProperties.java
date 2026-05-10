/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 22:59
 */

package net.normslabs.nlmc_core.blocks.properties;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;

public class BlockRenderingProperties extends
        AbstractBuildable<BlockRenderingProperties, BlockRenderingProperties.Builder> {
    
    private final BlockDescriptor<?,?,?,?,? extends Block> parentDescriptor;
    private int lightEmission = 0;
    private boolean hasCollision = true;
    private boolean isSuffocating = true;
    private boolean occludesNeighboringBlocks = true;
    private boolean isViewBlocking = true;
    private boolean emitsParticlesOnBreak = true;
    private MapColor mapColor = null;
    private SoundType soundType = null;
    private BlockBehaviour.StatePredicate emitsLightOn = (state, world, pos) -> false;
    
    
    public BlockRenderingProperties(BlockDescriptor<?,?,?,?,? extends Block> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
    
    
    @Override
    public void validateForBuild() {
        if (this.mapColor == null) {
        
        }
        if (this.soundType == null) {
        
        }
    
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public boolean emitsParticlesOnBreak() {
        return this.emitsParticlesOnBreak;
    }
    
    public boolean hasCollision() {
        return this.hasCollision;
    }
    
    public boolean isSuffocating() {
        return this.isSuffocating;
    }
    
    public boolean isViewBlocking() {
        return this.isViewBlocking;
    }
    
    public int getLightEmission() {
        return this.lightEmission;
    }
    
    public MapColor getMapColor() {
        return this.mapColor;
    }
    
    public boolean occludesNeighboringBlocks() {
        return this.occludesNeighboringBlocks;
    }
    
    public BlockDescriptor<?,?,?,?,?> getParentDescriptor() {
        return this.parentDescriptor;
    }
    
    public SoundType getSoundType() {
        return this.soundType;
    }
    
    public BlockBehaviour.StatePredicate getEmitsLightOn() {
        return this.emitsLightOn;
    }
    
    protected void setEmitsParticlesOnBreak(boolean emitsParticlesOnBreak) {
        this.emitsParticlesOnBreak = emitsParticlesOnBreak;
    }
    
    protected void setHasCollision(boolean hasCollision) {
        this.hasCollision = hasCollision;
    }
    
    protected void setIsSuffocating(boolean suffocating) {
        this.isSuffocating = suffocating;
    }
    
    protected void setIsViewBlocking(boolean viewBlocking) {
        this.isViewBlocking = viewBlocking;
    }
    
    protected void setLightEmission(int lightEmission) {
        if (lightEmission < 0 || lightEmission > 15) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Light emission for ["+this.parentDescriptor.getIdentifier()+"] must be between 0 and 15");
        }
        this.lightEmission = lightEmission;
    }
    
    protected void setMapColor(MapColor mapColor) {
        this.mapColor = mapColor;
    }
    
    protected void setOccludesNeighboringBlocks(boolean occludesNeighboringBlocks) {
        this.occludesNeighboringBlocks = occludesNeighboringBlocks;
    }
    
    protected void setSoundType(SoundType soundType) {
        this.soundType = soundType;
    }
    
    protected void setEmitsLightOn(BlockBehaviour.StatePredicate emitsLightOn) {
        this.emitsLightOn = emitsLightOn;
    }
    
    public class Builder extends AbstractBuilder<Builder, BlockRenderingProperties> {
        
        protected Builder(BlockRenderingProperties initialBuildable) {
            super(initialBuildable);
        }
        
        public Builder setEmitsParticlesOnBreak(boolean emitsParticlesOnBreak) {
            this.buildable.emitsParticlesOnBreak = emitsParticlesOnBreak;
            return this.self();
        }
        
        public Builder isSolidBlock() {
            this.buildable.hasCollision = true;
            this.buildable.isSuffocating = true;
            return this.self();
        }
        
        public Builder isEtherealBlock() {
            this.buildable.hasCollision = false;
            this.buildable.isSuffocating = false;
            return this.self();
        }
        
        public Builder setHasCollision(boolean hasCollision) {
            this.buildable.hasCollision = hasCollision;
            return this.self();
        }
        
        public Builder setIsSuffocating(boolean suffocating) {
            this.buildable.isSuffocating = suffocating;
            return this.self();
        }
        
        public Builder isOpaque() {
            this.buildable.isViewBlocking = true;
            this.buildable.occludesNeighboringBlocks = true;
            return this.self();
        }
        
        public Builder isTransparent() {
            this.buildable.isViewBlocking = false;
            this.buildable.occludesNeighboringBlocks = false;
            return this.self();
        }
        
        public Builder setIsViewBlocking(boolean viewBlocking) {
            this.buildable.isViewBlocking = viewBlocking;
            return this.self();
        }
        
        public Builder setOccludesNeighboringBlocks(boolean occludesNeighboringBlocks) {
            this.buildable.occludesNeighboringBlocks = occludesNeighboringBlocks;
            return this.self();
        }
        
        public Builder setLightEmission(int lightEmission) {
            this.buildable.setLightEmission(lightEmission);
            return this.self();
        }
        
        public Builder setMapColor(MapColor mapColor) {
            this.buildable.mapColor = mapColor;
            return this.self();
        }
        
        public Builder setSoundType(SoundType soundType) {
            this.buildable.soundType = soundType;
            return this.self();
        }
        
        protected Builder setEmitsLightOn(BlockBehaviour.StatePredicate emitsLightOn) {
            this.buildable.emitsLightOn = emitsLightOn;
            return this.self();
        }
        
    }
}
