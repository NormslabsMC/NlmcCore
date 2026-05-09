/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 00:11
 */

package net.normslabs.nlmc_core.blocks.models.abstracts;


import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.abstracts.IModel;
import net.normslabs.nlmc_core.rendering.NlmcBlockColor;

public interface IBlockModel<
        TSelf extends IBlockModel<TSelf, TBuilder>,
        TBuilder extends IBuilder<TBuilder, TSelf>>
        extends IModel<TSelf, TBuilder, NlmcBlockColor> {
    
    NlmcBlockColor getColorDescriptor();

}
