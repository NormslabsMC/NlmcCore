/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-29 16:05
 */

package net.normslabs.nlmc_core.items;


import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.normslabs.nlmc_core.abstracts.IModel;
import net.normslabs.nlmc_core.items.models.CubeTopItemModel;
import net.normslabs.nlmc_core.items.models.CustomCubeItemModel;
import net.normslabs.nlmc_core.items.models.GenericItemModel;
import net.normslabs.nlmc_core.items.models.UniformCubeItemModel;
import net.normslabs.nlmc_core.rendering.Texture;
import net.normslabs.nlmc_core.utils.ResLocUtils;

public class NlmcItemModelManager extends ItemModelProvider {
    
    public static final ResourceLocation MC_ITEM_GENERATED_MODEL_LOC = ResourceLocation.fromNamespaceAndPath(
            ResLocUtils.MC_NAMESPACE, "item/generated");
    public static final ResourceLocation MC_CUBEALL_ITEM_MODEL_LOC = ResourceLocation.fromNamespaceAndPath(
            ResLocUtils.MC_NAMESPACE, "block/cube_all");
    public static final ResourceLocation MC_CUSTOM_CUBE_ITEM_MODEL_LOC = ResourceLocation.fromNamespaceAndPath(
            ResLocUtils.MC_NAMESPACE, "block/block");
    
    private final ItemRegistrar parentRegistrar;
    
    public NlmcItemModelManager(ItemRegistrar parentRegistrar, PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, parentRegistrar.getNlmcRegistrar().getModNamespace(), existingFileHelper);
        this.parentRegistrar = parentRegistrar;
    }
    
    @Override
    protected void registerModels() {
        this.parentRegistrar.getNlmcRegistry().values().forEach(this::buildModelFor);
    }
    
    private void buildModelFor(ItemDescriptor<?, ?, ?> itemDescriptor) {
        String itemIdentifier = itemDescriptor.getIdentifier();
        IModel<?, ?, ?> modelDescriptor = itemDescriptor.getModelDescriptor();
        
        if (modelDescriptor instanceof GenericItemModel) {
            this.simpleItem(itemIdentifier, (GenericItemModel) modelDescriptor);
        } else if (modelDescriptor instanceof UniformCubeItemModel) {
            this.uniformCubeItem(itemIdentifier, (UniformCubeItemModel) modelDescriptor);
        } else if (modelDescriptor instanceof CubeTopItemModel) {
            this.cubeTopItem(itemIdentifier, (CubeTopItemModel) modelDescriptor);
        } else if (modelDescriptor instanceof CustomCubeItemModel) {
            this.customCubeItem(itemIdentifier, (CustomCubeItemModel) modelDescriptor);
        } else {
            throw new RuntimeException("Unsupported ItemModelDescriptor type: " + modelDescriptor.getClass().getName());
        }
    }
    
    private void simpleItem(String itemIdentifier, GenericItemModel modelDescriptor) {
        ItemModelBuilder builder = this.withExistingParent(itemIdentifier, modelDescriptor.getParentModel());
        for (Texture texture : modelDescriptor.getTextureMap().values()) {
            builder.texture(texture.getTextureKey(), texture.getTextureLocation());
        }
    }
    
    private void uniformCubeItem(String itemIdentifier, UniformCubeItemModel modelDescriptor) {
        ItemModelBuilder builder = this.withExistingParent(itemIdentifier, modelDescriptor.getParentModel());
        for (Texture texture : modelDescriptor.getTextureMap().values()) {
            if (texture.hasColor()) {
                builder.element()
                       .from(0, 0, 0).to(16, 16, 16)
                       .allFaces((direction, faceBuilder) -> {
                           faceBuilder.texture(texture.getTextureKey())
                                      .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                      .tintindex(texture.getTintIndex())
                                      .cullface(direction);
                           
                       }).end();
            } else {
                builder.element()
                       .from(0, 0, 0).to(16, 16, 16)
                       .allFaces((direction, faceBuilder) -> {
                           faceBuilder.texture(texture.getTextureKey())
                                      .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                      .cullface(direction);
                       }).end();
            }
        }
    }
    
    private void cubeTopItem(String itemIdentifier, CubeTopItemModel modelDescriptor) {
        ItemModelBuilder builder = this.withExistingParent(itemIdentifier, modelDescriptor.getParentModel());
        builder.element()
               .from(0, 0, 0)
               .to(16, 16, 16)
               .faces((direction, faceBuilder) -> {
                   Texture texture;
                   switch (direction) {
                       case UP, DOWN -> texture = modelDescriptor.getTopBottomTexture();
                       case NORTH, SOUTH, WEST, EAST -> texture = modelDescriptor.getSideTexture();
                       default -> throw new RuntimeException("Unsupported direction: " + direction);
                   }
                   if (texture == null) {
                       throw new RuntimeException("Missing texture for direction: " + direction);
                   }
                   if (texture.hasColor()) {
                       faceBuilder.texture(texture.getTextureKey())
                                  .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                  .tintindex(texture.getTintIndex())
                                  .cullface(direction);
                   } else {
                       faceBuilder.texture(texture.getTextureKey())
                                  .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                  .cullface(direction);
                   }
                   
               }).end();
    }
    
    private void customCubeItem(String itemIdentifier, CustomCubeItemModel modelDescriptor) {
        ItemModelBuilder builder = this.withExistingParent(itemIdentifier, modelDescriptor.getParentModel());
        builder.element()
               .from(0, 0, 0)
               .to(16, 16, 16)
               .faces((direction, faceBuilder) -> {
                   Texture texture;
                   switch (direction) {
                       case UP -> texture = modelDescriptor.getTopTexture();
                       case DOWN -> texture = modelDescriptor.getBottomTexture();
                       case NORTH -> texture = modelDescriptor.getNorthTexture();
                       case SOUTH -> texture = modelDescriptor.getSouthTexture();
                       case WEST -> texture = modelDescriptor.getWestTexture();
                       case EAST -> texture = modelDescriptor.getEastTexture();
                       default -> throw new RuntimeException("Unsupported direction: " + direction);
                   }
                   if (texture == null) {
                       throw new RuntimeException("Missing texture for direction: " + direction);
                   }
                   if (texture.hasColor()) {
                       faceBuilder.texture(texture.getTextureKey())
                                  .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                  .tintindex(texture.getTintIndex())
                                  .cullface(direction);
                   } else {
                       faceBuilder.texture(texture.getTextureKey())
                                  .emissivity(texture.getBlockLightEmissivity(), texture.getSkyLightEmissivity())
                                  .cullface(direction);
                   }
                   
               }).end();
    }
}
