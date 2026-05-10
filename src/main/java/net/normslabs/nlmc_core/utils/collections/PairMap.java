/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:42
 */

package net.normslabs.nlmc_core.utils.collections;


import net.normslabs.nlmc_core.utils.tuples.Pair;

import java.util.HashMap;

public class PairMap<TKey, T1, T2> extends HashMap<Object, Pair<T1, T2>> {
    
    public T1 getFirst(TKey key) {
        return get(key).getFirst();
    }
    
    public T2 getSecond(TKey key) {
        return get(key).getSecond();
    }
}
