/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 17:05
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.infrastructure.abstracts.IRegistrar;

import java.util.function.Function;

public abstract class AbstractRegistrable<
        TSelf extends AbstractRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType>,
        TBuilder extends Builder<TBuilder, TSelf>,
        TRegistrar extends IRegistrar<? super TSelf>,
        TNlmcType>
        extends AbstractDescriptor<TSelf, TBuilder>
        implements IRegistrable<TSelf, TRegistrar, TNlmcType> {
    
    
    protected boolean isRegistered;
    protected final String objectNamespace;
    protected final String objectIdentifier;
    protected final ResourceLocation objectResourceLocation;
    protected final Function<TSelf, TNlmcType> objectCreatorFunction;
    protected TNlmcType createdObject;
    
    protected AbstractRegistrable(String objectNamespace, String objectIdentifier,
                                  Function<TSelf, TNlmcType> objectCreatorFunction) {
        this.objectNamespace = objectNamespace;
        this.objectIdentifier = objectIdentifier;
        this.objectResourceLocation = ResourceLocation.fromNamespaceAndPath(objectNamespace, objectIdentifier);
        this.objectCreatorFunction = objectCreatorFunction;
    }
    
    @Override
    public boolean isRegistered() {
        return this.isRegistered;
    }
    
    @Override
    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
    
    @Override
    public String getNamespace() {
        return this.objectNamespace;
    }
    
    @Override
    public String getIdentifier() {
        return this.objectIdentifier;
    }
    
    @Override
    public ResourceLocation getResourceLocation() {
        return this.objectResourceLocation;
    }
    
    @Override
    public TNlmcType get() {
        if (!this.isBuilt) {
            throw new IllegalStateException("Cannot create MC object ["+this.objectNamespace+":"+this.objectIdentifier+"] from descriptor before it is built.");
        }
        if (this.createdObject == null) {
            this.validateForBuild();
            this.createdObject = this.objectCreatorFunction.apply(this.self());
        }
        return this.createdObject;
    }
    
    @Override
    public TSelf registerIn(TRegistrar registrar) {
        registrar.register(this.self());
        this.setIsRegistered(true);
        return this.self();
    }
}
