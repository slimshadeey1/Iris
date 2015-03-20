package com.benbyers.Iris.math.units.mass;

import com.benbyers.Iris.math.units.force.Newton;

/**
 * Created by benbyers on 3/12/15.
 */
public interface Mass {

    public Gram toGrams();

    public Tonne toTonnes();

    public Pound toPounds();

    public Pound toPounds(double gravity);

    public Newton toNewtons();

    public Newton toNewtons(double gravity);

    public Ton toTon();

    public Ton toTon(double gravity);


}
