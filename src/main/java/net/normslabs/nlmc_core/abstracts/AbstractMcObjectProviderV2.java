/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryV2;
import net.normslabs.nlmc_core.infrastructure.builders.IBaseBuilder;

/**
 * Abstract class for the NLMC platform registrar objects that are used to handle
 * minecraft/forge internal objects through object descriptors.
 * Object descriptors are buildable objects configured by modders that represent
 * minecraft or forge internal objects (like items, blocks, fluids, ...) and that are
 * registered in their corresponding registrar when configured ("built"). The registrars
 * interface with the Forge and Minecraft systems to do the real registration, data generation
 * and other required tasks to make these described objects actually usable in-game.
 *
 * @param <TMcObject> The type of the internal Minecraft/Forge object handled by the registrar
 * @param <TNlmcDescriptor> The type of the corresponding object descriptors used by the registrar
 * @param <TDescriptorBuilder> The type of the builder used to configure the descriptors
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 04:31
 */
public abstract class AbstractMcObjectProviderV2<
        TMcObject,
        TNlmcDescriptor extends IDescriptor<TNlmcDescriptor, TDescriptorBuilder, TMcObject>,
        TDescriptorBuilder extends IBuilderV3<TDescriptorBuilder, TNlmcDescriptor>>
        implements IMcObjectRegistrarV2<TMcObject, TNlmcDescriptor, TDescriptorBuilder> {
    
    protected final NlmcRegistrar modRegistrar;
    DeferredRegister<TMcObject> deferredRegister;
    protected final NlmcRegistryV2<TMcObject, TNlmcDescriptor, TDescriptorBuilder> nlmcRegistry;
    
    protected AbstractMcObjectProviderV2(NlmcRegistrar modRegistrar) {
        this.modRegistrar = modRegistrar;
        this.nlmcRegistry = new NlmcRegistryV2<>();
        this.modRegistrar.getModEventBus().addListener(this::onRegister);
    }
    
    public NlmcRegistrar getNlmcRegistrar() {
        return this.modRegistrar;
    }
    
    public DeferredRegister<TMcObject> getDeferredRegister() {
        return this.deferredRegister;
    }
    
    public NlmcRegistryV2<TMcObject, TNlmcDescriptor, TDescriptorBuilder> getNlmcRegistry() {
        return this.nlmcRegistry;
    }
    
    public abstract void onRegister(final RegisterEvent event);
    
}
