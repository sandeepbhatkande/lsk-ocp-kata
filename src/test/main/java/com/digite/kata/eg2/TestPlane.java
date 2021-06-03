package main.java.com.digite.kata.eg2;

import com.digite.kata.eg2.Car;
import com.digite.kata.eg2.Gear;
import com.digite.kata.eg2.Plane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPlane {

    @Test
    public void testChangeGear()
    {
        Plane p = new Plane(Gear.D);
        p.changeGear(Gear.N);
        Assertions.assertEquals(Gear.N, p.getGear());
    }
}
