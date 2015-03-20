package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Giga extends BaseMetric {
    public Giga(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Giga.getFactor();
    }
}
