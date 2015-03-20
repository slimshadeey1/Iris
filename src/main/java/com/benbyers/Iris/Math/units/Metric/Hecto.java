package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Hecto extends BaseMetric {
    public Hecto(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Hecto.getFactor();
    }
}
