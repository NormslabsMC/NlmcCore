/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:53
 */

package net.normslabs.nlmc_core.fluids;


import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractRegistrar;

public class FluidRegistrar extends AbstractRegistrar {
    
    public FluidRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
    }
    
    @Override
    public void onRegister(RegisterEvent event) {
    
    }
    
    @Override
    public void onDatagen(GatherDataEvent event) {
    
    }
}
