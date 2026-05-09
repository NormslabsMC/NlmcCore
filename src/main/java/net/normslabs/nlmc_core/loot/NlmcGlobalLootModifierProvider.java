/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 13:33
 */

package net.normslabs.nlmc_core.loot;


import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class NlmcGlobalLootModifierProvider extends GlobalLootModifierProvider {
    
    private final LootModifierRegistrar lootModifierRegistrar;
    public NlmcGlobalLootModifierProvider(LootModifierRegistrar lootModifierRegistrar, PackOutput output) {
        super(output, lootModifierRegistrar.getNlmcRegistrar().getModNamespace());
        this.lootModifierRegistrar = lootModifierRegistrar;
    }
    
    @Override
    protected void start() {
        this.lootModifierRegistrar.getNlmcRegistry()
                                  .values()
                                  .forEach(
                                          lootModifierDescriptor -> this.add(
                                                  lootModifierDescriptor.getIdentifier(),
                                                  lootModifierDescriptor.get()));
    }
}
