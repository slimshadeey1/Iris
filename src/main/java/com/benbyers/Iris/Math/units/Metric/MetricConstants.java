package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public enum MetricConstants {
        Pico(-12),
        Nano(-9),
        Micro(-6),
        Milli(-3),
        Centi(-2),
        Deci(-1),

        // -- Standard Metric No Prefix --
        Base(1),


        Deca(2),
        Hecto(3),
        Kilo(4),
        Mega(7),
        Giga(10),
        Tera(13),
        Peta(16); //largest

    private int factor;


    MetricConstants(int factor){
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }
}
