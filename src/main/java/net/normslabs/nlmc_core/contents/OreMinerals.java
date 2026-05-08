/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.normslabs.nlmc_core.rendering.DynamicTextures;
import net.normslabs.nlmc_core.worldgen.MineralRarities;
import net.normslabs.nlmc_core.worldgen.MineralTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OreMinerals {
    
    public static OreMinerals LITHIUM = new OreMinerals(ChemicalElements.LITHIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals BERYLLIUM = new OreMinerals(ChemicalElements.BERYLLIUM, MineralTypes.ORE);
    public static OreMinerals COAL = new OreMinerals(ChemicalElements.CARBON, MineralTypes.ORE, MineralRarities.ABUNDANT,
                                                     Map.of(Blocks.STONE, Blocks.COAL_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_COAL_ORE));
    public static OreMinerals MAGNESIUM = new OreMinerals(ChemicalElements.MAGNESIUM, MineralTypes.ORE);
    public static OreMinerals ALUMINIUM = new OreMinerals(ChemicalElements.ALUMINIUM, MineralTypes.ORE, MineralRarities.COMMON);
    public static OreMinerals SULFUR = new OreMinerals(ChemicalElements.SULFUR, MineralTypes.ORE, MineralRarities.STANDARD);
    public static OreMinerals TITANIUM = new OreMinerals(ChemicalElements.TITANIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals VANADIUM = new OreMinerals(ChemicalElements.VANADIUM, MineralTypes.ORE, MineralRarities.EXTREMELY_RARE);
    public static OreMinerals CHROMIUM = new OreMinerals(ChemicalElements.CHROMIUM, MineralTypes.ORE, MineralRarities.STANDARD);
    public static OreMinerals MANGANESE = new OreMinerals(ChemicalElements.MANGANESE, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals IRON = new OreMinerals(ChemicalElements.IRON, MineralTypes.ORE, MineralRarities.STANDARD,
                                                     Map.of(Blocks.STONE, Blocks.IRON_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_IRON_ORE));
    public static OreMinerals COBALT = new OreMinerals(ChemicalElements.COBALT, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals NICKEL = new OreMinerals(ChemicalElements.NICKEL, MineralTypes.ORE, MineralRarities.STANDARD);
    public static OreMinerals COPPER = new OreMinerals(ChemicalElements.COPPER, MineralTypes.ORE, MineralRarities.PLENTIFUL,
                                                       Map.of(Blocks.STONE, Blocks.COPPER_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_COPPER_ORE));
    public static OreMinerals ZINC = new OreMinerals(ChemicalElements.ZINC, MineralTypes.ORE, MineralRarities.STANDARD);
    public static OreMinerals GERMANIUM = new OreMinerals(ChemicalElements.GERMANIUM, MineralTypes.ORE);
    public static OreMinerals PALLADIUM = new OreMinerals(ChemicalElements.PALLADIUM, MineralTypes.ORE);
    public static OreMinerals SILVER = new OreMinerals(ChemicalElements.SILVER, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals TIN = new OreMinerals(ChemicalElements.TIN, MineralTypes.ORE, MineralRarities.STANDARD);
    public static OreMinerals IODINE = new OreMinerals(ChemicalElements.IODINE, MineralTypes.ORE);
    public static OreMinerals TUNGSTEN = new OreMinerals(ChemicalElements.TUNGSTEN, MineralTypes.ORE);
    public static OreMinerals OSMIUM = new OreMinerals(ChemicalElements.OSMIUM, MineralTypes.ORE);
    public static OreMinerals IRIDIUM = new OreMinerals(ChemicalElements.IRIDIUM, MineralTypes.ORE);
    public static OreMinerals PLATINUM = new OreMinerals(ChemicalElements.TUNGSTEN, MineralTypes.ORE, MineralRarities.VERY_RARE);
    public static OreMinerals GOLD = new OreMinerals(ChemicalElements.GOLD, MineralTypes.ORE, MineralRarities.VERY_RARE,
                                                     Map.of(Blocks.STONE, Blocks.GOLD_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_GOLD_ORE));
    public static OreMinerals LEAD = new OreMinerals(ChemicalElements.LEAD, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals THORIUM = new OreMinerals(ChemicalElements.THORIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static OreMinerals URANIUM = new OreMinerals(ChemicalElements.URANIUM, MineralTypes.ORE, MineralRarities.VERY_RARE);
    
    ;
    
    protected static final List<OreMinerals> values = new ArrayList<>();
    
    private final ChemicalElements oreElement;
    private final MineralTypes mineralType;
    private final ResourceLocation oreOverlayTexture;
    private final ResourceLocation rawOreTexture;
    private final ResourceLocation crushedOreTexture;
    private final ResourceLocation ingotTexture;
    private final ResourceLocation nuggetTexture;
    private final MineralRarities rarity;
    private final Map<Block, Block> preExistingReplacements = new HashMap<>();
    
    protected OreMinerals(ChemicalElements oreElement, MineralTypes mineralType, MineralRarities rarity,
                          Map<Block, Block> preExistingReplacements) {
        this.oreElement = oreElement;
        this.mineralType = mineralType;
        this.rarity = rarity;
        this.oreOverlayTexture = switch (oreElement.getAtomicNumber() % 4) {
            case 1 -> DynamicTextures.Ores.ORE_OVERLAY_1;
            case 2 -> DynamicTextures.Ores.ORE_OVERLAY_2;
            case 3 -> DynamicTextures.Ores.ORE_OVERLAY_3;
            default -> DynamicTextures.Ores.ORE_OVERLAY_0;
        };
        this.rawOreTexture = switch (oreElement.getAtomicNumber() % 4) {
            case 1 -> DynamicTextures.Ores.RAW_ORE_1;
            case 2 -> DynamicTextures.Ores.RAW_ORE_2;
            case 3 -> DynamicTextures.Ores.RAW_ORE_3;
            default -> DynamicTextures.Ores.RAW_ORE_0;
        };
        this.crushedOreTexture = switch (oreElement.getAtomicNumber() % 4) {
            case 1 -> DynamicTextures.Ores.CRUSHED_RAW_ORE_1;
            case 2 -> DynamicTextures.Ores.CRUSHED_RAW_ORE_2;
            case 3 -> DynamicTextures.Ores.CRUSHED_RAW_ORE_3;
            default -> DynamicTextures.Ores.CRUSHED_RAW_ORE_0;
        };
        this.ingotTexture = switch (oreElement.getAtomicNumber() % 4) {
            case 1 -> DynamicTextures.Metals.METAL_INGOT_1;
            case 2 -> DynamicTextures.Metals.METAL_INGOT_2;
            case 3 -> DynamicTextures.Metals.METAL_INGOT_3;
            default -> DynamicTextures.Metals.METAL_INGOT_0;
        };
        this.nuggetTexture = switch (oreElement.getAtomicNumber() % 4) {
            case 1 -> DynamicTextures.Metals.METAL_NUGGET_1;
            case 2 -> DynamicTextures.Metals.METAL_NUGGET_2;
            case 3 -> DynamicTextures.Metals.METAL_NUGGET_3;
            default -> DynamicTextures.Metals.METAL_NUGGET_0;
        };
        this.preExistingReplacements.putAll(preExistingReplacements);
        OreMinerals.values.add(this);
    }
    
    private OreMinerals(ChemicalElements oreElement, MineralTypes mineralType, MineralRarities rarity) {
        this(oreElement, mineralType, rarity, Map.of());
    }
    
    private OreMinerals(ChemicalElements oreElement, MineralTypes mineralType) {
        this(oreElement, mineralType, MineralRarities.EXTREMELY_RARE, Map.of());
    }
    
    public static List<OreMinerals> values() {
        return values;
    }
    
    public static OreMinerals fromElement(ChemicalElements element) {
        for (OreMinerals ore : values()) {
            if (ore.oreElement == element) {
                return ore;
            }
        }
        return null;
    }
    
    public ChemicalElements getOreElement() {
        return this.oreElement;
    }
    
    public MineralTypes getMineralType() {
        return this.mineralType;
    }
    
    public ResourceLocation getCrushedOreTexture() {
        return this.crushedOreTexture;
    }
    
    public ResourceLocation getIngotTexture() {
        return this.ingotTexture;
    }
    
    public ResourceLocation getOreOverlayTexture() {
        return this.oreOverlayTexture;
    }
    
    public ResourceLocation getRawOreTexture() {
        return this.rawOreTexture;
    }
    
    public ResourceLocation getNuggetTexture() {
        return this.nuggetTexture;
    }
    
    public MineralRarities getRarity() {
        return this.rarity;
    }
    
    public Map<Block, Block> getPreExistingReplacements() {
        return this.preExistingReplacements;
    }
}
