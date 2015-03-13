package com.benbyers.Iris.math.units.time;

/**
 * Created by benbyers on 3/13/15.
 */
public class Year extends Number implements Time {

    private Long Value;

    public Year(Long value) {
        Value = value;
    }

    @Override public void multiplyBy(Time t) {

    }

    @Override public void add(Time t) {

    }

    @Override public void subtract(Time t) {

    }

    @Override public void divideBy(Time t) {

    }

    @Override public int intValue() {
        return 0;
    }

    @Override public long longValue() {
        return 0;
    }

    @Override public float floatValue() {
        return 0;
    }

    @Override public double doubleValue() {
        return 0;
    }

    @Override public Nanosecond toNanoSeconds() {
        return null;
    }

    @Override public Millisecond toMillis() {
        return null;
    }

    @Override public Second toSeconds() {
        return null;
    }

    @Override public Minute toMinutes() {
        return null;
    }

    @Override public Hour toHours() {
        return null;
    }

    @Override public Day toDays() {
        return null;
    }

    @Override public Week toWeeks() {
        return null;
    }

    @Override public Year toYears() {
        return null;
    }
}
