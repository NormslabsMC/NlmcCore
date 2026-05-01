/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 03:14
 */

package net.normslabs.nlmc_core.abstracts;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.translations.TranslationDictionary;

import java.util.List;
import java.util.function.Supplier;

public interface IRegistrable<TMcObject> extends Supplier<TMcObject> {
    
    String getNamespace();
    
    String getIdentifier();
    
    ResourceLocation getResourceLocation();
    
    String getNameTranslationKey();
    
    String getTooltipTranslationKey();
    
    TranslationDictionary getTranslations();
    
    List<ResourceLocation> getTags();
    
    void addTag(ResourceLocation tagLocation);
    
    void addTag(TagKey<TMcObject> tagKey);
    
    void addTranslation(Locales locale, String translationKey, String translationValue);
    
    RegistryObject<TMcObject> registerIn(DeferredRegister<TMcObject> register);
    
    void validateForRegistration();
    
}
