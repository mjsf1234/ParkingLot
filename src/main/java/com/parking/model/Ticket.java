package main.java.com.parking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket {
    public final String ticketNumber;
    private Vehicle vehicle;
    private long startTime;
    private Date endTime;
    private ParkingSpot parkingSpot;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle){
        this.parkingSpot =parkingSpot;
        this.vehicle = vehicle;
        this.startTime =System.currentTimeMillis();
        this.ticketNumber= vehicle.getVehicleNumber()+System.currentTimeMillis();

    }

}
