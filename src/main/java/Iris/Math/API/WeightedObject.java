package Iris.Math.API;

import Iris.Interfaces.IWeightedObject;

/**
 * Created by Ben Byers on 9/13/2014.
 */
public abstract class WeightedObject implements IWeightedObject {

    private Integer frequency;

    @Override
    public Integer getFrequency() {
        return frequency;
    }

    @Override
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
