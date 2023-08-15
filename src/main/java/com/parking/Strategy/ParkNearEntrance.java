package main.java.com.parking.Strategy;

import main.java.com.parking.model.ParkingSpot;
import main.java.com.parking.model.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkNearEntrance implements ParkingStrategy{
    @Override
    public Optional<ParkingSpot> findAvailableSpot(List<ParkingSpot> parkingSpotList, Vehicle v) {
        System.out.println("finding the parking near to entrance");
        return parkingSpotList.stream()
                .filter(parkingSpot -> parkingSpot != null && parkingSpot.getParkingSpotType().getAssociatedVehicleType().equals(v.getType()))
                .findFirst();
    }
}
