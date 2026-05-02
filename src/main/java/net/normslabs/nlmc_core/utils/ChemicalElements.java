/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:29
 */

package net.normslabs.nlmc_core.utils;


public enum ChemicalElements {
    HYDROGEN(1, "hydrogen", "H", MatterPhases.GAS, 14, 20),
    HELIUM(2, "helium", "He", MatterPhases.GAS, 0, 4),
    LITHIUM(3, "lithium", "Li", MatterPhases.SOLID, 454, 1603),
    BERYLLIUM(4, "beryllium", "Be", MatterPhases.SOLID, 1560, 2742),
    BORON(5, "boron", "B", MatterPhases.SOLID, 2349, 4200),
    CARBON(6, "carbon", "C", MatterPhases.SOLID, 3823, 4300),
    NITROGEN(7, "nitrogen", "N", MatterPhases.GAS, 63, 77),
    OXYGEN(8, "oxygen", "O", MatterPhases.GAS, 54, 90),
    FLUORINE(9, "fluorine", "F", MatterPhases.GAS, 53, 85),
    NEON(10, "neon", "Ne", MatterPhases.GAS, 25, 27),
    SODIUM(11, "sodium", "Na", MatterPhases.SOLID, 371, 1156),
    MAGNESIUM(12, "magnesium", "Mg", MatterPhases.SOLID, 923, 1363),
    ALUMINIUM(13, "aluminium", "Al", MatterPhases.SOLID, 933, 2792),
    SILICON(14, "silicon", "Si", MatterPhases.SOLID, 1687, 3538),
    PHOSPHORUS(15, "phosphorus", "P", MatterPhases.SOLID, 317, 553),
    SULFUR(16, "sulfur", "S", MatterPhases.SOLID, 388, 717),
    CHLORINE(17, "chlorine", "Cl", MatterPhases.GAS, 172, 239),
    ARGON(18, "argon", "Ar", MatterPhases.GAS, 84, 87),
    POTASSIUM(19, "potassium", "K", MatterPhases.SOLID, 337, 1032),
    CALCIUM(20, "calcium", "Ca", MatterPhases.SOLID, 1115, 1757),
    SCANDIUM(21, "scandium", "Sc", MatterPhases.SOLID, 1814, 3109),
    TITANIUM(22, "titanium", "Ti", MatterPhases.SOLID, 1941, 3560),
    VANADIUM(23, "vanadium", "V", MatterPhases.SOLID, 2183, 3680),
    CHROMIUM(24, "chromium", "Cr", MatterPhases.SOLID, 2180, 2944),
    MANGANESE(25, "manganese", "Mn", MatterPhases.SOLID, 1519, 2334),
    IRON(26, "iron", "Fe", MatterPhases.SOLID, 1811, 3134),
    COBALT(27, "cobalt", "Co", MatterPhases.SOLID, 1768, 3200),
    NICKEL(28, "nickel", "Ni", MatterPhases.SOLID, 1728, 3186),
    COPPER(29, "copper", "Cu", MatterPhases.SOLID, 1358, 2835),
    ZINC(30, "zinc", "Zn", MatterPhases.SOLID, 693, 1180),
    GALLIUM(31, "gallium", "Ga", MatterPhases.SOLID, 303, 2477),
    GERMANIUM(32, "germanium", "Ge", MatterPhases.SOLID, 1211, 3106),
    ARSENIC(33, "arsenic", "As", MatterPhases.SOLID, 1090, 887),
    SELENIUM(34, "selenium", "Se", MatterPhases.SOLID, 494, 958),
    BROMINE(35, "bromine", "Br", MatterPhases.LIQUID, 266, 332),
    KRYPTON(36, "krypton", "Kr", MatterPhases.GAS, 116, 120),
    RUBIDIUM(37, "rubidium", "Rb", MatterPhases.SOLID, 312, 961),
    STRONTIUM(38, "strontium", "Sr", MatterPhases.SOLID, 1050, 1655),
    YTTRIUM(39, "yttrium", "Y", MatterPhases.SOLID, 1799, 3609),
    ZIRCONIUM(40, "zirconium", "Zr", MatterPhases.SOLID, 2128, 4682),
    NIOBIUM(41, "niobium", "Nb", MatterPhases.SOLID, 2750, 5017),
    MOLYBDENUM(42, "molybdenum", "Mo", MatterPhases.SOLID, 2896, 4912),
    TECHNETIUM(43, "technetium", "Tc", MatterPhases.SOLID, 2430, 4538),
    RUTHENIUM(44, "ruthenium", "Ru", MatterPhases.SOLID, 2607, 4423),
    RHODIUM(45, "rhodium", "Rh", MatterPhases.SOLID, 2237, 3968),
    PALLADIUM(46, "palladium", "Pd", MatterPhases.SOLID, 1828, 3236),
    SILVER(47, "silver", "Ag", MatterPhases.SOLID, 1235, 2435),
    CADMIUM(48, "cadmium", "Cd", MatterPhases.SOLID, 594, 1040),
    INDIUM(49, "indium", "In", MatterPhases.SOLID, 430, 2345),
    TIN(50, "tin", "Sn", MatterPhases.SOLID, 505, 2875),
    ANTIMONY(51, "antimony", "Sb", MatterPhases.SOLID, 904, 1860),
    TELLURIUM(52, "tellurium", "Te", MatterPhases.SOLID, 723, 1261),
    IODINE(53, "iodine", "I", MatterPhases.SOLID, 387, 457),
    XENON(54, "xenon", "Xe", MatterPhases.GAS, 161, 165),
    CESIUM(55, "cesium", "Cs", MatterPhases.SOLID, 302, 944),
    BARIUM(56, "barium", "Ba", MatterPhases.SOLID, 1000, 2170),
    LANTHANUM(57, "lanthanum", "La", MatterPhases.SOLID, 1193, 3737),
    CERIUM(58, "cerium", "Ce", MatterPhases.SOLID, 1071, 3697),
    PRASEODYMIUM(59, "praseodymium", "Pr", MatterPhases.SOLID, 1204, 3793),
    NEODYMIUM(60, "neodymium", "Nd", MatterPhases.SOLID, 1294, 3347),
    PROMETHIUM(61, "promethium", "Pm", MatterPhases.SOLID, 1315, 3273),
    SAMARIUM(62, "samarium", "Sm", MatterPhases.SOLID, 1345, 2067),
    EUROPIUM(63, "europium", "Eu", MatterPhases.SOLID, 1095, 1802),
    GADOLINIUM(64, "gadolinium", "Gd", MatterPhases.SOLID, 1586, 3546),
    TERBIUM(65, "terbium", "Tb", MatterPhases.SOLID, 1629, 3503),
    DYSPROSIUM(66, "dysprosium", "Dy", MatterPhases.SOLID, 1680, 2840),
    HOLMIUM(67, "holmium", "Ho", MatterPhases.SOLID, 1747, 2973),
    ERBIUM(68, "erbium", "Er", MatterPhases.SOLID, 1802, 3141),
    THULIUM(69, "thulium", "Tm", MatterPhases.SOLID, 1818, 2223),
    YTTERBIUM(70, "ytterbium", "Yb", MatterPhases.SOLID, 1097, 1469),
    LUTETIUM(71, "lutetium", "Lu", MatterPhases.SOLID, 1925, 3675),
    HAFNIUM(72, "hafnium", "Hf", MatterPhases.SOLID, 2506, 4876),
    TANTALUM(73, "tantalum", "Ta", MatterPhases.SOLID, 3290, 5731),
    TUNGSTEN(74, "tungsten", "W", MatterPhases.SOLID, 3695, 5828),
    RHENIUM(75, "rhenium", "Re", MatterPhases.SOLID, 3459, 5869),
    OSMIUM(76, "osmium", "Os", MatterPhases.SOLID, 3306, 5285),
    IRIDIUM(77, "iridium", "Ir", MatterPhases.SOLID, 2719, 4701),
    PLATINUM(78, "platinum", "Pt", MatterPhases.SOLID, 2041, 4098),
    GOLD(79, "gold", "Au", MatterPhases.SOLID, 1337, 3129),
    MERCURY(80, "mercury", "Hg", MatterPhases.LIQUID, 234, 630),
    THALLIUM(81, "thallium", "Tl", MatterPhases.SOLID, 577, 1746),
    LEAD(82, "lead", "Pb", MatterPhases.SOLID, 601, 2022),
    BISMUTH(83, "bismuth", "Bi", MatterPhases.SOLID, 545, 1837),
    POLONIUM(84, "polonium", "Po", MatterPhases.SOLID, 527, 1235),
    ASTATINE(85, "astatine", "At", MatterPhases.SOLID, 575, 610),
    RADON(86, "radon", "Rn", MatterPhases.GAS, 202, 211),
    FRANCIUM(87, "francium", "Fr", MatterPhases.SOLID, 300, 950),
    RADIUM(88, "radium", "Ra", MatterPhases.SOLID, 973, 2010),
    ACTINIUM(89, "actinium", "Ac", MatterPhases.SOLID, 1323, 3471),
    THORIUM(90, "thorium", "Th", MatterPhases.SOLID, 2023, 5061),
    PROTACTINIUM(91, "protactinium", "Pa", MatterPhases.SOLID, 1841, 4300),
    URANIUM(92, "uranium", "U", MatterPhases.SOLID, 1405, 4404),
    NEPTUNIUM(93, "neptunium", "Np", MatterPhases.SOLID, 913, 4175),
    PLUTONIUM(94, "plutonium", "Pu", MatterPhases.SOLID, 913, 3505),
    AMERICIUM(95, "americium", "Am", MatterPhases.SOLID, 1449, 2880),
    CURIUM(96, "curium", "Cm", MatterPhases.SOLID, 1618, 3383),
    BERKELIUM(97, "berkelium", "Bk", MatterPhases.SOLID, 1259, 2900),
    CALIFORNIUM(98, "californium", "Cf", MatterPhases.SOLID, 1173, 1743),
    EINSTEINIUM(99, "einsteinium", "Es", MatterPhases.SOLID, 1133, 1269),
    FERMIUM(100, "fermium", "Fm", MatterPhases.SOLID, 1800),
    MENDELEVIUM(101, "mendelevium", "Md", MatterPhases.SOLID, 1100),
    NOBELIUM(102, "nobelium", "No", MatterPhases.SOLID, 1100),
    LAWRENCIUM(103, "lawrencium", "Lr", MatterPhases.SOLID, 1900),
    RUTHERFORDIUM(104, "rutherfordium", "Rf", MatterPhases.SOLID, 2400, 5800),
    DUBNIUM(105, "dubnium", "Db", MatterPhases.SOLID, 303, 2477),
    SEABORGIUM(106, "seaborgium", "Sg", MatterPhases.SOLID, 2200, 4000),
    BOHRIUM(107, "bohrium", "Bh", MatterPhases.SOLID),
    HASSIUM(108, "hassium", "Hs", MatterPhases.SOLID),
    MEITNERIUM(109, "meitnerium", "Mt", MatterPhases.SOLID),
    DARMSTADTIUM(110, "darmstadtium", "Ds", MatterPhases.SOLID),
    ROENTGENIUM(111, "roentgenium", "Rg", MatterPhases.SOLID),
    COPERNICIUM(112, "copernicium", "Cn", MatterPhases.SOLID),
    NIHONIUM(113, "nihonium", "Nh", MatterPhases.SOLID),
    FLEROVIUM(114, "flerovium", "Fl", MatterPhases.SOLID),
    MOSCOVIUM(115, "moscovium", "Mc", MatterPhases.SOLID),
    LIVERMORIUM(116, "livermorium", "Lv", MatterPhases.SOLID),
    TENNESSINE(117, "tennessine", "Ts", MatterPhases.SOLID),
    OGANESSON(118, "oganesson", "Og", MatterPhases.GAS);
    
    
    private final int atomicNumber;
    private final String elementName;
    private final String symbol;
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
    private ChemicalElements(int atomicNumber, String elementName, String symbol, MatterPhases phaseAtSTP, int meltingPointInKelvins, int boilingPointInKelvins) {
        this.atomicNumber = atomicNumber;
        this.elementName = elementName;
        this.symbol = symbol;
        this.phaseAtSTP = phaseAtSTP;
        this.meltingPointInKelvins = meltingPointInKelvins;
        this.boilingPointInKelvins = boilingPointInKelvins;
        this.doesSublimate = meltingPointInKelvins >= boilingPointInKelvins;
    }
    
    /**
     * Convenience constructor for enum entries without explicit temperature data.
     * Uses default assumptions for unknown elements (or when data is not provided).
     */
    private ChemicalElements(int atomicNumber, String elementName, String symbol, MatterPhases phaseAtSTP, int meltingPointInKelvins) {
        this(atomicNumber, elementName, symbol, phaseAtSTP, meltingPointInKelvins,
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
    private ChemicalElements(int atomicNumber, String elementName, String symbol, MatterPhases phaseAtSTP) {
        this(atomicNumber, elementName, symbol, phaseAtSTP,
            TemperatureUtils.HEATED_TEMP_LIMIT_IN_KELVINS,
            TemperatureUtils.SUPERHEATED_TEMP_LIMIT_IN_KELVINS);
    }
    
    public static ChemicalElements fromAtomicNumber(int atomicNumber) {
        for (ChemicalElements element : ChemicalElements.values()) {
            if (element.atomicNumber == atomicNumber) {
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
    
    public String getElementName() {
        return elementName;
    }
    
    public String getSymbol() {
        return symbol;
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
