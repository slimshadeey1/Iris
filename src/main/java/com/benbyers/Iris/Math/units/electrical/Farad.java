package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 *
 * Calculate Farads
 *
 * Equations:
 *
 *
 */
public class Farad extends BaseMetric {
    Volt volt;
    Ampre amp;
    Ohm ohm;
    Watt watt;
    Float farads;
    Float seconds;


    public Farad(Ampre amp, Float seconds) {
        this(amp.floatValue()/seconds);
        this.amp = amp;
        this.seconds = seconds;
    }

    public Farad(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

}
