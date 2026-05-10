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

import java.util.*;
import java.util.function.*;

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
        this.registerAll(initialMap);
    }
    
    public void register(TRegistrable registrable) {
        if (this.internalMap.containsKey(registrable.getResourceLocation())) {
            throw new IllegalArgumentException(
                    "[NlmcRegistry] : Cannot register " + registrable + " : duplicate key already present.");
        }
        this.internalMap.put(registrable.getResourceLocation(), registrable);
    }
    
    public void registerAll(Map<ResourceLocation, TRegistrable> registrableMap) {
        registrableMap.forEach((key, value) -> this.register(value));
    }
    
    public @NotNull TRegistrable get(ResourceLocation key) {
        if (!this.internalMap.containsKey(key)) {
            throw new IllegalArgumentException(
                    "[NlmcRegistry] : Cannot get map value for " + key + " : no matching key present.");
        }
        return this.internalMap.get(key);
    }
    
    public @Nullable TRegistrable getOrDefault(ResourceLocation key) {
        return this.internalMap.getOrDefault(key, null);
    }
    
    public boolean containsKey(ResourceLocation key) {
        return this.internalMap.containsKey(key);
    }
    
    public boolean containsValue(TRegistrable registrable) {
        return this.internalMap.containsValue(registrable);
    }
    
    public @Nullable ResourceLocation keyOf(TRegistrable registrable) {
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
    
    public @Nullable TRegistrable remove(ResourceLocation key) {
        return this.internalMap.remove(key);
    }
    
    public @Nullable TRegistrable remove(TRegistrable value) {
        var key = this.keyOf(value);
        if (key == null) {
            return null;
        }
        return this.internalMap.remove(key);
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
    
    public void forEach(BiConsumer<ResourceLocation, TRegistrable> action) {
        this.internalMap.forEach(action);
    }
    
    public Set<TRegistrable> findAll(Predicate<TRegistrable> predicate) {
        Set<TRegistrable> results = new HashSet<>();
        for (TRegistrable registrable : this.internalMap.values()) {
            if (predicate.test(registrable)) {
                results.add(registrable);
            }
        }
        return results;
    }
    
    public @Nullable TRegistrable findFirst(Predicate<TRegistrable> predicate) {
        for (TRegistrable registrable : this.internalMap.values()) {
            if (predicate.test(registrable)) {
                return registrable;
            }
        }
        return null;
    }
    
    public boolean all(Predicate<TRegistrable> predicate) {
        for (TRegistrable registrable : this.internalMap.values()) {
            if (!predicate.test(registrable)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean any(Predicate<TRegistrable> predicate) {
        for (TRegistrable registrable : this.internalMap.values()) {
            if (predicate.test(registrable)) {
                return true;
            }
        }
        return false;
    }
    
    public void apply(Consumer<TRegistrable> effector) {
        for (TRegistrable registrable : this.internalMap.values()) {
            effector.accept(registrable);
        }
    }
    
}
