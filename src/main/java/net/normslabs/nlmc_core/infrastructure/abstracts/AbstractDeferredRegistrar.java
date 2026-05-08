/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryV3;

public abstract class AbstractDeferredRegistrar<TMcObject, TRegistrable extends IRegistrable<? extends TMcObject>>
        extends AbstractRegistrar<TMcObject, TRegistrable> implements IDeferredRegistrar<TMcObject, TRegistrable> {
    
    private final ResourceKey<Registry<TMcObject>> registryKey;
    protected DeferredRegister<TMcObject> deferredRegister;
    
    protected AbstractDeferredRegistrar(NlmcRegistrar modRegistrar, ResourceKey<Registry<TMcObject>> registryKey) {
        super(modRegistrar);
        this.registryKey = registryKey;
        this.deferredRegister = DeferredRegister.create(registryKey, modRegistrar.getModNamespace());
        this.deferredRegister.register(modRegistrar.getModEventBus());
    }
    
    @Override
    public ResourceKey<Registry<TMcObject>> getRegistryKey() {
        return this.registryKey;
    }
    
    @Override
    public DeferredRegister<TMcObject> getDeferredRegister() {
        return this.deferredRegister;
    }
    
    @Override
    public <T extends TRegistrable> T  register(T descriptor) {
        super.register(descriptor);
        this.deferredRegister.register(descriptor.getIdentifier(), descriptor);
        return descriptor;
    }
    
}
