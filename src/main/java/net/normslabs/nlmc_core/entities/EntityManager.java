/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 20:02
 */

package net.normslabs.nlmc_core.entities;


import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractManager;

import java.util.HashMap;
import java.util.Map;

public class EntityManager extends AbstractManager {
    
    public static Map<ResourceLocation, ResourceLocation> ALL_MC_ENTITIES_WITH_LOOT_TABLE = new HashMap<>(){{
        this.put(McEntities.ALLAY, McEntityLootTables.ALLAY);
        this.put(McEntities.AXOLOTL, McEntityLootTables.AXOLOTL);
        this.put(McEntities.BAT, McEntityLootTables.BAT);
        this.put(McEntities.CAMEL, McEntityLootTables.CAMEL);
        this.put(McEntities.CAT, McEntityLootTables.CAT);
        this.put(McEntities.CHICKEN, McEntityLootTables.CHICKEN);
        this.put(McEntities.COD, McEntityLootTables.COD);
        this.put(McEntities.COW, McEntityLootTables.COW);
        this.put(McEntities.DONKEY, McEntityLootTables.DONKEY);
        this.put(McEntities.FROG, McEntityLootTables.FROG);
        this.put(McEntities.GLOW_SQUID, McEntityLootTables.GLOW_SQUID);
        this.put(McEntities.HORSE, McEntityLootTables.HORSE);
        this.put(McEntities.MOOSHROOM, McEntityLootTables.MOOSHROOM);
        this.put(McEntities.MULE, McEntityLootTables.MULE);
        this.put(McEntities.OCELOT, McEntityLootTables.OCELOT);
        this.put(McEntities.PARROT, McEntityLootTables.PARROT);
        this.put(McEntities.PIG, McEntityLootTables.PIG);
        this.put(McEntities.PUFFERFISH, McEntityLootTables.PUFFERFISH);
        this.put(McEntities.RABBIT, McEntityLootTables.RABBIT);
        this.put(McEntities.SALMON, McEntityLootTables.SALMON);
        this.put(McEntities.SHEEP, McEntityLootTables.SHEEP);
        this.put(McEntities.SKELETON_HORSE, McEntityLootTables.SKELETON_HORSE);
        this.put(McEntities.SNIFFER, McEntityLootTables.SNIFFER);
        this.put(McEntities.SNOW_GOLEM, McEntityLootTables.SNOW_GOLEM);
        this.put(McEntities.SQUID, McEntityLootTables.SQUID);
        this.put(McEntities.STRIDER, McEntityLootTables.STRIDER);
        this.put(McEntities.TADPOLE, McEntityLootTables.TADPOLE);
        this.put(McEntities.TROPICAL_FISH, McEntityLootTables.TROPICAL_FISH);
        this.put(McEntities.TURTLE, McEntityLootTables.TURTLE);
        this.put(McEntities.VILLAGER, McEntityLootTables.VILLAGER);
        this.put(McEntities.WANDERING_TRADER, McEntityLootTables.WANDERING_TRADER);
        this.put(McEntities.BEE, McEntityLootTables.BEE);
        this.put(McEntities.CAVE_SPIDER, McEntityLootTables.CAVE_SPIDER);
        this.put(McEntities.DOLPHIN, McEntityLootTables.DOLPHIN);
        this.put(McEntities.ENDERMAN, McEntityLootTables.ENDERMAN);
        this.put(McEntities.FOX, McEntityLootTables.FOX);
        this.put(McEntities.GOAT, McEntityLootTables.GOAT);
        this.put(McEntities.IRON_GOLEM, McEntityLootTables.IRON_GOLEM);
        this.put(McEntities.LLAMA, McEntityLootTables.LLAMA);
        this.put(McEntities.PANDA, McEntityLootTables.PANDA);
        this.put(McEntities.PIGLIN, McEntityLootTables.PIGLIN);
        this.put(McEntities.POLAR_BEAR, McEntityLootTables.POLAR_BEAR);
        this.put(McEntities.SPIDER, McEntityLootTables.SPIDER);
        this.put(McEntities.TRADER_LLAMA, McEntityLootTables.TRADER_LLAMA);
        this.put(McEntities.WOLF, McEntityLootTables.WOLF);
        this.put(McEntities.ZOMBIFIED_PIGLIN, McEntityLootTables.ZOMBIFIED_PIGLIN);
        this.put(McEntities.BLAZE, McEntityLootTables.BLAZE);
        this.put(McEntities.CREEPER, McEntityLootTables.CREEPER);
        this.put(McEntities.DROWNED, McEntityLootTables.DROWNED);
        this.put(McEntities.ELDER_GUARDIAN, McEntityLootTables.ELDER_GUARDIAN);
        this.put(McEntities.ENDER_DRAGON, McEntityLootTables.ENDER_DRAGON);
        this.put(McEntities.ENDERMITE, McEntityLootTables.ENDERMITE);
        this.put(McEntities.EVOKER, McEntityLootTables.EVOKER);
        this.put(McEntities.GHAST, McEntityLootTables.GHAST);
        this.put(McEntities.GUARDIAN, McEntityLootTables.GUARDIAN);
        this.put(McEntities.HOGLIN, McEntityLootTables.HOGLIN);
        this.put(McEntities.HUSK, McEntityLootTables.HUSK);
        this.put(McEntities.MAGMA_CUBE, McEntityLootTables.MAGMA_CUBE);
        this.put(McEntities.PHANTOM, McEntityLootTables.PHANTOM);
        this.put(McEntities.PIGLIN_BRUTE, McEntityLootTables.PIGLIN_BRUTE);
        this.put(McEntities.PILLAGER, McEntityLootTables.PILLAGER);
        this.put(McEntities.RAVAGER, McEntityLootTables.RAVAGER);
        this.put(McEntities.SHULKER, McEntityLootTables.SHULKER);
        this.put(McEntities.SILVERFISH, McEntityLootTables.SILVERFISH);
        this.put(McEntities.SKELETON, McEntityLootTables.SKELETON);
        this.put(McEntities.SLIME, McEntityLootTables.SLIME);
        this.put(McEntities.STRAY, McEntityLootTables.STRAY);
        this.put(McEntities.VEX, McEntityLootTables.VEX);
        this.put(McEntities.VINDICATOR, McEntityLootTables.VINDICATOR);
        this.put(McEntities.WARDEN, McEntityLootTables.WARDEN);
        this.put(McEntities.WITCH, McEntityLootTables.WITCH);
        this.put(McEntities.WITHER, McEntityLootTables.WITHER);
        this.put(McEntities.WITHER_SKELETON, McEntityLootTables.WITHER_SKELETON);
        this.put(McEntities.ZOGLIN, McEntityLootTables.ZOGLIN);
        this.put(McEntities.ZOMBIE, McEntityLootTables.ZOMBIE);
        this.put(McEntities.ZOMBIE_VILLAGER, McEntityLootTables.ZOMBIE_VILLAGER);
    }};
    
    protected EntityManager(NlmcRegistrar nlmcRegistrar) {
        super(nlmcRegistrar);
    }
    
    @Override
    public void initialize(IEventBus modEventBus, IEventBus forgeEventBus) {
        
    }
    
    public static void registerEntity(ResourceLocation entityId, ResourceLocation entityLootTableId) {
        ALL_MC_ENTITIES_WITH_LOOT_TABLE.putIfAbsent(entityId, entityLootTableId);
    }
    
    public static void registerT1CurrencyEntity(ResourceLocation entityId, ResourceLocation entityLootTable) {
        T1_CURRENCY_ENTITIES.putIfAbsent(entityId, entityLootTable);
    }
    
    public static void registerT2CurrencyEntity(ResourceLocation entityId, ResourceLocation entityLootTable) {
        T2_CURRENCY_ENTITIES.putIfAbsent(entityId, entityLootTable);
    }
    
    public static void registerT3CurrencyEntity(ResourceLocation entityId, ResourceLocation entityLootTable) {
        T3_CURRENCY_ENTITIES.putIfAbsent(entityId, entityLootTable);
    }
    
    public static void registerT4CurrencyEntity(ResourceLocation entityId, ResourceLocation entityLootTable) {
        T4_CURRENCY_ENTITIES.putIfAbsent(entityId, entityLootTable);
    }
    
    public static void registerT5CurrencyEntity(ResourceLocation entityId, ResourceLocation entityLootTable) {
        T5_CURRENCY_ENTITIES.putIfAbsent(entityId, entityLootTable);
    }
    
    public static Map<ResourceLocation, ResourceLocation> T1_CURRENCY_ENTITIES = new HashMap<>(){{
        this.put(McEntities.VILLAGER, McEntityLootTables.VILLAGER);
        this.put(McEntities.ZOMBIE_VILLAGER, McEntityLootTables.ZOMBIE_VILLAGER);
        this.put(McEntities.CREEPER, McEntityLootTables.CREEPER);
        this.put(McEntities.SPIDER, McEntityLootTables.SPIDER);
        this.put(McEntities.SKELETON, McEntityLootTables.SKELETON);
        this.put(McEntities.STRAY, McEntityLootTables.STRAY);
        this.put(McEntities.HUSK, McEntityLootTables.HUSK);
        this.put(McEntities.ZOMBIE, McEntityLootTables.ZOMBIE);
        this.put(McEntities.DROWNED, McEntityLootTables.DROWNED);
        this.put(McEntities.ZOMBIFIED_PIGLIN, McEntityLootTables.ZOMBIFIED_PIGLIN);
        this.put(McEntities.SILVERFISH, McEntityLootTables.SILVERFISH);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> T2_CURRENCY_ENTITIES = new HashMap<>(){{
        this.put(McEntities.WANDERING_TRADER, McEntityLootTables.WANDERING_TRADER);
        this.put(McEntities.CAVE_SPIDER, McEntityLootTables.CAVE_SPIDER);
        this.put(McEntities.ENDERMAN, McEntityLootTables.ENDERMAN);
        this.put(McEntities.ENDERMITE, McEntityLootTables.ENDERMITE);
        this.put(McEntities.PIGLIN, McEntityLootTables.PIGLIN);
        this.put(McEntities.PILLAGER, McEntityLootTables.PILLAGER);
        this.put(McEntities.WITCH, McEntityLootTables.WITCH);
        this.put(McEntities.WITHER_SKELETON, McEntityLootTables.WITHER_SKELETON);
        this.put(McEntities.ZOGLIN, McEntityLootTables.ZOGLIN);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> T3_CURRENCY_ENTITIES = new HashMap<>(){{
        this.put(McEntities.PIGLIN_BRUTE, McEntityLootTables.PIGLIN_BRUTE);
        this.put(McEntities.GHAST, McEntityLootTables.GHAST);
        this.put(McEntities.GUARDIAN, McEntityLootTables.GUARDIAN);
        this.put(McEntities.PHANTOM, McEntityLootTables.PHANTOM);
        this.put(McEntities.SHULKER, McEntityLootTables.SHULKER);
        this.put(McEntities.VINDICATOR, McEntityLootTables.VINDICATOR);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> T4_CURRENCY_ENTITIES = new HashMap<>(){{
        this.put(McEntities.VEX, McEntityLootTables.VEX);
        this.put(McEntities.RAVAGER, McEntityLootTables.RAVAGER);
        this.put(McEntities.BLAZE, McEntityLootTables.BLAZE);
        this.put(McEntities.ELDER_GUARDIAN, McEntityLootTables.ELDER_GUARDIAN);
        this.put(McEntities.EVOKER, McEntityLootTables.EVOKER);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> T5_CURRENCY_ENTITIES = new HashMap<>(){{
        this.put(McEntities.ENDER_DRAGON, McEntityLootTables.ENDER_DRAGON);
        this.put(McEntities.WITHER, McEntityLootTables.WITHER);
        this.put(McEntities.WARDEN, McEntityLootTables.WARDEN);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> FAT_ANIMAL_ENTITIES = new HashMap<>(){{
        this.put(McEntities.SHEEP, McEntityLootTables.SHEEP);
        this.put(McEntities.CHICKEN, McEntityLootTables.CHICKEN);
        this.put(McEntities.COW, McEntityLootTables.COW);
        this.put(McEntities.PIG, McEntityLootTables.PIG);
        this.put(McEntities.HORSE, McEntityLootTables.HORSE);
        this.put(McEntities.DONKEY, McEntityLootTables.DONKEY);
        this.put(McEntities.MULE, McEntityLootTables.MULE);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> MC_PASSIVE_ENTITIES = new HashMap<>(){{
        this.put(McEntities.ALLAY, McEntityLootTables.ALLAY);
        this.put(McEntities.AXOLOTL, McEntityLootTables.AXOLOTL);
        this.put(McEntities.BAT, McEntityLootTables.BAT);
        this.put(McEntities.CAMEL, McEntityLootTables.CAMEL);
        this.put(McEntities.CAT, McEntityLootTables.CAT);
        this.put(McEntities.CHICKEN, McEntityLootTables.CHICKEN);
        this.put(McEntities.COD, McEntityLootTables.COD);
        this.put(McEntities.COW, McEntityLootTables.COW);
        this.put(McEntities.DONKEY, McEntityLootTables.DONKEY);
        this.put(McEntities.FROG, McEntityLootTables.FROG);
        this.put(McEntities.GLOW_SQUID, McEntityLootTables.GLOW_SQUID);
        this.put(McEntities.HORSE, McEntityLootTables.HORSE);
        this.put(McEntities.MOOSHROOM, McEntityLootTables.MOOSHROOM);
        this.put(McEntities.MULE, McEntityLootTables.MULE);
        this.put(McEntities.OCELOT, McEntityLootTables.OCELOT);
        this.put(McEntities.PARROT, McEntityLootTables.PARROT);
        this.put(McEntities.PIG, McEntityLootTables.PIG);
        this.put(McEntities.PUFFERFISH, McEntityLootTables.PUFFERFISH);
        this.put(McEntities.RABBIT, McEntityLootTables.RABBIT);
        this.put(McEntities.SALMON, McEntityLootTables.SALMON);
        this.put(McEntities.SHEEP, McEntityLootTables.SHEEP);
        this.put(McEntities.SKELETON_HORSE, McEntityLootTables.SKELETON_HORSE);
        this.put(McEntities.SNIFFER, McEntityLootTables.SNIFFER);
        this.put(McEntities.SNOW_GOLEM, McEntityLootTables.SNOW_GOLEM);
        this.put(McEntities.SQUID, McEntityLootTables.SQUID);
        this.put(McEntities.STRIDER, McEntityLootTables.STRIDER);
        this.put(McEntities.TADPOLE, McEntityLootTables.TADPOLE);
        this.put(McEntities.TROPICAL_FISH, McEntityLootTables.TROPICAL_FISH);
        this.put(McEntities.TURTLE, McEntityLootTables.TURTLE);
        this.put(McEntities.VILLAGER, McEntityLootTables.VILLAGER);
        this.put(McEntities.WANDERING_TRADER, McEntityLootTables.WANDERING_TRADER);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> MC_NEUTRAL_ENTITIES = new HashMap<>(){{
        this.put(McEntities.BEE, McEntityLootTables.BEE);
        this.put(McEntities.CAVE_SPIDER, McEntityLootTables.CAVE_SPIDER);
        this.put(McEntities.DOLPHIN, McEntityLootTables.DOLPHIN);
        this.put(McEntities.ENDERMAN, McEntityLootTables.ENDERMAN);
        this.put(McEntities.FOX, McEntityLootTables.FOX);
        this.put(McEntities.GOAT, McEntityLootTables.GOAT);
        this.put(McEntities.IRON_GOLEM, McEntityLootTables.IRON_GOLEM);
        this.put(McEntities.LLAMA, McEntityLootTables.LLAMA);
        this.put(McEntities.PANDA, McEntityLootTables.PANDA);
        this.put(McEntities.PIGLIN, McEntityLootTables.PIGLIN);
        this.put(McEntities.POLAR_BEAR, McEntityLootTables.POLAR_BEAR);
        this.put(McEntities.SPIDER, McEntityLootTables.SPIDER);
        this.put(McEntities.TRADER_LLAMA, McEntityLootTables.TRADER_LLAMA);
        this.put(McEntities.WOLF, McEntityLootTables.WOLF);
        this.put(McEntities.ZOMBIFIED_PIGLIN, McEntityLootTables.ZOMBIFIED_PIGLIN);
    }};
    
    public static Map<ResourceLocation, ResourceLocation> MC_HOSTILE_ENTITIES = new HashMap<>(){{
        this.put(McEntities.BLAZE, McEntityLootTables.BLAZE);
        this.put(McEntities.CREEPER, McEntityLootTables.CREEPER);
        this.put(McEntities.DROWNED, McEntityLootTables.DROWNED);
        this.put(McEntities.ELDER_GUARDIAN, McEntityLootTables.ELDER_GUARDIAN);
        this.put(McEntities.ENDER_DRAGON, McEntityLootTables.ENDER_DRAGON);
        this.put(McEntities.ENDERMITE, McEntityLootTables.ENDERMITE);
        this.put(McEntities.EVOKER, McEntityLootTables.EVOKER);
        this.put(McEntities.GHAST, McEntityLootTables.GHAST);
        this.put(McEntities.GUARDIAN, McEntityLootTables.GUARDIAN);
        this.put(McEntities.HOGLIN, McEntityLootTables.HOGLIN);
        this.put(McEntities.HUSK, McEntityLootTables.HUSK);
        this.put(McEntities.MAGMA_CUBE, McEntityLootTables.MAGMA_CUBE);
        this.put(McEntities.PHANTOM, McEntityLootTables.PHANTOM);
        this.put(McEntities.PIGLIN_BRUTE, McEntityLootTables.PIGLIN_BRUTE);
        this.put(McEntities.PILLAGER, McEntityLootTables.PILLAGER);
        this.put(McEntities.RAVAGER, McEntityLootTables.RAVAGER);
        this.put(McEntities.SHULKER, McEntityLootTables.SHULKER);
        this.put(McEntities.SILVERFISH, McEntityLootTables.SILVERFISH);
        this.put(McEntities.SKELETON, McEntityLootTables.SKELETON);
        this.put(McEntities.SLIME, McEntityLootTables.SLIME);
        this.put(McEntities.STRAY, McEntityLootTables.STRAY);
        this.put(McEntities.VEX, McEntityLootTables.VEX);
        this.put(McEntities.VINDICATOR, McEntityLootTables.VINDICATOR);
        this.put(McEntities.WARDEN, McEntityLootTables.WARDEN);
        this.put(McEntities.WITCH, McEntityLootTables.WITCH);
        this.put(McEntities.WITHER, McEntityLootTables.WITHER);
        this.put(McEntities.WITHER_SKELETON, McEntityLootTables.WITHER_SKELETON);
        this.put(McEntities.ZOGLIN, McEntityLootTables.ZOGLIN);
        this.put(McEntities.ZOMBIE, McEntityLootTables.ZOMBIE);
        this.put(McEntities.ZOMBIE_VILLAGER, McEntityLootTables.ZOMBIE_VILLAGER);
    }};
    
    
    
    public static class McEntities {
        // --- PASSIVE ---
        public static final ResourceLocation ALLAY = ResourceLocation.fromNamespaceAndPath("minecraft", "allay");
        public static final ResourceLocation AXOLOTL = ResourceLocation.fromNamespaceAndPath("minecraft", "axolotl");
        public static final ResourceLocation BAT = ResourceLocation.fromNamespaceAndPath("minecraft", "bat");
        public static final ResourceLocation CAMEL = ResourceLocation.fromNamespaceAndPath("minecraft", "camel");
        public static final ResourceLocation CAT = ResourceLocation.fromNamespaceAndPath("minecraft", "cat");
        public static final ResourceLocation CHICKEN = ResourceLocation.fromNamespaceAndPath("minecraft", "chicken");
        public static final ResourceLocation COD = ResourceLocation.fromNamespaceAndPath("minecraft", "cod");
        public static final ResourceLocation COW = ResourceLocation.fromNamespaceAndPath("minecraft", "cow");
        public static final ResourceLocation DONKEY = ResourceLocation.fromNamespaceAndPath("minecraft", "donkey");
        public static final ResourceLocation FROG = ResourceLocation.fromNamespaceAndPath("minecraft", "frog");
        public static final ResourceLocation GLOW_SQUID = ResourceLocation.fromNamespaceAndPath("minecraft", "glow_squid");
        public static final ResourceLocation HORSE = ResourceLocation.fromNamespaceAndPath("minecraft", "horse");
        public static final ResourceLocation MOOSHROOM = ResourceLocation.fromNamespaceAndPath("minecraft", "mooshroom");
        public static final ResourceLocation MULE = ResourceLocation.fromNamespaceAndPath("minecraft", "mule");
        public static final ResourceLocation OCELOT = ResourceLocation.fromNamespaceAndPath("minecraft", "ocelot");
        public static final ResourceLocation PARROT = ResourceLocation.fromNamespaceAndPath("minecraft", "parrot");
        public static final ResourceLocation PIG = ResourceLocation.fromNamespaceAndPath("minecraft", "pig");
        public static final ResourceLocation PUFFERFISH = ResourceLocation.fromNamespaceAndPath("minecraft", "pufferfish");
        public static final ResourceLocation RABBIT = ResourceLocation.fromNamespaceAndPath("minecraft", "rabbit");
        public static final ResourceLocation SALMON = ResourceLocation.fromNamespaceAndPath("minecraft", "salmon");
        public static final ResourceLocation SHEEP = ResourceLocation.fromNamespaceAndPath("minecraft", "sheep");
        public static final ResourceLocation SKELETON_HORSE = ResourceLocation.fromNamespaceAndPath("minecraft", "skeleton_horse");
        public static final ResourceLocation SNIFFER = ResourceLocation.fromNamespaceAndPath("minecraft", "sniffer");
        public static final ResourceLocation SNOW_GOLEM = ResourceLocation.fromNamespaceAndPath("minecraft", "snow_golem");
        public static final ResourceLocation SQUID = ResourceLocation.fromNamespaceAndPath("minecraft", "squid");
        public static final ResourceLocation STRIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "strider");
        public static final ResourceLocation TADPOLE = ResourceLocation.fromNamespaceAndPath("minecraft", "tadpole");
        public static final ResourceLocation TROPICAL_FISH = ResourceLocation.fromNamespaceAndPath("minecraft", "tropical_fish");
        public static final ResourceLocation TURTLE = ResourceLocation.fromNamespaceAndPath("minecraft", "turtle");
        public static final ResourceLocation VILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "villager");
        public static final ResourceLocation WANDERING_TRADER = ResourceLocation.fromNamespaceAndPath("minecraft", "wandering_trader");
        
        // --- NEUTRAL ---
        public static final ResourceLocation BEE = ResourceLocation.fromNamespaceAndPath("minecraft", "bee");
        public static final ResourceLocation CAVE_SPIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "cave_spider");
        public static final ResourceLocation DOLPHIN = ResourceLocation.fromNamespaceAndPath("minecraft", "dolphin");
        public static final ResourceLocation ENDERMAN = ResourceLocation.fromNamespaceAndPath("minecraft", "enderman");
        public static final ResourceLocation FOX = ResourceLocation.fromNamespaceAndPath("minecraft", "fox");
        public static final ResourceLocation GOAT = ResourceLocation.fromNamespaceAndPath("minecraft", "goat");
        public static final ResourceLocation IRON_GOLEM = ResourceLocation.fromNamespaceAndPath("minecraft", "iron_golem");
        public static final ResourceLocation LLAMA = ResourceLocation.fromNamespaceAndPath("minecraft", "llama");
        public static final ResourceLocation PANDA = ResourceLocation.fromNamespaceAndPath("minecraft", "panda");
        public static final ResourceLocation PIGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "piglin");
        public static final ResourceLocation POLAR_BEAR = ResourceLocation.fromNamespaceAndPath("minecraft", "polar_bear");
        public static final ResourceLocation SPIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "spider");
        public static final ResourceLocation TRADER_LLAMA = ResourceLocation.fromNamespaceAndPath("minecraft", "trader_llama");
        public static final ResourceLocation WOLF = ResourceLocation.fromNamespaceAndPath("minecraft", "wolf");
        public static final ResourceLocation ZOMBIFIED_PIGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "zombified_piglin");
        
        // --- HOSTILE ---
        public static final ResourceLocation BLAZE = ResourceLocation.fromNamespaceAndPath("minecraft", "blaze");
        public static final ResourceLocation CREEPER = ResourceLocation.fromNamespaceAndPath("minecraft", "creeper");
        public static final ResourceLocation DROWNED = ResourceLocation.fromNamespaceAndPath("minecraft", "drowned");
        public static final ResourceLocation ELDER_GUARDIAN = ResourceLocation.fromNamespaceAndPath("minecraft", "elder_guardian");
        public static final ResourceLocation ENDER_DRAGON = ResourceLocation.fromNamespaceAndPath("minecraft", "ender_dragon");
        public static final ResourceLocation ENDERMITE = ResourceLocation.fromNamespaceAndPath("minecraft", "endermite");
        public static final ResourceLocation EVOKER = ResourceLocation.fromNamespaceAndPath("minecraft", "evoker");
        public static final ResourceLocation GHAST = ResourceLocation.fromNamespaceAndPath("minecraft", "ghast");
        public static final ResourceLocation GUARDIAN = ResourceLocation.fromNamespaceAndPath("minecraft", "guardian");
        public static final ResourceLocation HOGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "hoglin");
        public static final ResourceLocation HUSK = ResourceLocation.fromNamespaceAndPath("minecraft", "husk");
        public static final ResourceLocation MAGMA_CUBE = ResourceLocation.fromNamespaceAndPath("minecraft", "magma_cube");
        public static final ResourceLocation PHANTOM = ResourceLocation.fromNamespaceAndPath("minecraft", "phantom");
        public static final ResourceLocation PIGLIN_BRUTE = ResourceLocation.fromNamespaceAndPath("minecraft", "piglin_brute");
        public static final ResourceLocation PILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "pillager");
        public static final ResourceLocation RAVAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "ravager");
        public static final ResourceLocation SHULKER = ResourceLocation.fromNamespaceAndPath("minecraft", "shulker");
        public static final ResourceLocation SILVERFISH = ResourceLocation.fromNamespaceAndPath("minecraft", "silverfish");
        public static final ResourceLocation SKELETON = ResourceLocation.fromNamespaceAndPath("minecraft", "skeleton");
        public static final ResourceLocation SLIME = ResourceLocation.fromNamespaceAndPath("minecraft", "slime");
        public static final ResourceLocation STRAY = ResourceLocation.fromNamespaceAndPath("minecraft", "stray");
        public static final ResourceLocation VEX = ResourceLocation.fromNamespaceAndPath("minecraft", "vex");
        public static final ResourceLocation VINDICATOR = ResourceLocation.fromNamespaceAndPath("minecraft", "vindicator");
        public static final ResourceLocation WARDEN = ResourceLocation.fromNamespaceAndPath("minecraft", "warden");
        public static final ResourceLocation WITCH = ResourceLocation.fromNamespaceAndPath("minecraft", "witch");
        public static final ResourceLocation WITHER = ResourceLocation.fromNamespaceAndPath("minecraft", "wither");
        public static final ResourceLocation WITHER_SKELETON = ResourceLocation.fromNamespaceAndPath("minecraft", "wither_skeleton");
        public static final ResourceLocation ZOGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "zoglin");
        public static final ResourceLocation ZOMBIE = ResourceLocation.fromNamespaceAndPath("minecraft", "zombie");
        public static final ResourceLocation ZOMBIE_VILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "zombie_villager");
        
    }
    
    public static class McEntityLootTables {
        // --- PASSIVE ---
        public static final ResourceLocation ALLAY = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/allay");
        public static final ResourceLocation AXOLOTL = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/axolotl");
        public static final ResourceLocation BAT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/bat");
        public static final ResourceLocation CAMEL = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/camel");
        public static final ResourceLocation CAT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/cat");
        public static final ResourceLocation CHICKEN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/chicken");
        public static final ResourceLocation COD = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/cod");
        public static final ResourceLocation COW = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/cow");
        public static final ResourceLocation DONKEY = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/donkey");
        public static final ResourceLocation FROG = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/frog");
        public static final ResourceLocation GLOW_SQUID = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/glow_squid");
        public static final ResourceLocation HORSE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/horse");
        public static final ResourceLocation MOOSHROOM = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/mooshroom");
        public static final ResourceLocation MULE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/mule");
        public static final ResourceLocation OCELOT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/ocelot");
        public static final ResourceLocation PARROT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/parrot");
        public static final ResourceLocation PIG = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/pig");
        public static final ResourceLocation PUFFERFISH = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/pufferfish");
        public static final ResourceLocation RABBIT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/rabbit");
        public static final ResourceLocation SALMON = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/salmon");
        public static final ResourceLocation SHEEP = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/sheep");
        public static final ResourceLocation SKELETON_HORSE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/skeleton_horse");
        public static final ResourceLocation SNIFFER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/sniffer");
        public static final ResourceLocation SNOW_GOLEM = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/snow_golem");
        public static final ResourceLocation SQUID = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/squid");
        public static final ResourceLocation STRIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/strider");
        public static final ResourceLocation TADPOLE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/tadpole");
        public static final ResourceLocation TROPICAL_FISH = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/tropical_fish");
        public static final ResourceLocation TURTLE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/turtle");
        public static final ResourceLocation VILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/villager");
        public static final ResourceLocation WANDERING_TRADER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/wandering_trader");
        
        // --- NEUTRAL ---
        public static final ResourceLocation BEE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/bee");
        public static final ResourceLocation CAVE_SPIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/cave_spider");
        public static final ResourceLocation DOLPHIN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/dolphin");
        public static final ResourceLocation ENDERMAN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/enderman");
        public static final ResourceLocation FOX = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/fox");
        public static final ResourceLocation GOAT = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/goat");
        public static final ResourceLocation IRON_GOLEM = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/iron_golem");
        public static final ResourceLocation LLAMA = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/llama");
        public static final ResourceLocation PANDA = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/panda");
        public static final ResourceLocation PIGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/piglin");
        public static final ResourceLocation POLAR_BEAR = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/polar_bear");
        public static final ResourceLocation SPIDER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/spider");
        public static final ResourceLocation TRADER_LLAMA = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/trader_llama");
        public static final ResourceLocation WOLF = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/wolf");
        public static final ResourceLocation ZOMBIFIED_PIGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/zombified_piglin");
        
        // --- HOSTILE ---
        public static final ResourceLocation BLAZE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/blaze");
        public static final ResourceLocation CREEPER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/creeper");
        public static final ResourceLocation DROWNED = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/drowned");
        public static final ResourceLocation ELDER_GUARDIAN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/elder_guardian");
        public static final ResourceLocation ENDER_DRAGON = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/ender_dragon");
        public static final ResourceLocation ENDERMITE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/endermite");
        public static final ResourceLocation EVOKER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/evoker");
        public static final ResourceLocation GHAST = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/ghast");
        public static final ResourceLocation GUARDIAN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/guardian");
        public static final ResourceLocation HOGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/hoglin");
        public static final ResourceLocation HUSK = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/husk");
        public static final ResourceLocation MAGMA_CUBE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/magma_cube");
        public static final ResourceLocation PHANTOM = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/phantom");
        public static final ResourceLocation PIGLIN_BRUTE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/piglin_brute");
        public static final ResourceLocation PILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/pillager");
        public static final ResourceLocation RAVAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/ravager");
        public static final ResourceLocation SHULKER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/shulker");
        public static final ResourceLocation SILVERFISH = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/silverfish");
        public static final ResourceLocation SKELETON = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/skeleton");
        public static final ResourceLocation SLIME = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/slime");
        public static final ResourceLocation STRAY = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/stray");
        public static final ResourceLocation VEX = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/vex");
        public static final ResourceLocation VINDICATOR = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/vindicator");
        public static final ResourceLocation WARDEN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/warden");
        public static final ResourceLocation WITCH = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/witch");
        public static final ResourceLocation WITHER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/wither");
        public static final ResourceLocation WITHER_SKELETON = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/wither_skeleton");
        public static final ResourceLocation ZOGLIN = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/zoglin");
        public static final ResourceLocation ZOMBIE = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/zombie");
        public static final ResourceLocation ZOMBIE_VILLAGER = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/zombie_villager");
        
    }
}
