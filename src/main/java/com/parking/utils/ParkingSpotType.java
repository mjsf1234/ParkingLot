package main.java.com.parking.utils;

import main.java.com.parking.pricing.CostConfiguration;

public enum ParkingSpotType {
 TWO_WHEELER(CostConfiguration.getInstance().TWO_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().TWO_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().TWO_WHEELER_MONTHLY_RATE),

 THREE_WHEELER(CostConfiguration.getInstance().THREE_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().THREE_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().THREE_WHEELER_MONTHLY_RATE),

 FOUR_WHEELER(CostConfiguration.getInstance().FOUR_WHEELER_HOURLY_RATE,
         CostConfiguration.getInstance().FOUR_WHEELER_DAILY_RATE,
         CostConfiguration.getInstance().FOUR_WHEELER_MONTHLY_RATE);

 private final double hourlyRate;
 private final double dailyRate;
 private final double monthlyRate;

 ParkingSpotType(double hourlyRate, double dailyRate, double monthlyRate) {
  this.hourlyRate = hourlyRate;
  this.dailyRate = dailyRate;
  this.monthlyRate = monthlyRate;
 }

 public double getHourlyRate() {
  return hourlyRate;
 }

 public double getDailyRate() {
  return dailyRate;
 }

 public double getMonthlyRate() {
  return monthlyRate;
 }
}