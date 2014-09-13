package Iris.Math.API;

import Iris.Interfaces.*;

/**
 * Created by Ben Byers on 9/13/2014.
 */
public abstract class WeightedObject implements IWeightedObject {
    private Integer frequency;

    @Override
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public Integer getFrequency() {
        return frequency;
    }
}
