package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 */
public class Watt extends BaseMetric {
    public Watt(double value) {
        super(value);
    }

    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

}
