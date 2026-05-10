/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 18:52
 */

package net.normslabs.nlmc_core.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.normslabs.nlmc_core.tags.NlmcTagsManager;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NlmcBlockTagsProvider extends BlockTagsProvider {
    private final NlmcTagsManager manager;
    
    public NlmcBlockTagsProvider(NlmcTagsManager manager,
                                 PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getBlockTagAssociations()
                    .forEach((blockSupplier, tagKeyList)
                                 -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(blockSupplier.get())));
        this.manager.getTagBlockTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                 -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
}
