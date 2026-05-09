/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 16:33
 */

package net.normslabs.nlmc_core.infrastructure.abstracts;


import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

public abstract class AbstractManager implements IManager {
    
    protected final NlmcRegistrar nlmcRegistrar;
    
    protected AbstractManager(NlmcRegistrar nlmcRegistrar) {
        this.nlmcRegistrar = nlmcRegistrar;
        nlmcRegistrar.registerManager(this);
    }
    
    @Override
    public NlmcRegistrar getNlmcRegistrar() {
        return this.nlmcRegistrar;
    }
}
