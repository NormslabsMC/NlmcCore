/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 03:14
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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
public interface IRegistrable<TNlmcType>
        extends Supplier<TNlmcType> {
    
    /**
     * Returns the registrable's registration state:
     * true if it has already been registered, false if not.
     *
     * @return the registrable's registration state.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 22:27
     */
    boolean isRegistered();
    
    /**
     * <h2>INTERNAL METHOD</h2>
     * <strong>DO NOT CALL THIS METHOD YOURSELF.</strong> The registration process
     * is handled automatically by the NLMC platform.
     * <p>
     * Sets the registrable's registration state.
     *
     * @param isRegistered the registrable's registration state.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 22:26
     */
    void setIsRegistered(boolean isRegistered);
    
    /**
     * Returns the namespace of the object. This is usually the mod's own ID.
     *
     * @return the namespace of the object
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:21
     */
    String getNamespace();
    
    /**
     * Returns the identifier or identifying path of the object.
     *
     * @return the identifier or path of the object
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:22
     */
    String getIdentifier();
    
    /**
     * Returns the {@link ResourceLocation} of the object (based on its namespace
     * and identifier/path).
     *
     * @return the resource location of the object
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:23
     */
    ResourceLocation getResourceLocation();
    
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
     * @param forgeRegistry the forge {@link DeferredRegister} to register the registrable in.
     * @return the forge {@link RegistryObject} returned by the registration.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 23:27
     */
    RegistryObject<TNlmcType> registerIn(DeferredRegister<? super TNlmcType> forgeRegistry);
    
}
