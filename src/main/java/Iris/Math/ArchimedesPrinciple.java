package Iris.Math;

/**
 * Created by Ben Byers on 9/15/2014.
 */
public class ArchimedesPrinciple {
    /**
     * The average density of water is measured at 999.97 kg/m^3
     * Because of this are calculations will be based on meters and kg.
     * The principle states that a the buoyant force acting on an object is the weight
     * of the fluid displaced by the object submerged. The
     * TODO: This is not finished!
     */
    private Float WetWeight; //In Newtons
    private Float StandardWeight; //In newtons
    private Float BuoyantForce;
    private Float WaterDensity = 999.97F; //kg per m^3
    private Boolean Floats;

    public ArchimedesPrinciple(Float Volume, Float Mass, Float waterdensity){
        if(waterdensity != null) WaterDensity = waterdensity;
        StandardWeight = Mass*9.8F;
        WetWeight = (WaterDensity*Volume)*9.8F;
        Floats = WetWeight >= StandardWeight;
        BuoyantForce = WetWeight - StandardWeight;
    }

    public Boolean doesFloat() {
        return Floats;
    }

    public Float getWetWeight() {
        return WetWeight;
    }

    public Float getBouyantForce() {
        return BuoyantForce;
    }

    public Float getWaterDensity() {
        return WaterDensity;
    }

    public Float getStandardWeight() {
        return StandardWeight;
    }

}
