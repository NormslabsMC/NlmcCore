/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.creativetabs.abstracts.ICreativeTabDescriptor;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistry;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryEntry;
import net.normslabs.nlmc_core.items.abstracts.IItemDescriptor;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMcObjectRegistrar<TMcObject, TDescriptor extends IRegistrable<TMcObject>> extends AbstractRegistrar {
    protected final DeferredRegister<TMcObject> deferredRegister;
    protected final NlmcRegistry<TMcObject, TDescriptor> nlmcRegistry;
    
    protected AbstractMcObjectRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
        this.deferredRegister = DeferredRegister.create(this.getRegistryKey(), modRegistrar.getModNamespace());
        this.deferredRegister.register(modRegistrar.getModEventBus());
        this.nlmcRegistry = new NlmcRegistry<>();
    }
    
    protected abstract ResourceKey<Registry<TMcObject>> getRegistryKey();
    
    public DeferredRegister<TMcObject> getDeferredRegister() {
        return this.deferredRegister;
    }
    
    public NlmcRegistry<TMcObject, TDescriptor> getNlmcRegistry() {
        return this.nlmcRegistry;
    }
    
    public NlmcRegistryEntry<TMcObject, TDescriptor> getRegisteredObject(ResourceLocation itemResourceLocation) {
        return this.nlmcRegistry.get(itemResourceLocation);
    }
    
    public List<NlmcRegistryEntry<TMcObject, TDescriptor>> getRegisteredObjects() {
        return new ArrayList<>(this.nlmcRegistry.values());
    }
    
    public RegistryObject<TMcObject> registerObject(TDescriptor descriptor) {
        NlmcRegistryEntry<TMcObject, TDescriptor> registryEntry = this.nlmcRegistry.register(descriptor);
        this.modRegistrar.TRANSLATIONS.registerTranslations(descriptor.getTranslations());
        RegistryObject<TMcObject> registryObject = descriptor.registerIn(this.deferredRegister);
        registryEntry.setRegisteredObject(registryObject);
        return registryObject;
    }
}
