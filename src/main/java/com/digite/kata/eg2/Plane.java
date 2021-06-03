package com.digite.kata.eg2;

public class Plane extends Vehicle {
    // A plane can reverse engine gear while moving forward, no problem here
	
    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}

