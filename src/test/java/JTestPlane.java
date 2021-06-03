import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Vehicle;

public class JTestPlane {

		Vehicle vehicle;

		@Before
		public void setup() {
			vehicle = new Vehicle();
		}

		@Test
		public void testChangeGear() {
			vehicle.changeGear(Gear.R);
			assertTrue(Gear.R.equals(vehicle.getGear()));
		}

}