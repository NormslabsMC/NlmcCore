/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 15:45
 */

package net.normslabs.nlmc_core.loot;


import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.LootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcCustomAddLootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcCustomRemoveLootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcCustomReplaceLootModifier;

import java.util.function.Supplier;

public enum LootModifierTypes {
    ADD_ITEM(NlmcCustomAddLootModifier.CODEC_NAME, NlmcCustomAddLootModifier.CODEC),
    REMOVE_ITEM(NlmcCustomRemoveLootModifier.CODEC_NAME, NlmcCustomRemoveLootModifier.CODEC),
    REPLACE_ITEM(NlmcCustomReplaceLootModifier.CODEC_NAME, NlmcCustomReplaceLootModifier.CODEC);
    
    private final String identifier;
    private final Supplier<? extends Codec<? extends LootModifier>> codecSupplier;
    private LootModifierTypes(String identifier, Supplier<? extends Codec<? extends LootModifier>> codecSupplier) {
        this.identifier = identifier;
        this.codecSupplier = codecSupplier;
    }
    
    public Supplier<? extends Codec<? extends LootModifier>> getCodecSupplier() {
        return this.codecSupplier;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
}
