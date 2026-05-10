/*
 * Project: NlmcCore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2025 - All rights reserved
 * @since 2025-07-20 03:07
 */

package net.normslabs.nlmc_core.utils.functions;

@FunctionalInterface
public interface SixtiConsumer<T1, T2, T3, T4, T5, T6> {
    
    void accept(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth);
    
}