import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class JTestCar {
	
	@Test
    public void testChangeGearValid()
    {
        Car w_car = new Car();
        w_car.changeGear(Gear.D);
        assertEquals(w_car.getGear(), Gear.D);
        
    }
	
	@Test
    public void testChangeGearInValid()
    {
        try
        {
            Car w_car1 = new Car();
            w_car1.changeGear(Gear.D);
            w_car1.changeGear(Gear.R);

        }
        catch (Exception a_ex)
        {
            assertEquals(a_ex.getMessage(), "Can't change to REVERSE gear when D gear is engaged!");
        }
    }

}
