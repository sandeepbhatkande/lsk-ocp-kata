

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;

public class JTestCar {

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
	
	@Test
	public void testPassesAfterChangingCarClass() 
	{
		car.changeGear(Gear.D);
		assertEquals(car.getGear(), Gear.D);
	}

}