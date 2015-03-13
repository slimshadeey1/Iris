package com.benbyers.Iris.math.units.time;


/**
 * Created by benbyers on 3/13/15.
 */
public interface Time {

    public Nanosecond toNanoSeconds();

    public Millisecond toMillis();

    public Second toSeconds();

    public Minute toMinutes();

    public Hour toHours();

    public Day toDays();

    public Week toWeeks();

    public Year toYears();

    public void multiplyBy(Time t);

    public void add(Time t);

    public void subtract(Time t);

    public void divideBy(Time t);

}
