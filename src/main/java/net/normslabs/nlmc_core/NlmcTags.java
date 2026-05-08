/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 03:35
 */

package net.normslabs.nlmc_core;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.utils.ResLocUtils;
import net.normslabs.nlmc_core.utils.TagUtils;

public class NlmcTags {
    private NlmcRegistrar registrar;
    
    public NlmcTags(NlmcRegistrar registrar) {
        this.registrar = registrar;
    }
    
    public static class Items {
        
        public static class Foods {
            public static final TagKey<Item> ALL_FOODS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "foods"));
            public static final TagKey<Item> VEGETABLE_OIL = TagUtils.tagAppendPath(Foods.ALL_FOODS, "vegetable_oil");
            public static final TagKey<Item> CHEESE = TagUtils.tagAppendPath(Foods.ALL_FOODS, "cheese");
            public static final TagKey<Item> MILK = TagUtils.tagAppendPath(Foods.ALL_FOODS, "milk");
            public static final TagKey<Item> FLOUR = TagUtils.tagAppendPath(Foods.ALL_FOODS, "flour");
            public static final TagKey<Item> BREAD = TagUtils.tagAppendPath(Foods.ALL_FOODS, "bread");
            public static final TagKey<Item> COOKIES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "cookie");
            public static final TagKey<Item> CANDIES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "candy");
            public static final TagKey<Item> SOUP = TagUtils.tagAppendPath(Foods.ALL_FOODS, "soup");
            public static final TagKey<Item> CHOCOLATE = TagUtils.tagAppendPath(Foods.ALL_FOODS, "chocolate");
            public static final TagKey<Item> COFFEE = TagUtils.tagAppendPath(Foods.ALL_FOODS, "coffee");
            public static final TagKey<Item> TEA = TagUtils.tagAppendPath(Foods.ALL_FOODS, "tea");
            
            public static final TagKey<Item> ALL_FRUITS = TagUtils.tagAppendPath(Foods.ALL_FOODS, "fruit");
            public static final TagKey<Item> APPLE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "apple");
            public static final TagKey<Item> ORANGE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "orange");
            public static final TagKey<Item> MELON = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "melon");
            public static final TagKey<Item> PEACH = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "peach");
            public static final TagKey<Item> PINEAPPLE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "pineapple");
            public static final TagKey<Item> MANGO = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "mango");
            public static final TagKey<Item> BANANA = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "banana");
            public static final TagKey<Item> CHERRY = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "cherry");
            public static final TagKey<Item> NECTARINE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "nectarine");
            public static final TagKey<Item> POMEGRANATE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "pomegranate");
            public static final TagKey<Item> PAPAYA = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "papaya");
            public static final TagKey<Item> KIWI = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "kiwi");
            public static final TagKey<Item> LEMON = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "lemon");
            public static final TagKey<Item> LIME = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "lime");
            public static final TagKey<Item> GRAPE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "grape");
            public static final TagKey<Item> GRAPEFRUIT = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "grapefruit");
            public static final TagKey<Item> PLUM = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "plum");
            public static final TagKey<Item> LYCHEE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "lychee");
            public static final TagKey<Item> PASSION_FRUIT = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "passion_fruit");
            public static final TagKey<Item> FIG = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "fig");
            public static final TagKey<Item> DATE = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "date");
            public static final TagKey<Item> AVOCADO = TagUtils.tagAppendPath(Foods.ALL_FRUITS, "avocado");
            
            public static final TagKey<Item> ALL_VEGETABLES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "vegetable");
            public static final TagKey<Item> CARROT = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "carrot");
            public static final TagKey<Item> POTATO = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "potato");
            public static final TagKey<Item> BEETROOT = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "beetroot");
            public static final TagKey<Item> TOMATO = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "tomato");
            public static final TagKey<Item> CUCUMBER = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "cucumber");
            public static final TagKey<Item> CORN = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "corn");
            public static final TagKey<Item> BROCCOLI = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "broccoli");
            public static final TagKey<Item> BELL_PEPPER = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "bell_pepper");
            public static final TagKey<Item> CABBAGE = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "cabbage");
            public static final TagKey<Item> PUMPKIN = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "pumpkin");
            public static final TagKey<Item> EGGPLANT = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "eggplant");
            public static final TagKey<Item> SWEET_POTATO = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "sweet_potato");
            public static final TagKey<Item> LETTUCE = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "lettuce");
            public static final TagKey<Item> ONION = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "onion");
            public static final TagKey<Item> SHALLOT = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "shallot");
            public static final TagKey<Item> CHILI_PEPPER = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "chili_pepper");
            public static final TagKey<Item> TURNIP = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "turnip");
            public static final TagKey<Item> RADISH = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "radish");
            public static final TagKey<Item> PEA = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "pea");
            public static final TagKey<Item> ASPARAGUS = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "asparagus");
            public static final TagKey<Item> CELERY = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "celery");
            public static final TagKey<Item> SPINACH = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "spinach");
            public static final TagKey<Item> LEEK = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "leek");
            public static final TagKey<Item> ZUCCHINI = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "zucchini");
            public static final TagKey<Item> PARSNIP = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "parsnip");
            public static final TagKey<Item> CAULIFLOWER = TagUtils.tagAppendPath(Foods.ALL_VEGETABLES, "cauliflower");
            
            public static final TagKey<Item> ALL_NUTS = TagUtils.tagAppendPath(Foods.ALL_FOODS, "nut");
            public static final TagKey<Item> PEANUT = TagUtils.tagAppendPath(Foods.ALL_NUTS, "peanut");
            public static final TagKey<Item> COCONUT = TagUtils.tagAppendPath(Foods.ALL_NUTS, "coconut");
            public static final TagKey<Item> ALMOND = TagUtils.tagAppendPath(Foods.ALL_NUTS, "almond");
            public static final TagKey<Item> HAZELNUT = TagUtils.tagAppendPath(Foods.ALL_NUTS, "hazelnut");
            public static final TagKey<Item> CASHEW = TagUtils.tagAppendPath(Foods.ALL_NUTS, "cashew");
            public static final TagKey<Item> PISTACHIO = TagUtils.tagAppendPath(Foods.ALL_NUTS, "pistachio");
            public static final TagKey<Item> WALNUT = TagUtils.tagAppendPath(Foods.ALL_NUTS, "walnut");
            public static final TagKey<Item> PECAN = TagUtils.tagAppendPath(Foods.ALL_NUTS, "pecan");
            public static final TagKey<Item> CHESTNUT = TagUtils.tagAppendPath(Foods.ALL_NUTS, "chestnut");
            public static final TagKey<Item> MACADAMIA = TagUtils.tagAppendPath(Foods.ALL_NUTS, "macadamia");
            public static final TagKey<Item> ACORN = TagUtils.tagAppendPath(Foods.ALL_NUTS, "acorn");
            
            public static final TagKey<Item> ALL_BERRIES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "berry");
            public static final TagKey<Item> STRAWBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "strawberry");
            public static final TagKey<Item> RASPBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "raspberry");
            public static final TagKey<Item> BLUEBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "blueberry");
            public static final TagKey<Item> BLACKBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "blackberry");
            public static final TagKey<Item> CRANBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "cranberry");
            public static final TagKey<Item> MULBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "mulberry");
            public static final TagKey<Item> ELDERBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "elderberry");
            public static final TagKey<Item> SALMONBERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "salmonberry");
            public static final TagKey<Item> ACAI_BERRY = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "acai_berry");
            public static final TagKey<Item> CURRANT = TagUtils.tagAppendPath(Foods.ALL_BERRIES, "currant");
            
            public static final TagKey<Item> ALL_RAW_MEATS = TagUtils.tagAppendPath(Foods.ALL_FOODS, "raw_meat");
            public static final TagKey<Item> RAW_BEEF = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "beef");
            public static final TagKey<Item> RAW_MUTTON = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "mutton");
            public static final TagKey<Item> RAW_PORK = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "pork");
            public static final TagKey<Item> RAW_CHICKEN = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "chicken");
            public static final TagKey<Item> RAW_VENISON = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "venison");
            public static final TagKey<Item> RAW_RABBIT = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "rabbit");
            public static final TagKey<Item> RAW_BISON = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "bison");
            public static final TagKey<Item> RAW_LAMB = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "lamb");
            public static final TagKey<Item> RAW_GOAT = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "goat");
            public static final TagKey<Item> RAW_VEAL = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "veal");
            public static final TagKey<Item> RAW_DUCK = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "duck");
            public static final TagKey<Item> RAW_TURKEY = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "turkey");
            public static final TagKey<Item> RAW_PHEASANT = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "pheasant");
            public static final TagKey<Item> RAW_BEAR = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "bear");
            public static final TagKey<Item> RAW_BACON = TagUtils.tagAppendPath(Foods.ALL_RAW_MEATS, "bacon");
            
            public static final TagKey<Item> ALL_COOKED_MEATS = TagUtils.tagAppendPath(Foods.ALL_FOODS, "cooked_meat");
            public static final TagKey<Item> COOKED_BEEF = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "beef");
            public static final TagKey<Item> COOKED_MUTTON = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "mutton");
            public static final TagKey<Item> COOKED_PORK = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "pork");
            public static final TagKey<Item> COOKED_CHICKEN = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "chicken");
            public static final TagKey<Item> COOKED_VENISON = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "venison");
            public static final TagKey<Item> COOKED_RABBIT = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "rabbit");
            public static final TagKey<Item> COOKED_BISON = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "bison");
            public static final TagKey<Item> COOKED_LAMB = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "lamb");
            public static final TagKey<Item> COOKED_GOAT = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "goat");
            public static final TagKey<Item> COOKED_VEAL = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "veal");
            public static final TagKey<Item> COOKED_DUCK = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "duck");
            public static final TagKey<Item> COOKED_TURKEY = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "turkey");
            public static final TagKey<Item> COOKED_PHEASANT = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "pheasant");
            public static final TagKey<Item> COOKED_BEAR = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "bear");
            public static final TagKey<Item> COOKED_BACON = TagUtils.tagAppendPath(Foods.ALL_COOKED_MEATS, "bacon");
            
            public static final TagKey<Item> ALL_RAW_FISHES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "raw_fish");
            public static final TagKey<Item> RAW_COD = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "cod");
            public static final TagKey<Item> RAW_SALMON = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "salmon");
            public static final TagKey<Item> RAW_TROPICAL_FISH = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "tropical_fish");
            public static final TagKey<Item> RAW_PUFFERFISH = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "pufferfish");
            public static final TagKey<Item> RAW_TROUT = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "trout");
            public static final TagKey<Item> RAW_BASS = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "bass");
            public static final TagKey<Item> RAW_TUNA = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "tuna");
            public static final TagKey<Item> RAW_MACKEREL = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "mackerel");
            public static final TagKey<Item> RAW_SARDINE = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "sardine");
            public static final TagKey<Item> RAW_ANCHOVY = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "anchovy");
            public static final TagKey<Item> RAW_HERRING = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "herring");
            public static final TagKey<Item> RAW_HALIBUT = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "halibut");
            public static final TagKey<Item> RAW_SNAPPER = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "snapper");
            public static final TagKey<Item> RAW_TILAPIA = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "tilapia");
            public static final TagKey<Item> RAW_CARP = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "carp");
            public static final TagKey<Item> RAW_GROUPER = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "grouper");
            public static final TagKey<Item> RAW_PIKE = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "pike");
            public static final TagKey<Item> RAW_PERCH = TagUtils.tagAppendPath(Foods.ALL_RAW_FISHES, "perch");
            
            public static final TagKey<Item> ALL_COOKED_FISHES = TagUtils.tagAppendPath(Foods.ALL_FOODS, "cooked_fish");
            public static final TagKey<Item> COOKED_COD = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "cod");
            public static final TagKey<Item> COOKED_SALMON = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "salmon");
            public static final TagKey<Item> COOKED_TROPICAL_FISH = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "tropical_fish");
            public static final TagKey<Item> COOKED_PUFFERFISH = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "pufferfish");
            public static final TagKey<Item> COOKED_TROUT = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "trout");
            public static final TagKey<Item> COOKED_BASS = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "bass");
            public static final TagKey<Item> COOKED_TUNA = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "tuna");
            public static final TagKey<Item> COOKED_MACKEREL = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "mackerel");
            public static final TagKey<Item> COOKED_SARDINE = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "sardine");
            public static final TagKey<Item> COOKED_ANCHOVY = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "anchovy");
            public static final TagKey<Item> COOKED_HERRING = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "herring");
            public static final TagKey<Item> COOKED_HALIBUT = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "halibut");
            public static final TagKey<Item> COOKED_SNAPPER = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "snapper");
            public static final TagKey<Item> COOKED_TILAPIA = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "tilapia");
            public static final TagKey<Item> COOKED_CARP = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "carp");
            public static final TagKey<Item> COOKED_GROUPER = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "grouper");
            public static final TagKey<Item> COOKED_PIKE = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "pike");
            public static final TagKey<Item> COOKED_PERCH = TagUtils.tagAppendPath(Foods.ALL_COOKED_FISHES, "perch");
            
            public static final TagKey<Item> ALL_RAW_SEAFOOD = TagUtils.tagAppendPath(Foods.ALL_FOODS, "raw_seafood");
            public static final TagKey<Item> RAW_SHRIMP = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "shrimp");
            public static final TagKey<Item> RAW_CRAB = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "crab");
            public static final TagKey<Item> RAW_LOBSTER = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "lobster");
            public static final TagKey<Item> RAW_OYSTER = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "oyster");
            public static final TagKey<Item> RAW_CRAWFISH = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "crawfish");
            public static final TagKey<Item> RAW_CLAM = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "clam");
            public static final TagKey<Item> RAW_MUSSEL = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "mussel");
            public static final TagKey<Item> RAW_SCALLOP = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "scallop");
            public static final TagKey<Item> RAW_SQUID = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "squid");
            public static final TagKey<Item> RAW_GLOW_SQUID = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "glow_squid");
            public static final TagKey<Item> RAW_OCTOPUS = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "octopus");
            public static final TagKey<Item> RAW_GUARDIAN = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "guardian");
            public static final TagKey<Item> RAW_ELDER_GUARDIAN = TagUtils.tagAppendPath(Foods.ALL_RAW_SEAFOOD, "elder_guardian");
            
            public static final TagKey<Item> ALL_COOKED_SEAFOOD = TagUtils.tagAppendPath(Foods.ALL_FOODS, "cooked_seafood");
            public static final TagKey<Item> COOKED_SHRIMP = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "shrimp");
            public static final TagKey<Item> COOKED_CRAB = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "crab");
            public static final TagKey<Item> COOKED_LOBSTER = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "lobster");
            public static final TagKey<Item> COOKED_OYSTER = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "oyster"); // why on earth...
            public static final TagKey<Item> COOKED_CRAWFISH = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "crawfish");
            public static final TagKey<Item> COOKED_CLAM = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "clam");
            public static final TagKey<Item> COOKED_MUSSEL = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "mussel");
            public static final TagKey<Item> COOKED_SCALLOP = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "scallop");
            public static final TagKey<Item> COOKED_SQUID = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "squid");
            public static final TagKey<Item> COOKED_GLOW_SQUID = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "glow_squid");
            public static final TagKey<Item> COOKED_OCTOPUS = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "octopus");
            public static final TagKey<Item> COOKED_GUARDIAN = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "guardian");
            public static final TagKey<Item> COOKED_ELDER_GUARDIAN = TagUtils.tagAppendPath(Foods.ALL_COOKED_SEAFOOD, "elder_guardian");
            
        }
        
        public static class Agriculture {
            public static final TagKey<Item> ALL_FERTILIZERS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "fertilizers"));
            
            public static final TagKey<Item> ALL_SEEDS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "seeds"));
            public static final TagKey<Item> SEEDS_BEETROOT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "beetroot");
            public static final TagKey<Item> SEEDS_CARROT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "carrot");
            public static final TagKey<Item> SEEDS_POTATO = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "potato");
            public static final TagKey<Item> SEEDS_TOMATO = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "tomato");
            public static final TagKey<Item> SEEDS_CUCUMBER = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "cucumber");
            public static final TagKey<Item> SEEDS_CORN = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "corn");
            public static final TagKey<Item> SEEDS_BROCCOLI = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "broccoli");
            public static final TagKey<Item> SEEDS_BELL_PEPPER = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "bell_pepper");
            public static final TagKey<Item> SEEDS_CABBAGE = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "cabbage");
            public static final TagKey<Item> SEEDS_PUMPKIN = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "pumpkin");
            public static final TagKey<Item> SEEDS_EGGPLANT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "eggplant");
            public static final TagKey<Item> SEEDS_SWEET_POTATO = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "sweet_potato");
            public static final TagKey<Item> SEEDS_LETTUCE = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "lettuce");
            public static final TagKey<Item> SEEDS_ONION = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "onion");
            public static final TagKey<Item> SEEDS_SHALLOT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "shallot");
            public static final TagKey<Item> SEEDS_CHILI_PEPPER = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "chili_pepper");
            public static final TagKey<Item> SEEDS_TURNIP = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "turnip");
            public static final TagKey<Item> SEEDS_RADISH = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "radish");
            public static final TagKey<Item> SEEDS_PEA = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "pea");
            public static final TagKey<Item> SEEDS_ASPARAGUS = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "asparagus");
            public static final TagKey<Item> SEEDS_CELERY = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "celery");
            public static final TagKey<Item> SEEDS_SPINACH = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "spinach");
            public static final TagKey<Item> SEEDS_LEEK = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "leek");
            public static final TagKey<Item> SEEDS_ZUCCHINI = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "zucchini");
            public static final TagKey<Item> SEEDS_PARSNIP = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "parsnip");
            public static final TagKey<Item> SEEDS_CAULIFLOWER = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "cauliflower");
            public static final TagKey<Item> SEEDS_CACTUS = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "cactus");
            public static final TagKey<Item> SEEDS_COCOA_BEAN = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "cocoa_beans");
            public static final TagKey<Item> SEEDS_MELON = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "melon");
            public static final TagKey<Item> SEEDS_NETHER_WART = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "nether_wart");
            public static final TagKey<Item> SEEDS_SUGAR_CANE = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "sugar_cane");
            public static final TagKey<Item> SEEDS_WHEAT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "wheat");
            public static final TagKey<Item> SEEDS_RICE = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "rice");
            public static final TagKey<Item> SEEDS_OATS = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "oats");
            public static final TagKey<Item> SEEDS_BARLEY = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "barley");
            public static final TagKey<Item> SEEDS_MILLET = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "millet");
            public static final TagKey<Item> SEEDS_BUCKWHEAT = TagUtils.tagAppendPath(Agriculture.ALL_SEEDS, "buckwheat");
            
            public static final TagKey<Item> SAPLINGS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "saplings"));
            
            public static final TagKey<Item> ALL_CROPS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "crops"));
            public static final TagKey<Item> CROPS_BEETROOT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "beetroot");
            public static final TagKey<Item> CROPS_CARROT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "carrot");
            public static final TagKey<Item> CROPS_POTATO = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "potato");
            public static final TagKey<Item> CROPS_TOMATO = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "tomato");
            public static final TagKey<Item> CROPS_CUCUMBER = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "cucumber");
            public static final TagKey<Item> CROPS_CORN = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "corn");
            public static final TagKey<Item> CROPS_BROCCOLI = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "broccoli");
            public static final TagKey<Item> CROPS_BELL_PEPPER = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "bell_pepper");
            public static final TagKey<Item> CROPS_CABBAGE = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "cabbage");
            public static final TagKey<Item> CROPS_PUMPKIN = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "pumpkin");
            public static final TagKey<Item> CROPS_EGGPLANT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "eggplant");
            public static final TagKey<Item> CROPS_SWEET_POTATO = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "sweet_potato");
            public static final TagKey<Item> CROPS_LETTUCE = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "lettuce");
            public static final TagKey<Item> CROPS_ONION = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "onion");
            public static final TagKey<Item> CROPS_SHALLOT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "shallot");
            public static final TagKey<Item> CROPS_CHILI_PEPPER = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "chili_pepper");
            public static final TagKey<Item> CROPS_TURNIP = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "turnip");
            public static final TagKey<Item> CROPS_RADISH = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "radish");
            public static final TagKey<Item> CROPS_PEA = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "pea");
            public static final TagKey<Item> CROPS_ASPARAGUS = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "asparagus");
            public static final TagKey<Item> CROPS_CELERY = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "celery");
            public static final TagKey<Item> CROPS_SPINACH = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "spinach");
            public static final TagKey<Item> CROPS_LEEK = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "leek");
            public static final TagKey<Item> CROPS_ZUCCHINI = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "zucchini");
            public static final TagKey<Item> CROPS_PARSNIP = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "parsnip");
            public static final TagKey<Item> CROPS_CAULIFLOWER = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "cauliflower");
            public static final TagKey<Item> CROPS_CACTUS = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "cactus");
            public static final TagKey<Item> CROPS_COCOA_BEAN = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "cocoa_beans");
            public static final TagKey<Item> CROPS_MELON = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "melon");
            public static final TagKey<Item> CROPS_NETHER_WART = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "nether_wart");
            public static final TagKey<Item> CROPS_SUGAR_CANE = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "sugar_cane");
            public static final TagKey<Item> CROPS_WHEAT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "wheat");
            public static final TagKey<Item> CROPS_RICE = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "rice");
            public static final TagKey<Item> CROPS_OATS = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "oats");
            public static final TagKey<Item> CROPS_BARLEY = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "barley");
            public static final TagKey<Item> CROPS_MILLET = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "millet");
            public static final TagKey<Item> CROPS_BUCKWHEAT = TagUtils.tagAppendPath(Agriculture.ALL_CROPS, "buckwheat");
            
            public static final TagKey<Item> ALL_GRAINS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "grain"));
            public static final TagKey<Item> GRAINS_WHEAT = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "wheat");
            public static final TagKey<Item> GRAINS_RICE = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "rice");
            public static final TagKey<Item> GRAINS_OATS = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "oats");
            public static final TagKey<Item> GRAINS_CORN = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "corn");
            public static final TagKey<Item> GRAINS_BARLEY = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "barley");
            public static final TagKey<Item> GRAINS_MILLET = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "millet");
            public static final TagKey<Item> GRAINS_BUCKWHEAT = TagUtils.tagAppendPath(Agriculture.ALL_GRAINS, "buckwheat");
            
        }
        
        public static class Stones {
            public static final TagKey<Item> ALL_STONES = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "stones"));
        
        }
        
        public static class Ores {
            public static final TagKey<Item> ALL_ORES = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ores"));
        
        }
        
        public static class RawOres {
            public static final TagKey<Item> ALL_RAW_ORES = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "raw_materials"));
        
        }
        
        public static class RawGems {
            public static final TagKey<Item> ALL_RAW_GEMS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "raw_gems"));
            
            public static final TagKey<Item> RAW_GEM_AMETHYST = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "amethyst");
            public static final TagKey<Item> RAW_GEM_DIAMOND = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "diamond");
            public static final TagKey<Item> RAW_GEM_EMERALD = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "emerald");
            public static final TagKey<Item> RAW_GEM_LAPIS_LAZULI = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "lapis");
            public static final TagKey<Item> RAW_GEM_QUARTZ = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "quartz");
            public static final TagKey<Item> RAW_GEM_PRISMARINE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "prismarine");
            public static final TagKey<Item> RAW_GEM_SAPPHIRE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "sapphire");
            public static final TagKey<Item> RAW_GEM_RUBY = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "ruby");
            public static final TagKey<Item> RAW_GEM_TOPAZ = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "topaz");
            public static final TagKey<Item> RAW_GEM_PERIDOT = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "peridot");
            public static final TagKey<Item> RAW_GEM_AQUAMARINE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "aquamarine");
            public static final TagKey<Item> RAW_GEM_CITRINE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "citrine");
            public static final TagKey<Item> RAW_GEM_OPAL = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "opal");
            public static final TagKey<Item> RAW_GEM_SUNSTONE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "sunstone");
            public static final TagKey<Item> RAW_GEM_ONYX = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "onyx");
            public static final TagKey<Item> RAW_GEM_MALACHITE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "malachite");
            public static final TagKey<Item> RAW_GEM_TOURMALINE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "tourmaline");
            public static final TagKey<Item> RAW_GEM_MOONSTONE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "moonstone");
            public static final TagKey<Item> RAW_GEM_AMBER = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "amber");
            public static final TagKey<Item> RAW_GEM_AGATE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "agate");
            public static final TagKey<Item> RAW_GEM_BLOODSTONE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "bloodstone");
            public static final TagKey<Item> RAW_GEM_JADE = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "jade");
            public static final TagKey<Item> RAW_GEM_GARNET = TagUtils.tagAppendPath(RawGems.ALL_RAW_GEMS, "garnet");
        
        }
        
        public static class RawStorageBlocks {
            public static final TagKey<Item> ALL_RAW_STORAGE_BLOCKS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "raw_storage_blocks"));
        
        }
        
        public static class CrushedRawOres {
        
        }
        
        public static class PowderedRawOres {
        
        }
        
        public static class Ingots {
            public static final TagKey<Item> ALL_INGOTS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "ingots"));
            
            // ELEMENTAL METALS
            
            public static final TagKey<Item> INGOT_LITHIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "lithium");
            public static final TagKey<Item> INGOT_BERYLLIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "beryllium");
            public static final TagKey<Item> INGOT_SODIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "sodium");
            public static final TagKey<Item> INGOT_MAGNESIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "magnesium");
            public static final TagKey<Item> INGOT_ALUMINUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "ingots/aluminum");
            public static final TagKey<Item> INGOT_POTASSIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "potassium");
            public static final TagKey<Item> INGOT_CALCIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "calcium");
            public static final TagKey<Item> INGOT_SCANDIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "scandium");
            public static final TagKey<Item> INGOT_TITANIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "titanium");
            public static final TagKey<Item> INGOT_VANADIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "vanadium");
            public static final TagKey<Item> INGOT_CHROMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "chromium");
            public static final TagKey<Item> INGOT_MANGANESE = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "manganese");
            public static final TagKey<Item> INGOT_IRON = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "iron");
            public static final TagKey<Item> INGOT_COBALT = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "cobalt");
            public static final TagKey<Item> INGOT_NICKEL = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "nickel");
            public static final TagKey<Item> INGOT_COPPER = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "copper");
            public static final TagKey<Item> INGOT_ZINC = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "zinc");
            public static final TagKey<Item> INGOT_GALLIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "gallium");
            public static final TagKey<Item> INGOT_RUBIDIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "rubidium");
            public static final TagKey<Item> INGOT_STRONTIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "strontium");
            public static final TagKey<Item> INGOT_YTTRIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "yttrium");
            public static final TagKey<Item> INGOT_ZIRCONIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "zirconium");
            public static final TagKey<Item> INGOT_NIOBIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "niobium");
            public static final TagKey<Item> INGOT_MOLYBDENUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "molybdenum");
            public static final TagKey<Item> INGOT_TECHNETIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "technetium");
            public static final TagKey<Item> INGOT_RUTHENIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "ruthenium");
            public static final TagKey<Item> INGOT_PALLADIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "palladium");
            public static final TagKey<Item> INGOT_SILVER = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "silver");
            public static final TagKey<Item> INGOT_CADMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "cadmium");
            public static final TagKey<Item> INGOT_INDIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "indium");
            public static final TagKey<Item> INGOT_TIN = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "tin");
            public static final TagKey<Item> INGOT_CESIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "cesium");
            public static final TagKey<Item> INGOT_BARIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "barium");
            public static final TagKey<Item> INGOT_LANTHANUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "lanthanum");
            public static final TagKey<Item> INGOT_CERIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "cerium");
            public static final TagKey<Item> INGOT_PRASEODYMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "praseodymium");
            public static final TagKey<Item> INGOT_NEODYMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "neodymium");
            public static final TagKey<Item> INGOT_PROMETHIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "promethium");
            public static final TagKey<Item> INGOT_SAMARIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "samarium");
            public static final TagKey<Item> INGOT_EUROPIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "europium");
            public static final TagKey<Item> INGOT_GADOLINIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "gadolinium");
            public static final TagKey<Item> INGOT_TERBIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "terbium");
            public static final TagKey<Item> INGOT_DYSPROSIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "dysprosium");
            public static final TagKey<Item> INGOT_HOLMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "holmium");
            public static final TagKey<Item> INGOT_ERBIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "erbium");
            public static final TagKey<Item> INGOT_THULIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "thulium");
            public static final TagKey<Item> INGOT_YTTERBIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "ytterbium");
            public static final TagKey<Item> INGOT_LUTETIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "lutetium");
            public static final TagKey<Item> INGOT_HAFNIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "hafnium");
            public static final TagKey<Item> INGOT_TANTALUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "tantalum");
            public static final TagKey<Item> INGOT_TUNGSTEN = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "tungsten");
            public static final TagKey<Item> INGOT_RHENIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "rhenium");
            public static final TagKey<Item> INGOT_OSMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "osmium");
            public static final TagKey<Item> INGOT_IRIDIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "iridium");
            public static final TagKey<Item> INGOT_PLATINUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "platinum");
            public static final TagKey<Item> INGOT_GOLD = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "gold");
            public static final TagKey<Item> INGOT_THALLIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "thallium");
            public static final TagKey<Item> INGOT_LEAD = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "lead");
            public static final TagKey<Item> INGOT_BISMUTH = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "bismuth");
            public static final TagKey<Item> INGOT_FRANCIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "francium");
            public static final TagKey<Item> INGOT_RADIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "radium");
            public static final TagKey<Item> INGOT_ACTINIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "actinium");
            public static final TagKey<Item> INGOT_THORIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "thorium");
            public static final TagKey<Item> INGOT_PROTACTINIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "protactinium");
            public static final TagKey<Item> INGOT_URANIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "uranium");
            public static final TagKey<Item> INGOT_NEPTUNIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "neptunium");
            public static final TagKey<Item> INGOT_PLUTONIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "plutonium");
            public static final TagKey<Item> INGOT_AMERICIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "americium");
            public static final TagKey<Item> INGOT_CURIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "curium");
            public static final TagKey<Item> INGOT_BERKELIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "berkelium");
            public static final TagKey<Item> INGOT_CALIFORNIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "californium");
            public static final TagKey<Item> INGOT_EINSTEINIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "einsteinium");
            public static final TagKey<Item> INGOT_FERMIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "fermium");
            public static final TagKey<Item> INGOT_MENDELEVIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "mendelevium");
            public static final TagKey<Item> INGOT_NOBELIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "nobelium");
            public static final TagKey<Item> INGOT_LAWRENCIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "lawrencium");
            public static final TagKey<Item> INGOT_RUTHERFORDIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "rutherfordium");
            public static final TagKey<Item> INGOT_DUBNIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "dubnium");
            public static final TagKey<Item> INGOT_SEABORGIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "seaborgium");
            public static final TagKey<Item> INGOT_BOHRIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "bohrium");
            public static final TagKey<Item> INGOT_HASSIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "hassium");
            public static final TagKey<Item> INGOT_MEITNERIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "meitnerium");
            public static final TagKey<Item> INGOT_DARMSTADTIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "darmstadtium");
            public static final TagKey<Item> INGOT_ROENTGENIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "roentgenium");
            public static final TagKey<Item> INGOT_COPERNICIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "copernicium");
            public static final TagKey<Item> INGOT_NIHONIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "nihonium");
            public static final TagKey<Item> INGOT_FLEROVIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "flerovium");
            public static final TagKey<Item> INGOT_MOSCOVIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "moscovium");
            public static final TagKey<Item> INGOT_LIVERMORIUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "livermorium");
            public static final TagKey<Item> INGOT_TENNESSINE = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "tennessine");
            public static final TagKey<Item> INGOT_OGANESSON = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "oganesson");
            
            // ALLOYS
            
            public static final TagKey<Item> INGOT_BRONZE = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "bronze");
            public static final TagKey<Item> INGOT_BRASS = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "brass");
            public static final TagKey<Item> INGOT_CONSTANTAN = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "constantan");
            public static final TagKey<Item> INGOT_CUPRONICKEL = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "cupronickel");
            public static final TagKey<Item> INGOT_INVAR = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "invar");
            public static final TagKey<Item> INGOT_ELECTRUM = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "electrum");
            public static final TagKey<Item> INGOT_STEEL = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "steel");
            public static final TagKey<Item> INGOT_HARDENED_STEEL = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "hardened_steel");
            public static final TagKey<Item> INGOT_TUNGSTEN_CARBIDE = TagUtils.tagAppendPath(Ingots.ALL_INGOTS, "tungsten_carbide");
            
            
        }
        
        public static class Gems {
            public static final TagKey<Item> ALL_GEMS = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "gems"));
            
            public static final TagKey<Item> GEM_AMETHYST = TagUtils.tagAppendPath(Gems.ALL_GEMS, "amethyst");
            public static final TagKey<Item> GEM_DIAMOND = TagUtils.tagAppendPath(Gems.ALL_GEMS, "diamond");
            public static final TagKey<Item> GEM_EMERALD = TagUtils.tagAppendPath(Gems.ALL_GEMS, "emerald");
            public static final TagKey<Item> GEM_LAPIS_LAZULI = TagUtils.tagAppendPath(Gems.ALL_GEMS, "lapis");
            public static final TagKey<Item> GEM_QUARTZ = TagUtils.tagAppendPath(Gems.ALL_GEMS, "quartz");
            public static final TagKey<Item> GEM_PRISMARINE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "prismarine");
            public static final TagKey<Item> GEM_SAPPHIRE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "sapphire");
            public static final TagKey<Item> GEM_RUBY = TagUtils.tagAppendPath(Gems.ALL_GEMS, "ruby");
            public static final TagKey<Item> GEM_TOPAZ = TagUtils.tagAppendPath(Gems.ALL_GEMS, "topaz");
            public static final TagKey<Item> GEM_PERIDOT = TagUtils.tagAppendPath(Gems.ALL_GEMS, "peridot");
            public static final TagKey<Item> GEM_AQUAMARINE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "aquamarine");
            public static final TagKey<Item> GEM_CITRINE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "citrine");
            public static final TagKey<Item> GEM_OPAL = TagUtils.tagAppendPath(Gems.ALL_GEMS, "opal");
            public static final TagKey<Item> GEM_SUNSTONE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "sunstone");
            public static final TagKey<Item> GEM_ONYX = TagUtils.tagAppendPath(Gems.ALL_GEMS, "onyx");
            public static final TagKey<Item> GEM_MALACHITE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "malachite");
            public static final TagKey<Item> GEM_TOURMALINE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "tourmaline");
            public static final TagKey<Item> GEM_MOONSTONE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "moonstone");
            public static final TagKey<Item> GEM_AMBER = TagUtils.tagAppendPath(Gems.ALL_GEMS, "amber");
            public static final TagKey<Item> GEM_AGATE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "agate");
            public static final TagKey<Item> GEM_BLOODSTONE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "bloodstone");
            public static final TagKey<Item> GEM_JADE = TagUtils.tagAppendPath(Gems.ALL_GEMS, "jade");
            public static final TagKey<Item> GEM_GARNET = TagUtils.tagAppendPath(Gems.ALL_GEMS, "garnet");
            
        }
        
        public static class Refined {
            public static final TagKey<Item> ALL_REFINED = TagUtils.createItemTag(ResourceLocation.fromNamespaceAndPath(ResLocUtils.FORGE_NAMESPACE, "refined"));
            
            // METALS
            public static final TagKey<Item> REFINED_LITHIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "lithium");
            public static final TagKey<Item> REFINED_BERYLLIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "beryllium");
            public static final TagKey<Item> REFINED_SODIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "sodium");
            public static final TagKey<Item> REFINED_MAGNESIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "magnesium");
            public static final TagKey<Item> REFINED_ALUMINUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "ingots/aluminum");
            public static final TagKey<Item> REFINED_POTASSIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "potassium");
            public static final TagKey<Item> REFINED_CALCIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "calcium");
            public static final TagKey<Item> REFINED_SCANDIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "scandium");
            public static final TagKey<Item> REFINED_TITANIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "titanium");
            public static final TagKey<Item> REFINED_VANADIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "vanadium");
            public static final TagKey<Item> REFINED_CHROMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "chromium");
            public static final TagKey<Item> REFINED_MANGANESE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "manganese");
            public static final TagKey<Item> REFINED_IRON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "iron");
            public static final TagKey<Item> REFINED_COBALT = TagUtils.tagAppendPath(Refined.ALL_REFINED, "cobalt");
            public static final TagKey<Item> REFINED_NICKEL = TagUtils.tagAppendPath(Refined.ALL_REFINED, "nickel");
            public static final TagKey<Item> REFINED_COPPER = TagUtils.tagAppendPath(Refined.ALL_REFINED, "copper");
            public static final TagKey<Item> REFINED_ZINC = TagUtils.tagAppendPath(Refined.ALL_REFINED, "zinc");
            public static final TagKey<Item> REFINED_GALLIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "gallium");
            public static final TagKey<Item> REFINED_RUBIDIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "rubidium");
            public static final TagKey<Item> REFINED_STRONTIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "strontium");
            public static final TagKey<Item> REFINED_YTTRIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "yttrium");
            public static final TagKey<Item> REFINED_ZIRCONIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "zirconium");
            public static final TagKey<Item> REFINED_NIOBIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "niobium");
            public static final TagKey<Item> REFINED_MOLYBDENUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "molybdenum");
            public static final TagKey<Item> REFINED_TECHNETIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "technetium");
            public static final TagKey<Item> REFINED_RUTHENIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "ruthenium");
            public static final TagKey<Item> REFINED_PALLADIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "palladium");
            public static final TagKey<Item> REFINED_SILVER = TagUtils.tagAppendPath(Refined.ALL_REFINED, "silver");
            public static final TagKey<Item> REFINED_CADMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "cadmium");
            public static final TagKey<Item> REFINED_INDIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "indium");
            public static final TagKey<Item> REFINED_TIN = TagUtils.tagAppendPath(Refined.ALL_REFINED, "tin");
            public static final TagKey<Item> REFINED_CESIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "cesium");
            public static final TagKey<Item> REFINED_BARIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "barium");
            public static final TagKey<Item> REFINED_LANTHANUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "lanthanum");
            public static final TagKey<Item> REFINED_CERIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "cerium");
            public static final TagKey<Item> REFINED_PRASEODYMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "praseodymium");
            public static final TagKey<Item> REFINED_NEODYMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "neodymium");
            public static final TagKey<Item> REFINED_PROMETHIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "promethium");
            public static final TagKey<Item> REFINED_SAMARIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "samarium");
            public static final TagKey<Item> REFINED_EUROPIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "europium");
            public static final TagKey<Item> REFINED_GADOLINIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "gadolinium");
            public static final TagKey<Item> REFINED_TERBIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "terbium");
            public static final TagKey<Item> REFINED_DYSPROSIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "dysprosium");
            public static final TagKey<Item> REFINED_HOLMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "holmium");
            public static final TagKey<Item> REFINED_ERBIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "erbium");
            public static final TagKey<Item> REFINED_THULIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "thulium");
            public static final TagKey<Item> REFINED_YTTERBIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "ytterbium");
            public static final TagKey<Item> REFINED_LUTETIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "lutetium");
            public static final TagKey<Item> REFINED_HAFNIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "hafnium");
            public static final TagKey<Item> REFINED_TANTALUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "tantalum");
            public static final TagKey<Item> REFINED_TUNGSTEN = TagUtils.tagAppendPath(Refined.ALL_REFINED, "tungsten");
            public static final TagKey<Item> REFINED_RHENIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "rhenium");
            public static final TagKey<Item> REFINED_OSMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "osmium");
            public static final TagKey<Item> REFINED_IRIDIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "iridium");
            public static final TagKey<Item> REFINED_PLATINUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "platinum");
            public static final TagKey<Item> REFINED_GOLD = TagUtils.tagAppendPath(Refined.ALL_REFINED, "gold");
            public static final TagKey<Item> REFINED_THALLIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "thallium");
            public static final TagKey<Item> REFINED_LEAD = TagUtils.tagAppendPath(Refined.ALL_REFINED, "lead");
            public static final TagKey<Item> REFINED_BISMUTH = TagUtils.tagAppendPath(Refined.ALL_REFINED, "bismuth");
            public static final TagKey<Item> REFINED_FRANCIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "francium");
            public static final TagKey<Item> REFINED_RADIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "radium");
            public static final TagKey<Item> REFINED_ACTINIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "actinium");
            public static final TagKey<Item> REFINED_THORIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "thorium");
            public static final TagKey<Item> REFINED_PROTACTINIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "protactinium");
            public static final TagKey<Item> REFINED_URANIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "uranium");
            public static final TagKey<Item> REFINED_NEPTUNIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "neptunium");
            public static final TagKey<Item> REFINED_PLUTONIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "plutonium");
            public static final TagKey<Item> REFINED_AMERICIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "americium");
            public static final TagKey<Item> REFINED_CURIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "curium");
            public static final TagKey<Item> REFINED_BERKELIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "berkelium");
            public static final TagKey<Item> REFINED_CALIFORNIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "californium");
            public static final TagKey<Item> REFINED_EINSTEINIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "einsteinium");
            public static final TagKey<Item> REFINED_FERMIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "fermium");
            public static final TagKey<Item> REFINED_MENDELEVIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "mendelevium");
            public static final TagKey<Item> REFINED_NOBELIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "nobelium");
            public static final TagKey<Item> REFINED_LAWRENCIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "lawrencium");
            public static final TagKey<Item> REFINED_RUTHERFORDIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "rutherfordium");
            public static final TagKey<Item> REFINED_DUBNIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "dubnium");
            public static final TagKey<Item> REFINED_SEABORGIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "seaborgium");
            public static final TagKey<Item> REFINED_BOHRIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "bohrium");
            public static final TagKey<Item> REFINED_HASSIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "hassium");
            public static final TagKey<Item> REFINED_MEITNERIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "meitnerium");
            public static final TagKey<Item> REFINED_DARMSTADTIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "darmstadtium");
            public static final TagKey<Item> REFINED_ROENTGENIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "roentgenium");
            public static final TagKey<Item> REFINED_COPERNICIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "copernicium");
            public static final TagKey<Item> REFINED_NIHONIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "nihonium");
            public static final TagKey<Item> REFINED_FLEROVIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "flerovium");
            public static final TagKey<Item> REFINED_MOSCOVIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "moscovium");
            public static final TagKey<Item> REFINED_LIVERMORIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "livermorium");
            public static final TagKey<Item> REFINED_TENNESSINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "tennessine");
            public static final TagKey<Item> REFINED_OGANESSON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "oganesson");
            
            // NON-METAL SOLIDS
            public static final TagKey<Item> REFINED_BORON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "boron");
            public static final TagKey<Item> REFINED_CARBON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "carbon");
            public static final TagKey<Item> REFINED_SILICON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "silicon");
            public static final TagKey<Item> REFINED_PHOSPHORUS = TagUtils.tagAppendPath(Refined.ALL_REFINED, "phosphorus");
            public static final TagKey<Item> REFINED_SULFUR = TagUtils.tagAppendPath(Refined.ALL_REFINED, "sulfur");
            public static final TagKey<Item> REFINED_GERMANIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "germanium");
            public static final TagKey<Item> REFINED_ARSENIC = TagUtils.tagAppendPath(Refined.ALL_REFINED, "arsenic");
            public static final TagKey<Item> REFINED_SELENIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "selenium");
            public static final TagKey<Item> REFINED_ANTIMONY = TagUtils.tagAppendPath(Refined.ALL_REFINED, "antimony");
            public static final TagKey<Item> REFINED_TELLURIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "tellurium");
            public static final TagKey<Item> REFINED_IODINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "iodine");
            public static final TagKey<Item> REFINED_POLONIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "polonium");
            public static final TagKey<Item> REFINED_ASTATINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "astatine");
            
            // NON-METAL LIQUIDS
            public static final TagKey<Item> REFINED_MERCURY = TagUtils.tagAppendPath(Refined.ALL_REFINED, "mercury");
            public static final TagKey<Item> REFINED_BROMINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "bromine");
            
            // NON-METAL GASES
            public static final TagKey<Item> REFINED_HYDROGEN = TagUtils.tagAppendPath(Refined.ALL_REFINED, "hydrogen");
            public static final TagKey<Item> REFINED_HELIUM = TagUtils.tagAppendPath(Refined.ALL_REFINED, "helium");
            public static final TagKey<Item> REFINED_NITROGEN = TagUtils.tagAppendPath(Refined.ALL_REFINED, "nitrogen");
            public static final TagKey<Item> REFINED_OXYGEN = TagUtils.tagAppendPath(Refined.ALL_REFINED, "oxygen");
            public static final TagKey<Item> REFINED_FLUORINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "fluorine");
            public static final TagKey<Item> REFINED_NEON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "neon");
            public static final TagKey<Item> REFINED_CHLORINE = TagUtils.tagAppendPath(Refined.ALL_REFINED, "chlorine");
            public static final TagKey<Item> REFINED_ARGON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "argon");
            public static final TagKey<Item> REFINED_KRYPTON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "krypton");
            public static final TagKey<Item> REFINED_XENON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "xenon");
            public static final TagKey<Item> REFINED_RADON = TagUtils.tagAppendPath(Refined.ALL_REFINED, "radon");
        
        }
        
        public static class Samples {
            // Nuggets
            
            
            // Other samples
            
        }
        
        public static class RefinedPowders {
        
        }
        
        public static class RefinedStorageBlocks {
        
        }
        
        public static class Machinable {
            // Billets
            
            // Rods
            
            // Wires
            
            // Plates
            
            // Sheet
            
            // Gears
            
            // Springs
            
            
            
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
