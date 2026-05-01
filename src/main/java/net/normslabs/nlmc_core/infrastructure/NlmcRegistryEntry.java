/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 02:56
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.abstracts.IRegistrable;


public class NlmcRegistryEntry<TMcObject, TNlmcDescriptor extends IRegistrable<TMcObject>> {
    
    private final TNlmcDescriptor descriptor;
    private RegistryObject<TMcObject> registeredObject;
    
    public NlmcRegistryEntry(TNlmcDescriptor supplier) {
        this.descriptor = supplier;
    }
    
    public TNlmcDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    public RegistryObject<TMcObject> getRegisteredObject() {
        return this.registeredObject;
    }
    
    public void setRegisteredObject(RegistryObject<TMcObject> registeredObject) {
        this.registeredObject = registeredObject;
    }
}
