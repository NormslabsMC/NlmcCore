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
import net.normslabs.nlmc_core.infrastructure.builders.IBaseBuilder;

public abstract class AbstractMcObjectProviderRegistrar<
        TMcObject,
        TNlmcDescriptor extends IDescriptor<TNlmcDescriptor, TDescriptorBuilder, TMcObject>,
        TDescriptorBuilder extends IBaseBuilder<TDescriptorBuilder, TNlmcDescriptor>,
        TInternalProvider extends DataProvider>
        extends AbstractMcObjectRegistrarV2<TMcObject, TNlmcDescriptor, TDescriptorBuilder>
        implements IDatagenProvider<TInternalProvider> {
    
    protected TInternalProvider internalProvider;
    
    protected AbstractMcObjectProviderRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
        this.modRegistrar.getModEventBus().addListener(this::onDatagen);
    }
    
    public NlmcRegistrar getNlmcRegistrar() {
        return this.modRegistrar;
    }
    
    public abstract void onDatagen(final GatherDataEvent event);
    
}
