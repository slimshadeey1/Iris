package Iris.Math;

/**
 * Created by Ben Byers on 10/4/2014. Math for Vectors
 */
public class Vector {
    private double x;
    private double y;
    private double z;

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



    public Vector getSquareDistance(Vector vector) {
        return new Vector(vector.x - x, vector.y - y, vector.z - z);
    }

    /*


     */

}
