/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-08 19:02
 */

package net.normslabs.nlmc_core.abstracts;


import net.normslabs.nlmc_core.infrastructure.abstracts.IDeferredRegistrar;
import net.normslabs.nlmc_core.translations.Locales;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class AbstractTooltippedRegistrable<
        TSelf extends AbstractTooltippedRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>,
        TBuilder extends AbstractBuilder<TBuilder, TSelf>,
        TRegistrar extends IDeferredRegistrar<? super TSelf, TMcType>,
        TNlmcType extends TMcType,
        TMcType>
        extends AbstractNamedRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>
        implements IHasTooltips {
    
    private int nextTooltipIndex = 0;
    
    public AbstractTooltippedRegistrable(String objectNamespace, String objectIdentifier,
                                         Function<? super TSelf, TNlmcType> objectCreatorFunction,
                                         String displayNameDictionaryKeyPrefix) {
        super(objectNamespace, objectIdentifier, objectCreatorFunction, displayNameDictionaryKeyPrefix);
    }
    
    @Override
    public int getNextTooltipIndex() {
        return this.nextTooltipIndex;
    }
    
    @Override
    public List<String> getTooltipDictionaryKeys() {
        List<String> tooltipDictionaryKeys = new ArrayList<>();
        for (int i = 0; i < this.nextTooltipIndex; i++) {
            tooltipDictionaryKeys.add(this.displayNameDictionaryKeyPrefix+".tooltips."+this.objectNamespace+"."+this.objectIdentifier+"."+i);
        }
        return tooltipDictionaryKeys;
    }
    
    @Override
    public void addTooltip(Map<Locales, String> tooltipTranslations) {
        String key = "items.tooltips."+this.objectNamespace+"."+this.objectIdentifier+"."+this.nextTooltipIndex;
        tooltipTranslations.forEach((locale, translation) -> this.translations.addTranslation(locale, key, translation));
        this.nextTooltipIndex++;
    }
    
    @Override
    public void addTooltips(List<Map<Locales, String>> tooltips) {
        tooltips.forEach(this::addTooltip);
    }
    
    
    public abstract class Builder extends AbstractNamedRegistrable<TSelf, TBuilder, TRegistrar, TNlmcType, TMcType>.Builder {
        
        protected Builder(TSelf initialBuildable) {
            super(initialBuildable);
        }
        
        public TBuilder addTooltip(Map<Locales, String> tooltipTranslations) {
            this.buildable.addTooltip(tooltipTranslations);
            return this.self();
        }
        
        public TBuilder addTooltips(List<Map<Locales, String>> tooltips) {
            this.buildable.addTooltips(tooltips);
            return this.self();
        }
        
    }
}
