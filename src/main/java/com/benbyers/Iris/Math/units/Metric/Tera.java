package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Tera extends BaseMetric {
    public Tera(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Tera.getFactor();
    }
}
