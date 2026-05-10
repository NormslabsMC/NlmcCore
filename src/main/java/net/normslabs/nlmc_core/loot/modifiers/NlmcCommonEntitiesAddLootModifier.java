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

public class NlmcCommonEntitiesAddLootModifier extends LootModifier implements INlmcLootModifier<NlmcCommonEntitiesAddLootModifier> {
    
    public static final String CODEC_NAME = "nlmc_all_chests_add_loot_modifier";
    public static final Supplier<Codec<NlmcCommonEntitiesAddLootModifier>> CODEC
            = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                    inst.group(
                                ForgeRegistries.ITEMS.getCodec()
                                                     .fieldOf("itemToAdd")
                                                     .forGetter(modifier -> modifier.itemToAdd),
                                Codec.INT
                                        .fieldOf("minItemCount")
                                        .forGetter(modifier -> modifier.minItemCount),
                                Codec.INT
                                        .fieldOf("maxItemCount")
                                        .forGetter(modifier -> modifier.maxItemCount),
                                Codec.FLOAT
                                        .fieldOf("chance")
                                        .forGetter(modifier -> modifier.chance)))
                        .apply(inst, NlmcCommonEntitiesAddLootModifier::new)));
    private final Item itemToAdd;
    private final int minItemCount;
    private final int maxItemCount;
    private final float chance;
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcCommonEntitiesAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd, int minItemCount, int maxItemCount, float chance) {
        super(conditionsIn);
        this.itemToAdd = itemToAdd;
        this.minItemCount = minItemCount;
        this.maxItemCount = maxItemCount;
        this.chance = chance;
    }
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcCommonEntitiesAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd, int minItemCount, int maxItemCount) {
        this(conditionsIn, itemToAdd, minItemCount, maxItemCount, 1.0f);
    }
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcCommonEntitiesAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd, float chance) {
        this(conditionsIn, itemToAdd, 1, 1, chance);
    }
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcCommonEntitiesAddLootModifier(LootItemCondition[] conditionsIn, Item itemToAdd) {
        this(conditionsIn, itemToAdd, 1, 1, 1.0f);
    }
    
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
                                                          LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }
        if (context.getQueriedLootTableId().getPath().startsWith("chests/")) {
            if (context.getRandom().nextFloat() <= chance) {
                // Random integer between min and max (inclusive)
                int amount = context.getRandom().nextInt(this.minItemCount, this.maxItemCount + 1);
                generatedLoot.add(new ItemStack(this.itemToAdd, amount));
            }
        }
        return generatedLoot;
    }
    
    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
    
    @Override
    public String getCodecName() {
        return NlmcCommonEntitiesAddLootModifier.CODEC_NAME;
    }
    
    @Override
    public Supplier<Codec<NlmcCommonEntitiesAddLootModifier>> getCodecSupplier() {
        return NlmcCommonEntitiesAddLootModifier.CODEC;
    }
}
