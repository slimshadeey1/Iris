package com.benbyers.Iris.math.units.mass;


import com.benbyers.Iris.math.units.Metric.Centi;
import com.benbyers.Iris.math.units.Metric.Deca;
import com.benbyers.Iris.math.units.Metric.Deci;
import com.benbyers.Iris.math.units.Metric.Giga;
import com.benbyers.Iris.math.units.Metric.Hecto;
import com.benbyers.Iris.math.units.Metric.Kilo;
import com.benbyers.Iris.math.units.Metric.Mega;
import com.benbyers.Iris.math.units.Metric.Metric;
import com.benbyers.Iris.math.units.Metric.Micro;
import com.benbyers.Iris.math.units.Metric.Milli;
import com.benbyers.Iris.math.units.Metric.Nano;
import com.benbyers.Iris.math.units.Metric.Peta;
import com.benbyers.Iris.math.units.Metric.Pico;
import com.benbyers.Iris.math.units.Metric.Tera;
import com.benbyers.Iris.math.units.force.Newton;
import com.benbyers.Iris.math.units.weight.Ton;

import java.util.Comparator;

/**
 * Created by benbyers on 3/11/15.
 *
 * Kilogram is Base Unit
 */
public class Gram extends Number implements Comparator<Gram>, Mass, Metric<Gram> {

    private double value;

    public Gram(Double grams) {
        this.value = grams;
    }

    @Override public int intValue() {
        return 0;
    }

    @Override public long longValue() {
        return 0;
    }

    @Override public float floatValue() {
        return 0;
    }

    @Override public double doubleValue() {
        return 0;
    }

    @Override public byte byteValue() {
        return super.byteValue();
    }

    @Override public short shortValue() {
        return super.shortValue();
    }

    @Override public int compare(Gram o1, Gram o2) {
        return 0;
    }

    @Override public Gram toGrams() {
        return null;
    }

    @Override public Tonne toTonnes() {
        return null;
    }

    @Override public Pound toPounds() {
        return null;
    }

    @Override public Newton toNewtons() {
        return null;
    }

    @Override public Ton toTon(Double gravity) {
        return null;
    }

    @Override public com.benbyers.Iris.math.units.weight.Pound toPounds(Double Gravity) {
        return null;
    }

    @Override public Pico<Gram> toPico() {
        return null;
    }

    @Override public Nano<Gram> toNano() {
        return null;
    }

    @Override public Micro<Gram> toMicro() {
        return null;
    }

    @Override public Milli<Gram> toMilli() {
        return null;
    }

    @Override public Centi<Gram> toCenti() {
        return null;
    }

    @Override public Deci<Gram> toDeci() {
        return null;
    }

    @Override public Deca<Gram> toDeca() {
        return null;
    }

    @Override public Hecto<Gram> toHecto() {
        return null;
    }

    @Override public Kilo<Gram> toKilo() {
        return null;
    }

    @Override public Mega<Gram> toMega() {
        return null;
    }

    @Override public Giga<Gram> toGiga() {
        return null;
    }

    @Override public Tera<Gram> toTera() {
        return null;
    }

    @Override public Peta<Gram> toPeta() {
        return new Peta<>();
    }

    @Override public Gram toBase() {
        return null;
    }
}
