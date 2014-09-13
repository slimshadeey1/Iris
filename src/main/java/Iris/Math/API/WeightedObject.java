package Iris.Math.API;

import Iris.Interfaces.*;

/**
 * Created by Ben Byers on 9/13/2014.
 */
public abstract class WeightedObject implements IWeightedObject {
    private Integer frequency;

    @Override
    public void setFreququency(Integer frequency) {
        frequency = frequency;
    }

    @Override
    public Integer getfrequency() {
        return frequency;
    }
}
