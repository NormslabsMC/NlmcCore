/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public abstract class AbstractRegistrar implements IRegistrar {
    
    protected final NlmcRegistrar modRegistrar;
    
    protected AbstractRegistrar(NlmcRegistrar modRegistrar) {
        this.modRegistrar = modRegistrar;
        this.modRegistrar.getModEventBus().addListener(this::onRegister);
        this.modRegistrar.getModEventBus().addListener(this::onDatagen);
    }
    
    public NlmcRegistrar getModRegistrar() {
        return this.modRegistrar;
    }
    
    protected abstract void onRegister(final RegisterEvent event);
    
    protected abstract void onDatagen(final GatherDataEvent event);
    
}
