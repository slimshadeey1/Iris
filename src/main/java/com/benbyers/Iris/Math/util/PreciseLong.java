package com.benbyers.Iris.math.util;

/**
 * Created by benbyers on 3/13/15.
 */
public class PreciseLong extends Number implements Comparable<PreciseLong> {

    private Long whole;

    private Long decimal;

    public PreciseLong(long whole, long decimal) {
        this.whole = whole;
        this.decimal = decimal;
    }

    @Override public int intValue() {
        return whole.intValue();
    }

    @Override public long longValue() {
        return whole;
    }

    @Override public float floatValue() {
        return new Float(whole+"."+decimal);
    }

    @Override public double doubleValue() {
        return new Double(whole+"."+decimal);
    }

    @Override public byte byteValue() {
        return whole.byteValue();
    }

    // Not sure how to approach this one.
    @Override public short shortValue() {
        return whole.shortValue();
    }

    // Will customize later
    @Override public int hashCode() {
        return super.hashCode();
    }

    @Override public boolean equals(Object obj) {
        return ((PreciseLong) obj).whole == this.whole && ((PreciseLong) obj).decimal == this.decimal;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override public String toString() {
        return this.whole + "." + this.decimal;
    }

    @Override protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override public int compareTo(PreciseLong o) {
        return
            this.whole > o.whole ? 1 :
                this.whole < o.whole ? -1 :
                    this.whole == o.whole ? (
                        this.decimal > o.decimal ? 1 :
                            this.decimal < o.decimal ? -1 :
                                this.decimal == o.decimal ? 0 : 0) : 0;
    }

}
