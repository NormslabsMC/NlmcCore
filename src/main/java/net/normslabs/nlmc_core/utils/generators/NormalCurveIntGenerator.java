/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 16:41
 */

package net.normslabs.nlmc_core.utils.generators;


import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToIntBiFunction;

public class NormalCurveIntGenerator implements ToIntBiFunction<Integer, Integer> {
    
    public static int generate(int minInteger, int maxInteger) {
        if (minInteger > maxInteger) {
            throw new IllegalArgumentException("Lower bound must be <= upper bound.");
        }
        
        double mean = (minInteger + maxInteger) / 2.0;
        // 6 standard deviations (3 on each side) covers 99.7% of the curve
        double stdDev = (maxInteger - minInteger) / 6.0;
        
        while (true) {
            // ThreadLocalRandom.current() is thread-safe and highly performant
            double val = (ThreadLocalRandom.current().nextGaussian() * stdDev) + mean;
            int result = (int) Math.round(val);
            
            // Validate the result is within the inclusive bounds
            if (result >= minInteger && result <= maxInteger) {
                return result;
            }
        }
    }
    
    @Override
    public int applyAsInt(Integer minInteger, Integer maxInteger) {
        return generate(minInteger, maxInteger);
    }
}
