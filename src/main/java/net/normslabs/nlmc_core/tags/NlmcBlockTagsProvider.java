/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 18:52
 */

package net.normslabs.nlmc_core.tags;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;
import net.normslabs.nlmc_core.abstracts.AbstractTagsRegistrar;
import net.normslabs.nlmc_core.blocks.BlockRegistrar;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class NlmcBlockTagsProvider extends BlockTagsProvider {
    private final AbstractTagsRegistrar<Block> tagsRegistrar;
    
    public NlmcBlockTagsProvider(AbstractTagsRegistrar<Block> tagsRegistrar,
                                 PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, tagsRegistrar.getModRegistrar().getModNamespace(), existingFileHelper);
        this.tagsRegistrar = tagsRegistrar;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.tagsRegistrar.getObjectTagAssociations()
                .forEach((blockSupplier, tagKeyList)
                                 -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(blockSupplier.get())));
        this.tagsRegistrar.getTagTagAssociations()
                .forEach((targetTagSupplier, tagSupplierList)
                                 -> tagSupplierList.forEach((tagSupplier) -> this.tag(targetTagSupplier.get()).addTag(tagSupplier.get())));
    }
    
}
