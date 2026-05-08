/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 00:32
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.registries.DeferredRegister;
import net.normslabs.nlmc_core.abstracts.IRegistrable;

public interface IDeferredRegistrar<TMcObject, TRegistrable extends IRegistrable<? extends TMcObject>>
        extends IRegistrar<TMcObject, TRegistrable> {
    
    DeferredRegister<TMcObject> getDeferredRegister();
    
    ResourceKey<Registry<TMcObject>> getRegistryKey();
    
}
