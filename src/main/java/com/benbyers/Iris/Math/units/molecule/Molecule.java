package com.benbyers.Iris.math.units.molecule;

import com.benbyers.Iris.math.units.atom.Atom;
import com.benbyers.Iris.math.units.atom.Electronegativity;
import com.benbyers.Iris.math.units.mass.AtomicMassUnit;
import com.benbyers.Iris.math.units.particle.subatomic.Electron;
import com.benbyers.Iris.math.units.particle.subatomic.Proton;

import java.util.ArrayList;

/**
 * Created by benbyers on 3/11/15.
 */
public class Molecule implements Comparable<Molecule> {
    Atom[] atoms;
    Atom central;

    Molecule[] molecules;
    Molecule centralM;

    private Electronegativity electronegativity;
    private ElectronStructure electronStructure;
    private AtomicMassUnit mass;
    private Polarity polarity;
    private Charge charge;
    private ArrayList<Electron> electrons;
    private ArrayList<Proton> protons;
    //private Neutron[] neutrons;
    private int protonCount;
    private int electronCount;



    public Molecule(Atom central,Atom... atoms) {
        this.atoms = atoms;
        this.central = central;
        // TODO: Here we should generate the molecule and all the variables.

    }

    public Molecule(Molecule centralM, Molecule... molecules) {
        this.electrons = new ArrayList<>();
        this.protons = new ArrayList<>();

        this.centralM = centralM;
        this.molecules = molecules;
        this.protonCount = centralM.protonCount;
        this.electronCount = centralM.electronCount;
        for(Molecule molecule: molecules){
            this.protonCount += molecule.electronCount;
            this.electronCount += molecule.electronCount;
            for(Electron electron:molecule.electrons) this.electrons.add(electron);
            for(Proton proton: molecule.protons) this.protons.add(proton);
        }
        this.charge = new Charge(electronCount,protonCount);
        // TODO: Here we should generate the molecule and all the variables.
    }

    public Atom[] getAtoms() {
        return atoms;
    }

    public Atom getCentral() {
        return central;
    }

    public Molecule[] getMolecules() {
        return molecules;
    }

    public Molecule getCentralM() {
        return centralM;
    }

    public Electronegativity getElectronegativity() {
        return electronegativity;
    }

    public ElectronStructure getElectronStructure() {
        return electronStructure;
    }

    public AtomicMassUnit getMass() {
        return mass;
    }

    public Polarity getPolarity() {
        return polarity;
    }

    public Charge getCharge() {
        return charge;
    }

    public ArrayList<Electron> getElectrons() {
        return electrons;
    }

    public ArrayList<Proton> getProtons() {
        return protons;
    }

    @Override public int compareTo(Molecule o) {
        return 0;
    }
}
