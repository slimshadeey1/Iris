package Iris.Interfaces;

import Iris.*;

/**
 * Created by Ben Byers on 9/10/2014.
 */
public interface IWeightedRunnable {
    public void setFrequency(Integer frequency);
    public Integer getFrequency();
    public void run();
}
