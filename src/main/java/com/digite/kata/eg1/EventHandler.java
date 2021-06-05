package com.digite.kata.eg1;

public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final Mode drivingMode){
    			vehicle.setPower(drivingMode.getPower());
                vehicle.setSuspensionHeight(drivingMode.getHeight());
    }
}

