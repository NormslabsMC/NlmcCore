/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-01 07:00
 */

package net.normslabs.nlmc_core.tags;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.normslabs.nlmc_core.abstracts.AbstractRegistrar;
import net.normslabs.nlmc_core.abstracts.AbstractTagsRegistrar;
import net.normslabs.nlmc_core.infrastructure.NlmcRegistrar;

import java.util.concurrent.CompletableFuture;

public class NlmcFluidTagsRegistrar extends AbstractTagsRegistrar<Fluid> {
    
    public NlmcFluidTagsRegistrar(NlmcRegistrar modRegistrar) {
        super(modRegistrar);
    }
    
    @Override
    protected TagKey<Fluid> createTag(ResourceLocation tagResourceLocation) {
        return FluidTags.create(tagResourceLocation);
    }
    
    @Override
    protected void onRegister(RegisterEvent event) {
    
    }
    
    @Override
    protected void onDatagen(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
    
        this.provider = new NlmcFluidTagsProvider(this, packOutput, lookupProvider, fileHelper).contentsGetter();
    }
}
