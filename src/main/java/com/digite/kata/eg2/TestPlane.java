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
}
