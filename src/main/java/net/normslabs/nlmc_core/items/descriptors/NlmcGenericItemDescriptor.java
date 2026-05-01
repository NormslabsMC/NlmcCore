/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:56
 */

package net.normslabs.nlmc_core.items.descriptors;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.normslabs.nlmc_core.items.abstracts.NlmcItemDescriptor;
import net.normslabs.nlmc_core.items.types.NlmcItem;

import java.util.function.Supplier;

public class NlmcGenericItemDescriptor extends NlmcItemDescriptor<NlmcItem> {
    
    private Supplier<CreativeModeTab> creativeTab = null;
    private int maxStackSize = 64;
    private Rarity rarity = Rarity.COMMON;
    private boolean isFireResistant = false;
    
    public NlmcGenericItemDescriptor(String modNamespace, String itemIdentifier) {
        super(modNamespace, itemIdentifier);
    }
    
    public Supplier<CreativeModeTab> getCreativeTab() {
        return this.creativeTab;
    }
    
    public void setCreativeTab(Supplier<CreativeModeTab> creativeTab) {
        this.creativeTab = creativeTab;
    }
    
    public void setFireResistant(boolean fireResistant) {
        isFireResistant = fireResistant;
    }
    
    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }
    
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    
    @Override
    public void validateForRegistration() {
    
    }
    
    @Override
    protected NlmcItem createItem() {
        return new NlmcItem(this);
    }
    
    @Override
    public Item.Properties buildProperties() {
        this.itemProperties.rarity(this.rarity).stacksTo(this.maxStackSize);
        if (this.isFireResistant) {
            this.itemProperties.fireResistant();
        }
        return this.itemProperties;
    }
}
