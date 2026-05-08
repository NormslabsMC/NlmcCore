/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 17:19
 */

package net.normslabs.nlmc_core.tags;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NlmcItemTagsProvider extends ItemTagsProvider {
    private final NlmcTagsManager manager;
    
    public NlmcItemTagsProvider(NlmcTagsManager manager,
                                PackOutput output,
                                CompletableFuture<HolderLookup.Provider> lookupProvider,
                                CompletableFuture<TagLookup<Block>> blockTagProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getItemTagAssociations()
                    .forEach((itemSupplier, tagKeyList)
                                     -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(itemSupplier.get())));
        this.manager.getTagItemTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                     -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
}
