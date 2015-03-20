package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 *
 * Base Unit
 */
public class Ampre extends BaseMetric {
    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

    public Ampre(double value) {
        super(value);
    }

}
