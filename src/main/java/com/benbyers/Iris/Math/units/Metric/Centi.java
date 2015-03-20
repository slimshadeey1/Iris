package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/12/15.
 */
public class Centi extends BaseMetric {

    public Centi(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Centi.getFactor();
    }

}
