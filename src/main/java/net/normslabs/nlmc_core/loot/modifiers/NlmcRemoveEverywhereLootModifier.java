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

public class NlmcRemoveEverywhereLootModifier
        extends LootModifier implements INlmcLootModifier<NlmcRemoveEverywhereLootModifier> {
    
    public static final String CODEC_NAME = "nlmc_remove_everywhere_loot_modifier";
    public static final Supplier<Codec<NlmcRemoveEverywhereLootModifier>> CODEC
            = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                                ForgeRegistries.ITEMS.getCodec()
                                                     .fieldOf("itemToRemove")
                                                     .forGetter(modifier -> modifier.itemToRemove))
                        .apply(inst, NlmcRemoveEverywhereLootModifier::new)));
    private final Item itemToRemove;
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcRemoveEverywhereLootModifier(LootItemCondition[] conditionsIn, Item itemToRemove) {
        super(conditionsIn);
        this.itemToRemove = itemToRemove;
    }
    
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
                                                          LootContext context) {
        generatedLoot.removeIf(stack -> stack.is(this.itemToRemove));
        return generatedLoot;
    }
    
    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
    
    @Override
    public String getCodecName() {
        return NlmcRemoveEverywhereLootModifier.CODEC_NAME;
    }
    
    @Override
    public Supplier<Codec<NlmcRemoveEverywhereLootModifier>> getCodecSupplier() {
        return NlmcRemoveEverywhereLootModifier.CODEC;
    }
}
