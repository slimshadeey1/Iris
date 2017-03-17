package com.benbyers.Iris.math.units.electrical;

import com.benbyers.Iris.math.units.Metric.Base;
import com.benbyers.Iris.math.units.Metric.BaseMetric;
import com.benbyers.Iris.math.units.Metric.Centi;
import com.benbyers.Iris.math.units.Metric.Deca;
import com.benbyers.Iris.math.units.Metric.Deci;
import com.benbyers.Iris.math.units.Metric.Giga;
import com.benbyers.Iris.math.units.Metric.Hecto;
import com.benbyers.Iris.math.units.Metric.Kilo;
import com.benbyers.Iris.math.units.Metric.Mega;
import com.benbyers.Iris.math.units.Metric.MetricConstants;
import com.benbyers.Iris.math.units.Metric.Micro;
import com.benbyers.Iris.math.units.Metric.Milli;
import com.benbyers.Iris.math.units.Metric.Nano;
import com.benbyers.Iris.math.units.Metric.Peta;
import com.benbyers.Iris.math.units.Metric.Pico;
import com.benbyers.Iris.math.units.Metric.Tera;

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

    public Ohm(double value, Volt volts) {
        super(value);
        this.volts = volts;
    }



    //    public long getCurrentForVoltage(){
//
//    }
//
//    public long getVoltageForCurrent(){
//
//    }

}
