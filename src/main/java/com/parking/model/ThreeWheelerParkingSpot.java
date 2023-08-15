package main.java.com.parking.model;

import main.java.com.parking.utils.ParkingSpotType;
import main.java.com.parking.utils.VehicleType;

public class ThreeWheelerParkingSpot implements ParkingSpot{
    private String spotNumber;
    private ParkingSpotType spotType = ParkingSpotType.THREE_WHEELER ;
    private boolean isOccupied =false;
    private Vehicle parkedVehicle;

    @Override
    public void parkVehicle(Vehicle vehicle) {

        if (!isOccupied && vehicle.getType() == VehicleType.THREE_WHEELER){
            System.out.println("system is parking the vehicle please wait");
            this.parkedVehicle = vehicle;
            this.isOccupied =true;
            System.out.println("Vehicle Parked");
        }else{
            throw new IllegalArgumentException("Cannot park a non-two-wheeler vehicle in a two-wheeler parking spot.");
        }
    }
    @Override
    public void vacate() {
        parkedVehicle =null;
        isOccupied=true;
        System.out.println("vehicle removed successFully!!");
    }
    @Override
    public ParkingSpotType getParkingSpotType() {
        return spotType;
    }

    @Override
    public boolean getStatus() {
        return isOccupied;
    }

}
