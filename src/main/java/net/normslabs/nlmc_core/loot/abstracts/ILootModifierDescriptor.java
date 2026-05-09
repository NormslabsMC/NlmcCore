/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 13:40
 */

package net.normslabs.nlmc_core.loot.abstracts;


import net.minecraftforge.common.loot.LootModifier;
import net.normslabs.nlmc_core.abstracts.*;
import net.normslabs.nlmc_core.loot.LootModifierRegistrar;

public interface ILootModifierDescriptor<
        TSelf extends ILootModifierDescriptor<TSelf, TBuilder, TNlmcType>,
        TBuilder extends IBuilder<TBuilder, TSelf>,
        TNlmcType extends LootModifier>
        extends IDescriptor<TSelf, TBuilder>,
        IRegistrable<TSelf, LootModifierRegistrar, TNlmcType, LootModifier>,
        IBuildable<TSelf, TBuilder> {
}
