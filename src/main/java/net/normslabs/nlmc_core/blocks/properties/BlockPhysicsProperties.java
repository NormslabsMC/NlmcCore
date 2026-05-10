/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 21:57
 */

package net.normslabs.nlmc_core.blocks.properties;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;
import net.normslabs.nlmc_core.utils.MatterPhases;
import net.normslabs.nlmc_core.utils.TemperatureUtils;

public class BlockPhysicsProperties extends AbstractBuildable<BlockPhysicsProperties, BlockPhysicsProperties.Builder> {
    public static int DEFAULT_TEMPERATURE = TemperatureUtils.DEFAULT_SOLID_TEMPERATURE;
    public static float DEFAULT_EXPLOSION_RESISTANCE = 6.0f;
    public static float DEFAULT_FRICTION_COEFFICIENT = 0.6f;
    public static float DEFAULT_HARDNESS = 1.5f;
    public static float DEFAULT_JUMP_MULTIPLIER = 1.0f;
    public static float DEFAULT_SPEED_FACTOR = 1.0f;
    
    private final BlockDescriptor<?,?,?,?, ? extends Block> parentDescriptor;
    private int standardTemperatureInKelvins = Integer.MIN_VALUE;
    private MatterPhases phaseAtSTP = null;
    private float explosionResistance = Float.MIN_VALUE;
    private float hardness = Float.MIN_VALUE;
    private float frictionCoefficient = Float.MIN_VALUE;
    private float jumpHeightMultiplier = Float.MIN_VALUE;
    private float speedFactor = Float.MIN_VALUE;
    private boolean isFlammable = false;
    private BlockBehaviour.StatePredicate conductsRedstoneOn = (state, world, pos) -> true;
    
    public BlockPhysicsProperties(BlockDescriptor<?,?,?,?, ? extends Block> parentDescriptor) {
        this.parentDescriptor = parentDescriptor;
    }
    
    public MatterPhases getPhaseAtSTP() {
        return this.phaseAtSTP;
    }
    
    public float getExplosionResistance() {
        return this.explosionResistance;
    }
    
    public float getFrictionCoefficient() {
        return this.frictionCoefficient;
    }
    
    public float getHardness() {
        return this.hardness;
    }
    
    public float getJumpHeightMultiplier() {
        return this.jumpHeightMultiplier;
    }
    
    public float getSpeedFactor() {
        return this.speedFactor;
    }
    
    public int getStandardTemperatureInKelvins() {
        return this.standardTemperatureInKelvins;
    }
    
    public boolean isFlammable() {
        return this.isFlammable;
    }
    
    public BlockBehaviour.StatePredicate getConductsRedstoneOn() {
        return this.conductsRedstoneOn;
    }
    
    protected void setPhaseAtSTP(MatterPhases phaseAtSTP) {
        this.phaseAtSTP = phaseAtSTP;
    }
    
    protected void setExplosionResistance(float explosionResistance) {
        if (explosionResistance < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Explosion resistance for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.explosionResistance = explosionResistance;
    }
    
    protected void setFrictionCoefficient(float frictionCoefficient) {
        if (frictionCoefficient < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Friction coefficient for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.frictionCoefficient = frictionCoefficient;
    }
    
    protected void setHardness(float hardness) {
        if (hardness < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Hardness for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.hardness = hardness;
    }
    
    protected void setJumpHeightMultiplier(float jumpHeightMultiplier) {
        if (jumpHeightMultiplier < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Jump height multiplier for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.jumpHeightMultiplier = jumpHeightMultiplier;
    }
    
    protected void setSpeedFactor(float speedFactor) {
        if (speedFactor < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Speed factor for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.speedFactor = speedFactor;
    }
    
    protected void setStandardTemperatureInKelvins(int standardTemperatureInKelvins) {
        if (standardTemperatureInKelvins < 0) {
            throw new IllegalArgumentException("["+this.getClass().getSimpleName()+"] : Standard temperature in kelvins for ["+this.parentDescriptor.getIdentifier()+"] must be >= 0");
        }
        this.standardTemperatureInKelvins = standardTemperatureInKelvins;
    }
    
    protected void setIsFlammable(boolean flammable) {
        this.isFlammable = flammable;
    }
    
    protected void setConductsRedstoneOn(BlockBehaviour.StatePredicate conductsRedstoneOn) {
        this.conductsRedstoneOn = conductsRedstoneOn;
    }
    
    @Override
    public void validateForBuild() {
        if (this.standardTemperatureInKelvins == Integer.MIN_VALUE) {
            this.setStandardTemperatureInKelvins(DEFAULT_TEMPERATURE);
        }
        if (this.explosionResistance == Float.MIN_VALUE) {
            this.setExplosionResistance(DEFAULT_EXPLOSION_RESISTANCE);
        }
        if (this.hardness == Float.MIN_VALUE) {
            this.setHardness(DEFAULT_HARDNESS);
        }
        if (this.frictionCoefficient == Float.MIN_VALUE) {
            this.setFrictionCoefficient(DEFAULT_FRICTION_COEFFICIENT);
        }
        if (this.jumpHeightMultiplier == Float.MIN_VALUE) {
            this.setJumpHeightMultiplier(DEFAULT_JUMP_MULTIPLIER);
        }
        if (this.speedFactor == Float.MIN_VALUE) {
            this.setSpeedFactor(DEFAULT_SPEED_FACTOR);
        }
    
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public class Builder extends AbstractBuilder<Builder, BlockPhysicsProperties> {
        
        protected Builder(BlockPhysicsProperties initialBuildable) {
            super(initialBuildable);
        }
        
        protected Builder solid() {
            this.buildable.phaseAtSTP = MatterPhases.SOLID;
            return this.self();
        }
        
        protected Builder liquid() {
            this.buildable.phaseAtSTP = MatterPhases.LIQUID;
            return this.self();
        }
        
        protected Builder gas() {
            this.buildable.phaseAtSTP = MatterPhases.GAS;
            return this.self();
        }
        
        protected Builder setExplosionResistance(float explosionResistance) {
            this.buildable.setExplosionResistance(explosionResistance);
            return this.self();
        }
        
        protected Builder setFrictionCoefficient(float frictionCoefficient) {
            this.buildable.setFrictionCoefficient(frictionCoefficient);
            return this.self();
        }
        
        protected Builder setHardness(float hardness) {
            this.buildable.setHardness(hardness);
            return this.self();
        }
        
        protected Builder setJumpDamageFactor(float jumpDamageFactor) {
            this.buildable.setJumpHeightMultiplier(jumpHeightMultiplier);
            return this.self();
        }
        
        protected Builder setSpeedFactor(float speedFactor) {
            this.buildable.setSpeedFactor(speedFactor);
            return this.self();
        }
        
        protected Builder setStandardTemperatureInKelvins(int standardTemperatureInKelvins) {
            this.buildable.setStandardTemperatureInKelvins(standardTemperatureInKelvins);
            return this.self();
        }
        
        protected Builder setIsFlammable(boolean isFlammable) {
            this.buildable.setIsFlammable(isFlammable);
            return this.self();
        }
        
        protected Builder setConductsRedstoneOn(BlockBehaviour.StatePredicate conductsRedstoneOn) {
            this.buildable.conductsRedstoneOn = conductsRedstoneOn;
            return this.self();
        }
    }
}
