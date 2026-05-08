/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:56
 */

package net.normslabs.nlmc_core.items.descriptors;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.normslabs.nlmc_core.items.ItemRegistrar;
import net.normslabs.nlmc_core.items.abstracts.ItemDescriptor;
import net.normslabs.nlmc_core.items.models.abstracts.ItemModel;
import net.normslabs.nlmc_core.items.types.NlmcGenericItem;

public class GenericItemDescriptor extends ItemDescriptor<NlmcGenericItem> {
    
    private int maxStackSize = 64;
    private Rarity rarity = Rarity.COMMON;
    private boolean isFireResistant = false;
    
    public GenericItemDescriptor(String modNamespace, String itemIdentifier) {
        super(modNamespace, itemIdentifier);
    }
    
    public static <TModelBuilder extends ItemModel.Builder<?, ?>> Builder<GenericItemDescriptor, TModelBuilder> getBuilder(
            ItemRegistrar registerToRegistrar,
            String itemIdentifier,
            TModelBuilder modelBuilder) {
        return new Builder<>(registerToRegistrar,
                             new GenericItemDescriptor(registerToRegistrar.getNlmcRegistrar().getModNamespace(), itemIdentifier),
                             modelBuilder);
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
        super.validateForRegistration();
    }
    
    @Override
    protected NlmcGenericItem createItem() {
        return new NlmcGenericItem(this);
    }
    
    /**
     * Assigns the descriptor's configurations to the underlying item properties.
     * <p>
     * <strong>Do not manually call this method; it is automatically handled internally.</strong>
     *
     * @return the modified underlying item properties.
     * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
     * @since 2026-05-02 20:37
     */
    @Override
    public Item.Properties buildProperties() {
        this.itemProperties
                .rarity(this.rarity)
                .stacksTo(this.maxStackSize);
        if (this.isFireResistant) {
            this.itemProperties.fireResistant();
        }
        return this.itemProperties;
    }
    
    public static class Builder<
            TBuiltItemDescriptor extends GenericItemDescriptor,
            TModelBuilder extends ItemModel.Builder<?, ?>>
            extends ItemDescriptor.Builder<TBuiltItemDescriptor, TModelBuilder> {
        
        public Builder(ItemRegistrar registerToRegistrar, TBuiltItemDescriptor blankDescriptor, TModelBuilder modelBuilder) {
            super(registerToRegistrar, blankDescriptor, modelBuilder);
        }
        
        /**
         * Sets whether the item is fire-resistant or not.
         * Fire-resistant items will not be destroyed by fire or lava.
         * Default is false.
         *
         * @param fireResistant whether the item is fire-resistant or not.
         * @return the item builder.
         * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
         * @since 2026-05-02 20:25
         */
        public Builder<TBuiltItemDescriptor, TModelBuilder> setFireResistant(boolean fireResistant) {
            this.itemDescriptor.setFireResistant(fireResistant);
            return this;
        }
        
        /**
         * Sets the maximum stack size of the item. Default is 64.
         *
         * @param maxStackSize the maximum stack size of the item.
         * @return the item builder.
         * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
         * @since 2026-05-02 20:26
         */
        public Builder<TBuiltItemDescriptor, TModelBuilder> setMaxStackSize(int maxStackSize) {
            this.itemDescriptor.setMaxStackSize(maxStackSize);
            return this;
        }
        
        /**
         * Sets the {@link Rarity rarity} of the item. Default is {@link Rarity#COMMON}.
         *
         * @param rarity the rarity of the item.
         * @return the item builder.
         * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
         * @since 2026-05-02 20:35
         */
        public Builder<TBuiltItemDescriptor, TModelBuilder> setRarity(Rarity rarity) {
            this.itemDescriptor.setRarity(rarity);
            return this;
        }
        
    }
}
