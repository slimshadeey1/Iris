package com.benbyers.test;

import com.benbyers.Iris.util.Tuple;
import com.benbyers.Iris.math.Vector;
import com.benbyers.Iris.util.WeightedRandom;

/**
 * Created by benbyers on 3/10/15.
 */
public class Main {

    public void test() {

        Vector vector = new Vector(5,5,5);

        Vector[][] vectors = Vector.OnionSort(vector.getRadius(18));

        Vector[] vectors1 = Vector.sortHigh(vector.getRadius(7));

        Vector[] vectors2 = Vector.sortLow(vector.getRadius(23));

        Tuple<Vector,Vector> vectorSet = new Tuple<>(vector,vectors1[3]);

        WeightedRandom<Vector> random = new WeightedRandom<>(6);

        random.putObject(vector);

        random.getRandom();

        // Ill figure out a way to test this.

    }

}
