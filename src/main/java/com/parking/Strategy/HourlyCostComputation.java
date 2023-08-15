package main.java.com.parking.Strategy;

import main.java.com.parking.model.Ticket;
import main.java.com.parking.utils.ParkingSpotType;

public class HourlyCostComputation implements CostComputation{

    @Override
    public double calculateCost(Ticket ticket) {

        long startTime = ticket.getStartTime();
        long endTime = System.currentTimeMillis();
        long diff = endTime-startTime;
        ParkingSpotType ps = ticket.getParkingSpot().getParkingSpotType();
        double costPerHour = ps.getHourlyRate();
        System.out.println("startTime: "+ startTime+"  EndTime:"+ endTime+"  costPerHour"+costPerHour+" parkingSpotType:"+ps);
        return (double) diff / (1000 * 60 * 60) * costPerHour;
    }
}
