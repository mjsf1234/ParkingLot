package main.java.com.parking.Strategy;
import java.util.List;
import java.util.Optional;

import main.java.com.parking.model.ParkingSpot;
import main.java.com.parking.model.Vehicle;

public interface ParkingStrategy {
    public Optional<ParkingSpot> findAvailableSpot(List<ParkingSpot> parkingSpotList, Vehicle v);


}
