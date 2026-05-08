/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 03:28
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.normslabs.nlmc_core.NlmcTags;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.List;

public class NlmcToolTiers {
    
    public static void registerTiers(NlmcRegistrar registrar) {
        TierSortingRegistry.registerTier(COPPER,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "copper"),
                                         List.of(Tiers.STONE),
                                         List.of(Tiers.IRON));
        TierSortingRegistry.registerTier(ALUMINUM,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "aluminum"),
                                         List.of(COPPER),
                                         List.of(Tiers.IRON));
        TierSortingRegistry.registerTier(STEEL,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "steel"),
                                         List.of(Tiers.IRON),
                                         List.of(Tiers.DIAMOND));
        TierSortingRegistry.registerTier(HARDENED_STEEL,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "hardened_steel"),
                                         List.of(STEEL),
                                         List.of(Tiers.DIAMOND));
        TierSortingRegistry.registerTier(TITANIUM,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "titanium"),
                                         List.of(Tiers.DIAMOND),
                                         List.of(Tiers.NETHERITE));
        TierSortingRegistry.registerTier(TUNGSTEN_CARBIDE,
                                         ResourceLocation.fromNamespaceAndPath(registrar.getModNamespace(), "titanium"),
                                         List.of(Tiers.NETHERITE),
                                         List.of());
    }
    
    /**
     * Tier between stone and iron:
     * stone mining level,
     * fast as iron,
     * slightly more durable than stone
     * slightly better damage than stone
     */
    public static final Tier COPPER = new ForgeTier(
            2,
            181,
            6.0f,
            1.5f,
            7,
            NlmcTags.Blocks.NEEDS_COPPER_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_COPPER)
    );
    
    /**
     * Tier between copper and iron:
     * iron mining level,
     * fast as iron,
     * as durable than copper
     * same damage bonus as copper
     */
    public static final Tier ALUMINUM = new ForgeTier(
            2,
            181,
            6.0f,
            1.5f,
            10,
            NlmcTags.Blocks.NEEDS_ALUMINUM_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_ALUMINUM));
    
    /**
     * Tier between iron and diamond:
     * iron mining level,
     * faster than iron,
     * twice as durable as iron
     * slightly higher damage bonus than iron
     */
    public static final Tier STEEL = new ForgeTier(
            2,
            500,
            7.0f,
            2.5f,
            12,
            NlmcTags.Blocks.NEEDS_STEEL_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_STEEL));
    
    /**
     * Tier between steel and diamond:
     * diamond mining level,
     * same speed as steel,
     * twice as durable as steel (~ 2/3 that of diamond)
     * slightly higher damage bonus than iron
     */
    public static final Tier HARDENED_STEEL = new ForgeTier(
            3,
            1000,
            7.0f,
            2.5f,
            12,
            NlmcTags.Blocks.NEEDS_HARDENED_STEEL_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_HARDENED_STEEL));
    
    /**
     * Tier between diamond and netherite:
     * diamond mining level,
     * same speed as diamond,
     * same durability as netherite
     * slightly higher damage than diamond
     */
    public static final Tier TITANIUM = new ForgeTier(
            3,
            2031,
            8.0f,
            3.5f,
            14,
            NlmcTags.Blocks.NEEDS_TITANIUM_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_TITANIUM));
    
    /**
     * Tier over netherite:
     * netherite mining level,
     * same speed as netherite,
     * twice the durability of netherite
     * slightly higher damage than netherite
     */
    public static final Tier TUNGSTEN_CARBIDE = new ForgeTier(
            4,
            4062,
            9.0f,
            5.0f,
            18,
            NlmcTags.Blocks.NEEDS_TUNGSTEN_CARBIDE_TOOL,
            () -> Ingredient.of(NlmcTags.Items.Ingots.INGOT_TUNGSTEN_CARBIDE));
}
