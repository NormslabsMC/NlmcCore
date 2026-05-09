/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 15:45
 */

package net.normslabs.nlmc_core.loot;


import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.LootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcAddLootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcRemoveLootModifier;
import net.normslabs.nlmc_core.loot.modifiers.NlmcReplaceItemModifier;

import java.util.function.Supplier;

public enum LootModifierTypes {
    ADD_ITEM(NlmcAddLootModifier.CODEC_NAME, NlmcAddLootModifier.CODEC),
    REMOVE_ITEM(NlmcRemoveLootModifier.CODEC_NAME, NlmcRemoveLootModifier.CODEC),
    REPLACE_ITEM(NlmcReplaceItemModifier.CODEC_NAME, NlmcReplaceItemModifier.CODEC);
    
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
