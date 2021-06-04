import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Plane;

public class TestPlane {
	
	@Test
    public void testChangeGear()
    {
        Plane p = new Plane();
        p.changeGear(Gear.P);
        assertEquals(p.getGear(), Gear.P);
    }
}