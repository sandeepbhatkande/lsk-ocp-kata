

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;

class JTestCar {

	Car car;
	
	@Before
	public void setup() {
		car = new Car();
	}
	
	@Test
	public void testFailsBecauseCarCantChange() 
	{
			car.changeGear(Gear.D);
			assertEquals(car.getGear(), Gear.D);
	}

}