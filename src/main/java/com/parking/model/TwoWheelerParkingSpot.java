package main.java.com.parking.model;

import lombok.Getter;
import lombok.Setter;
import main.java.com.parking.utils.ParkingSpotType;
import main.java.com.parking.utils.VehicleType;

@Setter
@Getter
public class TwoWheelerParkingSpot implements ParkingSpot{
    private String spotNumber;
    private ParkingSpotType spotType = ParkingSpotType.TWO_WHEELER ;
    private boolean isOccupied =false;
    private Vehicle parkedVehicle;

    @Override
    public void parkVehicle(Vehicle vehicle) {

        if (!isOccupied && vehicle.getType() == VehicleType.TWO_WHEELER){
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
