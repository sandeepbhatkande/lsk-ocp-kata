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
    
    @Test
    public void testChangeGearForException()
    {
        try
        {
            Car w_car = new Car();
            w_car.changeGear(Gear.D);
            w_car.changeGear(Gear.R);
                   
        }
        catch (Exception a_ex)
        {
            Assert.assertEquals(a_ex.getMessage(), "Can't change to REVERSE gear when D gear is engaged!");
        }

    }
}
