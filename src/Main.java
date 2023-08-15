
import main.java.com.parking.Strategy.*;
import main.java.com.parking.model.*;
import main.java.com.parking.utils.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Get the Parking Spot Manager instance (singleTon Class)
        ParkingSpotManager parkingSpotManager = ParkingSpotManager.getInstance();
        //Getting the entrance manager
        EntranceManager entranceManager = new EntranceManager(parkingSpotManager);
        //Getting the Exit manager
        ExitManager exitManager = new ExitManager(parkingSpotManager);


        //Create the vehicle of different Types
        Vehicle bike1 = new Vehicle("Mp18-Bike00", VehicleType.TWO_WHEELER);
        System.out.println(" vehicle type "+ bike1.getType() +" vehicle number "+bike1.getVehicleNumber());
        Vehicle car1 = new Vehicle("Mp18-Car00", VehicleType.FOUR_WHEELER);
        System.out.println(" vehicle type "+ car1.getType() +" vehicle number "+car1.getVehicleNumber());


        //create the parkingStrategy
        ParkingStrategy parkNearEntrance = new ParkNearEntrance();
        ParkingStrategy parkNearElevator = new ParkNearElevator();

        //Get the spot and ticket
        Optional<Ticket> ticketBikeOptional = entranceManager.parkVehicleAndAssignTicket(bike1, parkNearEntrance);
        Optional<Ticket> ticketCarOptional = entranceManager.parkVehicleAndAssignTicket(car1, parkNearElevator);

        //Exiting sequence for the bike
        if (ticketBikeOptional.isPresent()) {
            Ticket ticketBike = ticketBikeOptional.get();
            System.out.println("Bike parked. Ticket number: " + ticketBike.getTicketNumber());
            Thread.sleep(10000);
            System.out.println("your bill for 10 sec is " + exitManager.payAndExit(ticketBike,new HourlyCostComputation()));
            System.out.println("your bill for 10 sec is " + exitManager.payAndExit(ticketBike,new DailyCostComputation()));

        } else {
            System.out.println("Bike couldn't be parked.");
        }

        //Exiting sequence for the car

        if (ticketCarOptional.isPresent()) {
            Ticket ticketCar = ticketCarOptional.get();
            System.out.println("Car parked. Ticket number: " + ticketCar.getTicketNumber());
            Thread.sleep(10000);
            System.out.println("your bill for 10 sec is " + exitManager.payAndExit(ticketCar,new HourlyCostComputation()));
            System.out.println("your bill for 10 sec is " + exitManager.payAndExit(ticketCar,new DailyCostComputation()));

        } else {
            System.out.println("Car couldn't be parked.");
        }
}}