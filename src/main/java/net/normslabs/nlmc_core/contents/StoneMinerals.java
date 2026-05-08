/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.contents;


import net.normslabs.nlmc_core.utils.ChemistryUtils;
import net.normslabs.nlmc_core.utils.MatterPhases;
import net.normslabs.nlmc_core.worldgen.MineralRarities;
import net.normslabs.nlmc_core.worldgen.MineralTypes;

import java.util.ArrayList;
import java.util.List;

public class StoneMinerals {
    
    // Stone-like minerals
    public static StoneMinerals FELDSPAR = new StoneMinerals("feldspar", "KAlSi3O8", MatterPhases.SOLID, 1500, MineralTypes.STONE);
    public static StoneMinerals ALBITE = new StoneMinerals("albite", "NaAlSi3O8", MatterPhases.SOLID, 1500, MineralTypes.STONE);
    public static StoneMinerals FORSTERITE = new StoneMinerals("forsterite", "Mg2SiO4", MatterPhases.SOLID, 2171, MineralTypes.STONE);
    public static StoneMinerals FAYALITE = new StoneMinerals("fayalite", "Fe2SiO4", MatterPhases.SOLID, 1478, MineralTypes.STONE);
    public static StoneMinerals MUSCOVITE = new StoneMinerals("muscovite", "KAl2 = new StoneMinerals(AlSi3O10) = new StoneMinerals(OH)2", MatterPhases.SOLID, 1425, MineralTypes.STONE);
    public static StoneMinerals CALCITE = new StoneMinerals("calcite", "CaO3", MatterPhases.SOLID, 1170, MineralTypes.STONE);
    public static StoneMinerals DOLOMITE = new StoneMinerals("dolomite", "CaMg = new StoneMinerals(CO3)2", MatterPhases.SOLID, 1131, MineralTypes.STONE);
    public static StoneMinerals MALACHITE = new StoneMinerals("malachite", "Cu2 = new StoneMinerals(CO3) = new StoneMinerals(OH)2", MatterPhases.SOLID, 653, MineralTypes.STONE);
    public static StoneMinerals PYRITE = new StoneMinerals("pyrite", "FeS2", MatterPhases.SOLID, 950, MineralTypes.STONE);
    public static StoneMinerals GALENA = new StoneMinerals("galena", "PbS", MatterPhases.SOLID, 839, MineralTypes.STONE);
    public static StoneMinerals SPHALERITE = new StoneMinerals("sphalerite", "Zn20InS20", MatterPhases.SOLID, 973, MineralTypes.STONE);
    public static StoneMinerals CHALCOPYRITE = new StoneMinerals("chalcopyrite", "CuFeS2", MatterPhases.SOLID, 1223, MineralTypes.STONE);
    public static StoneMinerals HEMATITE = new StoneMinerals("hematite", "Fe2O3", MatterPhases.SOLID, 1663, MineralTypes.STONE);
    public static StoneMinerals RUTILE = new StoneMinerals("rutile", "TiO2", MatterPhases.SOLID, 2123, MineralTypes.STONE);
    public static StoneMinerals FLUORITE = new StoneMinerals("fluorite", "CaF2", MatterPhases.SOLID, 1633, MineralTypes.STONE);
    public static StoneMinerals APATITE = new StoneMinerals("apatite", "Ca5 = new StoneMinerals(PO4)3Cl", MatterPhases.SOLID, 2123, MineralTypes.STONE);
    public static StoneMinerals BAUXITE = new StoneMinerals("bauxite", "Al2O3", MatterPhases.SOLID, 805, MineralTypes.STONE);
    public static StoneMinerals CINNABAR = new StoneMinerals("cinnabar", "HgS", MatterPhases.SOLID, 744, MineralTypes.STONE);
    public static StoneMinerals PYROLUSITE = new StoneMinerals("pyrolusite", "MnO2", MatterPhases.SOLID, 868, MineralTypes.STONE);
    public static StoneMinerals CHROMITE = new StoneMinerals("chromite", "FeCr2O4", MatterPhases.SOLID, 2313, MineralTypes.STONE);
    public static StoneMinerals ZIRCON = new StoneMinerals("zircon", "ZrSiO4", MatterPhases.SOLID, 1970, MineralTypes.STONE);
    public static StoneMinerals BERYL = new StoneMinerals("beryl", "Be3Al2Si6O18", MatterPhases.SOLID, 1613, MineralTypes.STONE);
    public static StoneMinerals TALC = new StoneMinerals("talc", "Mg3Si4O10 = new StoneMinerals(OH)2", MatterPhases.SOLID, 1350, MineralTypes.STONE);
    public static StoneMinerals POTASH = new StoneMinerals("potash", "KCl", MatterPhases.SOLID, 1040, MineralTypes.STONE);
    public static StoneMinerals BARITE = new StoneMinerals("barite", "BaSO4", MatterPhases.SOLID, 1733, MineralTypes.STONE);
    public static StoneMinerals BORAX = new StoneMinerals("borax", "Na2B4O5 = new StoneMinerals(OH)4", MatterPhases.SOLID, 1015, MineralTypes.STONE);
    public static StoneMinerals LOPARITE = new StoneMinerals("loparite", "CeTiO3", MatterPhases.SOLID, 1073, MineralTypes.STONE);
    public static StoneMinerals MONAZITE = new StoneMinerals("monazite", "NdPO4", MatterPhases.SOLID, 2273, MineralTypes.STONE);
    public static StoneMinerals XENOTIME = new StoneMinerals("xenotime", "ErPO4", MatterPhases.SOLID, 2169, MineralTypes.STONE);
    public static StoneMinerals GADOLINITE = new StoneMinerals("gadolinite", "Y2FeBe2Si2O10", MatterPhases.SOLID, 1323, MineralTypes.STONE);
    public static StoneMinerals BASTNASITE = new StoneMinerals("bastnasite", "LaCO3F", MatterPhases.SOLID, 773, MineralTypes.STONE);
    public static StoneMinerals GERMANITE = new StoneMinerals("germanite", "Cu26Fe4Ge4S32", MatterPhases.SOLID, 1116, MineralTypes.STONE);
    public static StoneMinerals GALLITE = new StoneMinerals("gallite", "CuGaS2", MatterPhases.SOLID, 1523, MineralTypes.STONE);
    public static StoneMinerals SPODUMENE = new StoneMinerals("spodumene", "LiAl = new StoneMinerals(SiO3)2", MatterPhases.SOLID, 1700, MineralTypes.STONE);
    public static StoneMinerals COBALTITE = new StoneMinerals("cobaltite", "CoAsS", MatterPhases.SOLID, 1273, MineralTypes.STONE);
    public static StoneMinerals TANTALITE = new StoneMinerals("tantalite", "MnTa2O6", MatterPhases.SOLID, 1773, MineralTypes.STONE);
    public static StoneMinerals VANADINITE = new StoneMinerals("vanadinite", "Pb5 = new StoneMinerals(VO4)3Cl", MatterPhases.SOLID, 1123, MineralTypes.STONE);
    public static StoneMinerals RHODOCHROSITE = new StoneMinerals("rhodochrosite", "MnCO3", MatterPhases.SOLID, 1418, MineralTypes.STONE);
    public static StoneMinerals MAGNESITE = new StoneMinerals("magnesite", "MgCO3", MatterPhases.SOLID, 953, MineralTypes.STONE);
    public static StoneMinerals SALTPETER = new StoneMinerals("saltpeter", "KNO3", MatterPhases.SOLID, 873, MineralTypes.STONE);
    public static StoneMinerals SCHEELITE = new StoneMinerals("scheelite", "CaWO4", MatterPhases.SOLID, 503, MineralTypes.STONE);
    public static StoneMinerals WOLFRAMITE = new StoneMinerals("wolframite", "MnWO4", MatterPhases.SOLID, 1023, MineralTypes.STONE);
    public static StoneMinerals WULFENITE = new StoneMinerals("wulfenite", "PbMoO4", MatterPhases.SOLID, 1337, MineralTypes.STONE);
    public static StoneMinerals TITANITE = new StoneMinerals("titanite", "CaTiSiO5", MatterPhases.SOLID, 1573, MineralTypes.STONE);
    public static StoneMinerals ILMENITE = new StoneMinerals("ilmenite", "FeTiO3", MatterPhases.SOLID, 2000, MineralTypes.STONE);
    public static StoneMinerals MOLYBDENITE = new StoneMinerals("molybdenite", "MoS2", MatterPhases.SOLID, 1467, MineralTypes.STONE);
    public static StoneMinerals STIBNITE = new StoneMinerals("stibnite", "Sb2S3", MatterPhases.SOLID, 1173, MineralTypes.STONE);
    public static StoneMinerals BISMITE = new StoneMinerals("bismite", "Bi2O3", MatterPhases.SOLID, 1090, MineralTypes.STONE);
    public static StoneMinerals CELESTITE = new StoneMinerals("celestite", "SrSO4", MatterPhases.SOLID, 1223, MineralTypes.STONE);
    public static StoneMinerals POLLUCITE = new StoneMinerals("pollucite", "Cs2Al2Si4O12", MatterPhases.SOLID, 873, MineralTypes.STONE);
    public static StoneMinerals URANINITE = new StoneMinerals("uraninite", "UO2", MatterPhases.SOLID, 1023, MineralTypes.STONE);
    public static StoneMinerals CARNOTITE = new StoneMinerals("carnotite", "K2 = new StoneMinerals(UO2)2 = new StoneMinerals(VO4)2", MatterPhases.SOLID, 1122, MineralTypes.STONE);
    public static StoneMinerals PYROCHLORE = new StoneMinerals("pyrochlore", "Na2Nb2O6F", MatterPhases.SOLID, 1673, MineralTypes.STONE);
    public static StoneMinerals CALAVERITE = new StoneMinerals("calaverite", "AuTe2", MatterPhases.SOLID, 473, MineralTypes.STONE);
    public static StoneMinerals HAFNON = new StoneMinerals("hafnon", "HfSiO4", MatterPhases.SOLID, 2800, MineralTypes.STONE);
    public static StoneMinerals CRYOLITE = new StoneMinerals("cryolite", "Na3AlF6", MatterPhases.SOLID, 1285, MineralTypes.STONE);
    public static StoneMinerals NITRATINE = new StoneMinerals("nitratine", "NaNO3", MatterPhases.SOLID, 293, MineralTypes.STONE);
    public static StoneMinerals HALITE = new StoneMinerals("halite", "NaCl", MatterPhases.SOLID, 373, MineralTypes.STONE);
    public static StoneMinerals CARNALLITE = new StoneMinerals("carnallite", "KMgCl3", MatterPhases.SOLID, 510, MineralTypes.STONE);
    public static StoneMinerals BISCHOFITE = new StoneMinerals("bischofite", "MgBr2", MatterPhases.SOLID, 973, MineralTypes.STONE);
    public static StoneMinerals LANTARITE = new StoneMinerals("lantarite", "Ca = new StoneMinerals(IO3)2", MatterPhases.SOLID, 1423, MineralTypes.STONE);
    public static StoneMinerals LEPIDOTITE = new StoneMinerals("lepidolite", "KLi3Rb4O10F2", MatterPhases.SOLID, 1122, MineralTypes.STONE);
    public static StoneMinerals ARGENTITE = new StoneMinerals("argentite", "Ag2S", MatterPhases.SOLID, 923, MineralTypes.STONE);
    public static StoneMinerals SPERRYLITE = new StoneMinerals("sperrylite", "PtAs2", MatterPhases.SOLID, 1273, MineralTypes.STONE);
    public static StoneMinerals COOPERITE = new StoneMinerals("cooperite", "PdS", MatterPhases.SOLID, 1673, MineralTypes.STONE);
    public static StoneMinerals BOWIEITE = new StoneMinerals("bowieite", "Rh2Ir2Pt2S9", MatterPhases.SOLID, 1573, MineralTypes.STONE);
    public static StoneMinerals CASSITERITE = new StoneMinerals("cassiterite", "SnO2", MatterPhases.SOLID, 1523, MineralTypes.STONE);
    public static StoneMinerals CROOKESITE = new StoneMinerals("crookesite", "Tl2Se", MatterPhases.SOLID, 750, MineralTypes.STONE);
    public static StoneMinerals SYLVANITE = new StoneMinerals("sylvanite", "AgTe2", MatterPhases.SOLID, 627, MineralTypes.STONE);
    public static StoneMinerals ARSENOPYRITE = new StoneMinerals("arsenopyrite", "FeAsS", MatterPhases.SOLID, 1073, MineralTypes.STONE);
    public static StoneMinerals THORITE = new StoneMinerals("thorite", "ThSiO4", MatterPhases.SOLID, 723, MineralTypes.STONE);
    public static StoneMinerals LIGNITE = new StoneMinerals("lignite", "C6H5O", MatterPhases.SOLID, 723, MineralTypes.STONE);
    public static StoneMinerals DIRT = new StoneMinerals("dirt", "Mg = new StoneMinerals(NH4)2KNO3CaHPO4", MatterPhases.SOLID, 298, MineralTypes.STONE, false);
    public static StoneMinerals STONE = new StoneMinerals("stone", " = new StoneMinerals(SiO2)4 = new StoneMinerals(Al2O3) = new StoneMinerals(Fe2O3) = new StoneMinerals(MgO)", MatterPhases.SOLID, 1273, MineralTypes.STONE, false);
    public static StoneMinerals DIORITE = new StoneMinerals("diorite", "Ca2Mg5Si8O22 = new StoneMinerals(OH)2", MatterPhases.SOLID, 973, MineralTypes.STONE, false);
    public static StoneMinerals GRANITE = new StoneMinerals("granite", " = new StoneMinerals(SiO2)4 = new StoneMinerals(Al2O3)2 = new StoneMinerals(Na2O) = new StoneMinerals(K2O)", MatterPhases.SOLID, 1453, MineralTypes.STONE, false);
    public static StoneMinerals ANDESITE = new StoneMinerals("andesite", " = new StoneMinerals(SiO2)3 = new StoneMinerals(Al2O3) = new StoneMinerals(CaO)2", MatterPhases.SOLID, 1193, MineralTypes.STONE, false);
    public static StoneMinerals SANDSTONE = new StoneMinerals("sandstone", " = new StoneMinerals(SiO2)3 = new StoneMinerals(CaC03)3 = new StoneMinerals(Al2O3)", MatterPhases.SOLID, 711, MineralTypes.STONE, false);
    public static StoneMinerals RED_SANDSTONE = new StoneMinerals("red_sandstone", " = new StoneMinerals(SiO2)3 = new StoneMinerals(Fe2O3)2 = new StoneMinerals(Al2O3)", MatterPhases.SOLID, 711, MineralTypes.STONE, false);
    public static StoneMinerals SAND = new StoneMinerals("sand", "SiO2", MatterPhases.SOLID, 2473, MineralTypes.STONE, false);
    public static StoneMinerals RED_SAND = new StoneMinerals("red_sand", " = new StoneMinerals(SiO2)3 = new StoneMinerals(Fe2O3)2", MatterPhases.SOLID, 2473, MineralTypes.STONE, false);
    public static StoneMinerals CLAY = new StoneMinerals("clay", "Al2Si2O5 = new StoneMinerals(OH)4", MatterPhases.SOLID, 298, MineralTypes.STONE, false);
    public static StoneMinerals TERRACOTTA = new StoneMinerals("terracotta", "Fe2Al2Si2O5 = new StoneMinerals(OH)4", MatterPhases.SOLID, 298, MineralTypes.STONE, false);
    public static StoneMinerals PRISMARINE = new StoneMinerals("prismarine", "Be3Cu2Si6O18", MatterPhases.SOLID, 1633, MineralTypes.STONE, false);
    public static StoneMinerals DEEPSLATE = new StoneMinerals("deepslate", "Al2O3Pb2Ni2Sn2Zn2", MatterPhases.SOLID, 1734, MineralTypes.STONE, false);
    public static StoneMinerals NETHERRACK = new StoneMinerals("netherrack", "Ca = new StoneMinerals(NO3)2PdMn2Li2O", MatterPhases.SOLID, 1967, MineralTypes.STONE, false);
    public static StoneMinerals BASALT = new StoneMinerals("basalt", "", MatterPhases.SOLID, 2256, MineralTypes.STONE, false);
    public static StoneMinerals END_STONE = new StoneMinerals("end_stone", "", MatterPhases.SOLID, 842, MineralTypes.STONE, false);
    public static StoneMinerals PURPUR = new StoneMinerals("purpur", "", MatterPhases.SOLID, 944, MineralTypes.STONE, false);
    
    
    // ORES
    
    
    ;
    
    protected static final List<StoneMinerals> values = new ArrayList<>();
    private final String stoneName;
    private final String formula;
    private final MatterPhases phaseAtSTP;
    private final int processingTemperature;
    private final MineralTypes mineralType;
    private final boolean needsWorldGen;
    private MineralRarities rarity = null;
    
    protected StoneMinerals(String stoneName, String formula, MatterPhases phaseAtSTP, int processingTemperature,
                            MineralTypes mineralType, boolean needsWorldGen, MineralRarities rarity) {
        this.stoneName = stoneName;
        this.formula = formula;
        this.phaseAtSTP = phaseAtSTP;
        this.processingTemperature = processingTemperature;
        this.mineralType = mineralType;
        this.needsWorldGen = needsWorldGen;
        this.rarity = rarity;
        StoneMinerals.values.add(this);
    }
    
    private StoneMinerals(String stoneName, String formula, MatterPhases phaseAtSTP, int processingTemperature, MineralTypes mineralType, MineralRarities rarity) {
        this(stoneName, formula, phaseAtSTP, processingTemperature, mineralType, true, rarity);
    }
    
    private StoneMinerals(String stoneName, String formula, MatterPhases phaseAtSTP, int processingTemperature, MineralTypes mineralType, boolean needsWorldGen) {
        this(stoneName, formula, phaseAtSTP, processingTemperature, mineralType, needsWorldGen, needsWorldGen ? MineralRarities.STANDARD : null);
    }
    
    private StoneMinerals(String stoneName, String formula, MatterPhases phaseAtSTP, int processingTemperature, MineralTypes mineralType) {
        this(stoneName, formula, phaseAtSTP, processingTemperature, mineralType, true, MineralRarities.STANDARD);
    }
    
    public static List<StoneMinerals> values() {
        return values;
    }
    
    public static StoneMinerals fromFormula(String formula) {
        for (StoneMinerals compound : values()) {
            if (ChemistryUtils.areFormulasEquivalent(compound.formula, formula)) {
                return compound;
            }
        }
        return null;
    }
    
    public String getStoneName() {
        return this.stoneName;
    }
    
    public String getFormula() {
        return this.formula;
    }
    
    public MatterPhases getPhaseAtSTP() {
        return this.phaseAtSTP;
    }
    
    public int getProcessingTemperature() {
        return this.processingTemperature;
    }
    
    public MineralTypes getMineralType() {
        return this.mineralType;
    }
    
    public boolean needsWorldGen() {
        return this.needsWorldGen;
    }
    
    public MineralRarities getRarity() {
        return this.rarity;
    }
}
