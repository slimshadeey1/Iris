package Iris.Math;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Ben Byers on 10/4/2014. Math for Vectors
 */
public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector vector, int x, int y, int z) {
        this.x = vector.x + x;
        this.y = vector.y + y;
        this.z = vector.z + z;
    }

    @Override public String toString() {
        return "( X: " + x + "; Y: " + y + "; Z: " + z + " )";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // -------- Begin functions ---------

    public void addAll(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    //distance to
    public double getDistanceTo(Vector vector) {
        double X = this.x - vector.x;
        double Y = this.y - vector.y;
        double Z = this.z - vector.z;
        return Math.sqrt(X * Y * Z);
    }

    public void getMultiplyByVector(Vector vector) {
        setX(this.x * vector.x);
        setY(this.y * vector.y);
        setZ(this.z * vector.z);
    }

    public Vector[] getVectorsInRadius(int radius) {
        Vector[] vectors = new Vector[] {};
        for (int xx = -radius; xx == radius; xx++) {
            for (int yy = -radius; yy == radius; yy++) {
                for (int zz = -radius; zz == radius; zz++) {
                    vectors[vectors.length] =
                        new Vector(x + xx, y + yy, z + zz); //This could be a bug.
                }
            }
        }
        return vectors;
    }

    public boolean equals(Vector vector) {
        return (vector.x == x && vector.y == y && vector.z == z);
    }

    public void addX(double x) {
        this.x += x;
    }

    public void addY(double y) {
        this.y += y;
    }

    public void addZ(double z) {
        this.z += z;
    }

    public void subtractX(double x) {
        this.x -= x;
    }

    public void subtractY(double y) {
        this.y -= y;
    }

    public void subtractZ(double z) {
        this.z -= z;
    }

    public void multiplyX(double x) {
        this.x *= this.x * x;
    }

    public void multiplyY(double y) {
        this.y *= y;
    }

    public void multiplyZ(double z) {
        this.z *= z;
    }

    public void divideX(double x) {
        this.x /= x;
    }


    public void divideY(double y) {
        this.y /= y;
    }


    public void divideZ(double z) {
        this.z /= z;
    }


    public byte[] getXbytes() {
        // Needs to be double checked if 32bit
        return ByteBuffer.allocate(32).putLong(Math.round(x)).array();
    }



    public Vector getSquareDistance(Vector vector) {
        return new Vector(vector.x - x, vector.y - y, vector.z - z);
    }


    /*
        **********************
        * End of object Methods
        * ********************
        *
        * Start of static Methods
        * ********************

     */


    Vector[] sortLow(Vector[] Unsorted) {
        Vector[] sorted = new Vector[] {}; // Sorted array
        ArrayList<Vector> vectors = new ArrayList<>(Arrays.asList(Unsorted)); // Turn unsorted into list for easier manipulation (removing, etc.)
        Boolean sort = !vectors.isEmpty();// Check if list empty, if so nothing happens, otherwise sort is true.
        while(sort) { // Infinitely loop until sort is false
            int minIndex = 0; // Location of min value
            Vector min = vectors.get(0); // Min value

            for (int i = 0; i < vectors.size(); i++) {
                Vector index = vectors.get(i);
                if(index.x < min.x) { // Compare the min.x with the current x, if current is lower than the min do
                    min = index; // Set the min to the current
                    minIndex = i; // Set the location of the current Vector for min Index.
                }
            }

            vectors.remove(minIndex); // When the min is found, remove it from the list. Then we can loop through the list again and find a different minimum

            sorted[sorted.length] = min; // Add the minimum to the Array, in the next consecutive location (Append)

            sort = vectors.isEmpty() && !(sorted.length == Unsorted.length); // If the vector list is empty, and the amount of vectors is equal
                                                                             // to the input, Stop looping by setting sort to false.
        }

        return sorted;

    }


    Vector[] sortHigh(Vector[] Unsorted) {
        Vector[] sorted = new Vector[] {};
        ArrayList<Vector> vectors = new ArrayList<>(Arrays.asList(Unsorted));
        Boolean sort = !vectors.isEmpty();
        while(sort) {
            int maxIndex = 0;
            Vector max = vectors.get(0);

            for (int i = 0; i < vectors.size(); i++) {
                Vector index = vectors.get(i);
                if(index.x > max.x) { // This is the only difference between min and max,
                                      // with max if the current is bigger than the max (min equivalent) then set it equal to that.
                    max = index;
                    maxIndex = i;
                }
            }

            vectors.remove(maxIndex);

            sorted[sorted.length] = max;

            sort = vectors.isEmpty() && sorted.length == Unsorted.length;
        }
        return sorted;
    }


    Vector[][] OnionSort(Vector[] unsorted) {
        ArrayList<Vector> vectors = new ArrayList<>(Arrays.asList(unsorted)); // Convert the Array to an Array list to speed up removal operations
        Vector[][] sorted = new Vector[][]{}; // Create the array of sorted vectors
        Boolean sort = !vectors.isEmpty(); // Check if list is empty. If not then sort is true.
        while(sort) { // If list is not empty, sort. Loop through until list empty.

            // Actual Sort Function
            Vector min = vectors.get(0); //Set the first element to compare to
            int minIndex = 0; // Location of the minimum element, we use this to remove it at the end.
            for (int i = 0; i < vectors.size(); i++) { // Iterate vector list
                Vector index = vectors.get(i); // Get the current vector to compare
                if (Math.abs(index.x) < Math.abs(min.x)) { // Compare vector to minimum, do absolute value to handle negative inverses.
                    min = index; // Set the Vector of lowest to current if true
                    minIndex = i; // Set the index of the lowest to the current index location if true.
                }
            }

            // Remove the minimum x found, repeat until empty.
            vectors.remove(minIndex);

            // Get the amount of X's sorted
            int sortIndex = sorted.length;


            //Organize into onion function
            if (sortIndex == 0) {

                //add to first spot in array if empty
                sorted[sortIndex][0] = min;

            } else if(sorted[sortIndex-1][0].x == min.x) {
                // If same x cord is found, Add to existing x sub array.
                int SubSortIndex = sorted[sortIndex-1].length;
                sorted[sortIndex-1][SubSortIndex] = min;

            } else {

                // If array has contents but lacks this X, add it.
                sorted[sortIndex][0]= min;
            }


            // Check if done.
            sort = vectors.isEmpty() && vectors.get(0) == null;
        }

        return sorted;
    }

    //TODO: Sort sub list in onion.
    // Possible solution:
    //  * Sort vectors from low to high first, then onionize it.


}
