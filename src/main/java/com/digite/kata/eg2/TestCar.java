package com.digite.kata;

import org.junit.Assert;
import org.junit.Test;

public class TestCar {

    @Test
    public void testChangeGearSuceesForCar()
    {
        Car w_car = new Car();
        w_car.changeGear(Gear.D);
        Assert.assertEquals(w_car.getGear(), Gear.D);
    }
}
