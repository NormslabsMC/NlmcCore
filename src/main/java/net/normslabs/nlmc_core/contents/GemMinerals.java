/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 18:47
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.normslabs.nlmc_core.worldgen.MineralRarities;
import net.normslabs.nlmc_core.worldgen.MineralTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GemMinerals {
    
    public static GemMinerals LITHIUM = new GemMinerals(ChemicalElements.LITHIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals BERYLLIUM = new GemMinerals(ChemicalElements.BERYLLIUM, MineralTypes.ORE);
    public static GemMinerals COAL = new GemMinerals(ChemicalElements.CARBON, MineralTypes.ORE, MineralRarities.ABUNDANT,
                                                     Map.of(Blocks.STONE, Blocks.COAL_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_COAL_ORE));
    public static GemMinerals MAGNESIUM = new GemMinerals(ChemicalElements.MAGNESIUM, MineralTypes.ORE);
    public static GemMinerals ALUMINIUM = new GemMinerals(ChemicalElements.ALUMINIUM, MineralTypes.ORE, MineralRarities.COMMON);
    public static GemMinerals SULFUR = new GemMinerals(ChemicalElements.SULFUR, MineralTypes.ORE, MineralRarities.STANDARD);
    public static GemMinerals TITANIUM = new GemMinerals(ChemicalElements.TITANIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals VANADIUM = new GemMinerals(ChemicalElements.VANADIUM, MineralTypes.ORE, MineralRarities.EXTREMELY_RARE);
    public static GemMinerals CHROMIUM = new GemMinerals(ChemicalElements.CHROMIUM, MineralTypes.ORE, MineralRarities.STANDARD);
    public static GemMinerals MANGANESE = new GemMinerals(ChemicalElements.MANGANESE, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals IRON = new GemMinerals(ChemicalElements.IRON, MineralTypes.ORE, MineralRarities.STANDARD,
                                                     Map.of(Blocks.STONE, Blocks.IRON_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_IRON_ORE));
    public static GemMinerals COBALT = new GemMinerals(ChemicalElements.COBALT, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals NICKEL = new GemMinerals(ChemicalElements.NICKEL, MineralTypes.ORE, MineralRarities.STANDARD);
    public static GemMinerals COPPER = new GemMinerals(ChemicalElements.COPPER, MineralTypes.ORE, MineralRarities.PLENTIFUL,
                                                       Map.of(Blocks.STONE, Blocks.COPPER_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_COPPER_ORE));
    public static GemMinerals ZINC = new GemMinerals(ChemicalElements.ZINC, MineralTypes.ORE, MineralRarities.STANDARD);
    public static GemMinerals GERMANIUM = new GemMinerals(ChemicalElements.GERMANIUM, MineralTypes.ORE);
    public static GemMinerals PALLADIUM = new GemMinerals(ChemicalElements.PALLADIUM, MineralTypes.ORE);
    public static GemMinerals SILVER = new GemMinerals(ChemicalElements.SILVER, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals TIN = new GemMinerals(ChemicalElements.TIN, MineralTypes.ORE, MineralRarities.STANDARD);
    public static GemMinerals IODINE = new GemMinerals(ChemicalElements.IODINE, MineralTypes.ORE);
    public static GemMinerals TUNGSTEN = new GemMinerals(ChemicalElements.TUNGSTEN, MineralTypes.ORE);
    public static GemMinerals OSMIUM = new GemMinerals(ChemicalElements.OSMIUM, MineralTypes.ORE);
    public static GemMinerals IRIDIUM = new GemMinerals(ChemicalElements.IRIDIUM, MineralTypes.ORE);
    public static GemMinerals PLATINUM = new GemMinerals(ChemicalElements.TUNGSTEN, MineralTypes.ORE, MineralRarities.VERY_RARE);
    public static GemMinerals GOLD = new GemMinerals(ChemicalElements.GOLD, MineralTypes.ORE, MineralRarities.VERY_RARE,
                                                     Map.of(Blocks.STONE, Blocks.GOLD_ORE, Blocks.DEEPSLATE, Blocks.DEEPSLATE_GOLD_ORE));
    public static GemMinerals LEAD = new GemMinerals(ChemicalElements.LEAD, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals THORIUM = new GemMinerals(ChemicalElements.URANIUM, MineralTypes.ORE, MineralRarities.RARE);
    public static GemMinerals URANIUM = new GemMinerals(ChemicalElements.URANIUM, MineralTypes.ORE, MineralRarities.VERY_RARE);
    
    // ORES
    
    
    ;
    
    protected static final List<GemMinerals> values = new ArrayList<>();
    
    private final ChemicalElements oreElement;
    private final MineralTypes mineralType;
    private final MineralRarities rarity;
    private final Map<Block, Block> preExistingReplacements = new HashMap<>();
    
    protected GemMinerals(ChemicalElements oreElement, MineralTypes mineralType, MineralRarities rarity,
                          Map<Block, Block> preExistingReplacements) {
        this.oreElement = oreElement;
        this.mineralType = mineralType;
        this.rarity = rarity;
        this.preExistingReplacements.putAll(preExistingReplacements);
        GemMinerals.values.add(this);
    }
    
    private GemMinerals(ChemicalElements oreElement, MineralTypes mineralType, MineralRarities rarity) {
        this(oreElement, mineralType, rarity, Map.of());
    }
    
    private GemMinerals(ChemicalElements oreElement, MineralTypes mineralType) {
        this(oreElement, mineralType, MineralRarities.EXTREMELY_RARE, Map.of());
    }
    
    public static List<GemMinerals> values() {
        return values;
    }
    
    public static GemMinerals fromElement(ChemicalElements element) {
        for (GemMinerals ore : values()) {
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
    
    public MineralRarities getRarity() {
        return this.rarity;
    }
    
    public Map<Block, Block> getPreExistingReplacements() {
        return this.preExistingReplacements;
    }
}
