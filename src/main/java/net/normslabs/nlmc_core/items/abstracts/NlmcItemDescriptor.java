/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 04:54
 */

package net.normslabs.nlmc_core.items.abstracts;


import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.abstracts.IBuilder;
import net.normslabs.nlmc_core.abstracts.IModelDescriptor;
import net.normslabs.nlmc_core.items.types.NlmcGenericItem;
import net.normslabs.nlmc_core.rendering.NlmcItemColor;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.translations.TranslationDictionary;

import java.util.*;

public abstract class NlmcItemDescriptor<T extends Item> implements IItemDescriptor {
    private final String modNamespace;
    private final String itemIdentifier;
    protected final Item.Properties itemProperties;
    private ResourceLocation resourceLocation;
    private T item;
    private final List<ResourceLocation> tags;
    private final TranslationDictionary translations;
    private IModelDescriptor<Item, NlmcItemColor> modelDescriptor;
    private final List<ResourceKey<CreativeModeTab>> creativeTabs;
    
    protected NlmcItemDescriptor(String modNamespace, String itemIdentifier) {
        this.modNamespace = modNamespace;
        this.itemIdentifier = itemIdentifier;
        this.itemProperties = new Item.Properties();
        this.tags = new ArrayList<>();
        this.translations = new TranslationDictionary();
        this.creativeTabs = new ArrayList<>();
    }
    
    @Override
    public String getNamespace() {
        return this.modNamespace;
    }
    
    @Override
    public String getIdentifier() {
        return this.itemIdentifier;
    }
    
    /**
     * Returns the {@link ResourceLocation resource location} for the item
     *
     * @return The resource location of the item.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-04-29 17:00
     */
    public ResourceLocation getResourceLocation() {
        if (this.resourceLocation == null) {
            this.resourceLocation = ResourceLocation.fromNamespaceAndPath(this.modNamespace, this.itemIdentifier);
        }
        return this.resourceLocation;
    }
    
    @Override
    public String getNameTranslationKey() {
        return "items."+this.modNamespace+"."+this.itemIdentifier;
    }
    
    @Override
    public String getTooltipTranslationKey() {
        return "items.tooltips."+this.modNamespace+"."+this.itemIdentifier;
    }
    
    @Override
    public List<ResourceLocation> getTags() {
        return this.tags;
    }
    
    public TranslationDictionary getTranslations() {
        return this.translations;
    }
    
    @Override
    public IModelDescriptor<Item, NlmcItemColor> getModelDescriptor() {
        return this.modelDescriptor;
    }
    
    @Override
    public List<ResourceKey<CreativeModeTab>> getCreativeTabs() {
        return this.creativeTabs;
    }
    
    @Override
    public void setModelDescriptor(IModelDescriptor<Item, NlmcItemColor> modelDescriptor) {
        this.modelDescriptor = modelDescriptor;
    }
    
    @Override
    public void addTag(ResourceLocation tagLocation) {
        this.tags.add(tagLocation);
    }
    
    @Override
    public void addTag(TagKey<Item> tagKey) {
        this.tags.add(tagKey.location());
    }
    
    @Override
    public void addTranslation(Locales locale, String translationKey, String translationValue) {
        this.translations.addTranslation(locale, translationKey, translationValue);
    }
    
    @Override
    public void addItemNameTranslation(Locales locale, String translationValue) {
        this.addTranslation(locale, this.getNameTranslationKey(), translationValue);
    }
    
    @Override
    public void addItemTooltipTranslation(Locales locale, String translationValue) {
        this.addTranslation(locale, this.getTooltipTranslationKey(), translationValue);
    }
    
    @Override
    public void addItemCreativeModeTab(ResourceKey<CreativeModeTab> creativeModeTab) {
        this.creativeTabs.add(creativeModeTab);
    }
    
    @Override
    public RegistryObject<Item> registerIn(DeferredRegister<Item> register) {
        return register.register(this.itemIdentifier, this);
    }
    
    @Override
    public T get() {
        if (this.item == null) {
            this.item = this.createItem();
        }
        return this.item;
    }
    
    @Override
    public abstract void validateForRegistration();
    
    protected abstract T createItem();
    
    
    protected class Builder<TOutput extends NlmcItemDescriptor<T>> implements IBuilder<TOutput> {
        protected TOutput itemDescriptor;
        
        protected Builder(TOutput blankDescriptor) {
            this.itemDescriptor = blankDescriptor;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> setModelDescriptor(IModelDescriptor<Item, NlmcItemColor> modelDescriptor) {
            this.itemDescriptor.setModelDescriptor(modelDescriptor);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addTag(ResourceLocation tagLocation) {
            this.itemDescriptor.addTag(tagLocation);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addTag(TagKey<Item> tagKey) {
            this.itemDescriptor.addTag(tagKey);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addTranslation(Locales locale, String translationKey, String translationValue) {
            this.itemDescriptor.addTranslation(locale, translationKey, translationValue);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addItemNameTranslation(Locales locale, String translationValue) {
            this.itemDescriptor.addItemNameTranslation(locale, translationValue);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addItemTooltipTranslation(Locales locale, String translationValue) {
            this.itemDescriptor.addItemTooltipTranslation(locale, translationValue);
            return this;
        }
        
        public NlmcItemDescriptor<T>.Builder<TOutput> addItemCreativeModeTab(ResourceKey<CreativeModeTab> creativeModeTab) {
            this.itemDescriptor.addItemCreativeModeTab(creativeModeTab);
            return this;
        }
        
        @Override
        public TOutput build() {
            return null;
        }
    }
    
}
