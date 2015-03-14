package com.benbyers.Iris.math.units.mass;

import com.benbyers.Iris.math.units.force.Newton;
import com.benbyers.Iris.math.units.weight.Ton;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by benbyers on 3/12/15.
 */
public interface Mass {

    public Gram toGrams();

    public Tonne toTonnes();

    public Pound toPounds();

    public Newton toNewtons();

    public Ton toTon(Double gravity);

    public com.benbyers.Iris.math.units.weight.Pound toPounds(Double Gravity);

}
