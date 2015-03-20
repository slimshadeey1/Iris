package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Nano extends BaseMetric {
    public Nano(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Nano.getFactor();
    }
}
