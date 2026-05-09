/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:48
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.normslabs.nlmc_core.blocks.BlockRegistrar;
import net.normslabs.nlmc_core.creativetabs.CreativeTabsRegistrar;
import net.normslabs.nlmc_core.fluids.FluidRegistrar;
import net.normslabs.nlmc_core.infrastructure.abstracts.IManager;
import net.normslabs.nlmc_core.infrastructure.abstracts.IRegistrar;
import net.normslabs.nlmc_core.items.ItemRegistrar;
import net.normslabs.nlmc_core.items.tiers.ToolTiersRegistrar;
import net.normslabs.nlmc_core.loot.LootModifierRegistrar;
import net.normslabs.nlmc_core.tags.NlmcBlockTagsRegistrar;
import net.normslabs.nlmc_core.tags.NlmcFluidTagsRegistrar;
import net.normslabs.nlmc_core.tags.NlmcItemTagsRegistrar;
import net.normslabs.nlmc_core.tags.NlmcTagsManager;
import net.normslabs.nlmc_core.translations.NlmcTranslationRegistrar;

import java.util.ArrayList;
import java.util.List;

public class NlmcRegistrar {
    private final String modNamespace;
    private final List<IManager> managers = new ArrayList<>();
    private boolean isInitialized;
    public final LootModifierRegistrar LOOT_MODIFIERS;
    public final NlmcTagsManager TAGS;
    public final NlmcTranslationRegistrar TRANSLATIONS;
    public final ToolTiersRegistrar TOOL_TIERS;
    public final CreativeTabsRegistrar CREATIVE_TABS;
    public final BlockRegistrar BLOCKS;
    public final ItemRegistrar ITEMS;
    public final FluidRegistrar FLUIDS;
    
    public NlmcRegistrar(String modNamespace) {
        this.isInitialized = false;
        this.modNamespace = modNamespace;
        
        this.LOOT_MODIFIERS = new LootModifierRegistrar(this);
        this.TAGS = new NlmcTagsManager(this);
        this.TRANSLATIONS = new NlmcTranslationRegistrar(this);
        this.TOOL_TIERS = new ToolTiersRegistrar(this);
        this.CREATIVE_TABS = new CreativeTabsRegistrar(this);
        this.BLOCKS = new BlockRegistrar(this);
        this.ITEMS = new ItemRegistrar(this);
        this.FLUIDS = new FluidRegistrar(this);
    }
    
    public String getModNamespace() {
        return this.modNamespace;
    }
    
    public void registerManager(IManager manager) {
        if (this.isInitialized) {
            throw new IllegalStateException("["+manager.getClass().getSimpleName()+"] : Cannot register manager after initialization.");
        }
        this.managers.add(manager);
    }
    
    public void initialize(IEventBus modEventBus) {
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        this.managers.forEach(registrar -> registrar.initialize(modEventBus, forgeEventBus));
        this.isInitialized = true;
    }
}
