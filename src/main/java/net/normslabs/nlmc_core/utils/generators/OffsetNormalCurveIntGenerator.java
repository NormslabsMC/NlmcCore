/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 16:41
 */

package net.normslabs.nlmc_core.utils.generators;


import net.normslabs.nlmc_core.utils.functions.ToIntTriFunction;

import java.util.concurrent.ThreadLocalRandom;

public class OffsetNormalCurveIntGenerator implements ToIntTriFunction<Integer, Integer, Double> {
    
    public static int generate(int minInteger, int maxInteger, double mean) {
        if (minInteger > maxInteger) {
            throw new IllegalArgumentException("Lower bound must be <= upper bound.");
        }
        if (mean < minInteger || mean > maxInteger) {
            throw new IllegalArgumentException("Mean must be between lower bound and upper bound.");
        }
        
        // 6 standard deviations (3 on each side) covers 99.7% of the curve
        double stdDev = (maxInteger - minInteger) / 6.0;
        
        while (true) {
            double val = (ThreadLocalRandom.current().nextGaussian() * stdDev) + mean;
            int result = (int) Math.round(val);
            if (result >= minInteger && result <= maxInteger) {
                return result;
            }
        }
    }
    
    @Override
    public int applyAsInt(Integer minInteger, Integer maxInteger, Double mean) {
        return generate(minInteger, maxInteger, mean);
    }
}
