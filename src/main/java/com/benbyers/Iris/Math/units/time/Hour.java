package com.benbyers.Iris.math.units.time;

/**
 * Created by benbyers on 3/11/15.
 */
public class Hour extends Number implements Time {

    private Double Value;

    private TimeConstants c = TimeConstants.Hour;

    public Hour(Double value) {
        Value = value;
    }

    @Override public void multiplyBy(Time t) {
        Value*=t.toHours().Value;

    }

    @Override public void add(Time t) {
        Value+=t.toHours().Value;

    }

    @Override public void subtract(Time t) {
        Value-=t.toHours().Value;

    }

    @Override public void divideBy(Time t) {
        Value/=t.toHours().Value;
    }

    @Override public int intValue() {
        return Value.intValue();
    }

    @Override public long longValue() {
        return Value.longValue();
    }

    @Override public float floatValue() {
        return Value.floatValue();
    }

    @Override public double doubleValue() {
        return Value;
    }

    @Override public Nanosecond toNanoSeconds() {
        return new Nanosecond(Value*c.getNanos());
    }

    @Override public Millisecond toMillis() {
        return new Millisecond(Value*c.getMillis());
    }

    @Override public Second toSeconds() {
        return new Second(Value*c.getSeconds());
    }

    @Override public Minute toMinutes() {
        return new Minute(Value*c.getMinutes());
    }

    @Override public Hour toHours() {
        return new Hour(Value*c.getHours());
    }

    @Override public Day toDays() {
        return new Day(Value*c.getDays());
    }

    @Override public Week toWeeks() {
        return new Week(Value*c.getWeeks());
    }

    @Override public Year toYears() {
        return new Year(Value*c.getYears());
    }
}
