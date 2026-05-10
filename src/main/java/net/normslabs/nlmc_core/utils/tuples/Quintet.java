/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:26
 */

package net.normslabs.nlmc_core.utils.tuples;


public class Quintet<T1, T2, T3, T4, T5> {
    protected T1 first;
    protected T2 second;
    protected T3 third;
    protected T4 fourth;
    protected T5 fifth;
    
    public Quintet(T1 first, T2 second, T3 third, T4 fourth, T5 fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }
    public Quintet(T1 first, T2 second, T3 third, T4 fourth) {
        this(first, second, third, fourth, null);
    }
    public Quintet(T1 first, T2 second, T3 third) {
        this(first, second, third, null, null);
    }
    public Quintet(T1 first, T2 second) {
        this(first, second, null, null, null);
    }
    public Quintet(T1 first) {
        this(first, null, null, null, null);
    }
    public Quintet() {}
    
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
    public T5 getFifth() {
        return this.fifth;
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
    public void setFifth(T5 value) {
        this.fifth = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Quintet<?,?,?,?,?> quintet) {
            return this.first.equals(quintet.first)
                   && this.second.equals(quintet.second)
                   && this.third.equals(quintet.third)
                   && this.fourth.equals(quintet.fourth)
                   && this.fifth.equals(quintet.fifth);
        }
        return false;
    }
}
