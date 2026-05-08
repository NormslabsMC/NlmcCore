/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-07 14:52
 */

package net.normslabs.nlmc_core.rendering;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.NlmcCore;

public class DynamicTextures {
    
    public static class Ores {
        
        // Ores
        public static final ResourceLocation ORE_OVERLAY_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/ores/ore_overlay_0");
        public static final ResourceLocation ORE_OVERLAY_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/ores/ore_overlay_1");
        public static final ResourceLocation ORE_OVERLAY_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/ores/ore_overlay_2");
        public static final ResourceLocation ORE_OVERLAY_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/ores/ore_overlay_3");
        
        public static final ResourceLocation RAW_ORE_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/raw_ore_0");
        public static final ResourceLocation RAW_ORE_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/raw_ore_1");
        public static final ResourceLocation RAW_ORE_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/raw_ore_2");
        public static final ResourceLocation RAW_ORE_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/raw_ore_3");
        
        public static final ResourceLocation CRUSHED_RAW_ORE_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/crushed_raw_ore_0");
        public static final ResourceLocation CRUSHED_RAW_ORE_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/crushed_raw_ore_1");
        public static final ResourceLocation CRUSHED_RAW_ORE_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/crushed_raw_ore_2");
        public static final ResourceLocation CRUSHED_RAW_ORE_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/crushed_raw_ore_3");
        
        public static final ResourceLocation PULVERIZED_RAW_ORE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/ores/pulverized_raw_ore_0");
        
        public static final ResourceLocation RAW_STORAGE_BLOCK = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/ores/raw_storage_block");
        
    }
    
    public static class Stones {
        // Stones
        public static final ResourceLocation STONE_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/stones/stone_0");
        public static final ResourceLocation STONE_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/stones/stone_1");
        public static final ResourceLocation STONE_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/stones/stone_2");
        public static final ResourceLocation STONE_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/stones/stone_3");
        public static final ResourceLocation STONE_STRATIFIED = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/stones/stone_stratified");
        
        public static final ResourceLocation CRUSHED_STONE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/stones/crushed_stone_0");
        
        public static final ResourceLocation PULVERIZED_STONE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/stones/pulverized_stone_0");
        
    }
    
    public static class Gems {
        // Gems
        public static final ResourceLocation GEM_ORE_OVERLAY = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/gems/gem_ore_overlay");
        
        public static final ResourceLocation RAW_GEM_GENERIC = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/gems/raw_gem_generic");
        public static final ResourceLocation RAW_GEM_CRYSTAL = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/gems/raw_gem_crystal");
        
        public static final ResourceLocation GEM_DIAMOND = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/gems/gem_diamond");
        public static final ResourceLocation GEM_EMERALD = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/gems/gem_emerald");
        public static final ResourceLocation GEM_GENERIC = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/gems/gem_generic");
        
        public static final ResourceLocation GEM_STORAGE_BLOCK = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "dynamic/gems/gem_storage_block");
        
    }
    
    public static class Tools {
        public static final ResourceLocation AXE_HANDLE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/axe_handle");
        public static final ResourceLocation AXE_HEAD = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/axe_head");
        
        public static final ResourceLocation HOE_HANDLE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/hoe_handle");
        public static final ResourceLocation HOE_HEAD = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/hoe_head");
        
        public static final ResourceLocation SHOVEL_HANDLE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/shovel_handle");
        public static final ResourceLocation SHOVEL_HEAD = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/shovel_head");
        
        public static final ResourceLocation PICKAXE_HANDLE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/pickaxe_handle");
        public static final ResourceLocation PICKAXE_HEAD = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/pickaxe_head");
        
        public static final ResourceLocation SWORD_HILT = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/sword_hilt");
        public static final ResourceLocation SWORD_BLADE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/tools/sword_blade");
        
    }
    
    public static class Metals {
        public static final ResourceLocation METAL_INGOT_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/ingot_0");
        public static final ResourceLocation METAL_INGOT_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/ingot_1");
        public static final ResourceLocation METAL_INGOT_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/ingot_2");
        public static final ResourceLocation METAL_INGOT_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/ingot_3");
        
        public static final ResourceLocation METAL_NUGGET_0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/nugget_0");
        public static final ResourceLocation METAL_NUGGET_1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/nugget_1");
        public static final ResourceLocation METAL_NUGGET_2 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/nugget_2");
        public static final ResourceLocation METAL_NUGGET_3 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/nugget_3");
        
        public static final ResourceLocation METAL_STORAGE_BLOCK = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "block/dynamic/metals/refined_storage_block");
        
        public static final ResourceLocation METAL_PLATE = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/metal_plate");
        public static final ResourceLocation METAL_SHEET = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/metal_sheet");
        public static final ResourceLocation METAL_BEAM = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/metal_beam");
        public static final ResourceLocation METAL_SPRING = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/metal_spring");
        public static final ResourceLocation METAL_WIRE_SPOOL_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/wire_spool_layer_0");
        public static final ResourceLocation METAL_WIRE_SPOOL_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/metals/wire_spool_layer_1");
        
    }
    
    public static class Chemistry {
        public static final ResourceLocation SAMPLE_SOLID_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_solid_layer_0");
        public static final ResourceLocation SAMPLE_SOLID_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_solid_layer_1");
        public static final ResourceLocation SAMPLE_LIQUID_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_liquid_layer_0");
        public static final ResourceLocation SAMPLE_LIQUID_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_liquid_layer_1");
        public static final ResourceLocation SAMPLE_GAS_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_gas_layer_0");
        public static final ResourceLocation SAMPLE_GAS_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/sample_gas_layer_1");
        
        public static final ResourceLocation COMPOUND_SOLID_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_solid_layer_0");
        public static final ResourceLocation COMPOUND_SOLID_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_solid_layer_1");
        public static final ResourceLocation COMPOUND_LIQUID_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_liquid_layer_0");
        public static final ResourceLocation COMPOUND_LIQUID_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_liquid_layer_1");
        public static final ResourceLocation COMPOUND_GAS_L0 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_gas_layer_0");
        public static final ResourceLocation COMPOUND_GAS_L1 = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/dynamic/chemistry/compound_gas_layer_1");
    }
    
}
