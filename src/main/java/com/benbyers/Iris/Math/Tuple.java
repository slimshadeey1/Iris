package com.benbyers.Iris.Math;

/**
 * Created by benbyers on 3/7/15.
 */
public class Tuple<A,B> implements Comparable<Tuple> {
    A a;
    B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override public int compareTo(Tuple o) {
        return o.hashCode()-this.hashCode();
    }
}
