package main.java.com.parking.model;

import lombok.Getter;
import lombok.Setter;
import main.java.com.parking.utils.VehicleType;
@Getter
@Setter
public class Vehicle {
    private final String VehicleNumber;
    private final VehicleType type;

 public Vehicle(String vehicleNumber, VehicleType vt){
     this.VehicleNumber=vehicleNumber;
     this.type=vt;
 }
}
