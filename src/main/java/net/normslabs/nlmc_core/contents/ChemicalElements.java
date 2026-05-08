/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:29
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.rendering.DynamicTextures;
import net.normslabs.nlmc_core.utils.Color;
import net.normslabs.nlmc_core.utils.MatterPhases;
import net.normslabs.nlmc_core.utils.TemperatureUtils;

import java.util.ArrayList;
import java.util.List;

public class ChemicalElements {
    public static ChemicalElements HYDROGEN = new ChemicalElements(1, Color.HYDROGEN, "hydrogen", "H", MatterPhases.GAS, 14, 20);
    public static ChemicalElements HELIUM = new ChemicalElements(2, Color.HELIUM, "helium", "He", MatterPhases.GAS, 0, 4);
    public static ChemicalElements LITHIUM = new ChemicalElements(3, Color.LITHIUM, "lithium", "Li", MatterPhases.SOLID, 454, 1603);
    public static ChemicalElements BERYLLIUM = new ChemicalElements(4, Color.BERYLLIUM, "beryllium", "Be", MatterPhases.SOLID, 1560, 2742);
    public static ChemicalElements BORON = new ChemicalElements(5, Color.BORON, "boron", "B", MatterPhases.SOLID, 2349, 4200);
    public static ChemicalElements CARBON = new ChemicalElements(6, Color.CARBON, "carbon", "C", MatterPhases.SOLID, 3823, 4300);
    public static ChemicalElements NITROGEN = new ChemicalElements(7, Color.NITROGEN, "nitrogen", "N", MatterPhases.GAS, 63, 77);
    public static ChemicalElements OXYGEN = new ChemicalElements(8, Color.OXYGEN, "oxygen", "O", MatterPhases.GAS, 54, 90);
    public static ChemicalElements FLUORINE = new ChemicalElements(9, Color.FLUORINE, "fluorine", "F", MatterPhases.GAS, 53, 85);
    public static ChemicalElements NEON = new ChemicalElements(10, Color.NEON, "neon", "Ne", MatterPhases.GAS, 25, 27);
    public static ChemicalElements SODIUM = new ChemicalElements(11, Color.SODIUM, "sodium", "Na", MatterPhases.SOLID, 371, 1156);
    public static ChemicalElements MAGNESIUM = new ChemicalElements(12, Color.MAGNESIUM, "magnesium", "Mg", MatterPhases.SOLID, 923, 1363);
    public static ChemicalElements ALUMINIUM = new ChemicalElements(13, Color.ALUMINIUM, "aluminium", "Al", MatterPhases.SOLID, 933, 2792);
    public static ChemicalElements SILICON = new ChemicalElements(14, Color.SILICON, "silicon", "Si", MatterPhases.SOLID, 1687, 3538);
    public static ChemicalElements PHOSPHORUS = new ChemicalElements(15, Color.PHOSPHORUS, "phosphorus", "P", MatterPhases.SOLID, 317, 553);
    public static ChemicalElements SULFUR = new ChemicalElements(16, Color.SULFUR, "sulfur", "S", MatterPhases.SOLID, 388, 717);
    public static ChemicalElements CHLORINE = new ChemicalElements(17, Color.CHLORINE, "chlorine", "Cl", MatterPhases.GAS, 172, 239);
    public static ChemicalElements ARGON = new ChemicalElements(18, Color.ARGON, "argon", "Ar", MatterPhases.GAS, 84, 87);
    public static ChemicalElements POTASSIUM = new ChemicalElements(19, Color.POTASSIUM, "potassium", "K", MatterPhases.SOLID, 337, 1032);
    public static ChemicalElements CALCIUM = new ChemicalElements(20, Color.CALCIUM, "calcium", "Ca", MatterPhases.SOLID, 1115, 1757);
    public static ChemicalElements SCANDIUM = new ChemicalElements(21, Color.SCANDIUM, "scandium", "Sc", MatterPhases.SOLID, 1814, 3109);
    public static ChemicalElements TITANIUM = new ChemicalElements(22, Color.TITANIUM, "titanium", "Ti", MatterPhases.SOLID, 1941, 3560);
    public static ChemicalElements VANADIUM = new ChemicalElements(23, Color.VANADIUM, "vanadium", "V", MatterPhases.SOLID, 2183, 3680);
    public static ChemicalElements CHROMIUM = new ChemicalElements(24, Color.CHROMIUM, "chromium", "Cr", MatterPhases.SOLID, 2180, 2944);
    public static ChemicalElements MANGANESE = new ChemicalElements(25, Color.MANGANESE, "manganese", "Mn", MatterPhases.SOLID, 1519, 2334);
    public static ChemicalElements IRON = new ChemicalElements(26, Color.IRON, "iron", "Fe", MatterPhases.SOLID, 1811, 3134);
    public static ChemicalElements COBALT = new ChemicalElements(27, Color.COBALT, "cobalt", "Co", MatterPhases.SOLID, 1768, 3200);
    public static ChemicalElements NICKEL = new ChemicalElements(28, Color.NICKEL, "nickel", "Ni", MatterPhases.SOLID, 1728, 3186);
    public static ChemicalElements COPPER = new ChemicalElements(29, Color.COPPER, "copper", "Cu", MatterPhases.SOLID, 1358, 2835);
    public static ChemicalElements ZINC = new ChemicalElements(30, Color.ZINC, "zinc", "Zn", MatterPhases.SOLID, 693, 1180);
    public static ChemicalElements GALLIUM = new ChemicalElements(31, Color.GALLIUM, "gallium", "Ga", MatterPhases.SOLID, 303, 2477);
    public static ChemicalElements GERMANIUM = new ChemicalElements(32, Color.GERMANIUM, "germanium", "Ge", MatterPhases.SOLID, 1211, 3106);
    public static ChemicalElements ARSENIC = new ChemicalElements(33, Color.ARSENIC, "arsenic", "As", MatterPhases.SOLID, 1090, 887);
    public static ChemicalElements SELENIUM = new ChemicalElements(34, Color.SELENIUM, "selenium", "Se", MatterPhases.SOLID, 494, 958);
    public static ChemicalElements BROMINE = new ChemicalElements(35, Color.BROMINE, "bromine", "Br", MatterPhases.LIQUID, 266, 332);
    public static ChemicalElements KRYPTON = new ChemicalElements(36, Color.KRYPTON, "krypton", "Kr", MatterPhases.GAS, 116, 120);
    public static ChemicalElements RUBIDIUM = new ChemicalElements(37, Color.RUBIDIUM, "rubidium", "Rb", MatterPhases.SOLID, 312, 961);
    public static ChemicalElements STRONTIUM = new ChemicalElements(38, Color.STRONTIUM, "strontium", "Sr", MatterPhases.SOLID, 1050, 1655);
    public static ChemicalElements YTTRIUM = new ChemicalElements(39, Color.YTTRIUM, "yttrium", "Y", MatterPhases.SOLID, 1799, 3609);
    public static ChemicalElements ZIRCONIUM = new ChemicalElements(40, Color.ZIRCONIUM, "zirconium", "Zr", MatterPhases.SOLID, 2128, 4682);
    public static ChemicalElements NIOBIUM = new ChemicalElements(41, Color.NIOBIUM, "niobium", "Nb", MatterPhases.SOLID, 2750, 5017);
    public static ChemicalElements MOLYBDENUM = new ChemicalElements(42, Color.MOLYBDENUM, "molybdenum", "Mo", MatterPhases.SOLID, 2896, 4912);
    public static ChemicalElements TECHNETIUM = new ChemicalElements(43, Color.TECHNETIUM, "technetium", "Tc", MatterPhases.SOLID, 2430, 4538);
    public static ChemicalElements RUTHENIUM = new ChemicalElements(44, Color.RUTHENIUM, "ruthenium", "Ru", MatterPhases.SOLID, 2607, 4423);
    public static ChemicalElements RHODIUM = new ChemicalElements(45, Color.RHODIUM, "rhodium", "Rh", MatterPhases.SOLID, 2237, 3968);
    public static ChemicalElements PALLADIUM = new ChemicalElements(46, Color.PALLADIUM, "palladium", "Pd", MatterPhases.SOLID, 1828, 3236);
    public static ChemicalElements SILVER = new ChemicalElements(47, Color.SILVER, "silver", "Ag", MatterPhases.SOLID, 1235, 2435);
    public static ChemicalElements CADMIUM = new ChemicalElements(48, Color.CADMIUM, "cadmium", "Cd", MatterPhases.SOLID, 594, 1040);
    public static ChemicalElements INDIUM = new ChemicalElements(49, Color.INDIUM, "indium", "In", MatterPhases.SOLID, 430, 2345);
    public static ChemicalElements TIN = new ChemicalElements(50, Color.TIN, "tin", "Sn", MatterPhases.SOLID, 505, 2875);
    public static ChemicalElements ANTIMONY = new ChemicalElements(51, Color.ANTIMONY, "antimony", "Sb", MatterPhases.SOLID, 904, 1860);
    public static ChemicalElements TELLURIUM = new ChemicalElements(52, Color.TELLURIUM, "tellurium", "Te", MatterPhases.SOLID, 723, 1261);
    public static ChemicalElements IODINE = new ChemicalElements(53, Color.IODINE, "iodine", "I", MatterPhases.SOLID, 387, 457);
    public static ChemicalElements XENON = new ChemicalElements(54, Color.XENON, "xenon", "Xe", MatterPhases.GAS, 161, 165);
    public static ChemicalElements CESIUM = new ChemicalElements(55, Color.CESIUM, "cesium", "Cs", MatterPhases.SOLID, 302, 944);
    public static ChemicalElements BARIUM = new ChemicalElements(56, Color.BARIUM, "barium", "Ba", MatterPhases.SOLID, 1000, 2170);
    public static ChemicalElements LANTHANUM = new ChemicalElements(57, Color.LANTHANUM, "lanthanum", "La", MatterPhases.SOLID, 1193, 3737);
    public static ChemicalElements CERIUM = new ChemicalElements(58, Color.CERIUM, "cerium", "Ce", MatterPhases.SOLID, 1071, 3697);
    public static ChemicalElements PRASEODYMIUM = new ChemicalElements(59, Color.PRASEODYMIUM, "praseodymium", "Pr", MatterPhases.SOLID, 1204, 3793);
    public static ChemicalElements NEODYMIUM = new ChemicalElements(60, Color.NEODYMIUM, "neodymium", "Nd", MatterPhases.SOLID, 1294, 3347);
    public static ChemicalElements PROMETHIUM = new ChemicalElements(61, Color.PROMETHIUM, "promethium", "Pm", MatterPhases.SOLID, 1315, 3273);
    public static ChemicalElements SAMARIUM = new ChemicalElements(62, Color.SAMARIUM, "samarium", "Sm", MatterPhases.SOLID, 1345, 2067);
    public static ChemicalElements EUROPIUM = new ChemicalElements(63, Color.EUROPIUM, "europium", "Eu", MatterPhases.SOLID, 1095, 1802);
    public static ChemicalElements GADOLINIUM = new ChemicalElements(64, Color.GADOLINIUM, "gadolinium", "Gd", MatterPhases.SOLID, 1586, 3546);
    public static ChemicalElements TERBIUM = new ChemicalElements(65, Color.TERBIUM, "terbium", "Tb", MatterPhases.SOLID, 1629, 3503);
    public static ChemicalElements DYSPROSIUM = new ChemicalElements(66, Color.DYSPROSIUM, "dysprosium", "Dy", MatterPhases.SOLID, 1680, 2840);
    public static ChemicalElements HOLMIUM = new ChemicalElements(67, Color.HOLMIUM, "holmium", "Ho", MatterPhases.SOLID, 1747, 2973);
    public static ChemicalElements ERBIUM = new ChemicalElements(68, Color.ERBIUM, "erbium", "Er", MatterPhases.SOLID, 1802, 3141);
    public static ChemicalElements THULIUM = new ChemicalElements(69, Color.THULIUM, "thulium", "Tm", MatterPhases.SOLID, 1818, 2223);
    public static ChemicalElements YTTERBIUM = new ChemicalElements(70, Color.YTTERBIUM, "ytterbium", "Yb", MatterPhases.SOLID, 1097, 1469);
    public static ChemicalElements LUTETIUM = new ChemicalElements(71, Color.LUTETIUM, "lutetium", "Lu", MatterPhases.SOLID, 1925, 3675);
    public static ChemicalElements HAFNIUM = new ChemicalElements(72, Color.HAFNIUM, "hafnium", "Hf", MatterPhases.SOLID, 2506, 4876);
    public static ChemicalElements TANTALUM = new ChemicalElements(73, Color.TANTALUM, "tantalum", "Ta", MatterPhases.SOLID, 3290, 5731);
    public static ChemicalElements TUNGSTEN = new ChemicalElements(74, Color.TUNGSTEN, "tungsten", "W", MatterPhases.SOLID, 3695, 5828);
    public static ChemicalElements RHENIUM = new ChemicalElements(75, Color.RHENIUM, "rhenium", "Re", MatterPhases.SOLID, 3459, 5869);
    public static ChemicalElements OSMIUM = new ChemicalElements(76, Color.OSMIUM, "osmium", "Os", MatterPhases.SOLID, 3306, 5285);
    public static ChemicalElements IRIDIUM = new ChemicalElements(77, Color.IRIDIUM, "iridium", "Ir", MatterPhases.SOLID, 2719, 4701);
    public static ChemicalElements PLATINUM = new ChemicalElements(78, Color.PLATINUM, "platinum", "Pt", MatterPhases.SOLID, 2041, 4098);
    public static ChemicalElements GOLD = new ChemicalElements(79, Color.GOLD, "gold", "Au", MatterPhases.SOLID, 1337, 3129);
    public static ChemicalElements MERCURY = new ChemicalElements(80, Color.MERCURY, "mercury", "Hg", MatterPhases.LIQUID, 234, 630);
    public static ChemicalElements THALLIUM = new ChemicalElements(81, Color.THALLIUM, "thallium", "Tl", MatterPhases.SOLID, 577, 1746);
    public static ChemicalElements LEAD = new ChemicalElements(82, Color.LEAD, "lead", "Pb", MatterPhases.SOLID, 601, 2022);
    public static ChemicalElements BISMUTH = new ChemicalElements(83, Color.BISMUTH, "bismuth", "Bi", MatterPhases.SOLID, 545, 1837);
    public static ChemicalElements POLONIUM = new ChemicalElements(84, Color.POLONIUM, "polonium", "Po", MatterPhases.SOLID, 527, 1235);
    public static ChemicalElements ASTATINE = new ChemicalElements(85, Color.ASTATINE, "astatine", "At", MatterPhases.SOLID, 575, 610);
    public static ChemicalElements RADON = new ChemicalElements(86, Color.RADON, "radon", "Rn", MatterPhases.GAS, 202, 211);
    public static ChemicalElements FRANCIUM = new ChemicalElements(87, Color.FRANCIUM, "francium", "Fr", MatterPhases.SOLID, 300, 950);
    public static ChemicalElements RADIUM = new ChemicalElements(88, Color.RADIUM, "radium", "Ra", MatterPhases.SOLID, 973, 2010);
    public static ChemicalElements ACTINIUM = new ChemicalElements(89, Color.ACTINIUM, "actinium", "Ac", MatterPhases.SOLID, 1323, 3471);
    public static ChemicalElements THORIUM = new ChemicalElements(90, Color.THORIUM, "thorium", "Th", MatterPhases.SOLID, 2023, 5061);
    public static ChemicalElements PROTACTINIUM = new ChemicalElements(91, Color.PROTACTINIUM, "protactinium", "Pa", MatterPhases.SOLID, 1841, 4300);
    public static ChemicalElements URANIUM = new ChemicalElements(92, Color.URANIUM, "uranium", "U", MatterPhases.SOLID, 1405, 4404);
    public static ChemicalElements NEPTUNIUM = new ChemicalElements(93, Color.NEPTUNIUM, "neptunium", "Np", MatterPhases.SOLID, 913, 4175);
    public static ChemicalElements PLUTONIUM = new ChemicalElements(94, Color.PLUTONIUM, "plutonium", "Pu", MatterPhases.SOLID, 913, 3505);
    public static ChemicalElements AMERICIUM = new ChemicalElements(95, Color.AMERICIUM, "americium", "Am", MatterPhases.SOLID, 1449, 2880);
    public static ChemicalElements CURIUM = new ChemicalElements(96, Color.CURIUM, "curium", "Cm", MatterPhases.SOLID, 1618, 3383);
    public static ChemicalElements BERKELIUM = new ChemicalElements(97, Color.BERKELIUM, "berkelium", "Bk", MatterPhases.SOLID, 1259, 2900);
    public static ChemicalElements CALIFORNIUM = new ChemicalElements(98, Color.CALIFORNIUM, "californium", "Cf", MatterPhases.SOLID, 1173, 1743);
    public static ChemicalElements EINSTEINIUM = new ChemicalElements(99, Color.EINSTEINIUM, "einsteinium", "Es", MatterPhases.SOLID, 1133, 1269);
    public static ChemicalElements FERMIUM = new ChemicalElements(100, Color.FERMIUM, "fermium", "Fm", MatterPhases.SOLID, 1800);
    public static ChemicalElements MENDELEVIUM = new ChemicalElements(101, Color.MENDELEVIUM, "mendelevium", "Md", MatterPhases.SOLID, 1100);
    public static ChemicalElements NOBELIUM = new ChemicalElements(102, Color.NOBELIUM, "nobelium", "No", MatterPhases.SOLID, 1100);
    public static ChemicalElements LAWRENCIUM = new ChemicalElements(103, Color.LAWRENCIUM, "lawrencium", "Lr", MatterPhases.SOLID, 1900);
    public static ChemicalElements RUTHERFORDIUM = new ChemicalElements(104, Color.RUTHERFORDIUM, "rutherfordium", "Rf", MatterPhases.SOLID, 2400, 5800);
    public static ChemicalElements DUBNIUM = new ChemicalElements(105, Color.DUBNIUM, "dubnium", "Db", MatterPhases.SOLID, 303, 2477);
    public static ChemicalElements SEABORGIUM = new ChemicalElements(106, Color.SEABORGIUM, "seaborgium", "Sg", MatterPhases.SOLID, 2200, 4000);
    public static ChemicalElements BOHRIUM = new ChemicalElements(107, Color.BOHRIUM, "bohrium", "Bh", MatterPhases.SOLID);
    public static ChemicalElements HASSIUM = new ChemicalElements(108, Color.HASSIUM, "hassium", "Hs", MatterPhases.SOLID);
    public static ChemicalElements MEITNERIUM = new ChemicalElements(109, Color.MEITNERIUM, "meitnerium", "Mt", MatterPhases.SOLID);
    public static ChemicalElements DARMSTADTIUM = new ChemicalElements(110, Color.DARMSTADTIUM, "darmstadtium", "Ds", MatterPhases.SOLID);
    public static ChemicalElements ROENTGENIUM = new ChemicalElements(111, Color.ROENTGENIUM, "roentgenium", "Rg", MatterPhases.SOLID);
    public static ChemicalElements COPERNICIUM = new ChemicalElements(112, Color.COPERNICIUM, "copernicium", "Cn", MatterPhases.SOLID);
    public static ChemicalElements NIHONIUM = new ChemicalElements(113, Color.NIHONIUM, "nihonium", "Nh", MatterPhases.SOLID);
    public static ChemicalElements FLEROVIUM = new ChemicalElements(114, Color.FLEROVIUM, "flerovium", "Fl", MatterPhases.SOLID);
    public static ChemicalElements MOSCOVIUM = new ChemicalElements(115, Color.MOSCOVIUM, "moscovium", "Mc", MatterPhases.SOLID);
    public static ChemicalElements LIVERMORIUM = new ChemicalElements(116, Color.LIVERMORIUM, "livermorium", "Lv", MatterPhases.SOLID);
    public static ChemicalElements TENNESSINE = new ChemicalElements(117, Color.TENNESSINE, "tennessine", "Ts", MatterPhases.SOLID);
    public static ChemicalElements OGANESSON = new ChemicalElements(118, Color.OGANESSON, "oganesson", "Og", MatterPhases.GAS);
    
    
    protected static final List<ChemicalElements> values = new ArrayList<>();
    private final int atomicNumber;
    private final String elementName;
    private final String symbol;
    private final Color elementColor;
    private final ResourceLocation sampleBaseTexture;
    private final ResourceLocation sampleTintedTexture;
    private final ResourceLocation compoundBaseTexture;
    private final ResourceLocation compoundTintedTexture;
    private final MatterPhases phaseAtSTP;
    private final int meltingPointInKelvins;
    private final int boilingPointInKelvins;
    private final boolean doesSublimate;
    
    /**
     * Creates a {@code ChemicalElements} entry.
     * <p>
     * Parameters use standard IUPAC conventions. Temperatures are in kelvins (K) at ~1 atm.
     *
     * @param atomicNumber The atomic number of the element
     * @param elementName  The lowercase English name of the element
     * @param symbol       The chemical symbol of the element (case-sensitive)
     * @param phaseAtSTP   The matter phase of the element at standard temperature and pressure (STP)
     * @param meltingPointInKelvins The melting point temperature in kelvins at standard pressure
     * @param boilingPointInKelvins The boiling point temperature in kelvins at standard pressure
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-01 18:37
     */
    private ChemicalElements(int atomicNumber, Color elementColor, String elementName, String symbol, MatterPhases phaseAtSTP, int meltingPointInKelvins, int boilingPointInKelvins) {
        this.atomicNumber = atomicNumber;
        this.elementColor = elementColor;
        this.elementName = elementName;
        this.symbol = symbol;
        this.phaseAtSTP = phaseAtSTP;
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
        this.meltingPointInKelvins = meltingPointInKelvins;
        this.boilingPointInKelvins = boilingPointInKelvins;
        this.doesSublimate = meltingPointInKelvins >= boilingPointInKelvins;
        ChemicalElements.values.add(this);
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown elements (or when data is not provided).
     */
    private ChemicalElements(int atomicNumber, Color elementColor, String elementName, String symbol, MatterPhases phaseAtSTP, int meltingPointInKelvins) {
        this(atomicNumber, elementColor, elementName, symbol, phaseAtSTP, meltingPointInKelvins,
             meltingPointInKelvins < TemperatureUtils.NOHEAT_TEMP_LIMIT_IN_KELVINS
             ? TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS
             : meltingPointInKelvins < TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS
               ? TemperatureUtils.SUPERHEATED_TEMP_LIMIT_IN_KELVINS
               : TemperatureUtils.INDUSTRIAL_BLASTING_TEMP_LIMIT_IN_KELVINS);
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown elements (or when data is not provided).
     */
    private ChemicalElements(int atomicNumber, Color elementColor, String elementName, String symbol, MatterPhases phaseAtSTP) {
        this(atomicNumber, elementColor, elementName, symbol, phaseAtSTP,
            TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS,
            TemperatureUtils.SUPERHEATED_TEMP_LIMIT_IN_KELVINS);
    }
    
    public static List<ChemicalElements> values() {
        return values;
    }
    
    public static ChemicalElements fromAtomicNumber(int atomicNumber) {
        for (ChemicalElements element : ChemicalElements.values()) {
            if (element.atomicNumber == atomicNumber) {
                return element;
            }
        }
        return null;
    }
    
    public static ChemicalElements fromElementName(String elementName) {
        for (ChemicalElements element : ChemicalElements.values()) {
            if (element.elementName.equalsIgnoreCase(elementName)) {
                return element;
            }
        }
        return null;
    }
    
    public static ChemicalElements fromSymbol(String symbol) {
        for (ChemicalElements element : ChemicalElements.values()) {
            if (element.symbol.equals(symbol)) {
                return element;
            }
        }
        return null;
    }
    
    public int getAtomicNumber() {
        return this.atomicNumber;
    }
    
    public Color getElementColor() {
        return this.elementColor;
    }
    
    public String getElementName() {
        return elementName;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public ResourceLocation getCompoundBaseTexture() {
        return this.compoundBaseTexture;
    }
    
    public ResourceLocation getCompoundTintedTexture() {
        return this.compoundTintedTexture;
    }
    
    public ResourceLocation getSampleBaseTexture() {
        return this.sampleBaseTexture;
    }
    
    public ResourceLocation getSampleTintedTexture() {
        return this.sampleTintedTexture;
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
}
