package Iris.Math;

/**
 * Created by Ben Byers on 10/4/2014.
 * Math for Vectors
 */
public class Vector  {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    // -------- Begin functions ---------

    //distance to
    public double getDistanceTo(Vector vector) {
        double X = this.getX() - vector.getX();
        double Y = this.getY() - vector.getY();
        double Z = this.getZ() - vector.getZ();
        return Math.sqrt(X*Y*Z);
    }

    public Vector getMultiplyByVector(Vector vector) {
        return new Vector(
            (this.getX() * vector.getX()),
            (this.getY() * vector.getY()),
            (this.getZ() * vector.getZ())
        );
    }


    /*
    TODO: Add Radius that returns vectors for whats in radius
    TODO: Add addition, Subtraction, Multiplication, Division
    TODO: Add Compare
    TODO: Add the distance of each plane.

     */

}
