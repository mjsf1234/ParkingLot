package main.java.com.parking.model;

import main.java.com.parking.utils.ParkingSpotType;

public interface ParkingSpot {
    public void parkVehicle(Vehicle v);
    public void vacate ();
    public ParkingSpotType getParkingSpotType();

    public boolean getStatus();


}
