package net.normslabs.nlmc_core.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.normslabs.nlmc_core.tags.NlmcTagsManager;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NlmcEntityTypeTagsProvider extends EntityTypeTagsProvider {
    private final NlmcTagsManager manager;
    
    public NlmcEntityTypeTagsProvider(NlmcTagsManager manager,
                                      PackOutput output,
                                      CompletableFuture<HolderLookup.Provider> lookupProvider,
                                      @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getEntityTypeTagAssociations()
                    .forEach((entityType, tagKeyList)
                                     -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(entityType.get())));
        this.manager.getTagEntityTypeTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                     -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
}