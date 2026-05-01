/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 02:55
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.abstracts.IRegistrable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class NlmcRegistry<TMcObject, TNlmcDescriptor extends IRegistrable<TMcObject>> implements Map<ResourceLocation, NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> {
    private final Map<ResourceLocation, NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> internalMap;
    
    public NlmcRegistry() {
        this.internalMap = new HashMap<>();
    }
    
    public NlmcRegistry(Map<ResourceLocation, NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> initialMap) {
        this();
        this.putAll(initialMap);
    }
    
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> register(TNlmcDescriptor registrable) {
        NlmcRegistryEntry<TMcObject, TNlmcDescriptor> entry = new NlmcRegistryEntry<>(registrable);
        this.put(registrable.getResourceLocation(), entry);
        return entry;
    }
    
    @Override
    public int size() {
        return this.internalMap.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }
    
    @Override
    public boolean containsKey(Object o) {
        return this.internalMap.containsKey(o);
    }
    
    @Override
    public boolean containsValue(Object o) {
        return this.internalMap.containsValue(o);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> get(Object o) {
        return this.internalMap.get(o);
    }
    
    @Override
    public @Nullable NlmcRegistryEntry<TMcObject, TNlmcDescriptor> put(ResourceLocation resourceLocation,
                                                            NlmcRegistryEntry<TMcObject, TNlmcDescriptor> registryEntry) {
        return this.internalMap.put(resourceLocation, registryEntry);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> remove(Object o) {
        return this.internalMap.remove(o);
    }
    
    @Override
    public void putAll(@NotNull Map<? extends ResourceLocation, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> map) {
        this.internalMap.putAll(map);
    }
    
    @Override
    public void clear() {
        this.internalMap.clear();
    }
    
    @Override
    public @NotNull Set<ResourceLocation> keySet() {
        return this.internalMap.keySet();
    }
    
    @Override
    public @NotNull Collection<NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> values() {
        return this.internalMap.values();
    }
    
    @Override
    public @NotNull Set<Entry<ResourceLocation, NlmcRegistryEntry<TMcObject, TNlmcDescriptor>>> entrySet() {
        return this.internalMap.entrySet();
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> getOrDefault(Object key, NlmcRegistryEntry<TMcObject, TNlmcDescriptor> defaultValue) {
        return this.internalMap.getOrDefault((ResourceLocation) key, defaultValue);
    }
    
    @Override
    public void forEach(BiConsumer<? super ResourceLocation, ? super NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> action) {
        this.internalMap.forEach(action);
    }
    
    @Override
    public void replaceAll(
            BiFunction<? super ResourceLocation, ? super NlmcRegistryEntry<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> function) {
        this.internalMap.replaceAll(function);
    }
    
    @Override
    public @Nullable NlmcRegistryEntry<TMcObject, TNlmcDescriptor> putIfAbsent(ResourceLocation key, NlmcRegistryEntry<TMcObject, TNlmcDescriptor> value) {
        return this.internalMap.putIfAbsent(key, value);
    }
    
    @Override
    public boolean remove(Object key, Object value) {
        return this.internalMap.remove(key, value);
    }
    
    @Override
    public boolean replace(ResourceLocation key, NlmcRegistryEntry<TMcObject, TNlmcDescriptor> oldValue, NlmcRegistryEntry<TMcObject, TNlmcDescriptor> newValue) {
        return this.internalMap.replace(key, oldValue, newValue);
    }
    
    @Override
    public @Nullable NlmcRegistryEntry<TMcObject, TNlmcDescriptor> replace(ResourceLocation key, NlmcRegistryEntry<TMcObject, TNlmcDescriptor> value) {
        return this.internalMap.replace(key, value);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> computeIfAbsent(ResourceLocation key,
                                                              @NotNull Function<? super ResourceLocation, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> mappingFunction) {
        return this.internalMap.computeIfAbsent(key, mappingFunction);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> computeIfPresent(ResourceLocation key,
                                                               @NotNull BiFunction<? super ResourceLocation, ? super NlmcRegistryEntry<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.computeIfPresent(key, remappingFunction);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> compute(ResourceLocation key,
                                                      @NotNull BiFunction<? super ResourceLocation, ? super @Nullable NlmcRegistryEntry<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.compute(key, remappingFunction);
    }
    
    @Override
    public NlmcRegistryEntry<TMcObject, TNlmcDescriptor> merge(ResourceLocation key, @NotNull NlmcRegistryEntry<TMcObject, TNlmcDescriptor> value,
                                                    @NotNull BiFunction<? super NlmcRegistryEntry<TMcObject, TNlmcDescriptor>, ? super NlmcRegistryEntry<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntry<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.merge(key, value, remappingFunction);
    }
}
