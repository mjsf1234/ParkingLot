package main.java.com.parking.Strategy;

import main.java.com.parking.model.Ticket;

public interface CostComputation {
    public double calculateCost(Ticket ticket);
}
