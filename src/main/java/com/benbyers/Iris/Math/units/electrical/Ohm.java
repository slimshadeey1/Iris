package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.MetricConstants;

/**
 * Created by benbyers on 3/11/15.
 *
 * v = i/r
 * r = i/v
 * i = current
 * v = volts
 * r = resistance
 */
public class Ohm extends BaseMetric {
    @Override public int thisValue() {
        return MetricConstants.Base.getFactor();
    }

    private Volt volts;
    private Ampre current;

    public Ohm(long volt,long current){
        super(volt/current);
        this.current = new Ampre(current);
        this.volts = new Volt(volt);
    }


    public Ohm(double value) {
        super(value);
    }

//    public long getCurrentForVoltage(){
//
//    }
//
//    public long getVoltageForCurrent(){
//
//    }

}
