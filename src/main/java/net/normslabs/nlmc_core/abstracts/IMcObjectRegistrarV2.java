/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:54
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryV2;
import net.normslabs.nlmc_core.infrastructure.builders.IBaseBuilder;

import java.util.Map;

/**
 * Interface for the NLMC platform registrar objects that are used to handle
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
 * @since 2026-05-04 04:05
 */
public interface IMcObjectRegistrarV2<
        TMcObject,
        TNlmcDescriptor extends IDescriptor<TNlmcDescriptor, TDescriptorBuilder, TMcObject>,
        TDescriptorBuilder extends IBaseBuilder<TDescriptorBuilder, TNlmcDescriptor>> {
    
    /**
     * Returns the parent mod-wide {@link NlmcRegistrar} object that holds all the individual object registrars.
     *
     * @return the parent global registrar object.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 04:08
     */
    NlmcRegistrar getNlmcRegistrar();
    
    /**
     * Registers a descriptor object for processing.
     *
     * @param descriptor the descriptor object to process.
     * @return A forge {@link RegistryObject} for the registered object
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 04:09
     */
    RegistryObject<TMcObject> registerDescriptor(TNlmcDescriptor descriptor);
    
    /**
     * Returns the map of all descriptor objects currently registered in the registrar.
     *
     * @return the map of all descriptor objects currently registered in the registrar.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 04:11
     */
    Map<ResourceLocation, TNlmcDescriptor> getRegisteredDescriptors();
    
    /**
     * Returns the internal {@link DeferredRegister} used to register the descriptors
     * in the forge/minecraft system. This is used internally by the NLMC platform.
     *
     * @return the registrar's deferred register.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 04:11
     */
    DeferredRegister<TMcObject> getDeferredRegister();
    
    /**
     * Returns the internal {@link NlmcRegistryV2} used to hold the registered
     * descriptors in the registrar.
     *
     * @return the registrar's NLMC registry.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 04:13
     */
    NlmcRegistryV2<TMcObject, TNlmcDescriptor, TDescriptorBuilder> getNlmcRegistry();
    
    void onRegister(final RegisterEvent event);
    
}
