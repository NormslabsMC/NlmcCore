/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-06 10:10
 */

package net.normslabs.nlmc_core.utils;


import java.util.Objects;
import java.util.function.Supplier;

public record UniqueSupplier<T>(T value) implements Supplier<T> {
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof UniqueSupplier<?> that) return Objects.equals(value, that.value);
        return false;
    }
    
    @Override
    public int hashCode() { return Objects.hash(value); }
    
    @Override
    public T get() {
        return value;
    }
    
}
