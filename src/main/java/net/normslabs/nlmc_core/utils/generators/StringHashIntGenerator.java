/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 16:41
 */

package net.normslabs.nlmc_core.utils.generators;


import net.normslabs.nlmc_core.utils.functions.ToIntTriFunction;

import java.util.concurrent.ThreadLocalRandom;

public class StringHashIntGenerator implements ToIntTriFunction<String, Integer, Integer> {
    
    public static int generate(String input, int minInteger, int maxInteger) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        if (minInteger > maxInteger) {
            throw new IllegalArgumentException("Lower bound must be <= upper bound.");
        }
        
        // 1. Get a stable hash code for the string
        // String.hashCode() is deterministic across JVM runs
        int hash = input.hashCode();
        // 2. Map the hash into the desired range
        int range = maxInteger - minInteger + 1;
        // We use Math.abs() to avoid negative results from the hash
        // and % (modulo) to fit the range
        int offset = Math.abs(hash) % range;
        
        return minInteger + offset;
    }
    
    @Override
    public int applyAsInt(String input, Integer minInteger, Integer maxInteger) {
        return generate(input, minInteger, maxInteger);
    }
}
