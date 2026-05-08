/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 03:09
 */

package net.normslabs.nlmc_core.items.tiers;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.ArrayList;
import java.util.List;

public class ToolTiersRegistrar extends AbstractRegistrar {
    private final List<ItemTierDescriptor> tierDescriptors;
    
    public ToolTiersRegistrar(NlmcRegistrar parentRegistrar) {
        super(parentRegistrar);
        this.tierDescriptors = new ArrayList<>();
    }
    
    @Override
    public void onRegister(final RegisterEvent event) {
        this.tierDescriptors.forEach((tierDescriptor) -> {
            TierSortingRegistry.registerTier(tierDescriptor.buildTier(),
                                             ResourceLocation.fromNamespaceAndPath(
                                                     this.getNlmcRegistrar().getModNamespace(),
                                                     tierDescriptor.getTierName()),
                                             tierDescriptor.getLowerTiers(),
                                             tierDescriptor.getHigherTiers());
        });
    }
    
    @Override
    public void onDatagen(GatherDataEvent event) {
    
    }
    
    public Tier registerItemTier(ItemTierDescriptor descriptor) {
        this.tierDescriptors.add(descriptor);
        return descriptor.buildTier();
    }
}
