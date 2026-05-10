/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 16:41
 */

package net.normslabs.nlmc_core.utils.generators;


import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToIntBiFunction;

public class UniformRandomIntGenerator implements ToIntBiFunction<Integer, Integer> {
    
    public static int generate(int minInteger, int maxInteger) {
        if (minInteger > maxInteger) {
            throw new IllegalArgumentException("Lower bound must be <= upper bound.");
        }
        return ThreadLocalRandom.current().nextInt(minInteger, maxInteger + 1);
    }
    
    @Override
    public int applyAsInt(Integer minInteger, Integer maxInteger) {
        return generate(minInteger, maxInteger);
    }
}
