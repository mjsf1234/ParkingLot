package main.java.com.parking.model;

import main.java.com.parking.Strategy.CostComputation;

public class ExitManager {
    private final ParkingSpotManager parkingSpotManager;
    public ExitManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;

    }
    public double payAndExit(Ticket ticket, CostComputation costComputation) {
        return parkingSpotManager.payAndExit(ticket, costComputation);
    }
}
