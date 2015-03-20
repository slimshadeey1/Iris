package com.benbyers.Iris.math.units.frequency;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 *
 * Hertz represents the cycles in 1 second
 *
 * h=w/s
 * h= hertz
 * w= waves
 * s= seconds
 */
public class Hertz extends BaseMetric {

    private long seconds;
    private long cycles;

    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

    public Hertz(double value) {
        super(value);
    }


}
