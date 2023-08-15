package main.java.com.parking.utils;

import lombok.Getter;
import main.java.com.parking.Strategy.CostConfiguration;
import main.java.com.parking.utils.VehicleType;


@Getter

public enum ParkingSpotType {
 TWO_WHEELER(VehicleType.TWO_WHEELER,
         CostConfiguration.getInstance().TWO_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().TWO_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().TWO_WHEELER_MONTHLY_RATE),

 THREE_WHEELER(VehicleType.THREE_WHEELER,
         CostConfiguration.getInstance().THREE_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().THREE_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().THREE_WHEELER_MONTHLY_RATE),

 FOUR_WHEELER(VehicleType.FOUR_WHEELER,
         CostConfiguration.getInstance().FOUR_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().FOUR_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().FOUR_WHEELER_MONTHLY_RATE);

 private final VehicleType associatedVehicleType;
 private final double hourlyRate;
 private final double dailyRate;
 private final double monthlyRate;

 ParkingSpotType(VehicleType associatedVehicleType, double hourlyRate, double dailyRate, double monthlyRate) {
  this.associatedVehicleType = associatedVehicleType;
  this.hourlyRate = hourlyRate;
  this.dailyRate = dailyRate;
  this.monthlyRate = monthlyRate;
 }

}
