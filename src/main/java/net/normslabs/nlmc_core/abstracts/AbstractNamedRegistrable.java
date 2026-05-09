/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 18:36
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.translations.Locales;

import java.util.Map;
import java.util.function.Function;

public abstract class AbstractNamedRegistrable<
        TSelf extends AbstractNamedRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>,
        TBuilder extends Builder<TBuilder, TSelf>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, TMcType>,
        TNlmcType extends TMcType,
        TMcType>
        extends AbstractTranslatableRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>
        implements IHasDisplayedName {
    
    
    protected final String displayNameDictionaryKeyPrefix;
    
    public AbstractNamedRegistrable(String objectNamespace, String objectIdentifier,
                                    Function<TSelf, TNlmcType> objectCreatorFunction,
                                    String displayNameDictionaryKeyPrefix) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction);
        this.displayNameDictionaryKeyPrefix = displayNameDictionaryKeyPrefix;
    }
    
    @Override
    public void validateForBuild() {
        if (!this.translations.getTranslations().containsKey(this.getDisplayNameDictionaryKey())) {
            throw new IllegalStateException("["+this.getClass().getSimpleName()+"] : Cannot build named registrable ["+this.objectIdentifier+"] without display name translations.");
        }
    }
    
    @Override
    public String getDisplayNameDictionaryKey() {
        return this.displayNameDictionaryKeyPrefix + "." + this.objectNamespace + "." + this.objectIdentifier;
    }
    
    @Override
    public void addDisplayNameTranslation(Locales locale, String translation) {
        this.translations.addTranslation(locale, this.getDisplayNameDictionaryKey(), translation);
    }
    
    @Override
    public void addDisplayNameTranslations(Map<Locales, String> translationsMap) {
        translationsMap.forEach((locale, translation)
                                        -> this.translations.addTranslation(locale, this.getDisplayNameDictionaryKey(), translation));
    }
    
    
    public abstract class Builder extends AbstractTranslatableRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>.Builder {
        
        protected Builder(TSelf initialBuildable) {
            super(initialBuildable);
        }
        
        public TBuilder displayName(Locales language, String translatedName) {
            this.buildable.addDisplayNameTranslation(language, translatedName);
            return this.self();
        }
        
        public TBuilder displayName(Map<Locales, String> nameTranslationsMap) {
            this.buildable.addDisplayNameTranslations(nameTranslationsMap);
            return this.self();
        }
        
    }
}
