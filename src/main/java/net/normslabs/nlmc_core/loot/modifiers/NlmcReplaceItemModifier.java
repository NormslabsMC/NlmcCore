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

public class NlmcReplaceItemModifier extends LootModifier implements INlmcLootModifier<NlmcReplaceItemModifier> {
    public static final String CODEC_NAME = "nlmc_replace_item_modifier";
    public static final Supplier<Codec<NlmcReplaceItemModifier>> CODEC
            = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                    inst.group(
                            ForgeRegistries.ITEMS.getCodec()
                                                 .fieldOf("targetItem")
                                                 .forGetter(m -> m.targetItem),
                            ForgeRegistries.ITEMS.getCodec()
                                                 .fieldOf("replacementItem")
                                                 .forGetter(m -> m.replacementItem)))
                                                                                        .apply(inst, NlmcReplaceItemModifier::new)));
    
    private final Item targetItem;
    private final Item replacementItem;
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcReplaceItemModifier(LootItemCondition[] conditionsIn, Item targetItem, Item replacementItem) {
        super(conditionsIn);
        this.targetItem = targetItem;
        this.replacementItem = replacementItem;
    }
    
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
                                                          LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }
        for (ItemStack stack : generatedLoot) {
            if (stack.is(this.targetItem)) {
                int count = stack.getCount();
                generatedLoot.remove(stack);
                generatedLoot.add(new ItemStack(this.replacementItem, count));
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
        return NlmcReplaceItemModifier.CODEC_NAME;
    }
    
    @Override
    public Supplier<Codec<NlmcReplaceItemModifier>> getCodecSupplier() {
        return NlmcReplaceItemModifier.CODEC;
    }
}
