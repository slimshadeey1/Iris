package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public enum MetricConstants {
        Pico(0.000000000001d),
        Nano(0.000000001d),
        Micro(0.000001d),
        Milli(0.001d),
        Centi(0.01d),
        Deci(0.1d),

        // -- Standard Metric No Prefix --

        Deca(10d),
        Hecto(100d),
        Kilo(1000d),
        Mega(1000000d),
        Giga(1000000000d),
        Tera(1000000000000d),
        Peta(1000000000000000d); //largest

    private final double factor;

    MetricConstants(double factor){
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
