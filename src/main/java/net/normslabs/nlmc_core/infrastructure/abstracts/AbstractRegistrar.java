/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:25
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistry;

public abstract class AbstractRegistrar<TRegistrable extends IRegistrable<? extends TRegistrable, ?, ?, ?>>
        extends AbstractManager
        implements IRegistrar<TRegistrable> {
    
    protected NlmcRegistry<TRegistrable> nlmcRegistry;
    
    protected AbstractRegistrar(NlmcRegistrar nlmcRegistrar) {
        super(nlmcRegistrar);
        this.nlmcRegistry = new NlmcRegistry<>();
    }
    
    @Override
    public NlmcRegistry<TRegistrable> getNlmcRegistry() {
        return this.nlmcRegistry;
    }
    
    @Override
    public <T extends TRegistrable> T register(T descriptor) {
        if (descriptor.isRegistered()) {
            throw new IllegalStateException("Cannot register already registered descriptor: ["+descriptor.getClass().getSimpleName()+"] " + descriptor.getIdentifier());
        }
        this.nlmcRegistry.register(descriptor);
        descriptor.setIsRegistered(true);
        return descriptor;
    }
    
}
