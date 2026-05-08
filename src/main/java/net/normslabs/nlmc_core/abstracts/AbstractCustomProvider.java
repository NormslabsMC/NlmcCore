/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public abstract class AbstractCustomProvider<
        TInternalProvider extends DataProvider> {
    
    protected TInternalProvider internalProvider;
    protected final NlmcRegistrar modRegistrar;
    
    protected AbstractCustomProvider(NlmcRegistrar modRegistrar) {
        this.modRegistrar = modRegistrar;
        this.modRegistrar.getModEventBus().addListener(this::onDatagen);
    }
    
    public TInternalProvider getInternalProvider() {
        return this.internalProvider;
    }
    
    public NlmcRegistrar getNlmcRegistrar() {
        return this.modRegistrar;
    }
    
    protected abstract void onDatagen(final GatherDataEvent event);
    
}
