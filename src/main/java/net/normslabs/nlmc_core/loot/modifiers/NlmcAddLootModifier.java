/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 13:09
 */

package net.normslabs.nlmc_core.loot.modifiers;


import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import net.normslabs.nlmc_core.loot.abstracts.INlmcLootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class NlmcAddLootModifier extends LootModifier implements INlmcLootModifier<NlmcAddLootModifier> {
    
    public static final String CODEC_NAME = "nlmc_add_loot_modifier";
    public static final Supplier<Codec<NlmcAddLootModifier>> CODEC
            = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                    inst.group(
                                ForgeRegistries.ITEMS.getCodec()
                                                     .fieldOf("itemToAdd")
                                                     .forGetter(modifier -> modifier.itemToAdd),
                                Codec.INT
                                                     .fieldOf("itemCount")
                                                     .forGetter(modifier -> modifier.itemCount)))
                        .apply(inst, NlmcAddLootModifier::new)));
    private final Item itemToAdd;
    private final int itemCount;
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd, int itemCount) {
        super(conditionsIn);
        this.itemToAdd = itemToAdd;
        this.itemCount = itemCount;
    }
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd) {
        this(conditionsIn, itemToAdd, 1);
    }
    
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
                                                          LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }
        
        generatedLoot.add(new ItemStack(this.itemToAdd, this.itemCount));
        
        return generatedLoot;
    }
    
    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
    
    @Override
    public String getCodecName() {
        return NlmcAddLootModifier.CODEC_NAME;
    }
    
    @Override
    public Supplier<Codec<NlmcAddLootModifier>> getCodecSupplier() {
        return NlmcAddLootModifier.CODEC;
    }
}
