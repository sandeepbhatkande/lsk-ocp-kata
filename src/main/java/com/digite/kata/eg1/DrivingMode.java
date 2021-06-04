package com.digite.kata.eg1;

import com.digite.kata.eg1.Vehicle;

public enum DrivingMode {

    SPORT {
        public boolean match(String mode) {
            return mode == "SPORT";
        }
        public void setVehicleDefaults(Vehicle a_Vehicle) {
            a_Vehicle.setPower(500);
            a_Vehicle.setSuspensionHeight(10);
        }
    },
    COMFORT {
        public boolean match(String mode) {
            return mode == "COMFORT";
        }

        public void setVehicleDefaults(Vehicle a_Vehicle) {
            a_Vehicle.setPower(400);
            a_Vehicle.setSuspensionHeight(20);
        }
    };

    public static DrivingMode getDrivingMode(String a_drivingMode) {

        for (DrivingMode drivingMode:  com.digite.kata.eg1.DrivingMode.values()) {
            if (drivingMode.match(a_drivingMode)){
                return drivingMode;
            }
        }

        return null;
    };

    abstract boolean match(String drivingMode);
    abstract void setVehicleDefaults(Vehicle a_Vehicle);
}

