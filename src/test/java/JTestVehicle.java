import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Vehicle;

public class JTestVehicle {
	
	Vehicle vehicle;
	
	@Before
	public void setup() {
		vehicle = new Vehicle();
	}

	@Test
	public void testChangeGear() {
		vehicle.changeGear(Gear.D);
		assertTrue(Gear.D.equals(vehicle.getGear()));
	}

}

