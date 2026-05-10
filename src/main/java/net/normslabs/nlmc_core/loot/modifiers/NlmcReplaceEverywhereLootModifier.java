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
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
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

public class NlmcReplaceEverywhereLootModifier
        extends LootModifier implements INlmcLootModifier<NlmcReplaceEverywhereLootModifier> {
    public static final String CODEC_NAME = "nlmc_replace_everywhere_loot_modifier";
    public static final Supplier<Codec<NlmcReplaceEverywhereLootModifier>> CODEC
            = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                    inst.group(
                            ForgeRegistries.ITEMS.getCodec()
                                                 .fieldOf("targetItem")
                                                 .forGetter(m -> m.targetItem),
                            ForgeRegistries.ITEMS.getCodec()
                                                 .fieldOf("replacementItem")
                                                 .forGetter(m -> m.replacementItem),
                            Codec.FLOAT
                                    .fieldOf("countMultiplier")
                                    .forGetter(modifier -> modifier.countMultiplier)))
                                                                                        .apply(inst, NlmcReplaceEverywhereLootModifier::new)));
    
    private final Item targetItem;
    private final Item replacementItem;
    private final float countMultiplier;
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcReplaceEverywhereLootModifier(LootItemCondition[] conditionsIn, Item targetItem, Item replacementItem, float countMultiplier) {
        super(conditionsIn);
        this.targetItem = targetItem;
        this.replacementItem = replacementItem;
        this.countMultiplier = countMultiplier;
    }
    
    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected NlmcReplaceEverywhereLootModifier(LootItemCondition[] conditionsIn, Item targetItem, Item replacementItem) {
        this(conditionsIn, targetItem, replacementItem, 1.0f);
    }
    
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot,
                                                          LootContext context) {
        ObjectListIterator<ItemStack> it = generatedLoot.iterator();
        while (it.hasNext()) {
            var stack = it.next();
            if (stack.is(this.targetItem)) {
                int newCount = Math.round(stack.getCount() * this.countMultiplier);
                it.set(new ItemStack(this.replacementItem, newCount));
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
        return NlmcReplaceEverywhereLootModifier.CODEC_NAME;
    }
    
    @Override
    public Supplier<Codec<NlmcReplaceEverywhereLootModifier>> getCodecSupplier() {
        return NlmcReplaceEverywhereLootModifier.CODEC;
    }
}
