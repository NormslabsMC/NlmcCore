package net.normslabs.nlmc_core.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.normslabs.nlmc_core.tags.NlmcTagsManager;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NlmcBiomeTagsProvider extends BiomeTagsProvider {
    private final NlmcTagsManager manager;
    
    public NlmcBiomeTagsProvider(NlmcTagsManager manager,
                                 PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, manager.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.manager = manager;
    }
    
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.manager.getBiomeTagAssociations()
                    .forEach((biomeKey, tagKeyList)
                                     -> tagKeyList.forEach(tagKey -> this.tag(tagKey).add(biomeKey)));
        this.manager.getTagBiomeTagAssociations()
                    .forEach((targetTag, tagsToAddList)
                                     -> tagsToAddList.forEach((tagToAdd) -> this.tag(targetTag).addTag(tagToAdd)));
    }
    
}