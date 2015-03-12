package com.benbyers.Iris.math.units.electrical;

/**
 * Created by benbyers on 3/11/15.
 *
 * Calculate Farads
 *
 * Equations:
 *
 *
 */
public class Farad {
    Volt volt;
    Ampre amp;
    Ohm ohm;
    Watt watt;
    Float farads;
    Float seconds;

    public Farad(Float farads) {
        this.farads = farads;
    }

    public Farad(Ampre amp, Float seconds) {
        this.amp = amp;
        this.seconds = seconds;
    }


}
