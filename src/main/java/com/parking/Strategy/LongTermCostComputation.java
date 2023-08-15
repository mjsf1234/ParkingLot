package main.java.com.parking.Strategy;

import main.java.com.parking.model.Ticket;
import main.java.com.parking.utils.ParkingSpotType;

public class LongTermCostComputation implements CostComputation {
    @Override
    public double calculateCost(Ticket ticket) {
        long startTime = ticket.getStartTime();
        long endTime = System.currentTimeMillis();
        long diffInMillis = endTime - startTime;
        double costPerMonth = ticket.getParkingSpot().getParkingSpotType().getMonthlyRate();
        double months = (double) diffInMillis / (1000 * 60 * 60 * 24 * 30); // Assuming 30 days per month
        System.out.println("startTime: " + startTime + "  EndTime: " + endTime + "  costPerMonth: " + costPerMonth);
        return months * costPerMonth;
    }
}
