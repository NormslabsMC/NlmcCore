/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:47
 */

package net.normslabs.nlmc_core.abstracts;


/**
 * Interface for object descriptors that own a model (items / blocks)
 *
 * @param <TModel>
 * @param <TObjectColor>
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 02:52
 */
public interface IHasModelV2<
        TModel extends IModelV2<TModel, TModelBuilder, TObjectColor>,
        TModelBuilder extends IBuilderV3<TModelBuilder, TModel>,
        TObjectColor extends IObjectColor> {
    
    /**
     * Returns the model descriptor of the owning object
     *
     * @return the model descriptor
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 02:52
     */
    public TModel getModelDescriptor();
    
    /**
     * Sets the model descriptor of the owning object.
     *
     * @param modelDescriptor the model descriptor object to set
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-04 03:25
     */
    void setModelDescriptor(TModel modelDescriptor);
    
}
