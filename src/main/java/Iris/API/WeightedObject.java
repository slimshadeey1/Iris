package Iris.API;

import Iris.Interfaces.*;

/**
 * Created by Ben Byers on 9/13/2014.
 */
public abstract class WeightedObject implements IWeightedObject {
    private Integer Freququency;

    @Override
    public void setFreququency(Integer freququency) {
        Freququency = freququency;
    }

    @Override
    public Integer getFreququency() {
        return Freququency;
    }
}
