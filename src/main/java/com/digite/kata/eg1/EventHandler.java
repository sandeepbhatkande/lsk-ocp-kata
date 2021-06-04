package com.digite.kata.eg1;

public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(String drivingMode){
        DrivingMode w_DrivingMode = DrivingMode.getDrivingMode(drivingMode);
        if (w_DrivingMode != null) {
            w_DrivingMode.setVehicleDefaults(this.vehicle);
        }
    }
}
