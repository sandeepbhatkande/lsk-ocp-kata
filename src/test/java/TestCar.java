import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;

public class TestCar {
	
	@Test
    public void testChangeGear()
    {
        Car c = new Car();
        c.changeGear(Gear.P);
		assertEquals(c.getGear(), Gear.P);
    }
	
	@Test
    public void testChangeGearException()
    {
		try
		{
			Car c = new Car();
			c.changeGear(Gear.D);
			c.changeGear(Gear.R);
		}
		catch (Exception a_ex)
		{
			assertEquals(a_ex.getMessage(), "Can't change to REVERSE gear when D gear is engaged!");
		}
    }
}