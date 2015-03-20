package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Milli extends BaseMetric {
    public Milli(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Milli.getFactor();
    }

}
