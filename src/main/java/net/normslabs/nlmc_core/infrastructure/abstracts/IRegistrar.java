/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 00:32
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryV3;

public interface IRegistrar<TMcObject, TRegistrable extends IRegistrable<? extends TMcObject>> {
    
    NlmcRegistrar getNlmcRegistrar();
    
    NlmcRegistryV3<TMcObject, TRegistrable> getNlmcRegistry();
    
    <T extends TRegistrable> T register(T descriptor);
    
}
