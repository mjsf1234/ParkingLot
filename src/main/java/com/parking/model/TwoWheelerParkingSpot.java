package main.java.com.parking.model;

import main.java.com.parking.utils.ParkingSpotType;

public class TwoWheelerParkingSpot implements ParkingSpot{

    private final ParkingSpotType type = ParkingSpotType.TWOWHEELER;
    private boolean is_occupied = false;
    @Override
    public void partVehicle(Vehicle v) {
        this.is_occupied =true;

    }

    @Override
    public void vacate() {
       is_occupied =false;
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return type;
    }

    @Override
    public boolean getStatus() {
        return is_occupied;
    }


}
