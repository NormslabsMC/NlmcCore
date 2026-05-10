/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-08-02 06:35
 */

package net.normslabs.nlmc_core.utils.functions;


import net.nlmc.nlmc_core.infrastructure.utils.NlmcTuples;

@FunctionalInterface
public interface TripletSupplier<T1, T2, T3> {
    
    NlmcTuples.Triplet<T1, T2, T3> get();
    
}
