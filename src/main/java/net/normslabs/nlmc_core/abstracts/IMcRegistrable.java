/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 03:14
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.IRegistrar;

import java.util.function.Supplier;

/**
 * Interface for registrable descriptor objects that describe internal Minecraft/Forge
 * objects that can be registered in Forge {@link DeferredRegister}.
 * These objects have a namespace, identifier and associated {@link ResourceLocation}.
 * The interface implements the {@link Supplier} interface to allow the descriptors
 * to be used directly with forge/minecraft registries.
 *
 * @param <TNlmcType> NLMC platform object type (example: NlmcFoodItem, NlmcAxeItem, ...)
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 03:54
 */
public interface IMcRegistrable<
        TSelf extends IMcRegistrable<TSelf, TRegistrar, TNlmcType, TMcType>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, TMcType>,
        TNlmcType extends TMcType,
        TMcType>
        extends IRegistrable<TSelf, TRegistrar, TNlmcType> {
    
    /**
     *
     * TODO: complete documentation
     *
     * @return
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-08 17:01
     */
    ResourceKey<TMcType> getRegistryKey();
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> The registration process
     * is handled automatically by the NLMC platform.
     * <p>
     *
     * @param registryKey the registry key for the registrable after internal registration.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-08 17:01
     */
    void setRegistryKey(ResourceKey<TMcType> registryKey);
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> The registration process
     * is handled automatically by the NLMC platform.
     * <p>
     * Custom implementation of the {@link Supplier} interface.
     * This method SHOULD NOT be called in any way before the registration process is complete
     * (during which it is called automatically) because it triggers the finalization of the
     * descriptor and the creation of the underlying Minecraft/Forge object. Any further attempt
     * at customization through the descriptor would fail.
     * Once the descriptor has been registered and the underlying object created, it returns the
     * same underlying object.
     *
     * @return the created underlying Minecraft / Forge object.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:27
     */
    TNlmcType get();
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> The registration process
     * is handled automatically by the NLMC platform.
     * <p>
     *
     * @param registrar the {@link IRegistrar} to register the registrable in.
     * @return the registered {@link IRegistrable}.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 23:27
     */
    @Override
    TSelf registerIn(TRegistrar registrar);
    
}
