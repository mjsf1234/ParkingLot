package main.java.com.parking.model;

import main.java.com.parking.utils.ParkingSpotPrice;
import main.java.com.parking.utils.ParkingSpotType;

public interface ParkingSpot {
    public void partVehicle(Vehicle v);
    public void vacate ();
    public ParkingSpotType getParkingSpotType();

    public boolean getStatus();


}
