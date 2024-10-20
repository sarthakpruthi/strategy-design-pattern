package org.example;

import org.example.strategy.NormalDriveStrategy;
import org.example.strategy.SpecialDriveStrategy;
import org.example.vehicle.OffRoadVehicle;
import org.example.vehicle.TwoWheeler;
import org.example.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new OffRoadVehicle(new SpecialDriveStrategy());
        Vehicle v2 = new TwoWheeler(new NormalDriveStrategy());

        v1.drive();
        v2.drive();
    }
}