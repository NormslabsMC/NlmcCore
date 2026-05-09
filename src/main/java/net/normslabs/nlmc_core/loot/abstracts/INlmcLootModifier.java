/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 14:04
 */

package net.normslabs.nlmc_core.loot.abstracts;


import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;

import java.util.function.Supplier;

public interface INlmcLootModifier<TSelf> {
    
    String getCodecName();
    
    Supplier<Codec<TSelf>> getCodecSupplier();
    
}
