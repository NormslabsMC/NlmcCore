/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 13:36
 */

package net.normslabs.nlmc_core.loot;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import net.normslabs.nlmc_core.abstracts.AbstractBuilder;
import net.normslabs.nlmc_core.abstracts.AbstractBuildable;
import net.normslabs.nlmc_core.loot.abstracts.ILootModifierDescriptor;
import net.normslabs.nlmc_core.loot.abstracts.INlmcLootModifier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class LootModifierDescriptor<TNlmcType extends LootModifier & INlmcLootModifier<TNlmcType>>
        extends AbstractBuildable<LootModifierDescriptor<TNlmcType>, LootModifierDescriptor<TNlmcType>.Builder>
        implements
        ILootModifierDescriptor<LootModifierDescriptor<TNlmcType>, LootModifierDescriptor<TNlmcType>.Builder, TNlmcType> {
    
    private boolean isRegistered;
    protected final String objectNamespace;
    protected final String objectIdentifier;
    protected final ResourceLocation objectResourceLocation;
    private final Function<LootModifierDescriptor<TNlmcType>, TNlmcType> objectCreator;
    private TNlmcType createdObject;
    private final LootModifierTypes lootModifierType;
    private final List<LootItemCondition> conditions;
    private final List<Supplier<Item>> items;
    
    public LootModifierDescriptor(String objectNamespace, String objectIdentifier, LootModifierTypes lootModifierType,
                                  Function<LootModifierDescriptor<TNlmcType>, TNlmcType> objectCreator) {
        this.objectNamespace = objectNamespace;
        this.objectIdentifier = objectIdentifier;
        this.objectResourceLocation = ResourceLocation.fromNamespaceAndPath(objectNamespace, objectIdentifier);
        this.objectCreator = objectCreator;
        this.lootModifierType = lootModifierType;
        this.conditions = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    
    @Override
    public void validateForBuild() {
    
    }
    
    @Override
    public Builder getBuilder() {
        return new Builder(this);
    }
    
    @Override
    public void onBuild() {
    
    }
    
    @Override
    public boolean isRegistered() {
        return this.isRegistered;
    }
    
    @Override
    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
    
    @Override
    public String getNamespace() {
        return this.objectNamespace;
    }
    
    @Override
    public String getIdentifier() {
        return this.objectIdentifier;
    }
    
    @Override
    public ResourceLocation getResourceLocation() {
        return this.objectResourceLocation;
    }
    
    @Override
    public TNlmcType get() {
        if (!this.isBuilt) {
            throw new IllegalStateException("Cannot create MC object ["+this.objectNamespace+":"+this.objectIdentifier+"] from descriptor before it is built.");
        }
        if (this.createdObject == null) {
            this.validateForBuild();
            this.createdObject = this.objectCreator.apply(this);
        }
        return this.createdObject;
    }
    
    @Override
    public LootModifierDescriptor<TNlmcType> registerIn(LootModifierRegistrar registrar) {
        registrar.register(this);
        this.setIsRegistered(true);
        return this;
    }
    
    public LootModifierTypes getLootModifierType() {
        return this.lootModifierType;
    }
    
    public class Builder extends AbstractBuilder<Builder, LootModifierDescriptor<TNlmcType>> {
        
        protected Builder(LootModifierDescriptor<TNlmcType> initialBuildable) {
            super(initialBuildable);
        }
        
        public Builder isItemAddModifier(Supplier<Item> itemItemToAdd, int itemAmount) {
        
        }
        
    }
}
