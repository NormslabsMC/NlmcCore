/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 09:21
 */

package net.normslabs.nlmc_core.blocks.abstracts;


import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.normslabs.nlmc_core.abstracts.*;
import net.normslabs.nlmc_core.blocks.models.abstracts.IBlockModel;
import net.normslabs.nlmc_core.blocks.models.abstracts.IHasBlockModel;
import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.items.abstracts.IItemDescriptor;
import net.normslabs.nlmc_core.items.models.abstracts.IHasItemModel;
import net.normslabs.nlmc_core.items.models.abstracts.IItemModel;

public interface IBlockDescriptor<
        TSelf extends IBlockDescriptor<TSelf, TBuilder, TModel, TModelBuilder, TNlmcType, TRegistrar>,
        TBuilder extends IBuilder<TBuilder, TSelf>,
        TModel extends IBlockModel<TModel, TModelBuilder>,
        TModelBuilder extends IBuilder<TModelBuilder, TModel>,
        TNlmcType extends Block,
        TRegistrar extends IDeferredRegistrar<? super TSelf, Block>>
        extends IDescriptor<TSelf, TBuilder>,
        IMcRegistrable<TSelf, TRegistrar, TNlmcType, Block>,
        IHasBlockModel<TModel, TModelBuilder>,
        IHasDisplayedName,
        IHasTooltips,
        ITaggable<Block>,
        IBuildable<TSelf, TBuilder> {
    
    BlockBehaviour.Properties getMcBlockProperties();
    
}
