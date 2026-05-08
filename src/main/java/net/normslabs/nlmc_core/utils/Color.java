/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 17:10
 */

package net.normslabs.nlmc_core.utils;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.material.MapColor;
import net.normslabs.nlmc_core.NlmcCore;
import net.normslabs.nlmc_core.NlmcTags;
import net.normslabs.nlmc_core.exceptions.InvalidArgumentException;

/**
 *
 * TODO: complete documentation
 *
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-04-30 17:10
 */
public class Color {
    
    //<editor-fold defaultstate="collapsed" desc="COLOR VALUES">
    
    public static Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    // -- Elements (periodic table) completion (4-117)
    public static Color HYDROGEN = new Color("#C1CFD6");
    public static Color HELIUM = new Color("#CAD0D6");
    public static Color LITHIUM = new Color("#E7D0BD");
    public static Color BERYLLIUM = new Color("#ACB7AA");
    public static Color BORON = new Color("#B8AEBB");
    public static Color CARBON = new Color("#808080");
    public static Color NITROGEN = new Color("#A9B5C1");
    public static Color OXYGEN = new Color("#ACBDC1");
    public static Color FLUORINE = new Color("#B8C1A4");
    public static Color NEON = new Color("#BBAEC1");
    public static Color SODIUM = new Color("#C1B4A7");
    public static Color MAGNESIUM = new Color("#B0B6B5");
    public static Color ALUMINIUM = new Color("#D1D1D9");
    public static Color SILICON = new Color("#A1A5F0");
    public static Color PHOSPHORUS = new Color("#C1B59A");
    public static Color SULFUR = new Color("#F8E263");
    public static Color CHLORINE = new Color("#B0C1A7");
    public static Color ARGON = new Color("#B5B0C1");
    public static Color POTASSIUM = new Color("#C1AD9A");
    public static Color CALCIUM = new Color("#B9BBB7");
    public static Color SCANDIUM = new Color("#AEB4BB");
    public static Color TITANIUM = new Color("#83A3FF");
    public static Color VANADIUM = new Color("#CAE5D8");
    public static Color CHROMIUM = new Color("#B9C3C3");
    public static Color MANGANESE = new Color("#B3B2BA");
    public static Color IRON = new Color("#C4C9C9");
    public static Color COBALT = new Color("#CACAC6");
    public static Color NICKEL = new Color("#E4E2B3");
    public static Color COPPER = new Color("#f17a66");
    public static Color ZINC = new Color("#AFC8A0");
    public static Color GALLIUM = new Color("#BAAFB7");
    public static Color GERMANIUM = new Color("#B3B5BC");
    public static Color ARSENIC = new Color("#B6AEAE");
    public static Color SELENIUM = new Color("#B8B5AF");
    public static Color BROMINE = new Color("#C1AE9A");
    public static Color KRYPTON = new Color("#B5B0C1");
    public static Color RUBIDIUM = new Color("#C1AEA9");
    public static Color STRONTIUM = new Color("#B9B8AE");
    public static Color YTTRIUM = new Color("#B1B7BC");
    public static Color ZIRCONIUM = new Color("#B0B5B7");
    public static Color NIOBIUM = new Color("#AFB6BA");
    public static Color MOLYBDENUM = new Color("#AEB2B7");
    public static Color TECHNETIUM = new Color("#B1B5B9");
    public static Color RUTHENIUM = new Color("#AEB2BB");
    public static Color RHODIUM = new Color("#B3B5B7");
    public static Color PALLADIUM = new Color("#B0B8B8");
    public static Color SILVER = new Color("#C9DBDB");
    public static Color CADMIUM = new Color("#C1B5AE");
    public static Color INDIUM = new Color("#B5AEC1");
    public static Color TIN = new Color("#A6B7C5");
    public static Color ANTIMONY = new Color("#B7AEB7");
    public static Color TELLURIUM = new Color("#B8B7AE");
    public static Color IODINE = new Color("#B5AEBB");
    public static Color XENON = new Color("#B3B2C1");
    public static Color CESIUM = new Color("#C1B6A9");
    public static Color BARIUM = new Color("#B8BAAE");
    public static Color LANTHANUM = new Color("#B1B6C1");
    public static Color CERIUM = new Color("#B1BBB0");
    public static Color PRASEODYMIUM = new Color("#B0BBB1");
    public static Color NEODYMIUM = new Color("#B1AEC1");
    public static Color PROMETHIUM = new Color("#B9AEBC");
    public static Color SAMARIUM = new Color("#B4AEBD");
    public static Color EUROPIUM = new Color("#AFB7C1");
    public static Color GADOLINIUM = new Color("#B0B8BE");
    public static Color TERBIUM = new Color("#B1BFB2");
    public static Color DYSPROSIUM = new Color("#AEBBB7");
    public static Color HOLMIUM = new Color("#AFC1B9");
    public static Color ERBIUM = new Color("#B5B1BE");
    public static Color THULIUM = new Color("#B1B5C1");
    public static Color YTTERBIUM = new Color("#B9BBC1");
    public static Color LUTETIUM = new Color("#B4B8BD");
    public static Color HAFNIUM = new Color("#AFB5BB");
    public static Color TANTALUM = new Color("#AFB4B7");
    public static Color TUNGSTEN = new Color("#8E8B95");
    public static Color RHENIUM = new Color("#B1B5B8");
    public static Color OSMIUM = new Color("#BAB7F1");
    public static Color IRIDIUM = new Color("#C1C8CC");
    public static Color PLATINUM = new Color("#A1F0FF");
    public static Color GOLD = new Color("#f9ec4e");
    public static Color MERCURY = new Color("#B3B3B3");
    public static Color THALLIUM = new Color("#B8BAAE");
    public static Color LEAD = new Color("#90A4FF");
    public static Color BISMUTH = new Color("#B8AEBA");
    public static Color POLONIUM = new Color("#B8B1B1");
    public static Color ASTATINE = new Color("#B8B1B8");
    public static Color RADON = new Color("#B6B1BE");
    public static Color FRANCIUM = new Color("#C1B5AE");
    public static Color RADIUM = new Color("#D9F5A6");
    public static Color ACTINIUM = new Color("#B1B6BB");
    public static Color THORIUM = new Color("#A4A9A9");
    public static Color PROTACTINIUM = new Color("#B0BBB6");
    public static Color URANIUM = new Color("#BEFF9E");
    public static Color NEPTUNIUM = new Color("#76D8AD");
    public static Color PLUTONIUM = new Color("#DCE288");
    public static Color AMERICIUM = new Color("#B8B0BB");
    public static Color CURIUM = new Color("#BAB0B8");
    public static Color BERKELIUM = new Color("#B1BAB6");
    public static Color CALIFORNIUM = new Color("#B1B5BA");
    public static Color EINSTEINIUM = new Color("#B0B2C1");
    public static Color FERMIUM = new Color("#B4B6C1");
    public static Color MENDELEVIUM = new Color("#B6B1BA");
    public static Color NOBELIUM = new Color("#BBB1B6");
    public static Color LAWRENCIUM = new Color("#B5B1BB");
    public static Color RUTHERFORDIUM = new Color("#AFB5BB");
    public static Color DUBNIUM = new Color("#BBAFB4");
    public static Color SEABORGIUM = new Color("#B1B7BC");
    public static Color BOHRIUM = new Color("#B7B1BC");
    public static Color HASSIUM = new Color("#B1B1B7");
    public static Color MEITNERIUM = new Color("#BAB1B6");
    public static Color DARMSTADTIUM = new Color("#B0B6B6");
    public static Color ROENTGENIUM = new Color("#B8B3AE");
    public static Color COPERNICIUM = new Color("#B1BBBB");
    public static Color NIHONIUM = new Color("#C1B1B5");
    public static Color FLEROVIUM = new Color("#B9B9AE");
    public static Color MOSCOVIUM = new Color("#BFB2B5");
    public static Color LIVERMORIUM = new Color("#B9AEB2");
    public static Color TENNESSINE = new Color("#B5AEB3");
    public static Color OGANESSON = new Color("#D0AD9A");
    
    
    // BUILT-IN & OTHER MODS
    public static Color NETHERITE_SCRAP = new Color("#6F3A3A");
    public static Color DESH = new Color("#F89C55");
    public static Color OSTRUM = new Color("#B276A4");
    public static Color CALORITE = new Color("#D15968");
    public static Color JUPERIUM = new Color("#62BBF6");
    public static Color SATURLYTE = new Color("#9C62EE");
    public static Color ELECTROLYTE = new Color("#4A51B4");
    
    // ALLOYS
    public static Color NETHERITE = new Color("#3C3838");
    public static Color STEEL = new Color("#707070");
    public static Color HARDENED_STEEL = new Color("#555555");
    public static Color BRASS = new Color("#E7C16E");
    public static Color BRONZE = new Color("#D8AB73");
    public static Color CONSTANTAN = new Color("#E09970");
    public static Color INVAR = new Color("#D1CEC0");
    public static Color ELECTRUM = new Color("#E9E595");
    public static Color ANDESITE_ALLOY = new Color("#A4B7A8");
    public static Color DIORITE_ALLOY = new Color("#CCCBCB");
    public static Color GRANITE_ALLOY = new Color("#B98485");
    public static Color ALPHA_TITANIUM = new Color("#507EFD");
    public static Color PLASTANIUM = new Color("#86F17F");
    public static Color CAST_IRON = new Color("#4E4E4F");
    public static Color NECROMIUM = new Color("#1EE3F0");
    public static Color LUMIUM = new Color("#FFDA90");
    public static Color SIGNALUM = new Color("#E4680F");
    public static Color SIGNAR = new Color("#c37e48");
    public static Color ENDERIUM = new Color("#165B54");
    public static Color VOID_STEEL = new Color("#1C745D");
    public static Color RED_ALLOY = new Color("#CC3A29");
    public static Color QUARTZ_IRON = new Color("#BEC5C5");
    public static Color NETHERSTEEL = new Color("#594547");
    public static Color DESHTRUM = new Color("#746266");
    
    // GEMS
    public static Color EMERALD = new Color("#51d975");
    public static Color DIAMOND = new Color("#61dbd5");
    public static Color REDSTONE = new Color("#ab1b09");
    public static Color LAPIS = new Color("#264389");
    public static Color AMETHYST = new Color("#9966CC");
    public static Color QUARTZ = new Color("#FFFCF5");
    public static Color SAPPHIRE = new Color("#0F52BA");
    public static Color RUBY = new Color("#E0115F");
    public static Color PERIDOT = new Color("#B4C424");
    public static Color TOPAZ =  new Color( "#FFC87C");
    public static Color CITRINE =  new Color( "#E4D00A");
    public static Color OPAL =  new Color( "#A8C3BC");
    public static Color SUNSTONE =  new Color( "#BB6035");
    public static Color ONYX =  new Color( "#353839");
    public static Color MALACHITE =  new Color( "#0BDA51");
    public static Color TOURMALINE =  new Color( "#86A1A9");
    public static Color MOONSTONE =  new Color( "#3AA8C1");
    public static Color AMBER =  new Color( "#FFBF00");
    public static Color AGATE =  new Color( "#599F99");
    public static Color BLOODSTONE =  new Color( "#125524");
    public static Color JADE =  new Color( "#00A86B");
    public static Color GARNET =  new Color( "#9A2A2A");
    
    // OTHERS
    public static Color COAL = new Color("#1F1A1A");
    public static Color CHARCOAL = new Color("#190c01");
    public static Color NETHERRACK = new Color("#700200");
    public static Color CLAY = new Color("#A4A8B8");
    public static Color DIRT = new Color("#976D4D");
    public static Color STONE = new Color("#707070");
    public static Color WOOD = new Color("#8F7748");
    public static Color SAND = new Color("#F7E9A3");
    public static Color GLOWSTONE = new Color("#FFB755");
    public static Color PRISMARINE = new Color("#63988d");
    public static Color PURPUR = new Color("#a679a6");
    public static Color END_STONE = new Color("#dddfa5");
    public static Color ICE = new Color("#7dadff");
    public static Color COKE = new Color("#4B4B4B");
    public static Color GRAPHITE = new Color("#4B4B4B");
    public static Color PLASTIC = new Color("#F3F3E9");
    
    // Standard Colors
    public static Color WHITE = new Color("#FFFFFF");
    public static Color BLACK = new Color("#000000");
    public static Color RED = new Color("#FF0000");
    public static Color GREEN = new Color("#00FF00");
    public static Color BLUE = new Color("#0000FF");
    public static Color YELLOW = new Color("#FFFF00");
    public static Color MAGENTA = new Color("#FF00FF");
    public static Color CYAN = new Color("#00FFFF");
    public static Color ORANGE = new Color("#FFA500");
    public static Color PINK = new Color("#FFC0CB");
    public static Color GRAY = new Color("#808080");
    public static Color LIGHT_GRAY = new Color("#D3D3D3");
    public static Color DARK_GRAY = new Color("#A9A9A9");
    public static Color ALICE_BLUE = new Color("#F0F8FF");
    public static Color ANTIQUE_WHITE = new Color("#FAEBD7");
    public static Color AQUA = new Color("#00FFFF");
    public static Color AQUAMARINE = new Color("#7FFFD4");
    public static Color AZURE = new Color("#F0FFFF");
    public static Color BEIGE = new Color("#F5F5DC");
    public static Color BISQUE = new Color("#FFE4C4");
    public static Color BLANCHED_ALMOND = new Color("#FFEBCD");
    public static Color BLUE_VIOLET = new Color("#8A2BE2");
    public static Color BROWN = new Color("#A52A2A");
    public static Color BURLY_WOOD = new Color("#DEB887");
    public static Color CADET_BLUE = new Color("#5F9EA0");
    public static Color CHARTREUSE = new Color("#7FFF00");
    public static Color CHOCOLATE = new Color("#D2691E");
    public static Color CORAL = new Color("#FF7F50");
    public static Color CORNFLOWER_BLUE = new Color("#6495ED");
    public static Color CORNSILK = new Color("#FFF8DC");
    public static Color CRIMSON = new Color("#DC143C");
    public static Color DARK_BLUE = new Color("#00008B");
    public static Color DARK_CYAN = new Color("#008B8B");
    public static Color DARK_GOLDENROD = new Color("#B8860B");
    public static Color DARK_GREEN = new Color("#006400");
    public static Color DARK_KHAKI = new Color("#BDB76B");
    public static Color DARK_MAGENTA = new Color("#8B008B");
    public static Color DARK_OLIVE_GREEN = new Color("#556B2F");
    public static Color DARK_ORANGE = new Color("#FF8C00");
    public static Color DARK_ORCHID = new Color("#9932CC");
    public static Color DARK_RED = new Color("#8B0000");
    public static Color DARK_SALMON = new Color("#E9967A");
    public static Color DARK_SEA_GREEN = new Color("#8FBC8F");
    public static Color DARK_SLATE_BLUE = new Color("#483D8B");
    public static Color DARK_SLATE_GRAY = new Color("#2F4F4F");
    public static Color DARK_TURQUOISE = new Color("#00CED1");
    public static Color DARK_VIOLET = new Color("#9400D3");
    public static Color DEEP_PINK = new Color("#FF1493");
    public static Color DEEP_SKY_BLUE = new Color("#00BFFF");
    public static Color DIM_GRAY = new Color("#696969");
    public static Color DODGER_BLUE = new Color("#1E90FF");
    public static Color FIREBRICK = new Color("#B22222");
    public static Color FLORAL_WHITE = new Color("#FFFAF0");
    public static Color FOREST_GREEN = new Color("#228B22");
    public static Color FUCHSIA = new Color("#FF00FF");
    public static Color GAINSBORO = new Color("#DCDCDC");
    public static Color GHOST_WHITE = new Color("#F8F8FF");
    public static Color GOLDENROD = new Color("#DAA520");
    public static Color GREY = new Color("#808080");
    public static Color GREEN_YELLOW = new Color("#ADFF2F");
    public static Color HONEYDEW = new Color("#F0FFF0");
    public static Color HOT_PINK = new Color("#FF69B4");
    public static Color INDIAN_RED = new Color("#CD5C5C");
    public static Color INDIGO = new Color("#4B0082");
    public static Color IVORY = new Color("#FFFFF0");
    public static Color KHAKI = new Color("#F0E68C");
    public static Color LAVENDER = new Color("#E6E6FA");
    public static Color LAVENDER_BLUSH = new Color("#FFF0F5");
    public static Color LAWN_GREEN = new Color("#7CFC00");
    public static Color LEMON_CHIFFON = new Color("#FFFACD");
    public static Color LIGHT_BLUE = new Color("#ADD8E6");
    public static Color LIGHT_CORAL = new Color("#F08080");
    public static Color LIGHT_CYAN = new Color("#E0FFFF");
    public static Color LIGHT_GOLDENROD_YELLOW = new Color("#FAFAD2");
    public static Color LIGHT_GREY = new Color("#D3D3D3");
    public static Color LIGHT_GREEN = new Color("#90EE90");
    public static Color LIGHT_PINK = new Color("#FFB6C1");
    public static Color LIGHT_SALMON = new Color("#FFA07A");
    public static Color LIGHT_SEA_GREEN = new Color("#20B2AA");
    public static Color LIGHT_SKY_BLUE = new Color("#87CEFA");
    public static Color LIGHT_SLATE_GRAY = new Color("#778899");
    public static Color LIGHT_STEEL_BLUE = new Color("#B0C4DE");
    public static Color LIGHT_YELLOW = new Color("#FFFFE0");
    public static Color LIME = new Color("#00FF00");
    public static Color LIME_GREEN = new Color("#32CD32");
    public static Color LINEN = new Color("#FAF0E6");
    public static Color MAROON = new Color("#800000");
    public static Color MEDIUM_AQUAMARINE = new Color("#66CDAA");
    public static Color MEDIUM_BLUE = new Color("#0000CD");
    public static Color MEDIUM_ORCHID = new Color("#BA55D3");
    public static Color MEDIUM_PURPLE = new Color("#9370DB");
    public static Color MEDIUM_SEA_GREEN = new Color("#3CB371");
    public static Color MEDIUM_SLATE_BLUE = new Color("#7B68EE");
    public static Color MEDIUM_SPRING_GREEN = new Color("#00FA9A");
    public static Color MEDIUM_TURQUOISE = new Color("#48D1CC");
    public static Color MEDIUM_VIOLET_RED = new Color("#C71585");
    public static Color MIDNIGHT_BLUE = new Color("#191970");
    public static Color MINT_CREAM = new Color("#F5FFFA");
    public static Color MISTY_ROSE = new Color("#FFE4E1");
    public static Color MOCCASIN = new Color("#FFE4B5");
    public static Color NAVAJO_WHITE = new Color("#FFDEAD");
    public static Color NAVY = new Color("#000080");
    public static Color OLD_LACE = new Color("#FDF5E6");
    public static Color OLIVE = new Color("#808000");
    public static Color OLIVE_DRAB = new Color("#6B8E23");
    public static Color ORANGE_RED = new Color("#FF4500");
    public static Color ORCHID = new Color("#DA70D6");
    public static Color PALE_GOLDENROD = new Color("#EEE8AA");
    public static Color PALE_GREEN = new Color("#98FB98");
    public static Color PALE_TURQUOISE = new Color("#AFEEEE");
    public static Color PALE_VIOLET_RED = new Color("#DB7093");
    public static Color PAPAYA_WHIP = new Color("#FFEFD5");
    public static Color PEACH_PUFF = new Color("#FFDAB9");
    public static Color PERU = new Color("#CD853F");
    public static Color PLUM = new Color("#DDA0DD");
    public static Color POWDER_BLUE = new Color("#B0E0E6");
    public static Color PURPLE = new Color("#800080");
    public static Color REBECCA_PURPLE = new Color("#663399");
    public static Color ROSY_BROWN = new Color("#BC8F8F");
    public static Color ROYAL_BLUE = new Color("#4169E1");
    public static Color SADDLE_BROWN = new Color("#8B4513");
    public static Color SALMON = new Color("#FA8072");
    public static Color SANDY_BROWN = new Color("#F4A460");
    public static Color SEA_GREEN = new Color("#2E8B57");
    public static Color SEA_SHELL = new Color("#FFF5EE");
    public static Color SIENNA = new Color("#A0522D");
    public static Color SKY_BLUE = new Color("#87CEEB");
    public static Color SLATE_BLUE = new Color("#6A5ACD");
    public static Color SLATE_GRAY = new Color("#708090");
    public static Color SNOW = new Color("#FFFAFA");
    public static Color SPRING_GREEN = new Color("#00FF7F");
    public static Color STEEL_BLUE = new Color("#4682B4");
    public static Color TAN = new Color("#D2B48C");
    public static Color TEAL = new Color("#008080");
    public static Color THISTLE = new Color("#D8BFD8");
    public static Color TOMATO = new Color("#FF6347");
    public static Color TURQUOISE = new Color("#40E0D0");
    public static Color VIOLET = new Color("#EE82EE");
    public static Color WHEAT = new Color("#F5DEB3");
    public static Color WHITE_SMOKE = new Color("#F5F5F5");
    public static Color YELLOW_GREEN = new Color("#9ACD32");
    public static Color DARK_GREY = new Color("#A9A9A9");
    public static Color SLATE_GREY = new Color("#708090");
    public static Color LIGHT_SLATE_GREY = new Color("#778899");
    public static Color DARK_SLATE_GREY = new Color("#2F4F4F");
    public static Color DIM_GREY = new Color("#696969");
    
    
    // Minecraft Colors
    public static Color MINECRAFT_GRASS = new Color("#7FB238");
    public static Color MINECRAFT_SAND = new Color("#F7E9A3");
    public static Color MINECRAFT_WOOL = new Color("#C7C7C7");
    public static Color MINECRAFT_FIRE = new Color("#FF0000");
    public static Color MINECRAFT_ICE = new Color("#A0A0FF");
    public static Color MINECRAFT_IRON = new Color("#A7A7A7");
    public static Color MINECRAFT_PLANT = new Color("#007C00");
    public static Color MINECRAFT_SNOW = new Color("#FFFFFF");
    public static Color MINECRAFT_CLAY = new Color("#A4A8B8");
    public static Color MINECRAFT_DIRT = new Color("#976D4D");
    public static Color MINECRAFT_STONE = new Color("#707070");
    public static Color MINECRAFT_WATER = new Color("#4040FF");
    public static Color MINECRAFT_WOOD = new Color("#8F7748");
    public static Color MINECRAFT_QUARTZ = new Color("#FFFCF5");
    public static Color MINECRAFT_ORANGE = new Color("#D87F33");
    public static Color MINECRAFT_MAGENTA = new Color("#B24CD8");
    public static Color MINECRAFT_LIGHT_BLUE = new Color("#6699D8");
    public static Color MINECRAFT_YELLOW = new Color("#E5E533");
    public static Color MINECRAFT_LIGHT_GREEN = new Color("#7FCC19");
    public static Color MINECRAFT_PINK = new Color("#F27FA5");
    public static Color MINECRAFT_GRAY = new Color("#4C4C4C");
    public static Color MINECRAFT_SILVER = new Color("#999999");
    public static Color MINECRAFT_CYAN = new Color("#4C7F99");
    public static Color MINECRAFT_PURPLE = new Color("#7F3FB2");
    public static Color MINECRAFT_BLUE = new Color("#334CB2");
    public static Color MINECRAFT_BROWN = new Color("#664C33");
    public static Color MINECRAFT_GREEN = new Color("#667F33");
    public static Color MINECRAFT_RED = new Color("#993333");
    public static Color MINECRAFT_BLACK = new Color("#191919");
    public static Color MINECRAFT_GOLD = new Color("#FAEE4D");
    public static Color MINECRAFT_DIAMOND = new Color("#5CDBD5");
    public static Color MINECRAFT_LAPIS = new Color("#4A80FF");
    public static Color MINECRAFT_EMERALD = new Color("#00D93A");
    public static Color MINECRAFT_PODZOL = new Color("#815631");
    public static Color MINECRAFT_NETHERRACK = new Color("#700200");
    public static Color MINECRAFT_WHITE_TERRACOTTA = new Color("#D1B1A1");
    public static Color MINECRAFT_ORANGE_TERRACOTTA = new Color("#9F5224");
    public static Color MINECRAFT_MAGENTA_TERRACOTTA = new Color("#95576C");
    public static Color MINECRAFT_LIGHT_BLUE_TERRACOTTA = new Color("#706C8A");
    public static Color MINECRAFT_YELLOW_TERRACOTTA = new Color("#BA8524");
    public static Color MINECRAFT_LIME_TERRACOTTA = new Color("#677535");
    public static Color MINECRAFT_PINK_TERRACOTTA = new Color("#A04D4E");
    public static Color MINECRAFT_GREY_TERRACOTTA = new Color("#392923");
    public static Color MINECRAFT_LIGHT_GREY_TERRACOTTA = new Color("#876B62");
    public static Color MINECRAFT_CYAN_TERRACOTTA = new Color("#575C5C");
    public static Color MINECRAFT_PURPLE_TERRACOTTA = new Color("#7A4958");
    public static Color MINECRAFT_BLUE_TERRACOTTA = new Color("#4C3E5C");
    public static Color MINECRAFT_BROWN_TERRACOTTA = new Color("#4C3223");
    public static Color MINECRAFT_GREEN_TERRACOTTA = new Color("#4C522A");
    public static Color MINECRAFT_RED_TERRACOTTA = new Color("#8E3C2E");
    public static Color MINECRAFT_BLACK_TERRACOTTA = new Color("#251610");
    public static Color MINECRAFT_CRIMSON_NYLIUM = new Color("#BD3031");
    public static Color MINECRAFT_CRIMSON_STEM = new Color("#943F61");
    public static Color MINECRAFT_CRIMSON_HYPHAE = new Color("#5C191D");
    public static Color MINECRAFT_WARPED_NYLIUM = new Color("#167E86");
    public static Color MINECRAFT_WARPED_STEM = new Color("#3A8E8C");
    public static Color MINECRAFT_WARPED_HYPHAE = new Color("#562C3E");
    public static Color MINECRAFT_WARPED_WART = new Color("#14B485");
    public static Color MINECRAFT_DEEPSLATE = new Color("#646464");
    public static Color MINECRAFT_RAW_IRON = new Color("#D8AF93");
    public static Color MINECRAFT_GLOW_LICHEN = new Color("#7FA796");
    
    //</editor-fold>
    
    
    public static final int MAX_RGC_INT_VALUE = 255;
    public static final int MIN_RGB_INT_VALUE = 0;
    public static final int MAX_HUE_VALUE = 360;
    public static final int MIN_HUE_VALUE = 0;
    public static final int MAX_SATURATION_VALUE = 1;
    public static final int MIN_SATURATION_VALUE = 0;
    public static final int MAX_LIGHTNESS_VALUE = 1;
    public static final int MIN_LIGHTNESS_VALUE = 0;
    public static final int MIN_ALPHA_VALUE = 0;
    public static final int MAX_ALPHA_VALUE = 127;
    public static final int DEFAULT_ALPHA_VALUE = 127;
    
    private String rgbHexString;
    private String rgbaHexString;
    private String hslHexString;
    private String hslaHexString;
    
    private int redValue;
    private int greenValue;
    private int blueValue;
    
    private float hueValue;
    private float saturationValue;
    private float lightnessValue;
    
    private int alphaValue;
    
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    Color(String rgbHexString) {
        
        rgbHexString = rgbHexString.replace("#", "");
        try {
            if (rgbHexString.length() < 6) {
                throw new InvalidArgumentException("rgbHexString", String.format("Sanitized hex string argument [%s] must be at least %d characters long.", rgbHexString, 6));
            }
            
            this.redValue = Integer.valueOf(rgbHexString.substring(0, 2), 16);
            this.greenValue = Integer.valueOf(rgbHexString.substring(2, 4), 16);
            this.blueValue = Integer.valueOf(rgbHexString.substring(4, 6), 16);
            
            if (rgbHexString.length() == 8) {
                this.alphaValue = Integer.valueOf(rgbHexString.substring(6, 8), 16);
            } else {
                this.alphaValue = DEFAULT_ALPHA_VALUE;
            }
            
            this.rgbHexString = this.numValueToHexString(this.redValue)
                                + this.numValueToHexString(this.greenValue)
                                + this.numValueToHexString(this.blueValue);
            this.rgbaHexString = this.numValueToHexString(this.alphaValue) + this.rgbHexString;
            this.setHSLfromRGB(this.redValue, this.greenValue, this.blueValue);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid RGB/RGBA hex string argument passed to Color constructor", ex);
        }
    }
    
    Color(int red, int green, int blue) {
        this(red, green, blue, DEFAULT_ALPHA_VALUE);
    }
    
    Color(int red, int green, int blue, int alpha) {
        try {
            try {
                validateColorRgbIntValue(red);
            } catch (Exception ex) {
                throw new InvalidArgumentException("red", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", red), ex);
            }
            try {
                validateColorRgbIntValue(green);
            } catch (Exception ex) {
                throw new InvalidArgumentException("green", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", green), ex);
            }
            try {
                validateColorRgbIntValue(blue);
            } catch (Exception ex) {
                throw new InvalidArgumentException("blue", String.format("Invalid 'red' integer argument [%d] passed to Color constructor", blue), ex);
            }
            try {
                validateColorAlphaValue(alpha);
            } catch (Exception ex) {
                throw new InvalidArgumentException("alpha", String.format("Invalid 'alpha' integer argument [%d] passed to Color constructor", alpha), ex);
            }
            this.redValue = red;
            this.greenValue = green;
            this.blueValue = blue;
            this.alphaValue = alpha;
            this.rgbHexString = this.numValueToHexString(red) + this.numValueToHexString(green) + this.numValueToHexString(blue);
            this.rgbaHexString = this.numValueToHexString(alpha) + this.rgbHexString;
            
            this.setHSLfromRGB(red, green, blue);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid argument passed to Color constructor", ex);
        }
    
    }
    
    Color(float hue, float saturation, float lightness) {
        this(hue, saturation, lightness, DEFAULT_ALPHA_VALUE);
    }
    
    Color(float hue, float saturation, float lightness, int alpha) {
        try {
            try {
                validateHueValue(hue);
            } catch (Exception ex) {
                throw new InvalidArgumentException("hue", String.format("Invalid 'hue' integer argument [%f] passed to Color constructor", hue), ex);
            }
            try {
                validateSaturationValue(saturation);
            } catch (Exception ex) {
                throw new InvalidArgumentException("saturation", String.format("Invalid 'saturation' integer argument [%f] passed to Color constructor", saturation), ex);
            }
            try {
                validateLightnessValue(lightness);
            } catch (Exception ex) {
                throw new InvalidArgumentException("lightness", String.format("Invalid 'lightness' integer argument [%f] passed to Color constructor", lightness), ex);
            }
            try {
                validateColorAlphaValue(alpha);
            } catch (Exception ex) {
                throw new InvalidArgumentException("alpha", String.format("Invalid 'alpha' int argument [%d] passed to Color constructor", alpha), ex);
            }
            this.hueValue = hue;
            this.saturationValue = saturation;
            this.lightnessValue = lightness;
            this.alphaValue = alpha;
            this.rgbHexString = this.hueValueToHexString(hue)
                                + this.saturationValueToHexString(saturation)
                                + this.lightnessValueToHexString(lightness);
            this.rgbaHexString = this.rgbHexString + this.numValueToHexString(alpha);
            
            this.setRGBfromHSL(hue, saturation, lightness);
            
        } catch (Exception ex) {
            NlmcCore.LOGGER.error("Invalid argument passed to Color constructor", ex);
        }
        
    }
    
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
    
    public int getRedValue() {
        return this.redValue;
    }
    
    public int getGreenValue() {
        return this.greenValue;
    }
    
    public int getBlueValue() {
        return this.blueValue;
    }
    
    public float getHueValue() {
        return this.hueValue;
    }
    
    public float getSaturationValue() {
        return this.saturationValue;
    }
    
    public float getLightnessValue() {
        return this.lightnessValue;
    }
    
    public int getAlphaValue() {
        return this.alphaValue;
    }
    
    //</editor-fold>
    
    
    
    public int toTintIntValue() {
        return Integer.valueOf(this.rgbaHexString, 16);
    }
    
    public Color lightenBy(float percentage) {
        return new Color(this.hueValue, this.saturationValue, (this.lightnessValue * (1 + percentage)), this.alphaValue);
    }
    
    public Color darkenBy(float percentage) {
        return new Color(this.hueValue, this.saturationValue, (this.lightnessValue * (1 - percentage)), this.alphaValue);
    }
    
    private String numValueToHexString(int value) throws InvalidArgumentException {
        this.validateColorRgbIntValue(value);
        return String.format("%02x", value);
    }
    
    private String hueValueToHexString(float hueValue) throws InvalidArgumentException {
        this.validateHueValue(hueValue);
        return String.format("%02x", Math.round((hueValue / 360) * 255));
    }
    
    private String saturationValueToHexString(float saturationValue) throws InvalidArgumentException {
        this.validateSaturationValue(saturationValue);
        return String.format("%02x", Math.round(saturationValue * 255));
    }
    
    private String lightnessValueToHexString(float lightnessValue) throws InvalidArgumentException {
        this.validateSaturationValue(lightnessValue);
        return String.format("%02x", Math.round(lightnessValue * 255));
    }
    
    private void setHSLfromRGB(int red, int green, int blue) throws InvalidArgumentException {
        
        float redFloat = red / 255.f;
        float greenFloat = green / 255.f;
        float blueFloat = blue / 255.f;
        float max = Math.max(Math.max(redFloat, greenFloat), blueFloat);
        float min = Math.min(Math.min(redFloat, greenFloat), blueFloat);
        float minMaxDifferential = max - min;
        
        float baseHue = 0.f;
        if (minMaxDifferential == 0) {
            baseHue = 0;
        } else if (max == redFloat) {
            baseHue = (greenFloat-blueFloat) / minMaxDifferential;
            if (baseHue < 0) baseHue += 6.f;
        } else if (max == greenFloat) {
            baseHue = (blueFloat-redFloat) / minMaxDifferential + 2.f;
        } else if (max == blueFloat) {
            baseHue = (redFloat-greenFloat) / minMaxDifferential + 4.f;
        }
        
        float hue = 60.f * baseHue;
        float lightness = (max + min) * 0.5f;
        float saturation;
        
        if (minMaxDifferential == 0) {
            saturation = 0.f;
        } else {
            saturation = minMaxDifferential / (1 - Math.abs(2.f * lightness - 1.f));
        }
        
        this.hueValue = hue;
        this.saturationValue = saturation;
        this.lightnessValue = lightness;
        this.hslHexString = this.hueValueToHexString(hue)
                            + this.saturationValueToHexString(saturation)
                            + this.lightnessValueToHexString(lightness);
        this.hslaHexString = this.numValueToHexString(this.alphaValue) + this.hslHexString;
    }
    
    private void setRGBfromHSL(float hue, float saturation, float lightness) throws InvalidArgumentException {
        float qValue, pValue;
        int red, green, blue;
        
        if (saturation == 0) {
            red = green = blue = Math.round(lightness * 255); // achromatic
        } else {
            qValue = lightness < 0.5 ? (lightness * (1 + saturation)) : (lightness + saturation - lightness * saturation);
            pValue = 2 * lightness - qValue;
            red = Math.round(hue2rgb(pValue, qValue, hue + 1.0f / 3) * 255);
            green = Math.round(hue2rgb(pValue, qValue, hue) * 255);
            blue = Math.round(hue2rgb(pValue, qValue, hue - 1.0f / 3) * 255);
        }
        
        this.redValue = red;
        this.greenValue = green;
        this.blueValue = blue;
        this.rgbHexString = this.numValueToHexString(red) + this.numValueToHexString(green) + this.numValueToHexString(blue);
        this.rgbaHexString = this.numValueToHexString(this.alphaValue) + this.rgbHexString;
    
    }
    
    private static float hue2rgb(float pValue, float qValue, float hue) {
        if (hue < 0) {
            hue += 1;
        }
        if (hue > 1) {
            hue -= 1;
        }
        if (6 * hue < 1) {
            return pValue + ((qValue - pValue) * 6 * hue);
        }
        if (2 * hue < 1) {
            return qValue;
        }
        if (3 * hue < 2) {
            return pValue + ((qValue - pValue) * 6 * ((2.0f / 3.0f) - hue));
        }
        
        return pValue;
    }
    
    private void validateColorRgbIntValue(int value) throws InvalidArgumentException {
        if (value < MIN_RGB_INT_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color integer value %d is lower than the minimum %d.", value,
                                                                      MIN_RGB_INT_VALUE));
        }
        if (value > MAX_RGC_INT_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color integer value %d is greater than the maximum %d.", value,
                                                                      MAX_RGC_INT_VALUE));
        }
    }
    private void validateColorAlphaValue(int alphaValue) throws InvalidArgumentException {
        if (alphaValue < MIN_ALPHA_VALUE) {
            throw new InvalidArgumentException("alphaValue", String.format("Color alpha value [%d] is lower than the minimum %d.", alphaValue,
                                                                          MIN_ALPHA_VALUE));
        }
        if (alphaValue > MAX_ALPHA_VALUE) {
            throw new InvalidArgumentException("alphaValue", String.format("Color alpha value [%d] is greater than the maximum %d.", alphaValue,
                                                                          MAX_ALPHA_VALUE));
        }
    }
    private void validateHueValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_HUE_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color hue value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_HUE_VALUE));
        }
        if (Math.round(value) > MAX_HUE_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color hue value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_HUE_VALUE));
        }
    }
    private void validateSaturationValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_SATURATION_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color saturation value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_SATURATION_VALUE));
        }
        if (Math.round(value) > MAX_SATURATION_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color saturation value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_SATURATION_VALUE));
        }
    }
    private void validateLightnessValue(float value) throws InvalidArgumentException {
        if (Math.round(value) < MIN_LIGHTNESS_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color lightness value ["+value+"] is lower than the minimum %d.",
                                                                      MIN_LIGHTNESS_VALUE));
        }
        if (Math.round(value) > MAX_LIGHTNESS_VALUE) {
            throw new InvalidArgumentException("value", String.format("Color lightness value ["+value+"] is greater than the maximum %d.",
                                                                      MAX_LIGHTNESS_VALUE));
        }
    }
    
    private void logColorData() {
        NlmcCore.LOGGER.debug("RGBA [{} , {} , {} , {}].", this.redValue, this.greenValue, this.blueValue,
                              this.alphaValue);
        NlmcCore.LOGGER.debug("HSLA [{} , {} , {} , {}].", this.hueValue, this.saturationValue, this.lightnessValue,
                              this.alphaValue);
        NlmcCore.LOGGER.debug("RGBA HEX string [{}].", this.rgbaHexString);
        NlmcCore.LOGGER.debug("HSLA HEX string [{}].", this.hslaHexString);
        
    }
    
}