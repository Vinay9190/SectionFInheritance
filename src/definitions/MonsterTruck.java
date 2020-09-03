package definitions;

import  definitions.transport.Truck;
// we can access the Truck Class
// in a different class, even outside the package!


public class MonsterTruck extends Truck{

    private Truck myMonsterTruck;

    public void startMonsterTruck() {
        startTruck();
        // only inner members of a class can be protected , they can only be accessed by their child
        // classess, even outside the package it is declared in .
    }
}
