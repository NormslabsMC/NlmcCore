/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 03:35
 */

package net.normslabs.nlmc_core;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.utils.ResLocUtils;

public class NlmcTags {
    private NlmcRegistrar registrar;
    
    public NlmcTags(NlmcRegistrar registrar) {
        this.registrar = registrar;
    }
    
    public static class Items {
        
        public static class RAW_ORES {
        
        }
        
        public static class CRUSHED_RAW_ORES {
        
        }
        
        public static class POWDERED_RAW_ORES {
        
        }
        
        public static class INGOTS {
            
            // ELEMENTAL METALS
            
            public static final TagKey<Item> LITHIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/lithium"));
            public static final TagKey<Item> BERYLLIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/beryllium"));
            public static final TagKey<Item> SODIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/sodium"));
            public static final TagKey<Item> MAGNESIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/magnesium"));
            public static final TagKey<Item> ALUMINUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/aluminum"));
            public static final TagKey<Item> POTASSIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/potassium"));
            public static final TagKey<Item> CALCIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/calcium"));
            public static final TagKey<Item> SCANDIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/scandium"));
            public static final TagKey<Item> TITANIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/titanium"));
            public static final TagKey<Item> VANADIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/vanadium"));
            public static final TagKey<Item> CHROMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/chromium"));
            public static final TagKey<Item> MANGANESE_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/manganese"));
            public static final TagKey<Item> IRON_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/iron"));
            public static final TagKey<Item> COBALT_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/cobalt"));
            public static final TagKey<Item> NICKEL_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/nickel"));
            public static final TagKey<Item> COPPER_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/copper"));
            public static final TagKey<Item> ZINC_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/zinc"));
            public static final TagKey<Item> GALLIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/gallium"));
            public static final TagKey<Item> RUBIDIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/rubidium"));
            public static final TagKey<Item> STRONTIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/strontium"));
            public static final TagKey<Item> YTTRIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/yttrium"));
            public static final TagKey<Item> ZIRCONIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/zirconium"));
            public static final TagKey<Item> NIOBIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/niobium"));
            public static final TagKey<Item> MOLYBDENUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/molybdenum"));
            public static final TagKey<Item> TECHNETIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/technetium"));
            public static final TagKey<Item> RUTHENIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/ruthenium"));
            public static final TagKey<Item> PALLADIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/palladium"));
            public static final TagKey<Item> SILVER_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/silver"));
            public static final TagKey<Item> CADMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/cadmium"));
            public static final TagKey<Item> INDIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/indium"));
            public static final TagKey<Item> TIN_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/tin"));
            public static final TagKey<Item> CESIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/cesium"));
            public static final TagKey<Item> BARIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/barium"));
            public static final TagKey<Item> LANTHANUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/lanthanum"));
            public static final TagKey<Item> CERIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/cerium"));
            public static final TagKey<Item> PRASEODYMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/praseodymium"));
            public static final TagKey<Item> NEODYMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/neodymium"));
            public static final TagKey<Item> PROMETHIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/promethium"));
            public static final TagKey<Item> SAMARIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/samarium"));
            public static final TagKey<Item> EUROPIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/europium"));
            public static final TagKey<Item> GADOLINIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/gadolinium"));
            public static final TagKey<Item> TERBIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/terbium"));
            public static final TagKey<Item> DYSPROSIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/dysprosium"));
            public static final TagKey<Item> HOLMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/holmium"));
            public static final TagKey<Item> ERBIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/erbium"));
            public static final TagKey<Item> THULIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/thulium"));
            public static final TagKey<Item> YTTERBIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/ytterbium"));
            public static final TagKey<Item> LUTETIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/lutetium"));
            public static final TagKey<Item> HAFNIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/hafnium"));
            public static final TagKey<Item> TANTALUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/tantalum"));
            public static final TagKey<Item> TUNGSTEN_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/tungsten"));
            public static final TagKey<Item> RHENIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/rhenium"));
            public static final TagKey<Item> OSMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/osmium"));
            public static final TagKey<Item> IRIDIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/iridium"));
            public static final TagKey<Item> PLATINUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/platinum"));
            public static final TagKey<Item> GOLD_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/gold"));
            public static final TagKey<Item> THALLIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/thallium"));
            public static final TagKey<Item> LEAD_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/lead"));
            public static final TagKey<Item> BISMUTH_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/bismuth"));
            public static final TagKey<Item> FRANCIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/francium"));
            public static final TagKey<Item> RADIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/radium"));
            public static final TagKey<Item> ACTINIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/actinium"));
            public static final TagKey<Item> THORIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/thorium"));
            public static final TagKey<Item> PROTACTINIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/protactinium"));
            public static final TagKey<Item> URANIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/uranium"));
            public static final TagKey<Item> NEPTUNIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/neptunium"));
            public static final TagKey<Item> PLUTONIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/plutonium"));
            public static final TagKey<Item> AMERICIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/americium"));
            public static final TagKey<Item> CURIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/curium"));
            public static final TagKey<Item> BERKELIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/berkelium"));
            public static final TagKey<Item> CALIFORNIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/californium"));
            public static final TagKey<Item> EINSTEINIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/einsteinium"));
            public static final TagKey<Item> FERMIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/fermium"));
            public static final TagKey<Item> MENDELEVIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/mendelevium"));
            public static final TagKey<Item> NOBELIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/nobelium"));
            public static final TagKey<Item> LAWRENCIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/lawrencium"));
            public static final TagKey<Item> RUTHERFORDIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/rutherfordium"));
            public static final TagKey<Item> DUBNIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/dubnium"));
            public static final TagKey<Item> SEABORGIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/seaborgium"));
            public static final TagKey<Item> BOHRIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/bohrium"));
            public static final TagKey<Item> HASSIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/hassium"));
            public static final TagKey<Item> MEITNERIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/meitnerium"));
            public static final TagKey<Item> DARMSTADTIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/darmstadtium"));
            public static final TagKey<Item> ROENTGENIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/roentgenium"));
            public static final TagKey<Item> COPERNICIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/copernicium"));
            public static final TagKey<Item> NIHONIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/nihonium"));
            public static final TagKey<Item> FLEROVIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/flerovium"));
            public static final TagKey<Item> MOSCOVIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/moscovium"));
            public static final TagKey<Item> LIVERMORIUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/livermorium"));
            public static final TagKey<Item> TENNESSINE_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/tennessine"));
            public static final TagKey<Item> OGANESSON_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/oganesson"));
            
            // ALLOYS
            
            public static final TagKey<Item> BRONZE_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/bronze"));
            public static final TagKey<Item> BRASS_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/brass"));
            public static final TagKey<Item> CONSTANTAN_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/constantan"));
            public static final TagKey<Item> CUPRONICKEL_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/cupronickel"));
            public static final TagKey<Item> INVAR_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/invar"));
            public static final TagKey<Item> ELECTRUM_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/electrum"));
            public static final TagKey<Item> STEEL_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/steel"));
            public static final TagKey<Item> HARDENED_STEEL_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/hardened_steel"));
            public static final TagKey<Item> TUNGSTEN_CARBIDE_INGOTS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots/tungsten_carbide"));
            
            
        }
        
        public static class REFINED_SOLID_ELEMENTS {
            
            public static final TagKey<Item> REFINED_BORON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/boron"));
            public static final TagKey<Item> REFINED_CARBON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/carbon"));
            public static final TagKey<Item> REFINED_SILICON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/silicon"));
            public static final TagKey<Item> REFINED_PHOSPHORUS =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/phosphorus"));
            public static final TagKey<Item> REFINED_SULFUR =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/sulfur"));
            public static final TagKey<Item> REFINED_GERMANIUM =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/germanium"));
            public static final TagKey<Item> REFINED_ARSENIC =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/arsenic"));
            public static final TagKey<Item> REFINED_SELENIUM =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/selenium"));
            public static final TagKey<Item> REFINED_ANTIMONY =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/antimony"));
            public static final TagKey<Item> REFINED_TELLURIUM =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/tellurium"));
            public static final TagKey<Item> REFINED_IODINE =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/iodine"));
            public static final TagKey<Item> REFINED_POLONIUM =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/polonium"));
            public static final TagKey<Item> REFINED_ASTATINE =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/astatine"));
        
        }
        
        public static class REFINED_LIQUID_ELEMENTS {
            
            public static final TagKey<Item> REFINED_MERCURY =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/mercury"));
            public static final TagKey<Item> REFINED_BROMINE =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/bromine"));
            
        }
        
        public static class REFINED_GASEOUS_ELEMENTS {
            
            public static final TagKey<Item> REFINED_HYDROGEN =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/hydrogen"));
            public static final TagKey<Item> REFINED_HELIUM =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/helium"));
            public static final TagKey<Item> REFINED_NITROGEN =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/nitrogen"));
            public static final TagKey<Item> REFINED_OXYGEN =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/oxygen"));
            public static final TagKey<Item> REFINED_FLUORINE =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/fluorine"));
            public static final TagKey<Item> REFINED_NEON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/neon"));
            public static final TagKey<Item> REFINED_CHLORINE =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/chlorine"));
            public static final TagKey<Item> REFINED_ARGON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/argon"));
            public static final TagKey<Item> REFINED_KRYPTON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/krypton"));
            public static final TagKey<Item> REFINED_XENON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/xenon"));
            public static final TagKey<Item> REFINED_RADON =
                    ItemTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined/radon"));
        
        }
        
        public static class NUGGETS {
        
        }
        
        public static class REFINED_POWDERS {
        
        }
        
    }
    
    public static class Blocks {
        
        public static final TagKey<Block> NEEDS_COPPER_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_copper_tool"));
        public static final TagKey<Block> NEEDS_ALUMINUM_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_aluminum_tool"));
        public static final TagKey<Block> NEEDS_STEEL_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_steel_tool"));
        public static final TagKey<Block> NEEDS_HARDENED_STEEL_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_hardened_steel_tool"));
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_titanium_tool"));
        public static final TagKey<Block> NEEDS_TUNGSTEN_CARBIDE_TOOL =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(ResLocUtils.MC_NAMESPACE, "needs_tungsten_carbide_tool"));
        
    }

}
