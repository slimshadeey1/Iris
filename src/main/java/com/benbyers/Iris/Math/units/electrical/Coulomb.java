package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 */
public class Coulomb extends BaseMetric {
    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

    public Coulomb(double value) {
        super(value);
    }
}
