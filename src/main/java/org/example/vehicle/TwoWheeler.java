package org.example.vehicle;

import org.example.strategy.DriveStrategy;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
