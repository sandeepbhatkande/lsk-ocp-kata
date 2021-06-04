package com.digite.kata.eg2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JTestCar {
	
	
	@Test
	public void testchangeGear_D() {
		
		Car w_Car = new Car();
		w_Car.changeGear(Gear.D);
		assertEquals(Gear.D, w_Car.getGear());
		
	}

	@Test
	public void testchangeGear_R() {

		try
		{
			Car w_car = new Car();
			w_car.changeGear(Gear.D);
			w_car.changeGear(Gear.R);
			assertEquals(w_car.getGear(), Gear.D);
		}
		catch (Exception a_ex)
		{
			assertEquals(a_ex.getMessage(), "Can't change to REVERSE gear when D gear is engaged!");
		}

	}

}
