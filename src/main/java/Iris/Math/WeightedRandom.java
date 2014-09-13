package Iris.Math;

import Iris.Interfaces.*;

import java.util.*;

/**
 * Created by Ben Byers on 9/10/2014.
 */
public class WeightedRandom {
    private Random random = new Random();
    private int FINE_CURVE;
    private int sumRun = 0;
    private int sumReturn = 0;
    private ArrayList<IWeightedRunnable> ExecList;
    private ArrayList<IWeightedObject> returnList;

    public WeightedRandom(Integer tune) {
        FINE_CURVE = tune;
        returnList = new ArrayList<IWeightedObject>();
        ExecList = new ArrayList<IWeightedRunnable>();
    }

    public boolean addWeightedRunnable(IWeightedRunnable clazz) {
        if (ExecList.contains(clazz)) {
            return false;
        } else {
            sumRun = sumRun + clazz.getFreququency();
            ExecList.add(clazz);
            return true;
        }
    }

    public boolean addWeightedObject(IWeightedObject e) {
        if (returnList.isEmpty()) {
            return false;
        } else {
            sumReturn = sumReturn + e.getFreququency();
            returnList.add(e);
            return true;
        }
    }

    public void runRandom() throws NullPointerException {
        if (ExecList.isEmpty()) {
            throw new NullPointerException();
        } else {

            ArrayList<IWeightedRunnable> clazzes = new ArrayList<IWeightedRunnable>();
            int rand = random.nextInt(sumRun);
            for (IWeightedRunnable clazz : ExecList) {     // For each item on the list
                if (rand < clazz.getFreququency()) {               // This checks the items set frequency to the current frequency, then adds it to the qualification list
                    if (rand <= FINE_CURVE) {                  // This adds a curve to the generation of the drops list, for items under the curve.
                        if (clazz.getFreququency() <= FINE_CURVE)  // the reason for this being if something is 1% and we get 1%, then everything above
                            clazzes.add(clazz);                // would be added making it nearly impossible to get. This just balances it a little more
                    } else {                                   // We will only add the items the are below 10% but greater than the cutoff
                        clazzes.add(clazz);                    // Adding everything to list if above 10%, and meets the cutoff
                    }
                }
            }
            if (!clazzes.isEmpty()) {
                int select = random.nextInt(clazzes.size());
                clazzes.get(select).run();
            }
        }
    }

    public IWeightedObject returnRandom() throws NullPointerException {
        if (returnList.isEmpty()) {
            throw new NullPointerException();
        } else {
            ArrayList<IWeightedObject> objects = new ArrayList<IWeightedObject>();
            int rand = random.nextInt(sumRun);
            for (IWeightedObject e : returnList) {     // For each item on the list
                if (rand < e.getFreququency()) {               // This checks the items set frequency to the current frequency, then adds it to the qualification list
                    if (rand <= FINE_CURVE) {                  // This adds a curve to the generation of the drops list, for items under the curve.
                        if (e.getFreququency() <= FINE_CURVE)  // the reason for this being if something is 1% and we get 1%, then everything above
                            objects.add(e);                // would be added making it nearly impossible to get. This just balances it a little more
                    } else {                                   // We will only add the items the are below 10% but greater than the cutoff
                        objects.add(e);                    // Adding everything to list if above 10%, and meets the cutoff
                    }
                }
            }
            if (!objects.isEmpty()) {
                int select = random.nextInt(objects.size());
                return objects.get(select);
            } else {
                throw new NullPointerException();
            }
        }
    }

}