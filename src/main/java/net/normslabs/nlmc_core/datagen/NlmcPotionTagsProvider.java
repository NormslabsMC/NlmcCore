package net.normslabs.nlmc_core.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.normslabs.nlmc_core.tags.NlmcTagsManager;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NlmcPotionTagsProvider extends TagsProvider<Potion> {
    private final NlmcTagsManager manager;
    
    public NlmcPotionTagsProvider(NlmcTagsManager manager,
                                  PackOutput output,
                                  CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.POTION, lookupProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getPotionTagAssociations()
                    .forEach((potionKey, tagKeyList)
                                     -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(potionKey)));
        this.manager.getTagPotionTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                     -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
}