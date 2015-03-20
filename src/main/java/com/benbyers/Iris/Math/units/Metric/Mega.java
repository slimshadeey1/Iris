package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Mega extends BaseMetric {
    public Mega(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Mega.getFactor();
    }
}
