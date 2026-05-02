/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.worldgen;


import net.normslabs.nlmc_core.utils.ChemistryUtils;
import net.normslabs.nlmc_core.utils.MatterPhases;

public enum Minerals {
    
    // Stone-like minerals
    FELDSPAR("feldspar", "KAlSi3O8", MatterPhases.SOLID, 1500, MineralTypes.STONE),
    ALBITE("albite", "NaAlSi3O8", MatterPhases.SOLID, 1500, MineralTypes.STONE),
    FORSTERITE("forsterite", "Mg2SiO4", MatterPhases.SOLID, 2171, MineralTypes.STONE),
    FAYALITE("fayalite", "Fe2SiO4", MatterPhases.SOLID, 1478, MineralTypes.STONE),
    MUSCOVITE("muscovite", "KAl2(AlSi3O10)(OH)2", MatterPhases.SOLID, 1425, MineralTypes.STONE),
    CALCITE("calcite", "CaO3", MatterPhases.SOLID, 1170, MineralTypes.STONE),
    DOLOMITE("dolomite", "CaMg(CO3)2", MatterPhases.SOLID, 1131, MineralTypes.STONE),
    DIORITE("diorite", "Ca2Mg5Si8O22(OH)2", MatterPhases.SOLID, 973, MineralTypes.STONE),
    MALACHITE("malachite", "Cu2(CO3)(OH)2", MatterPhases.SOLID, 653, MineralTypes.STONE),
    PYRITE("pyrite", "FeS2", MatterPhases.SOLID, 950, MineralTypes.STONE),
    GALENA("galena", "PbS", MatterPhases.SOLID, 839, MineralTypes.STONE),
    SPHALERITE("sphalerite", "Zn20InS20", MatterPhases.SOLID, 973, MineralTypes.STONE),
    CHALCOPYRITE("chalcopyrite", "CuFeS2", MatterPhases.SOLID, 1223, MineralTypes.STONE),
    HEMATITE("hematite", "Fe2O3", MatterPhases.SOLID, 1663, MineralTypes.STONE),
    RUTILE("rutile", "TiO2", MatterPhases.SOLID, 2123, MineralTypes.STONE),
    FLUORITE("fluorite", "CaF2", MatterPhases.SOLID, 1633, MineralTypes.STONE),
    APATITE("apatite", "Ca5(PO4)3Cl", MatterPhases.SOLID, 2123, MineralTypes.STONE),
    BAUXITE("bauxite", "Al2O3", MatterPhases.SOLID, 805, MineralTypes.STONE),
    CINNABAR("cinnabar", "HgS", MatterPhases.SOLID, 744, MineralTypes.STONE),
    PYROLUSITE("pyrolusite", "MnO2", MatterPhases.SOLID, 868, MineralTypes.STONE),
    CHROMITE("chromite", "FeCr2O4", MatterPhases.SOLID, 2313, MineralTypes.STONE),
    ZIRCON("zircon", "ZrSiO4", MatterPhases.SOLID, 1970, MineralTypes.STONE),
    BERYL("beryl", "Be3Al2Si6O18", MatterPhases.SOLID, 1613, MineralTypes.STONE),
    TALC("talc", "Mg3Si4O10(OH)2", MatterPhases.SOLID, 1350, MineralTypes.STONE),
    POTASH("potash", "KCl", MatterPhases.SOLID, 1040, MineralTypes.STONE),
    BARITE("barite", "BaSO4", MatterPhases.SOLID, 1733, MineralTypes.STONE),
    BORAX("borax", "Na2B4O5(OH)4", MatterPhases.SOLID, 1015, MineralTypes.STONE),
    LOPARITE("loparite", "CeTiO3", MatterPhases.SOLID, 1073, MineralTypes.STONE),
    MONAZITE("monazite", "NdPO4", MatterPhases.SOLID, 2273, MineralTypes.STONE),
    XENOTIME("xenotime", "ErPO4", MatterPhases.SOLID, 2169, MineralTypes.STONE),
    GADOLINITE("gadolinite", "Y2FeBe2Si2O10", MatterPhases.SOLID, 1323, MineralTypes.STONE),
    BASTNASITE("bastnäsite", "LaCO3F", MatterPhases.SOLID, 773, MineralTypes.STONE),
    GERMANITE("germanite", "Cu26Fe4Ge4S32", MatterPhases.SOLID, 1116, MineralTypes.STONE),
    GALLITE("gallite", "CuGaS2", MatterPhases.SOLID, 1523, MineralTypes.STONE),
    SPODUMENE("spodumene", "LiAl(SiO3)2", MatterPhases.SOLID, 1700, MineralTypes.STONE),
    COBALTITE("cobaltite", "CoAsS", MatterPhases.SOLID, 1273, MineralTypes.STONE),
    TANTALITE("tantalite", "MnTa2O6", MatterPhases.SOLID, 1773, MineralTypes.STONE),
    VANADINITE("vanadinite", "Pb5(VO4)3Cl", MatterPhases.SOLID, 1123, MineralTypes.STONE),
    RHODOCHROSITE("rhodochrosite", "MnCO3", MatterPhases.SOLID, 1418, MineralTypes.STONE),
    MAGNESITE("magnesite", "MgCO3", MatterPhases.SOLID, 953, MineralTypes.STONE),
    SALTPETER("saltpeter", "KNO3", MatterPhases.SOLID, 873, MineralTypes.STONE),
    SCHEELITE("scheelite", "CaWO4", MatterPhases.SOLID, 503, MineralTypes.STONE),
    WOLFRAMITE("wolframite", "MnWO4", MatterPhases.SOLID, 1023, MineralTypes.STONE),
    WULFENITE("wulfenite", "PbMoO4", MatterPhases.SOLID, 1337, MineralTypes.STONE),
    TITANITE("titanite", "CaTiSiO5", MatterPhases.SOLID, 1573, MineralTypes.STONE),
    ILMENITE("ilmenite", "FeTiO3", MatterPhases.SOLID, 2000, MineralTypes.STONE),
    MOLYBDENITE("molybdenite", "MoS2", MatterPhases.SOLID, 1467, MineralTypes.STONE),
    STIBNITE("stibnite", "Sb2S3", MatterPhases.SOLID, 1173, MineralTypes.STONE),
    BISMITE("bismite", "Bi2O3", MatterPhases.SOLID, 1090, MineralTypes.STONE),
    CELESTITE("celestite", "SrSO4", MatterPhases.SOLID, 1223, MineralTypes.STONE),
    POLLUCITE("pollucite", "Cs2Al2Si4O12", MatterPhases.SOLID, 873, MineralTypes.STONE),
    URANINITE("uraninite", "UO2", MatterPhases.SOLID, 1023, MineralTypes.STONE),
    CARNOTITE("carnotite", "K2(UO2)2(VO4)2", MatterPhases.SOLID, 1122, MineralTypes.STONE),
    PYROCHLORE("pyrochlore", "Na2Nb2O6F", MatterPhases.SOLID, 1673, MineralTypes.STONE),
    CALAVERITE("calaverite", "AuTe2", MatterPhases.SOLID, 473, MineralTypes.STONE),
    HAFNON("hafnon", "HfSiO4", MatterPhases.SOLID, 2800, MineralTypes.STONE),
    CRYOLITE("cryolite", "Na3AlF6", MatterPhases.SOLID, 1285, MineralTypes.STONE),
    NITRATINE("nitratine", "NaNO3", MatterPhases.SOLID, 293, MineralTypes.STONE),
    HALITE("halite", "NaCl", MatterPhases.SOLID, 373, MineralTypes.STONE),
    CARNALLITE("carnallite", "KMgCl3", MatterPhases.SOLID, 510, MineralTypes.STONE),
    BISCHOFITE("bischofite", "MgBr2", MatterPhases.SOLID, 973, MineralTypes.STONE),
    LANTARITE("lantarite", "Ca(IO3)2", MatterPhases.SOLID, 1423, MineralTypes.STONE),
    LEPIDOTITE("lepidolite", "KLi3Rb4O10F2", MatterPhases.SOLID, 1122, MineralTypes.STONE),
    ARGENTITE("argentite", "Ag2S", MatterPhases.SOLID, 923, MineralTypes.STONE),
    SPERRYLITE("sperrylite", "PtAs2", MatterPhases.SOLID, 1273, MineralTypes.STONE),
    COOPERITE("cooperite", "PdS", MatterPhases.SOLID, 1673, MineralTypes.STONE),
    BOWIEITE("bowieite", "Rh2Ir2Pt2S9", MatterPhases.SOLID, 1573, MineralTypes.STONE),
    CASSITERITE("cassiterite", "SnO2", MatterPhases.SOLID, 1523, MineralTypes.STONE),
    CROOKESITE("crookesite", "Tl2Se", MatterPhases.SOLID, 750, MineralTypes.STONE),
    SYLVANITE("sylvanite", "AgTe2", MatterPhases.SOLID, 627, MineralTypes.STONE),
    ARSENOPYRITE("arsenopyrite", "FeAsS", MatterPhases.SOLID, 1073, MineralTypes.STONE),
    THORITE("thorite", "ThSiO4", MatterPhases.SOLID, 723, MineralTypes.STONE),
    LIGNITE("lignite", "C6H5O", MatterPhases.SOLID, 723, MineralTypes.STONE)
    
    // ORES
    
    ;
    
    private final String compoundName;
    private final String formula;
    private final MatterPhases phaseAtSTP;
    private final int processingTemperature;
    private final MineralTypes mineralType;
    
    private Minerals(String compoundName, String formula, MatterPhases phaseAtSTP, int processingTemperature, MineralTypes mineralType) {
        this.compoundName = compoundName;
        this.formula = formula;
        this.phaseAtSTP = phaseAtSTP;
        this.processingTemperature = processingTemperature;
        this.mineralType = mineralType;
    }
    
    public static Minerals fromFormula(String formula) {
        for (Minerals compound : values()) {
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
    
    public int getProcessingTemperature() {
        return this.processingTemperature;
    }
    
    public MineralTypes getMineralType() {
        return this.mineralType;
    }
}
