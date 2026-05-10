/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:24
 */

package net.normslabs.nlmc_core.utils.tuples;


public class Quartet<T1, T2, T3, T4> {
    protected T1 first;
    protected T2 second;
    protected T3 third;
    protected T4 fourth;
    
    public Quartet(T1 first, T2 second, T3 third, T4 fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
    public Quartet(T1 first, T2 second, T3 third) {
        this(first, second, third, null);
    }
    public Quartet(T1 first, T2 second) {
        this(first, second, null, null);
    }
    public Quartet(T1 first) {
        this(first, null, null, null);
    }
    public Quartet() {}
    
    public T1 getFirst() {
        return this.first;
    }
    public T2 getSecond() {
        return this.second;
    }
    public T3 getThird() {
        return this.third;
    }
    public T4 getFourth() {
        return this.fourth;
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
    public void setFourth(T4 value) {
        this.fourth = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Quartet<?,?,?,?> quartet) {
            return this.first.equals(quartet.first)
                   && this.second.equals(quartet.second)
                   && this.third.equals(quartet.third)
                   && this.fourth.equals(quartet.fourth);
        }
        return false;
    }
}
