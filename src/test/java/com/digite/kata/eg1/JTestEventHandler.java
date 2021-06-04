package com.digite.kata.eg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class JTestEventHandler {

	@Test
	public void testChangeDrivingModeForValidMode() {

		Vehicle w_vehicle = new Vehicle();

		EventHandler w_EventHandler = new EventHandler(w_vehicle);
		w_EventHandler.changeDrivingMode("SPORT");

		assertEquals(500, w_vehicle.getPower());
		assertEquals(10, w_vehicle.getSuspensionHeight());
	}

	@Test
	public void testChangeDrivingModeForNonValidMode() {

		Vehicle w_vehicle = new Vehicle();

		EventHandler w_EventHandler = new EventHandler(w_vehicle);
		w_EventHandler.changeDrivingMode("ABC");

		assertEquals(0, w_vehicle.getPower());
		assertEquals(0, w_vehicle.getSuspensionHeight());
	}
}
