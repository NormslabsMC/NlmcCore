/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.rendering.DynamicTextures;
import net.normslabs.nlmc_core.utils.ChemistryUtils;
import net.normslabs.nlmc_core.utils.Color;
import net.normslabs.nlmc_core.utils.MatterPhases;
import net.normslabs.nlmc_core.utils.TemperatureUtils;

import java.util.ArrayList;
import java.util.List;

public class ChemicalCompounds {
    public static ChemicalCompounds AIR = new ChemicalCompounds("air", "N16O4ArNeHeKrXe", MatterPhases.LIQUID, 273, 373);
    public static ChemicalCompounds WATER = new ChemicalCompounds("water", "H2O", MatterPhases.LIQUID, 273, 373);
    
    public static ChemicalCompounds AMINE = new ChemicalCompounds("amine", "NH2", MatterPhases.LIQUID, -1, 700);
    public static ChemicalCompounds AMMONIA = new ChemicalCompounds("ammonia", "NH3", MatterPhases.GAS, 195, 240);
    public static ChemicalCompounds AMMONIUM = new ChemicalCompounds("ammonium", "NH4", MatterPhases.LIQUID, 260, 873);
    public static ChemicalCompounds CARBONATE = new ChemicalCompounds("carbonate", "CO3", MatterPhases.SOLID, 1300, -1);
    public static ChemicalCompounds CARBOXYL = new ChemicalCompounds("carboxyl", "COOH", MatterPhases.GAS, 278, 391);
    public static ChemicalCompounds HYDROXIDE = new ChemicalCompounds("hydroxide", "OH", MatterPhases.SOLID, 591, 1663);
    public static ChemicalCompounds METHYLENE = new ChemicalCompounds("methylene", "CH2", MatterPhases.GAS, -1, -1);
    public static ChemicalCompounds METHYL = new ChemicalCompounds("methyl", "CH3", MatterPhases.GAS, -1, -1);
    public static ChemicalCompounds NITRATE = new ChemicalCompounds("nitrate", "NO3", MatterPhases.LIQUID, 232, 394);
    public static ChemicalCompounds NITRO = new ChemicalCompounds("nitro", "NO2", MatterPhases.LIQUID, 245, 374);
    public static ChemicalCompounds PHOSPHATE = new ChemicalCompounds("phosphate", "PO4", MatterPhases.SOLID, 1300, -1);
    public static ChemicalCompounds SULFATE = new ChemicalCompounds("sulfate", "SO4", MatterPhases.SOLID, 388, 718);
    
    public static ChemicalCompounds ALUMINUM_OXIDE = new ChemicalCompounds("aluminum_oxide", "Al2O3", MatterPhases.SOLID, 2345, 2835);
    public static ChemicalCompounds AMMONIUM_NITRATE = new ChemicalCompounds("ammonium_nitrate", "(NH4)(NO3)", MatterPhases.SOLID, 443, -1);
    public static ChemicalCompounds CARBON_DIOXIDE = new ChemicalCompounds("carbon_dioxide", "CO2", MatterPhases.GAS, 194, 194);
    public static ChemicalCompounds CARBON_MONOXIDE = new ChemicalCompounds("carbon_monoxide", "CO", MatterPhases.GAS, 71, 82);
    public static ChemicalCompounds CALCIUM_CHLORIDE = new ChemicalCompounds("calcium_chloride", "CaCl2", MatterPhases.SOLID, 1045, 2208);
    public static ChemicalCompounds CALCIUM_CARBONATE = new ChemicalCompounds("calcium_carbonate", "Ca(CO3)", MatterPhases.SOLID, 1613, -1);
    public static ChemicalCompounds CALCIUM_HYDROXIDE = new ChemicalCompounds("calcium_hydroxide", "Ca(OH)2", MatterPhases.SOLID, 853, -1);
    public static ChemicalCompounds SILICON_DIOXIDE = new ChemicalCompounds("silicon_dioxide", "SiO2", MatterPhases.SOLID, 1986, 3220);
    public static ChemicalCompounds SODIUM_BICARBONATE = new ChemicalCompounds("sodium_bicarbonate", "NaH(CO3)", MatterPhases.SOLID, 323, -1);
    public static ChemicalCompounds SODIUM_CHLORIDE = new ChemicalCompounds("sodium_chloride", "NaCl", MatterPhases.SOLID, 1074, 1738);
    public static ChemicalCompounds SODIUM_HYDROXIDE = new ChemicalCompounds("sodium_hydroxide", "Na(OH)", MatterPhases.SOLID, 591, 1663);
    public static ChemicalCompounds SULFUR_DIOXIDE = new ChemicalCompounds("sulfur_dioxide", "SO2", MatterPhases.GAS, 198, 263);
    public static ChemicalCompounds SULFURIC_ACID = new ChemicalCompounds("sulfuric_acid", "H2(SO4)", MatterPhases.LIQUID, 284, 610);
    public static ChemicalCompounds POTASSIUM_CHLORIDE = new ChemicalCompounds("potassium_chloride", "KCL", MatterPhases.SOLID, 1043, -1);
    public static ChemicalCompounds POTASSIUM_HYDROXIDE = new ChemicalCompounds("potassium_hydroxide", "K(OH)", MatterPhases.SOLID, 683, 1600);
    public static ChemicalCompounds POTASSIUM_NITRATE = new ChemicalCompounds("potassium_nitrate", "K(NO3)", MatterPhases.SOLID, 607, -1);
    
    public static ChemicalCompounds ETHANOL = new ChemicalCompounds("ethanol", "(CH3)(CH2)OH", MatterPhases.LIQUID, 159, 351);
    public static ChemicalCompounds ACETONE = new ChemicalCompounds("acetone", "(CH3)2(CO)", MatterPhases.LIQUID, 178, 329);
    public static ChemicalCompounds GLUCOSE = new ChemicalCompounds("glucose", "C2H2O(CH2)5(OH)", MatterPhases.SOLID, 419, -1);
    public static ChemicalCompounds SUCROSE = new ChemicalCompounds("sucrose", "C12H22O11", MatterPhases.SOLID, 459, 459);
    public static ChemicalCompounds CELLULOSE = new ChemicalCompounds("cellulose", "C6H7O2(OH)3", MatterPhases.SOLID, 673, -1);
    public static ChemicalCompounds STEARIC_ACID = new ChemicalCompounds("stearic_acid", "(CH3)(CH2)16(COOH)", MatterPhases.SOLID, 634, -1);
    public static ChemicalCompounds PROTEIN = new ChemicalCompounds("protein", "(NH2)2(CH2)4CH(COOH)", MatterPhases.SOLID, 673, -1);
    public static ChemicalCompounds CHLOROPHYLL = new ChemicalCompounds("chlorophyll", "C11H14NO", MatterPhases.SOLID, 473, -1);
    public static ChemicalCompounds HYDROXYAPATITE = new ChemicalCompounds("hydroxyapatite", "Ca5(PO4)3OH", MatterPhases.SOLID, 1973, -1);
    
    // Hydrocarbons
    public static ChemicalCompounds METHANE = new ChemicalCompounds("methane", "CH4", MatterPhases.GAS, 91, 112);
    public static ChemicalCompounds PROPANE = new ChemicalCompounds("propane", "C3H8", MatterPhases.GAS, 86, 231);
    public static ChemicalCompounds BUTANE = new ChemicalCompounds("butane", "C4H10", MatterPhases.GAS, 135, 272);
    public static ChemicalCompounds BENZENE = new ChemicalCompounds("benzene", "C6H6", MatterPhases.LIQUID, 279, 353);
    public static ChemicalCompounds OCTANE = new ChemicalCompounds("octane", "C8H18", MatterPhases.LIQUID, 216, 399);
    public static ChemicalCompounds DECANE = new ChemicalCompounds("decane", "C10H22", MatterPhases.LIQUID, 244, 447);
    public static ChemicalCompounds TOLUENE = new ChemicalCompounds("toluene", "C6H5(CH3)", MatterPhases.LIQUID, 178, 384);
    
    public static ChemicalCompounds NITROGLYCERIN = new ChemicalCompounds("nitroglycerin", "(CH2)2(NO2)3CHO3", MatterPhases.LIQUID, 286, -1);
    public static ChemicalCompounds NITROCELLULOSE = new ChemicalCompounds("nitrocellulose", "C6H7O5(NO2)3(OH3)", MatterPhases.SOLID, 473, -1);
    public static ChemicalCompounds TNT = new ChemicalCompounds("trinitrotoluene", "C6H2(NO2)3(CH3)", MatterPhases.SOLID, 354, -1);
    public static ChemicalCompounds AMATOL = new ChemicalCompounds("amatol", "(NH4)4(NO3)4C6H2(NO2)3(CH3)", MatterPhases.SOLID, 353, -1);
    
    
    
    private final String compoundName;
    private final String formula;
    private final Color compoundColor;
    private final ResourceLocation sampleBaseTexture;
    private final ResourceLocation sampleTintedTexture;
    private final ResourceLocation compoundBaseTexture;
    private final ResourceLocation compoundTintedTexture;
    private final MatterPhases phaseAtSTP;
    private final int meltingPointInKelvins;
    private final int boilingPointInKelvins;
    private final boolean doesSublimate;
    private final boolean decomposes;
    
    protected static final List<ChemicalCompounds> values = new ArrayList<>();
    
    protected ChemicalCompounds(String compoundName, String formula, Color compoundColor, MatterPhases phaseAtSTP, int meltingPointInKelvins, int boilingPointInKelvins) {
        this.compoundName = compoundName;
        this.formula = formula;
        this.compoundColor = compoundColor;
        this.phaseAtSTP = phaseAtSTP;
        this.meltingPointInKelvins = meltingPointInKelvins;
        this.boilingPointInKelvins = boilingPointInKelvins;
        this.doesSublimate = meltingPointInKelvins >= boilingPointInKelvins;
        this.decomposes = meltingPointInKelvins < 0 || boilingPointInKelvins < 0;
        switch (phaseAtSTP) {
            case LIQUID -> {
                this.sampleBaseTexture = DynamicTextures.Chemistry.SAMPLE_LIQUID_L0;
                this.sampleTintedTexture = DynamicTextures.Chemistry.SAMPLE_LIQUID_L1;
                this.compoundBaseTexture = DynamicTextures.Chemistry.COMPOUND_LIQUID_L0;
                this.compoundTintedTexture = DynamicTextures.Chemistry.COMPOUND_LIQUID_L1;
            }
            case GAS -> {
                this.sampleBaseTexture = DynamicTextures.Chemistry.SAMPLE_GAS_L0;
                this.sampleTintedTexture = DynamicTextures.Chemistry.SAMPLE_GAS_L1;
                this.compoundBaseTexture = DynamicTextures.Chemistry.COMPOUND_GAS_L0;
                this.compoundTintedTexture = DynamicTextures.Chemistry.COMPOUND_GAS_L1;
            }
            case SOLID, default -> {
                this.sampleBaseTexture = DynamicTextures.Chemistry.SAMPLE_SOLID_L0;
                this.sampleTintedTexture = DynamicTextures.Chemistry.SAMPLE_SOLID_L1;
                this.compoundBaseTexture = DynamicTextures.Chemistry.COMPOUND_SOLID_L0;
                this.compoundTintedTexture = DynamicTextures.Chemistry.COMPOUND_SOLID_L1;
            }
        }
        ChemicalCompounds.values.add(this);
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown compounds (or when data is not provided).
     */
    private ChemicalCompounds(String compoundName, String formula, Color compoundColor, MatterPhases phaseAtSTP, int meltingPointInKelvins) {
        this(compoundName, formula, compoundColor, phaseAtSTP, meltingPointInKelvins,
             meltingPointInKelvins < TemperatureUtils.NOHEAT_TEMP_LIMIT_IN_KELVINS
             ? TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS
             : meltingPointInKelvins < TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS
               ? TemperatureUtils.SUPERHEATED_TEMP_LIMIT_IN_KELVINS
               : TemperatureUtils.INDUSTRIAL_BLASTING_TEMP_LIMIT_IN_KELVINS);
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown compounds (or when data is not provided).
     */
    private ChemicalCompounds(String compoundName, String formula, Color compoundColor, MatterPhases phaseAtSTP) {
        this(compoundName, formula, compoundColor, phaseAtSTP,
             TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS,
             TemperatureUtils.SUPERHEATED_TEMP_LIMIT_IN_KELVINS);
    }
    
    public static ChemicalCompounds fromFormula(String formula) {
        for (ChemicalCompounds compound : values()) {
            if (ChemistryUtils.areFormulasEquivalent(compound.formula, formula)) {
                return compound;
            }
        }
        return null;
    }
    
    public static List<ChemicalCompounds> values() {
        return values;
    }
    
    public String getCompoundName() {
        return this.compoundName;
    }
    
    public String getFormula() {
        return this.formula;
    }
    
    public Color getCompoundColor() {
        return this.compoundColor;
    }
    
    public ResourceLocation getSampleTintedTexture() {
        return this.sampleTintedTexture;
    }
    
    public ResourceLocation getSampleBaseTexture() {
        return this.sampleBaseTexture;
    }
    
    public ResourceLocation getCompoundBaseTexture() {
        return this.compoundBaseTexture;
    }
    
    public ResourceLocation getCompoundTintedTexture() {
        return this.compoundTintedTexture;
    }
    
    public MatterPhases getPhaseAtSTP() {
        return this.phaseAtSTP;
    }
    
    public int getMeltingPointInKelvins() {
        return this.meltingPointInKelvins;
    }
    
    public int getBoilingPointInKelvins() {
        return this.boilingPointInKelvins;
    }
    
    public boolean doesSublimate() {
        return this.doesSublimate;
    }
    
    public boolean doesDecompose() {
        return this.decomposes;
    }
}
