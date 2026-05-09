/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:40
 */

package net.normslabs.nlmc_core.creativetabs;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.abstracts.AbstractMcObjectRegistrar;
import net.normslabs.nlmc_core.creativetabs.abstracts.ICreativeTabDescriptor;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.AbstractDeferredRegistrar;

public class CreativeTabsRegistrar extends AbstractDeferredRegistrar<CreativeTabDescriptor, CreativeModeTab> {
    
    public CreativeTabsRegistrar(NlmcRegistrar nlmcRegistrar) {
        super(nlmcRegistrar, Registries.CREATIVE_MODE_TAB);
    }
    
    protected void onDatagen(final GatherDataEvent event) {
    
    }
    
}
