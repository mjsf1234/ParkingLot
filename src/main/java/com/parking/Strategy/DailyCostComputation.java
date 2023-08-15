package main.java.com.parking.Strategy;

import main.java.com.parking.model.Ticket;
import main.java.com.parking.utils.ParkingSpotType;

public class DailyCostComputation implements CostComputation {
    @Override
    public double calculateCost(Ticket ticket) {
        long startTime = ticket.getStartTime();
        long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        ParkingSpotType ps = ticket.getParkingSpot().getParkingSpotType();
        double costPerDay = ps.getDailyRate();
        System.out.println("startTime: " + startTime + "  EndTime: " + endTime + "  costPerDay: " + costPerDay + " parkingSpotType: " + ps);
        return (double) diff / (1000 * 60 * 60 * 24) * costPerDay;
    }
}
