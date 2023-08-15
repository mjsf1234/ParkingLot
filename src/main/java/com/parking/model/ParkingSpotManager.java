package main.java.com.parking.model;

import main.java.com.parking.Strategy.CostComputation;
import main.java.com.parking.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList = new ArrayList<>();
    private static ParkingSpotManager instance = null;

    public static ParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new ParkingSpotManager();
        }
        return instance;
    }

    private ParkingSpotManager() {
        for (int i = 0; i < 3; i++) {
            parkingSpotList.add(new TwoWheelerParkingSpot());
            parkingSpotList.add(new ThreeWheelerParkingSpot());
            parkingSpotList.add(new FourWheelerParkingSpot());
        }
    }

    public double payAndExit(Ticket ticket, CostComputation costComputation) {
        ticket.getParkingSpot().vacate();
        return costComputation.calculateCost(ticket);
    }

    public Optional<Ticket> parkTheVehicleAndAssignTicket(Vehicle vehicle, ParkingStrategy parkingStrategy) {
        ParkingSpot allocatedSpot = findParkingSpot(vehicle, parkingStrategy);
        if (allocatedSpot != null) {
            allocatedSpot.parkVehicle(vehicle);
            return Optional.of(createTicket(vehicle, allocatedSpot));
        } else {
            return Optional.empty();
        }
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
        System.out.println("parkingSpot added "+ parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
        System.out.println("parkingSpot removed "+ parkingSpot);

    }

    private Ticket createTicket(Vehicle vehicle, ParkingSpot spot) {
        return new Ticket(spot, vehicle);
    }

    private ParkingSpot findParkingSpot(Vehicle vehicle, ParkingStrategy parkingStrategy) {
        Optional<ParkingSpot> availableSpot = parkingStrategy.findAvailableSpot(parkingSpotList, vehicle);

        if (availableSpot.isPresent()) {
            ParkingSpot spot = availableSpot.get();
            System.out.println("Parked: " + spot.getParkingSpotType());
            return spot;
        } else {
            System.out.println("No available parking spot.");
            return null;
        }
    }
}
