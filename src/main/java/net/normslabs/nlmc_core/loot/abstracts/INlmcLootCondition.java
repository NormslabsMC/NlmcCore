/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 20:00
 */

package net.normslabs.nlmc_core.loot.abstracts;


import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.List;

public interface INlmcLootCondition {
    
    List<LootItemCondition> asMcConditionList();
    
}
