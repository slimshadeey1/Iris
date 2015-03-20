package com.benbyers.Iris.math.units.mass;

import com.benbyers.Iris.math.units.force.Newton;

/**
 * Created by benbyers on 3/11/15.
 */
public class Ton extends Number implements Mass {

    private double value;



    public Ton(double value) {
        this.value = value;
    }

    public Ton(double value, double gravity){
        // Math to calc this here.
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

    @Override public Pound toPounds(double gravity) {
        return null;
    }

    @Override public Newton toNewtons(double gravity) {
        return null;
    }

    @Override public Ton toTon() {
        return null;
    }

    @Override public Ton toTon(double gravity) {
        return null;
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
}
