package main.java.com.parking.pricing;

import main.java.com.parking.model.Ticket;

public interface CostComputation {
    public double calculateCost(Ticket ticket);
}
