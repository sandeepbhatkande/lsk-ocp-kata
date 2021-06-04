package com.digite.kata.eg2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JTestVehicle {

    @Test
    public void testchangeGear() {

        Vehicle w_Vehicle = new Vehicle();
        w_Vehicle.changeGear(Gear.D);
        assertEquals(Gear.D, w_Vehicle.getGear());

    }

}
