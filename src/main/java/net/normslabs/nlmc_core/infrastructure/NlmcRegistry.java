/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-04-30 02:55
 */

package net.normslabs.nlmc_core.infrastructure;


import net.minecraft.resources.ResourceLocation;
import net.normslabs.nlmc_core.abstracts.IRegistrable;
import net.normslabs.nlmc_core.infrastructure.abstracts.IRegistrar;
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
 * Custom {@link Map}-like data storage type that represent a registry for
 * the object descriptors registered in a {@link IRegistrar registrar}.
 *
 * @param <TRegistrable> The type of the {@link IRegistrable} objects stored in this registry.
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @since 2026-05-04 04:17
 */
public class NlmcRegistry<TRegistrable extends IRegistrable<? extends TRegistrable, ?, ?>> {
    
    private final Map<ResourceLocation, TRegistrable> internalMap;
    
    public NlmcRegistry() {
        this.internalMap = new HashMap<>();
    }
    
    public NlmcRegistry(Map<ResourceLocation, TRegistrable> initialMap) {
        this();
        this.internalMap.putAll(initialMap);
    }
    
    public void register(TRegistrable registrable) {
        this.internalMap.put(registrable.getResourceLocation(), registrable);
    }
    
    public TRegistrable get(ResourceLocation resourceLocation) {
        return this.internalMap.get(resourceLocation);
    }
    
    public boolean containsKey(ResourceLocation key) {
        return this.internalMap.containsKey(key);
    }
    
    public boolean containsValue(TRegistrable registrable) {
        return this.internalMap.containsValue(registrable);
    }
    
    public ResourceLocation keyOf(TRegistrable registrable) {
        for (Map.Entry<ResourceLocation, TRegistrable> entry : this.internalMap.entrySet()) {
            if (entry.getValue() == registrable) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }
    
    public TRegistrable remove(ResourceLocation key) {
        return this.internalMap.remove(key);
    }
    
    public TRegistrable remove(TRegistrable value) {
        return this.internalMap.remove(this.keyOf(value));
    }
    
    public void putAll(@NotNull Map<ResourceLocation, TRegistrable> map) {
        this.internalMap.putAll(map);
    }
    
    public void clear() {
        this.internalMap.clear();
    }
    
    public @NotNull Set<ResourceLocation> keySet() {
        return this.internalMap.keySet();
    }
    
    public @NotNull Collection<TRegistrable> values() {
        return this.internalMap.values();
    }
    
    public @NotNull Set<Map.Entry<ResourceLocation, TRegistrable>> entrySet() {
        return this.internalMap.entrySet();
    }
    
    public TRegistrable getOrDefault(ResourceLocation key) {
        return this.internalMap.getOrDefault(key, null);
    }
    
    public void forEach(BiConsumer<ResourceLocation, TRegistrable> action) {
        this.internalMap.forEach(action);
    }
    
    public void replaceAll(
            BiFunction<ResourceLocation, TRegistrable, TRegistrable> function) {
        this.internalMap.replaceAll(function);
    }
    
    public @Nullable TRegistrable putIfAbsent(ResourceLocation key, TRegistrable value) {
        return this.internalMap.putIfAbsent(key, value);
    }
    
    public boolean replace(ResourceLocation key, TRegistrable oldValue, TRegistrable newValue) {
        return this.internalMap.replace(key, oldValue, newValue);
    }
    
    public @Nullable TRegistrable replace(ResourceLocation key, TRegistrable value) {
        return this.internalMap.replace(key, value);
    }
    
    public TRegistrable computeIfAbsent(
            ResourceLocation key, @NotNull Function<ResourceLocation, TRegistrable> mappingFunction) {
        return this.internalMap.computeIfAbsent(key, mappingFunction);
    }
    
    public TRegistrable computeIfPresent(ResourceLocation key,
                                                              @NotNull BiFunction<ResourceLocation, TRegistrable, TRegistrable> remappingFunction) {
        return this.internalMap.computeIfPresent(key, remappingFunction);
    }
    
    public TRegistrable compute(ResourceLocation key,
                                                     @NotNull BiFunction<ResourceLocation, TRegistrable, TRegistrable> remappingFunction) {
        return this.internalMap.compute(key, remappingFunction);
    }
    
    public TRegistrable merge(ResourceLocation key, @NotNull TRegistrable value,
                                                    @NotNull BiFunction<TRegistrable, TRegistrable, TRegistrable> remappingFunction) {
        return this.internalMap.merge(key, value, remappingFunction);
    }
}
