package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Pico extends BaseMetric {

    public Pico(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Pico.getFactor();
    }

}
