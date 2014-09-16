package Iris.Math;

/**
 * Created by Ben Byers on 9/15/2014.
 */
public class ArchimedesPrinciple {
    /**
     * The average density of water is measured at 999.97 kg/m^3
     * Because of this are calculations will be based on meters and kg.
     * Entity has height and width^2
     *
     * TODO: This is not finished!
     */
    private Float kgN = 9.81F;
    private Float WetWeight; //In Newtons
    private Float StandardWeight; //In newtons
    private Float ObjectMass;
    private Float ObjectVolume;
    private Float BouyancyForce;
    private Float ObjectDensity;
    private Float WaterDensity = 999.97F; //kg per m^3
    private Boolean Floats = ObjectDensity < WaterDensity;

    public ArchimedesPrinciple(Float Volume, Float Mass){
        ObjectVolume = Volume;// In cubic meters
        ObjectMass = Mass;// In kg
        ObjectDensity = Mass/Volume;
        StandardWeight = ObjectMass/kgN;
        WetWeight = ObjectVolume*WaterDensity;
        BouyancyForce = StandardWeight - WetWeight;
    }

    public Boolean doesFloat() {
        return Floats;
    }

    public void setWaterDensity(Float waterDensity) {
        WaterDensity = waterDensity;
    }

    public Float getWetWeight() {
        return WetWeight;
    }

    public Float getBouyancyForce() {
        return BouyancyForce;
    }

    public Float getWaterDensity() {
        return WaterDensity;
    }

    public Float getStandardWeight() {
        return StandardWeight;
    }

    public Float getObjectVolume() {
        return ObjectVolume;
    }

    public Float getObjectMass() {
        return ObjectMass;
    }

    public Float getObjectDensity() {
        return ObjectDensity;
    }
}
