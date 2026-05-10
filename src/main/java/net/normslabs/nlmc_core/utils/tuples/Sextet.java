/*
 * Project: nlmccore
 * @author Marc-Eric Boury (TheNorm24) <webmaster@normslabs.net>
 * @copyright (c) Marc-Eric Boury 2026 - All rights reserved
 * @since 2026-05-09 22:27
 */

package net.normslabs.nlmc_core.utils.tuples;


public class Sextet<T1, T2, T3, T4, T5, T6> {
    protected T1 first;
    protected T2 second;
    protected T3 third;
    protected T4 fourth;
    protected T5 fifth;
    protected T6 sixth;
    
    public Sextet(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }
    
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
    public T6 getSixth() {
        return this.sixth;
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
    public void setSixth(T6 value) {
        this.sixth = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sextet<?,?,?,?,?,?> sextet) {
            return this.first.equals(sextet.first)
                   && this.second.equals(sextet.second)
                   && this.third.equals(sextet.third)
                   && this.fourth.equals(sextet.fourth)
                   && this.fifth.equals(sextet.fifth)
                   && this.sixth.equals(sextet.sixth);
        }
        return false;
    }
}
