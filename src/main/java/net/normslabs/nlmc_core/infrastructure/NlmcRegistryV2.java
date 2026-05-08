/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 02:55
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.abstracts.IDescriptor;
import net.normslabs.nlmc_core.abstracts.IMcObjectRegistrarV2;
import net.normslabs.nlmc_core.infrastructure.builders.IBaseBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Custom type implementing the {@link Map} interface that represent a registry/holder for
 * the object descriptors registered in a {@link IMcObjectRegistrarV2 registrar}.
 *
 * @param <TMcObject> The type of the internal minecraft/forge objects described by the descriptor objects.
 * @param <TNlmcDescriptor> The type of the object descriptors stored in the registry
 * @param <TDescriptorBuilder> The type of the builder for the stored object descriptors
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 04:17
 */
public class NlmcRegistryV2<TMcObject, TNlmcDescriptor>
        implements Map<ResourceLocation, NlmcRegistryEntryV2<? extends TMcObject, TNlmcDescriptor>> {
    
    private final Map<ResourceLocation, NlmcRegistryEntryV2<? extends TMcObject, TNlmcDescriptor>> internalMap;
    
    public NlmcRegistryV2() {
        this.internalMap = new HashMap<>();
    }
    
    public NlmcRegistryV2(Map<ResourceLocation, NlmcRegistryEntryV2<? extends TMcObject, TNlmcDescriptor>> initialMap) {
        this();
        this.putAll(initialMap);
    }
    
    public NlmcRegistryEntryV2<? extends TMcObject, TNlmcDescriptor> register(TNlmcDescriptor registrable) {
        NlmcRegistryEntryV2<? extends TMcObject, TNlmcDescriptor> entry = new NlmcRegistryEntryV2<>(registrable);
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
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> get(Object o) {
        return this.internalMap.get(o);
    }
    
    @Override
    public @Nullable NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> put(ResourceLocation resourceLocation,
                                                                         NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> registryEntry) {
        return this.internalMap.put(resourceLocation, registryEntry);
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> remove(Object o) {
        return this.internalMap.remove(o);
    }
    
    @Override
    public void putAll(@NotNull Map<? extends ResourceLocation, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> map) {
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
    public @NotNull Collection<NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> values() {
        return this.internalMap.values();
    }
    
    @Override
    public @NotNull Set<Entry<ResourceLocation, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>>> entrySet() {
        return this.internalMap.entrySet();
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> getOrDefault(Object key, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> defaultValue) {
        return this.internalMap.getOrDefault((ResourceLocation) key, defaultValue);
    }
    
    @Override
    public void forEach(BiConsumer<? super ResourceLocation, ? super NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> action) {
        this.internalMap.forEach(action);
    }
    
    @Override
    public void replaceAll(
            BiFunction<? super ResourceLocation, ? super NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> function) {
        this.internalMap.replaceAll(function);
    }
    
    @Override
    public @Nullable NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> putIfAbsent(ResourceLocation key, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> value) {
        return this.internalMap.putIfAbsent(key, value);
    }
    
    @Override
    public boolean remove(Object key, Object value) {
        return this.internalMap.remove(key, value);
    }
    
    @Override
    public boolean replace(ResourceLocation key, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> oldValue, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> newValue) {
        return this.internalMap.replace(key, oldValue, newValue);
    }
    
    @Override
    public @Nullable NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> replace(ResourceLocation key, NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> value) {
        return this.internalMap.replace(key, value);
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> computeIfAbsent(
            ResourceLocation key, @NotNull Function<? super ResourceLocation, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> mappingFunction) {
        return this.internalMap.computeIfAbsent(key, mappingFunction);
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> computeIfPresent(ResourceLocation key,
                                                               @NotNull BiFunction<? super ResourceLocation, ? super NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.computeIfPresent(key, remappingFunction);
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> compute(ResourceLocation key,
                                                      @NotNull BiFunction<? super ResourceLocation, ? super @Nullable NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.compute(key, remappingFunction);
    }
    
    @Override
    public NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> merge(ResourceLocation key, @NotNull NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor> value,
                                                    @NotNull BiFunction<? super NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>, ? super NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>, ? extends NlmcRegistryEntryV2<TMcObject, TNlmcDescriptor>> remappingFunction) {
        return this.internalMap.merge(key, value, remappingFunction);
    }
}
