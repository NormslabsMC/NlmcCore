/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 16:51
 */

package net.normslabs.nlmc_core.creativetabs;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.normslabs.nlmc_core.abstracts.AbstractNamedRegistrable;
import net.normslabs.nlmc_core.creativetabs.abstracts.ICreativeTabDescriptor;
import net.normslabs.nlmc_core.translations.Locales;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class CreativeTabDescriptor
        extends AbstractNamedRegistrable<CreativeTabDescriptor, CreativeTabDescriptor.Builder, CreativeTabsRegistrar, CreativeModeTab, CreativeModeTab>
        implements ICreativeTabDescriptor<CreativeTabDescriptor, CreativeTabDescriptor.Builder, CreativeTabsRegistrar> {
    
    private Supplier<Item> iconItem;
    
    public CreativeTabDescriptor(String objectNamespace, String objectIdentifier,
                                 Function<CreativeTabDescriptor, CreativeModeTab> objectCreatorFunction) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction, "creative_tabs");
    }
    
    @Override
    public void validateForBuild() {
        super.validateForBuild();
        if (this.iconItem == null) {
            throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build creative tab ["+this.objectIdentifier+"] without icon item.");
        }
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    @Override
    public Supplier<ItemStack> getItemIcon() {
        return () -> this.iconItem.get().getDefaultInstance();
    }
    
    @Override
    public void setItemIcon(Supplier<Item> iconItemSupplier) {
        this.iconItem = iconItemSupplier;
    }
    
    public class Builder extends AbstractNamedRegistrable<
                CreativeTabDescriptor,
                Builder,
                CreativeTabsRegistrar,
                CreativeModeTab,
                CreativeModeTab>.Builder {
        
        protected Builder(CreativeTabDescriptor initialBuildable) {
            super(initialBuildable);
        }
        
        public Builder setItemIcon(Supplier<Item> iconItemSupplier) {
            this.buildable.iconItem = iconItemSupplier;
            return this.self();
        }
    }
}
