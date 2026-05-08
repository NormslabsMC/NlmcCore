/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 02:56
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraftforge.registries.RegistryObject;


public class NlmcRegistryEntryV2<TNlmcObject, TNlmcDescriptor> {
    
    private final TNlmcDescriptor descriptor;
    private RegistryObject<TNlmcObject> registeredObject;
    
    public NlmcRegistryEntryV2(TNlmcDescriptor supplier) {
        this.descriptor = supplier;
    }
    
    public TNlmcDescriptor getDescriptor() {
        return this.descriptor;
    }
    
    public RegistryObject<TNlmcObject> getRegisteredObject() {
        return this.registeredObject;
    }
    
    public void setRegisteredObject(RegistryObject<TNlmcObject> registeredObject) {
        this.registeredObject = registeredObject;
    }
}
