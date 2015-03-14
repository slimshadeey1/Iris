package com.benbyers.Iris.math.util;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by benbyers on 3/8/15.
 */
public class WeightedRandom<T> {
    private T aobjects[];
    private int Weight;

    public WeightedRandom(int Weight) {
        this.Weight = Weight;
    }

    public void putObject(T aobject){
        this.aobjects[this.aobjects.length] = aobject;
    }

    public T[] getObjects() {
        return aobjects;
    }

    public void setObjects(T[] aobjects) {
        this.aobjects = aobjects;
    }

    public int getWeight() {
        return Weight;
    }

    public T getRandom() {
        Random random = new Random();
        ArrayList<T> at = new ArrayList<>();
        int a = aobjects.length;

        for (T t:aobjects){
            if(random.nextInt(a) < Weight){
                at.add(t);
            }
        }
        if(!at.isEmpty()) {
            return at.get(random.nextInt(at.size()));
        } else {
            return aobjects[random.nextInt(a)];
        }
    }
}
