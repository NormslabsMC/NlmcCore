/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:22
 */

package net.normslabs.nlmc_core.utils.tuples;


public class Pair<T1, T2> {
    protected T1 first;
    protected T2 second;
    
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public Pair(T1 first) {
        this(first, null);
    }
    public Pair() {}
    
    public T1 getFirst() {
        return this.first;
    }
    public T2 getSecond() {
        return this.second;
    }
    public void setFirst(T1 value) {
        this.first = value;
    }
    public void setSecond(T2 value) {
        this.second = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair<?,?> pair) {
            return this.first.equals(pair.first) && this.second.equals(pair.second);
        }
        return false;
    }
}
