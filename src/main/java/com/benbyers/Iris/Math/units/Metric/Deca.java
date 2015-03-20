package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Deca extends BaseMetric {
    public Deca(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Deca.getFactor();
    }
}