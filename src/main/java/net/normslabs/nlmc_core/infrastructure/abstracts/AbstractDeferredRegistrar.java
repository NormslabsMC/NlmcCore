/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.abstracts.IMcRegistrable;
import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public abstract class AbstractDeferredRegistrar<
        TRegistrable extends IMcRegistrable<? extends TRegistrable, ?, ? extends TMcType, TMcType>,
        TMcType>
        extends AbstractRegistrar<TRegistrable>
        implements IDeferredRegistrar<TRegistrable, TMcType> {
    
    private final ResourceKey<Registry<TMcType>> registryKey;
    protected DeferredRegister<TMcType> deferredRegister;
    
    protected AbstractDeferredRegistrar(NlmcRegistrar modRegistrar, ResourceKey<Registry<TMcType>> registryKey) {
        super(modRegistrar);
        this.registryKey = registryKey;
        this.deferredRegister = DeferredRegister.create(registryKey, modRegistrar.getModNamespace());
    }
    
    @Override
    public void initialize(IEventBus modEventBus, IEventBus forgeEventBus) {
        this.deferredRegister.register(modEventBus);
    }
    
    @Override
    public ResourceKey<Registry<TMcType>> getRegistryKey() {
        return this.registryKey;
    }
    
    @Override
    public DeferredRegister<TMcType> getDeferredRegister() {
        return this.deferredRegister;
    }
    
    @Override
    public <T extends TRegistrable> T  register(T descriptor) {
        RegistryObject<TMcType> registryObject = this.deferredRegister.register(descriptor.getIdentifier(), descriptor);
        descriptor.setRegistryKey(registryObject.getKey());
        return super.register(descriptor);
    }
    
}
