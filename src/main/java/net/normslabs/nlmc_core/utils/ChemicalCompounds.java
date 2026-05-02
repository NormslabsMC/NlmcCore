/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.utils;


public enum ChemicalCompounds {
    WATER("water", "H2O", MatterPhases.LIQUID, 273, 373),
    AMMONIA("ammonia", "NH3", MatterPhases.GAS, 195, 240),
    AMMONIUM_NITRATE("ammonium", "NH4NO3", MatterPhases.SOLID, 443, -1),
    CARBON_DIOXIDE("carbon dioxide", "CO2", MatterPhases.GAS, 194, 194),
    CALCIUM_CARBONATE("calcium carbonate", "CaCO3", MatterPhases.SOLID, 1613, -1),
    SILICON_DIOXIDE("silicon dioxide", "SiO2", MatterPhases.SOLID, 1986, 3220),
    SODIUM_CHLORIDE("sodium chloride", "NaCl", MatterPhases.SOLID, 1074, 1738),
    SODIUM_HYDROXIDE("sodium hydroxide", "NaOH", MatterPhases.SOLID, 591, 1663),
    SULFUR_DIOXIDE("sulfur dioxide", "SO2", MatterPhases.GAS, 198, 263),
    SULFURIC_ACID("sulfuric acid", "H2SO4", MatterPhases.LIQUID, 284, 610),
    POTASSIUM_HYDROXIDE("potassium hydroxide", "KOH", MatterPhases.SOLID, 683, 1600),
    ETHANOL("ethanol", "C2H5OH", MatterPhases.LIQUID, 159, 351),
    ACETONE("acetone", "CH3COCH3", MatterPhases.LIQUID, 178, 329),
    GLUCOSE("glucose", "C6H12O6", MatterPhases.SOLID, 419, -1),
    SUCROSE("sucrose", "C12H22O11", MatterPhases.SOLID, 459, 459),
    HYDROXYAPATITE("hydroxyapatite", "Ca5(PO4)3OH", MatterPhases.SOLID, 1973, -1),
    
    // Petroleum products
    METHANE("methane", "CH4", MatterPhases.GAS, 91, 112),
    PROPANE("propane", "C3H8", MatterPhases.GAS, 86, 231),
    BENZENE("benzene", "C6H6", MatterPhases.LIQUID, 279, 353),
    
    ;
    
    private final String compoundName;
    private final String formula;
    private final MatterPhases phaseAtSTP;
    private final int meltingPointInKelvins;
    private final int boilingPointInKelvins;
    private final boolean doesSublimate;
    private final boolean decomposes;
    
    private ChemicalCompounds(String compoundName, String formula, MatterPhases phaseAtSTP, int meltingPointInKelvins, int boilingPointInKelvins) {
        this.compoundName = compoundName;
        this.formula = formula;
        this.phaseAtSTP = phaseAtSTP;
        this.meltingPointInKelvins = meltingPointInKelvins;
        this.boilingPointInKelvins = boilingPointInKelvins;
        this.doesSublimate = meltingPointInKelvins >= boilingPointInKelvins;
        this.decomposes = meltingPointInKelvins < 0 || boilingPointInKelvins < 0;
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown compounds (or when data is not provided).
     */
    private ChemicalCompounds(String compoundName, String formula, MatterPhases phaseAtSTP, int meltingPointInKelvins) {
        this(compoundName, formula, phaseAtSTP, meltingPointInKelvins,
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
    private ChemicalCompounds(String compoundName, String formula, MatterPhases phaseAtSTP) {
        this(compoundName, formula, phaseAtSTP,
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
    
    public String getCompoundName() {
        return this.compoundName;
    }
    
    public String getFormula() {
        return this.formula;
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
