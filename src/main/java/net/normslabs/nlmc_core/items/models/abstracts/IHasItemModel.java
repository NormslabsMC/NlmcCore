/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:47
 */

package net.normslabs.nlmc_core.items.models.abstracts;


import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.abstracts.IHasModel;
import net.normslabs.nlmc_core.abstracts.IModel;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;

/**
 * Interface for item descriptors that own a model
 *
 * @param <TModel>
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 02:52
 */
public interface IHasItemModel<
        TModel extends IModel<TModel, TModelBuilder, NlmcItemColor>,
        TModelBuilder extends IBuilder<TModelBuilder, TModel>>
        extends IHasModel<TModel, TModelBuilder, NlmcItemColor> {
    
}
