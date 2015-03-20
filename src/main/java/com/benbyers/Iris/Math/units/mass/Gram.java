package com.benbyers.Iris.math.units.mass;


import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;
import com.benbyers.Iris.math.units.force.Newton;

import java.util.Comparator;

/**
 * Created by benbyers on 3/11/15.
 *
 * Kilogram is Base Unit
 */
public class Gram<T extends BaseMetric> extends BaseMetric implements Comparator<Gram>, Mass {

    T metricValue;

    public Gram(double value) {
        super(value);
    }

    public Gram(T metricValue){
        super(metricValue.toBase().getValue());
        this.metricValue = metricValue;
    }

    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

    @Override public int compare(Gram o1, Gram o2) {
        double b1 = o1.toBase().getValue();
        double b2 = o2.toBase().getValue();
        return b1 > b2 ? 1 : b1 < b2 ? -1 : 0;
    }

    @Override public Gram toGrams() {
        return new Gram(toBase().doubleValue());
    }

    @Override public Tonne toTonnes() {
        return null;
    }

    @Override public Pound toPounds() {
        return null;
    }

    @Override public Newton toNewtons() {
        return null;
    }

    @Override public Pound toPounds(double gravity) {
        return null;
    }

    @Override public Newton toNewtons(double gravity) {
        return null;
    }

    @Override public Ton toTon() {
        return null;
    }

    @Override public Ton toTon(double gravity) {
        return null;
    }
}
