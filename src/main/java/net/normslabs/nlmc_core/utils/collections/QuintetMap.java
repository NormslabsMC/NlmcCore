/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:42
 */

package net.normslabs.nlmc_core.utils.collections;


import net.normslabs.nlmc_core.utils.tuples.Quintet;

import java.util.HashMap;

public class QuintetMap<TKey, T1, T2, T3, T4, T5> extends HashMap<Object, Quintet<T1, T2, T3, T4, T5>> {
    
    public T1 getFirst(TKey key) {
        return get(key).getFirst();
    }
    
    public T2 getSecond(TKey key) {
        return get(key).getSecond();
    }
    
    public T3 getThird(TKey key) {
        return get(key).getThird();
    }
    
    public T4 getFourth(TKey key) {
        return get(key).getFourth();
    }
    
    public T5 getFifth(TKey key) {
        return get(key).getFifth();
    }
}
