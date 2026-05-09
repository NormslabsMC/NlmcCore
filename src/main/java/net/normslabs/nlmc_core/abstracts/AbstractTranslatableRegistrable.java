/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 18:18
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.translations.Locales;
import net.normslabs.nlmc_core.translations.TranslationDictionary;

import java.util.Map;
import java.util.function.Function;

public abstract class AbstractTranslatableRegistrable<
        TSelf extends AbstractTranslatableRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>,
        TBuilder extends Builder<TBuilder, TSelf>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, TMcType>,
        TNlmcType extends TMcType,
        TMcType>
        extends AbstractMcRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>
        implements ITranslatable {
    
    
    protected final TranslationDictionary translations;
    
    public AbstractTranslatableRegistrable(String objectNamespace, String objectIdentifier,
                                           Function<TSelf, TNlmcType> objectCreatorFunction) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction);
        this.translations = new TranslationDictionary();
    }
    
    @Override
    public TranslationDictionary getTranslations() {
        return this.translations;
    }
    
    @Override
    public void addTranslation(Locales locale, String translationKey, String translationValue) {
        this.translations.addTranslation(locale, translationKey, translationValue);
    }
    
    @Override
    public void addTranslations(Locales locale, Map<String, String> translations) {
        this.translations.addTranslations(locale, translations);
    }
    
    @Override
    public void addTranslations(Map<String, Map<Locales, String>> translationsMap) {
        this.translations.addTranslations(translationsMap);
    }
    
    @Override
    public void addTranslations(TranslationDictionary translationsDictionary) {
        this.translations.merge(translationsDictionary);
    }
    
    public abstract class Builder extends net.normslabs.nlmc_core.abstracts.Builder<TBuilder, TSelf> {
        
        protected Builder(TSelf initialBuildable) {
            super(initialBuildable);
        }
        
        
        public TBuilder customTranslation(Locales locale, String translationKey, String translationValue) {
            this.buildable.addTranslation(locale, translationKey, translationValue);
            return this.self();
        }
        
        public TBuilder customTranslation(Locales locale, Map<String, String> translations) {
            this.buildable.addTranslations(locale, translations);
            return this.self();
        }
        
        public TBuilder customTranslation(Map<String, Map<Locales, String>> translationsMap) {
            this.buildable.addTranslations(translationsMap);
            return this.self();
        }
        
        public TBuilder customTranslation(TranslationDictionary translationsDictionary) {
            this.buildable.addTranslations(translationsDictionary);
            return this.self();
        }
    }
}
