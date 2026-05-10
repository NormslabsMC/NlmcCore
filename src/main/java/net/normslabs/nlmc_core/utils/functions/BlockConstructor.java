/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-25 22:47
 */

package net.normslabs.nlmc_core.utils.functions;


import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.blocks.BlockDescriptor;

@FunctionalInterface
public interface BlockConstructor<TBlock extends Block, TBlockDescriptor extends BlockDescriptor<?, ?, ?, ?, TBlock>> {
    TBlock create(TBlockDescriptor arg1);
}
