package main.java.com.parking.model;

import main.java.com.parking.Strategy.ParkingStrategy;

import java.util.Optional;

public class EntranceManager {
    private final ParkingSpotManager parkingSpotManager;

    public EntranceManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public Optional<Ticket> parkVehicleAndAssignTicket(Vehicle vehicle, ParkingStrategy parkingStrategy) {
        return parkingSpotManager.parkTheVehicleAndAssignTicket(vehicle, parkingStrategy);
    }
}
