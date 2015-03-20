package com.benbyers.Iris.math.units.mass;

import com.benbyers.Iris.math.units.force.Newton;

/**
 * Created by benbyers on 3/11/15.
 * TODO: Add gravity calculations, finish newtons.
 */
public class Pound extends Number implements Mass {

    private double value;

    private double ptog = 453.592;

    private double ptot = 2204.62;

    private double pton = 4.44822162;

    private double ptoton = 2000;

    public Pound(Double value) {
        this.value = value;
    }

    public Pound(double value, double gravity){
        // Math to calc this here.
    }

    @Override public int intValue() {
        return (int)value;
    }

    @Override public long longValue() {
        return (long)value;
    }

    @Override public float floatValue() {
        return (float)value;
    }

    @Override public double doubleValue() {
        return value;
    }

    @Override public Gram toGrams() {
        return new Gram(value*ptog);
    }

    @Override public Tonne toTonnes() {
        return new Tonne(value/ptot);
    }

    @Override public Pound toPounds() {
        return this;
    }

    @Override public Newton toNewtons() {
        return new Newton(value*pton);
    }

    @Override public Pound toPounds(double gravity) {
        return new Pound(value,gravity);
    }

    @Override public Newton toNewtons(double gravity) { // TODO: Finish this

        return null;
    }

    @Override public Ton toTon() {
        return new Ton(value/ptoton);
    }

    @Override public Ton toTon(double gravity) {
        return new Ton((value/ptoton),gravity);
    }
}
