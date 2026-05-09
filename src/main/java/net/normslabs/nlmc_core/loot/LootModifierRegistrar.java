/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 13:24
 */

package net.normslabs.nlmc_core.loot;


import com.mojang.serialization.Codec;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractRegistrar;

import java.util.ArrayList;
import java.util.List;

public class LootModifierRegistrar extends AbstractRegistrar<LootModifierDescriptor<? extends LootModifier>, LootModifier> {
    
    private static final List<String> LOOT_MODIFIER_SERIALIZERS = new ArrayList<>();
    private final DeferredRegister<Codec<? extends IGlobalLootModifier>> lootSerializerRegister;
    
    public LootModifierRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
        this.lootSerializerRegister = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS,
                                                              modRegistrar.getModNamespace());
    }
    
    @Override
    public void initialize(IEventBus modEventBus, IEventBus forgeEventBus) {
        this.lootSerializerRegister.register(modEventBus);
        modEventBus.addListener(this::onDatagen);
    }
    
    @Override
    public <T extends LootModifierDescriptor<? extends LootModifier>> T register(T descriptor) {
        if (!LOOT_MODIFIER_SERIALIZERS.contains(descriptor.getLootModifierType().getIdentifier())) {
            LOOT_MODIFIER_SERIALIZERS.add(descriptor.getLootModifierType().getIdentifier());
            this.lootSerializerRegister.register(descriptor.getLootModifierType().getIdentifier(),
                                                 descriptor.getLootModifierType().getCodecSupplier());
        }
        return super.register(descriptor);
    }
    
    protected void onDatagen(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        gen.addProvider(event.includeServer(), new NlmcGlobalLootModifierProvider(this, gen.getPackOutput()));
    }
}
