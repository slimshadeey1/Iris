package com.benbyers.Iris.math.units.Metric;

/**
 * Created by benbyers on 3/16/15.
 */
public abstract class BaseMetric<T extends BaseMetric> extends Number  {
    private double value;

    private int a = MetricConstants.Pico.getFactor();
    private int b = MetricConstants.Nano.getFactor();
    private int c = MetricConstants.Micro.getFactor();
    private int d = MetricConstants.Milli.getFactor();
    private int e = MetricConstants.Centi.getFactor();
    private int f = MetricConstants.Deci.getFactor();
    private int g = MetricConstants.Base.getFactor();
    private int h = MetricConstants.Deca.getFactor();
    private int i = MetricConstants.Hecto.getFactor();
    private int j = MetricConstants.Kilo.getFactor();
    private int k = MetricConstants.Mega.getFactor();
    private int l = MetricConstants.Giga.getFactor();
    private int m = MetricConstants.Tera.getFactor();
    private int n = MetricConstants.Peta.getFactor();


    public int thisValue() {
        return 0;
    }

    public Pico toPico() {
        return new Pico(this.value * Math.pow(10,(a-thisValue())));
    }//a

    public Nano toNano() {
        return new Nano(this.value * Math.pow(10,(b-thisValue())));
    }//b

    public Micro toMicro() {
        return new Micro(this.value * Math.pow(10,(c-thisValue())));
    }//c

    public Milli toMilli() {
        return new Milli(this.value * Math.pow(10,(d-thisValue())));
    }//d

    public Centi toCenti() {
        return new Centi(this.value * Math.pow(10,(e-thisValue())));
    }//e

    public Deci toDeci() {
        return new Deci(this.value * Math.pow(10,(f-thisValue())));
    }//f

    public Deca toDeca() {
        return new Deca(this.value * Math.pow(10,(h-thisValue())));
    }//g

    public Hecto toHecto() {
        return new Hecto(this.value * Math.pow(10,(i-thisValue())));
    }//h

    public Kilo toKilo() {
        return new Kilo(this.value * Math.pow(10,(j-thisValue())));
    }//i

    public Mega toMega() {
        return new Mega(this.value * Math.pow(10,(k-thisValue())));
    }//j

    public Giga toGiga() {
        return new Giga(this.value * Math.pow(10,(l-thisValue())));
    }//k

    public Tera toTera() {
        return new Tera(this.value * Math.pow(10,(m-thisValue())));
    }//l

    public Peta toPeta() {
        return new Peta(this.value * Math.pow(10,(n-thisValue())));
    }//m

    public Base toBase() {
        return new Base(this.value * Math.pow(10,(g-thisValue())));
    }//n

    public BaseMetric(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override public int intValue() {
        return (int)value;
    }

    @Override public long longValue() {
        return (long)value;
    }

    @Override public float floatValue() {
        return (float)value;
    }

    @Override public double doubleValue() {
        return value;
    }

    @Override public byte byteValue() {
        return super.byteValue();
    }

    @Override public short shortValue() {
        return super.shortValue();
    }
}
