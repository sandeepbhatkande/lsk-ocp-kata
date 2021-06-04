package com.digite.kata.eg2;

import com.digite.kata.eg2.Plane;
import com.digite.kata.eg2.Gear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestPlane {

    @Test
    public void testchangeGear() {

        Plane w_Plane = new Plane();
        w_Plane.changeGear(Gear.D);
        assertEquals(Gear.D, w_Plane.getGear());

    }
}
