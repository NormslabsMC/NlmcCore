/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 15:53
 */

package net.normslabs.nlmc_core.items;


import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.abstracts.AbstractMcObjectRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistryEntry;
import net.normslabs.nlmc_core.items.abstracts.IItemDescriptor;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ItemRegistrar extends AbstractMcObjectRegistrar<Item, IItemDescriptor> {
    private final HashMap<NlmcItemColor, List<IItemDescriptor>> ITEM_COLOR_MAP = new HashMap<>();
    
    public ItemRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
        modRegistrar.getModEventBus().addListener(this::onCreativeModeTabContentBuild);
        modRegistrar.getModEventBus().addListener(this::onRegisterItemColorHandlers);
    }
    
    @Override
    protected ResourceKey<Registry<Item>> getRegistryKey() {
        return Registries.ITEM;
    }
    
    @Override
    public RegistryObject<Item> registerObject(IItemDescriptor descriptor) {
        this.registerItemColor(descriptor);
        return super.registerObject(descriptor);
    }
    
    @Override
    protected void onRegister(final RegisterEvent event) {
    
    }
    
    protected void onCreativeModeTabContentBuild(final BuildCreativeModeTabContentsEvent event) {
        this.nlmcRegistry.forEach((resourceLocation, registryEntry) -> {
            if (registryEntry.getDescriptor().getCreativeTabs().contains(event.getTabKey())) {
                event.accept(registryEntry.getRegisteredObject());
            }
        });
    }
    
    protected void onRegisterItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        this.ITEM_COLOR_MAP.forEach((itemColor, itemSupplierList) -> {
            Item[] itemArray = itemSupplierList.stream().map(Supplier::get).toArray(Item[]::new);
            event.register(itemColor, itemArray);
        });
    }
    
    @Override
    protected void onDatagen(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        
        // Item models generator
        NlmcItemModelManager itemModelBuilder = new NlmcItemModelManager(this, packOutput, fileHelper);
        gen.addProvider(event.includeClient(), itemModelBuilder);
    }
    
    private void registerItemColor(IItemDescriptor descriptor) {
        if (descriptor.getModelDescriptor().getColorDescriptor().needsRegistration()) {
            NlmcItemColor matchingExistingItemColor = null;
            for (NlmcItemColor itemColor : this.ITEM_COLOR_MAP.keySet()) {
                if (itemColor.equals(descriptor.getModelDescriptor().getColorDescriptor())) {
                    matchingExistingItemColor = itemColor;
                    break;
                }
            }
            if (matchingExistingItemColor != null) {
                this.ITEM_COLOR_MAP.get(matchingExistingItemColor).add(descriptor);
            } else {
                List<IItemDescriptor> itemColorDescriptors = new ArrayList<>();
                itemColorDescriptors.add(descriptor);
                this.ITEM_COLOR_MAP.put(descriptor.getModelDescriptor().getColorDescriptor(), itemColorDescriptors);
            }
        }
    }
}
