package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/16/15.
 */
public class Base extends BaseMetric {
    public Base(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }
}
