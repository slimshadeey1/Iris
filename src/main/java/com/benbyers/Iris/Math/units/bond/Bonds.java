package com.benbyers.Iris.math.units.bond;

/**
 * Created by benbyers on 3/12/15.
 */
public enum Bonds {
    Covalent("Covalent"),
    Ionic("Ionic");


    private final String name;

    Bonds(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
