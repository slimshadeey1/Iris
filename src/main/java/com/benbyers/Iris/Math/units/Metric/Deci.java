package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Deci extends BaseMetric {
    public Deci(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Deci.getFactor();
    }
}
