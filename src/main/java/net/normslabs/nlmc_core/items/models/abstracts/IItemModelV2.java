/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:11
 */

package net.normslabs.nlmc_core.items.models.abstracts;


import net.normslabs.nlmc_core.abstracts.IBuilderV3;
import net.normslabs.nlmc_core.abstracts.IModelV2;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;

public interface IItemModelV2<
        TSelf extends IItemModelV2<TSelf, TBuilder>,
        TBuilder extends IBuilderV3<TBuilder, TSelf>>
        extends IModelV2<TSelf, TBuilder, NlmcItemColor> {
    
    NlmcItemColor getColorDescriptor();

}
