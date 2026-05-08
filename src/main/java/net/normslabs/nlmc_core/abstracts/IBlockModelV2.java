/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:11
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.rendering.NlmcBlockColor;

public interface IBlockModelV2<
        TSelf extends IBlockModelV2<TSelf, TBuilder>,
        TBuilder extends IBuilderV3<TBuilder, TSelf>>
        extends IModelV2<TSelf, TBuilder, NlmcBlockColor> {
    
    NlmcBlockColor getColorDescriptor();

}
