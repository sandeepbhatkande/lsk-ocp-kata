package com.digite.kata;

import org.junit.Assert;
import org.junit.Test;

public class TestPlane
{
    @Test
    public void testChangeGearwithoutOverride()
    {
        Plane w_plane = new Plane();
        w_plane.changeGear(Gear.D);
        Assert.assertEquals(w_plane.getGear(), Gear.D);
    }
    
     @Test
    public void testChangeGearwithOverride()
    {
        // A plane can reverse engine gear while moving forward, no problem here
        Plane w_plane = new Plane();
        w_plane.changeGear(Gear.D);
        w_plane.changeGear(Gear.R);
        Assert.assertEquals(w_plane.getGear(), Gear.R);
    }
}
