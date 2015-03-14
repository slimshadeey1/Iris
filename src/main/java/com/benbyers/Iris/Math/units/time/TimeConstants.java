package com.benbyers.Iris.math.units.time;

/**
 * Created by benbyers on 3/13/15.
 */
public enum TimeConstants {

    Nanosecond(1,0.001,1e-6,1e-9,1.6667e-11,2.7778e-13,1.1574e-14,1.6534e-15,3.1689e-17),
    Microsecond(1000,1,0.001,1e-6,1.6667e-8,2.7778e-10,1.1574e-11,1.6534e-12,3.1689e-14),
    Millisecond(1e6,1000,1,0.001,1.6667e-5,2.7778e-7,1.1574e-8,1.6534e-9,3.1689e-11),
    Second(1e+9,1e+6,1000,1,0.0166667,0.000277778,1.1574e-5,1.6534e-6,3.1689e-8),
    Minute(6e+10,6e+7,6e+4,60,1,0.0166667,0.000694444,9.9206e-5,1.9013e-6),
    Hour(3.6e+12,3.6e+9,3.6e+6,3600,60,1,0.0416667,0.00595238,0.00011408),
    Day(8.64e+13,8.64e+10,8.64e+7,8.64e+4,1440,24,1,0.142857,0.00273791),
    Week(6.048e+14,6.048e+11,6.048e+8,6.048e+5,10080,168,7,1,0.0191654),
    Year(3.156e+16,3.156e+13,3.156e+10,3.156e+7,525949,8765.81,365.242,52.1775,1);

    private double nanos;
    private double micros;
    private double millis;
    private double seconds;
    private double minutes;
    private double hours;
    private double days;
    private double weeks;
    private double years;

    TimeConstants(double nanos, double micros, double millis, double seconds, double minutes, double hours,
        double days, double weeks, double years) {
        this.nanos = nanos;
        this.micros = micros;
        this.millis = millis;
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.days = days;
        this.weeks = weeks;
        this.years = years;
    }

    public double getNanos() {
        return nanos;
    }

    public double getMicros() {
        return micros;
    }

    public double getMillis() {
        return millis;
    }

    public double getSeconds() {
        return seconds;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getHours() {
        return hours;
    }

    public double getDays() {
        return days;
    }

    public double getWeeks() {
        return weeks;
    }

    public double getYears() {
        return years;
    }
}
