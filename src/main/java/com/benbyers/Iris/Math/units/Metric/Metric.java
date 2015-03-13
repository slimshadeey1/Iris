package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public interface Metric<T extends Metric> {
    public Pico<T> toPico(); //smallest
    public Nano<T> toNano();
    public Micro<T> toMicro();
    public Milli<T> toMilli();
    public Centi<T> toCenti();
    public Deci<T> toDeci();

    // -- Standard Metric No Prefix --

    public Deca<T> toDeca();
    public Hecto<T> toHecto();
    public Kilo<T> toKilo();
    public Mega<T> toMega();
    public Giga<T> toGiga();
    public Tera<T> toTera();
    public Peta<T> toPeta(); //largest

    public T toBase();
    
}
