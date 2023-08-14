import main.java.com.parking.model.Ticket;
import main.java.com.parking.model.TwoWheelerParkingSpot;
import main.java.com.parking.model.Vehicle;
import main.java.com.parking.utils.VehicleType;

import java.io.PrintStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TwoWheelerParkingSpot twoWheelerSpot1 = new TwoWheelerParkingSpot();
        Vehicle bike1 = new Vehicle("Mp18-Ca00", VehicleType.TWO_WHEELER);
//        System.out.println(bike1.getType()+ " ---"+ bike1.getVehicleNumber());
        twoWheelerSpot1.parkVehicle(bike1);
        System.out.println( twoWheelerSpot1);
}}