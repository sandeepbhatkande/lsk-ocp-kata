import org.junit.Test;

import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Plane;

import static org.junit.Assert.assertEquals;


public class JTestPlane {

	@Test
    public void testChangeGear()
    {
        Plane w_plane = new Plane();
        w_plane.changeGear(Gear.D);
        assertEquals(w_plane.getGear(), Gear.D);
        
        //Case 2: Wih Gear R( No wrroe as it is allowed in plane)
        Plane w_plane1 = new Plane();
        w_plane.changeGear(Gear.D);
        w_plane1.changeGear(Gear.R);
        assertEquals(w_plane1.getGear(), Gear.R);
       
    }
}
