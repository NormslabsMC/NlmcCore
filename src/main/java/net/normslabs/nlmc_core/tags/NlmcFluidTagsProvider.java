/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 19:06
 */

package net.normslabs.nlmc_core.tags;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NlmcFluidTagsProvider extends FluidTagsProvider {
    private final NlmcTagsManager manager;
    
    public NlmcFluidTagsProvider(NlmcTagsManager manager,
                                 PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getFluidTagAssociations()
                    .forEach((fluidSupplier, tagKeyList)
                                     -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(fluidSupplier.get())));
        this.manager.getTagFluidTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                     -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
    
}
