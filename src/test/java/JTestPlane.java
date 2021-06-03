import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Plane;

public class JTestPlane {
	
	@Test
    public void testChangeGear()
    {
        Plane p = new Plane();
        p.changeGear(Gear.P);
        assertEquals(p.getGear(), Gear.P);
    }
}