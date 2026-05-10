/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 05:09
 */

package net.normslabs.nlmc_core;


import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.contents.CurrencyItems;

import java.util.HashMap;
import java.util.Map;

public class NlmcCurrencies {
    
    private static final String CURRENCY_PARTIAL_TEXTURE_PATH = "item/currency/";
    private static final Map<String, Long> CURRENCY_MAP = new HashMap<>() {
        {
            put("currency_1c", 1L);
            put("currency_10c", 10L);
            put("currency_50c", 50L);
            put("currency_1", 100L);
            put("currency_5", 500L);
            put("currency_10", 1000L);
            put("currency_50", 5000L);
            put("currency_100", 10000L);
            put("currency_500", 50000L);
            put("currency_1k", 100000L);
            put("currency_5k", 500000L);
            put("currency_10k", 1000000L);
            put("currency_50k", 5000000L);
            put("currency_100k", 10000000L);
            put("currency_500k", 50000000L);
            put("currency_1m", 100000000L);
            put("currency_5m", 500000000L);
            put("currency_10m", 1000000000L);
            put("currency_50m", 5000000000L);
            put("currency_100m", 10000000000L);
            put("currency_500m", 50000000000L);
            put("currency_1g", 100000000000L);
            put("currency_5g", 500000000000L);
            put("currency_10g", 1000000000000L);
            put("currency_50g", 5000000000000L);
            put("currency_100g", 10000000000000L);
            put("currency_500g", 50000000000000L);
        }
    };
    
    public static void register(NlmcRegistrar registrar) {
        
        for (CurrencyItems currency : CurrencyItems.values()) {
            var itemBuilder = registrar.ITEMS.buildCustomGenericItem(currency.getItemIdentifier())
                           .setMaxStackSize(100)
                           .setFireResistant(false)
                                         .configureModel((modelBuilder)
                                                                 -> modelBuilder.addTextureLayer(currency.getTextureLoc())
                                                                                .build());
            currency.getLocalizedNames().forEach(itemBuilder::displayName);
        }
    }
}
