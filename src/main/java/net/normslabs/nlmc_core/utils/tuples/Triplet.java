/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:23
 */

package net.normslabs.nlmc_core.utils.tuples;


public class Triplet<T1, T2, T3> {
    protected T1 first;
    protected T2 second;
    protected T3 third;
    
    public Triplet(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public Triplet(T1 first, T2 second) {
        this(first, second, null);
    }
    public Triplet(T1 first) {
        this(first, null, null);
    }
    public Triplet() {}
    
    public T1 getFirst() {
        return this.first;
    }
    public T2 getSecond() {
        return this.second;
    }
    public T3 getThird() {
        return this.third;
    }
    
    public void setFirst(T1 value) {
        this.first = value;
    }
    public void setSecond(T2 value) {
        this.second = value;
    }
    public void setThird(T3 value) {
        this.third = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triplet<?,?,?> triplet) {
            return this.first.equals(triplet.first)
                   && this.second.equals(triplet.second)
                   && this.third.equals(triplet.third);
        }
        return false;
    }
}
