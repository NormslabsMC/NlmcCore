/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:48
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.blocks.BlockRegistrar;
import net.normslabs.nlmc_core.creativetabs.CreativeTabsRegistrar;
import net.normslabs.nlmc_core.fluids.FluidRegistrar;
import net.normslabs.nlmc_core.items.ItemRegistrar;
import net.normslabs.nlmc_core.items.tiers.ToolTiersRegistrar;
import net.normslabs.nlmc_core.tags.NlmcBlockTagsRegistrar;
import net.normslabs.nlmc_core.tags.NlmcFluidTagsRegistrar;
import net.normslabs.nlmc_core.tags.NlmcItemTagsRegistrar;
import net.normslabs.nlmc_core.translations.NlmcTranslationRegistrar;

public class NlmcRegistrar {
    
    private final String modNamespace;
    private final IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
    private final IEventBus modEventBus;
    public final NlmcBlockTagsRegistrar BLOCK_TAGS;
    public final NlmcItemTagsRegistrar ITEM_TAGS;
    public final NlmcFluidTagsRegistrar FLUID_TAGS;
    public final NlmcTranslationRegistrar TRANSLATIONS;
    public final ToolTiersRegistrar TOOL_TIERS;
    public final CreativeTabsRegistrar CREATIVE_TABS;
    public final BlockRegistrar BLOCKS;
    public final ItemRegistrar ITEMS;
    public final FluidRegistrar FLUIDS;
    
    public NlmcRegistrar(String modNamespace, IEventBus modEventBus) {
        this.modNamespace = modNamespace;
        this.modEventBus = modEventBus;
        
        this.BLOCK_TAGS = new NlmcBlockTagsRegistrar(this);
        this.TRANSLATIONS = new NlmcTranslationRegistrar(this);
        this.TOOL_TIERS = new ToolTiersRegistrar(this);
        this.CREATIVE_TABS = new CreativeTabsRegistrar(this);
        this.BLOCKS = new BlockRegistrar(this);
        this.ITEMS = new ItemRegistrar(this);
        this.FLUIDS = new FluidRegistrar(this);
        
        this.modEventBus.addListener(this::onRegister);
        this.modEventBus.addListener(this::onCreativeModeTabContentBuild);
        this.modEventBus.addListener(this::onRegisterBlockColorHandlers);
        this.modEventBus.addListener(this::onRegisterItemColorHandlers);
        this.modEventBus.addListener(this::onDatagen);
    }
    
    public String getModNamespace() {
        return this.modNamespace;
    }
    
    public IEventBus getModEventBus() {
        return this.modEventBus;
    }
    
    
    private void onRegister(final RegisterEvent event) {
        this.TOOL_TIERS.onRegister(event);
        this.CREATIVE_TABS.onRegister(event);
        this.ITEMS.onRegister(event);
        this.BLOCKS.onRegister(event);
        this.FLUIDS.onRegister(event);
    }
    
    private void onCreativeModeTabContentBuild(final BuildCreativeModeTabContentsEvent event) {
        this.ITEMS.onCreativeModeTabContentBuild(event);
        this.BLOCKS.onCreativeModeTabContentBuild(event);
    }
    
    private void onRegisterBlockColorHandlers(final RegisterColorHandlersEvent.Block event) {
        this.BLOCKS.onRegisterBlockColorHandlers(event);
    }
    
    private void onRegisterItemColorHandlers(final RegisterColorHandlersEvent.Item event) {
        this.ITEMS.onRegisterItemColorHandlers(event);
    }
    
    private void onDatagen(final GatherDataEvent event) {
        this.CREATIVE_TABS.onDatagen(event);
        this.ITEMS.onDatagen(event);
        this.BLOCKS.onDatagen(event);
        this.FLUIDS.onDatagen(event);
        this.TRANSLATIONS.onDatagen(event);
    }
}
