/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 16:32
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.minecraftforge.eventbus.api.IEventBus;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public interface IManager {
    
    NlmcRegistrar getNlmcRegistrar();
    
    void initialize(IEventBus modEventBus, IEventBus forgeEventBus);
    
}
