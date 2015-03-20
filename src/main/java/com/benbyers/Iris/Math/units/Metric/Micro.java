package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Micro extends BaseMetric {
    public Micro(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Micro.getFactor();
    }
}
