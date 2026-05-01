/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 09:21
 */

package net.normslabs.nlmc_core.blocks.abstracts;


import net.minecraft.world.level.block.Block;
import net.normslabs.nlmc_core.abstracts.IRegistrable;

public interface IBlockDescriptor extends IRegistrable<Block>, IHasBlockModelDescriptor {
}
