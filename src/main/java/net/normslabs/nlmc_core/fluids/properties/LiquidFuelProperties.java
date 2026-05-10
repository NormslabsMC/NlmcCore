/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-20 03:07
 */

package net.normslabs.nlmc_core.fluids.properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.normslabs.nlmc_core.NlmcTags;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;

import java.util.ArrayList;
import java.util.List;

public class LiquidFuelProperties extends AbstractBuildable<LiquidFuelProperties, LiquidFuelProperties.Builder> {
    private static final float cdgModularBurnRateMultiplier = 1.0F;
    private static final float cdgModularRotationSpeedMultiplier = 1.0F;
    private static final float cdgModularSuppliedStressMultiplier = 0.75F;
    private static final float cdgHugeBurnRateMultiplier = 1.5F;
    private static final float cdgHugeRotationSpeedMultiplier = 1.0F;
    private static final float cdgHugeSuppliedStressMultiplier = 2.0F;
    
    private final TagKey<Fluid> fluidTag;
    private int consumptionPerTickInMB = Integer.MIN_VALUE;
    private int createRotationSpeed = Integer.MIN_VALUE;
    private int createSuppliedStress = Integer.MIN_VALUE;
    private int pcraftAirPerMBinML = Integer.MIN_VALUE;
    private float pcraftCompressorBurnRate = 1.0F;
    
    
    public LiquidFuelProperties() {
    }
    
    @Override
    public void validateForBuild() {
    
    }
    
    @Override
    public Builder getBuilder() {
        return null;
    }
    
    @Override
    public void onBuild() {
    
    }
    
    public LiquidFuelProperties(int consumptionPerTickInMB,
                                int createRotationSpeed,
                                int createSuppliedStress,
                                int pcraftCompressorAirPerMBinML) {
        this.consumptionPerTickInMB = consumptionPerTickInMB;
        this.createRotationSpeed = createRotationSpeed;
        this.createSuppliedStress = createSuppliedStress;
        this.pcraftAirPerMBinML = pcraftCompressorAirPerMBinML;
        
        NlmcTags.
    }
    
    public static float getCdgModularBurnRateMultiplier() {
        return cdgModularBurnRateMultiplier;
    }
    public static float getCdgModularRotationSpeedMultiplier() {
        return cdgModularRotationSpeedMultiplier;
    }
    public static float getCdgModularSuppliedStressMultiplier() {
        return cdgModularSuppliedStressMultiplier;
    }
    
    public static float getCdgHugeBurnRateMultiplier() {
        return cdgHugeBurnRateMultiplier;
    }
    public static float getCdgHugeRotationSpeedMultiplier() {
        return cdgHugeRotationSpeedMultiplier;
    }
    public static float getCdgHugeSuppliedStressMultiplier() {
        return cdgHugeSuppliedStressMultiplier;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="METHODS">
    
    public int getConsumptionPerTickInMB() {
        return this.consumptionPerTickInMB;
    }
    public int getCreateRotationSpeed() {
        return this.createRotationSpeed;
    }
    public int getCreateSuppliedStress() {
        return this.createSuppliedStress;
    }
    
    public int getPcraftAirPerMBinML() {
        return this.pcraftAirPerMBinML;
    }
    public float getPcraftCompressorBurnRate() {
        return this.pcraftCompressorBurnRate;
    }
    
    public void setConsumptionPerTickInMB(int consumptionPerTickInMB) {
        this.consumptionPerTickInMB = consumptionPerTickInMB;
        this.pcraftCompressorBurnRate = calculatePneumaticcraftBurnRate(consumptionPerTickInMB);
    }
    public void setCreateRotationSpeed(int createRotationSpeed) {
        this.createRotationSpeed = createRotationSpeed;
    }
    public void setCreateSuppliedStress(int createSuppliedStress) {
        this.createSuppliedStress = createSuppliedStress;
    }
    public void setPcraftAirPerMBinML(int pcraftAirPerMBinML) {
        this.pcraftAirPerMBinML = pcraftAirPerMBinML;
    }
    public void setPcraftCompressorBurnRate(float pcraftCompressorBurnRate) {
        this.pcraftCompressorBurnRate = pcraftCompressorBurnRate;
    }
    
    public String toCdgJson() {
        JsonObject rootObject = new JsonObject();
        rootObject.addProperty("fluid", "#" + this.fluidTag.location());
        rootObject.addProperty("sound_pitch", 0.9);
        rootObject.addProperty("burner_multiplier", 0.6);
        
        JsonObject normalEngineObject = new JsonObject();
        normalEngineObject.addProperty("speed", this.getCreateRotationSpeed());
        normalEngineObject.addProperty("strength", this.getCreateSuppliedStress());
        normalEngineObject.addProperty("burn_rate", this.getConsumptionPerTickInMB());
        rootObject.add("normal", normalEngineObject);
        
        JsonObject modularEngineObject = new JsonObject();
        modularEngineObject.addProperty("speed", this.getCreateRotationSpeed());
        modularEngineObject.addProperty("strength", this.getCreateSuppliedStress());
        modularEngineObject.addProperty("burn_rate", this.getConsumptionPerTickInMB());
        rootObject.add("modular", modularEngineObject);
        
        JsonObject hugeEngineObject = new JsonObject();
        hugeEngineObject.addProperty("speed", this.getCreateRotationSpeed());
        hugeEngineObject.addProperty("strength", this.getCreateSuppliedStress());
        hugeEngineObject.addProperty("burn_rate", this.getConsumptionPerTickInMB());
        rootObject.add("huge", hugeEngineObject);
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(rootObject);
    }
    
    public String toPneumaticcraftJson() {
        JsonObject rootObject = new JsonObject();
        rootObject.addProperty("fluid", "#" + this.fluidTag.location());
        rootObject.addProperty("air_per_mb", 1);
        rootObject.addProperty("burn_rate", 1);
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(rootObject);
    }
    
    private float calculatePneumaticcraftBurnRate(int consumptionPerTick) {
        return consumptionPerTick / 0.01f;
    }
    
    // </editor-fold>
    
    
    public static class Builder extends AbstractBuilder<Builder, LiquidFuelProperties> {
        
        
        protected Builder(LiquidFuelProperties descriptor) {
            super(descriptor);
        }
        public static Builder getNew() {
            return new Builder(new LiquidFuelProperties());
        }
        public static Builder getFor(LiquidFuelProperties descriptor) {
            return new Builder(descriptor);
        }
        
        
        
        public Builder setCdgBaseBurnRate(int baseBurnRate) {
            this.getTarget().setCdgBaseBurnRate(baseBurnRate);
            return this;
        }
        public Builder setCdgBaseRotationalSpeed(int baseRotationalSpeed) {
            this.getTarget().setCdgBaseRotationalSpeed(baseRotationalSpeed);
            return this;
        }
        public Builder setCdgBaseSuppliedStress(int baseSuppliedStress) {
            this.getTarget().setCdgBaseSuppliedStress(baseSuppliedStress);
            return this;
        }
        
        public Builder setCdgModularBurnRateMultiplier(float modularBurnRateMultiplier) {
            this.getTarget().setCdgModularBurnRateMultiplier(modularBurnRateMultiplier);
            return this;
        }
        public Builder setCdgModularRotationSpeedMultiplier(float modularRotationSpeedMultiplier) {
            this.getTarget().setCdgModularRotationSpeedMultiplier(modularRotationSpeedMultiplier);
            return this;
        }
        public Builder setCdgModularSuppliedStressMultiplier(float modularSuppliedStressMultiplier) {
            this.getTarget().setCdgModularSuppliedStressMultiplier(modularSuppliedStressMultiplier);
            return this;
        }
        
        public Builder setCdgHugeBurnRateMultiplier(float hugeBurnRateMultiplier) {
            this.getTarget().setCdgHugeBurnRateMultiplier(hugeBurnRateMultiplier);
            return this;
        }
        public Builder setCdgHugeRotationSpeedMultiplier(float hugeRotationSpeedMultiplier) {
            this.getTarget().setCdgHugeRotationSpeedMultiplier(hugeRotationSpeedMultiplier);
            return this;
        }
        public Builder setCdgHugeSuppliedStressMultiplier(float hugeSuppliedStressMultiplier) {
            this.getTarget().setCdgHugeSuppliedStressMultiplier(hugeSuppliedStressMultiplier);
            return this;
        }
        
        public Builder setPcraftCompressorAirProduction(int pcraftCompressorAirProduction) {
            this.getTarget().setPcraftCompressorAirProduction(pcraftCompressorAirProduction);
            return this;
        }
        public Builder setPcraftCompressorBurnRate(float pcraftCompressorBurnRate) {
            this.getTarget().setPcraftCompressorBurnRate(pcraftCompressorBurnRate);
            return this;
        }
        
        
        
        @Override
        public boolean validateBeforeBuild(LiquidFuelProperties validationTarget) {
            List<String> problems = new ArrayList<>();
            // TODO: Implement method
            
            return this.handleValidationProblems(problems);
        }
        
        @Override
        public LiquidFuelProperties build() {
            if (this.validateBeforeBuild(this.getTarget())) {
                return this.getTarget();
            }
            return null;
        }
    }
    
}