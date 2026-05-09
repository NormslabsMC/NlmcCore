/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 17:53
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceKey;
import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;

import java.util.function.Function;

public abstract class AbstractMcRegistrable<
        TSelf extends AbstractMcRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>,
        TBuilder extends Builder<TBuilder, TSelf>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, TMcType>,
        TNlmcType extends TMcType,
        TMcType>
        extends AbstractRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType>
        implements IMcRegistrable<TSelf, TRegistrar, TNlmcType, TMcType> {
    
    
    protected ResourceKey<TMcType> registeredResourceKey;
    
    protected AbstractMcRegistrable(String objectNamespace, String objectIdentifier,
                                  Function<TSelf, TNlmcType> objectCreatorFunction) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction);
    }
    
    @Override
    public ResourceKey<TMcType> getRegistryKey() {
        return this.registeredResourceKey;
    }
    
    @Override
    public void setRegistryKey(ResourceKey<TMcType> registryKey) {
        this.registeredResourceKey = registryKey;
    }
}
