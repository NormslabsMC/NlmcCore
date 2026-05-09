/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-05 00:32
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistry;

public interface IRegistrar<TRegistrable extends IRegistrable<? extends TRegistrable, ?, ?, ?>>
        extends IManager {
    
    NlmcRegistry<TRegistrable> getNlmcRegistry();
    
    <T extends TRegistrable> T register(T descriptor);
    
}
