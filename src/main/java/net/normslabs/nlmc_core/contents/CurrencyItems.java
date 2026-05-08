/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-03 00:53
 */

package net.normslabs.nlmc_core.contents;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.NlmcCore;
import net.normslabs.nlmc_core.translations.Locales;

import java.util.HashMap;
import java.util.Map;

public enum CurrencyItems {
    
    COIN_ONE_CENT("currency_1c", 1L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "1¢ Coin");
            put(Locales.FRENCH_FRANCE, "Pièce de 1¢");
        }
    }),
    COIN_TEN_CENT("currency_10c", 10L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "10 Cent Coin");
            put(Locales.FRENCH_FRANCE, "Pièce de 10¢");
        }
    }),
    COIN_FIFTY_CENT("currency_50c", 50L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "50 Cent Coin");
            put(Locales.FRENCH_FRANCE, "Pièce de 50¢");
        }
    }),
    BILL_ONE_DOLLAR("currency_1", 100L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "1$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 1$");
        }
    }),
    BILL_FIVE_DOLLARS("currency_5", 500L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "5$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 5$");
        }
    }),
    BILL_TEN_DOLLARS("currency_10", 1000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "10$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 10$");
        }
    }),
    BILL_FIFTY_DOLLARS("currency_50", 5000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "50$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 50$");
        }
    }),
    BILL_ONE_HUNDRED_DOLLARS("currency_100", 10000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "100$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 100$");
        }
    }),
    BILL_FIVE_HUNDRED_DOLLARS("currency_500", 50000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "500$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 500$");
        }
    }),
    BILL_ONE_THOUSAND_DOLLARS("currency_1k", 100000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "1000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 1000$");
        }
    }),
    BILL_FIVE_THOUSAND_DOLLARS("currency_5k", 500000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "5000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 5000$");
        }
    }),
    BILL_TEN_THOUSAND_DOLLARS("currency_10k", 1000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "10 000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 10 000$");
        }
    }),
    BILL_FIFTY_THOUSAND_DOLLARS("currency_50k", 5000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "50 000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 50 000$");
        }
    }),
    BILL_ONE_HUNDRED_THOUSAND_DOLLARS("currency_100k", 10000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "100 000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 100 000$");
        }
    }),
    BILL_FIVE_HUNDRED_THOUSAND_DOLLARS("currency_500k", 50000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "500 000$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 500 000$");
        }
    }),
    BILL_ONE_MILLION_DOLLARS("currency_1m", 100000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "1M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 1M$");
        }
    }),
    BILL_FIVE_MILLION_DOLLARS("currency_5m", 500000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "5M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 5M$");
        }
    }),
    BILL_TEN_MILLION_DOLLARS("currency_10m", 1000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "10M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 10M$");
        }
    }),
    BILL_FIFTY_MILLION_DOLLARS("currency_50m", 5000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "50M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 50M$");
        }
    }),
    BILL_ONE_HUNDRED_MILLION_DOLLARS("currency_100m", 10000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "100M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 100M$");
        }
    }),
    BILL_FIVE_HUNDRED_MILLION_DOLLARS("currency_500m", 50000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "500M$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 500M$");
        }
    }),
    BILL_ONE_BILLION_DOLLARS("currency_1g", 100000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "1G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 1G$");
        }
    }),
    BILL_FIVE_BILLION_DOLLARS("currency_5g", 500000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "5G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 5G$");
        }
    }),
    BILL_TEN_BILLION_DOLLARS("currency_10g", 1000000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "10G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 10G$");
        }
    }),
    BILL_FIFTY_BILLION_DOLLARS("currency_50g", 5000000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "50G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 50G$");
        }
    }),
    BILL_ONE_HUNDRED_BILLION_DOLLARS("currency_100g", 10000000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "100G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 100G$");
        }
    }),
    BILL_FIVE_HUNDRED_BILLION_DOLLARS("currency_500g", 50000000000000L, new HashMap<>() {
        {
            put(Locales.ENGLISH_US, "500G$ Bill");
            put(Locales.FRENCH_FRANCE, "Billet de 500G$");
        }
    });
    
    private final String itemIdentifier;
    private final long centValue;
    private final ResourceLocation textureLoc;
    private final Map<Locales, String> localizedNames;
    private CurrencyItems(String itemIdentifier, long centValue, Map<Locales, String> localizedNames) {
        this.itemIdentifier = itemIdentifier;
        this.centValue = centValue;
        this.textureLoc = ResourceLocation.fromNamespaceAndPath(NlmcCore.MODID, "item/currency/" + itemIdentifier);
        this.localizedNames = localizedNames;
    }
    
    public long getCentValue() {
        return this.centValue;
    }
    
    public String getItemIdentifier() {
        return this.itemIdentifier;
    }
    
    public ResourceLocation getTextureLoc() {
        return this.textureLoc;
    }
    
    public Map<Locales, String> getLocalizedNames() {
        return this.localizedNames;
    }
}
