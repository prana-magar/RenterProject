package com.lambton;

import java.time.LocalDate;

public class VehicleRented extends Vehicle {
    LocalDate startDate;
    LocalDate endDate;
    int numberOfDays;
    float distanceDriven;
    float totalBill;

    public VehicleRented(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate, LocalDate startDate, LocalDate endDate, int numberOfDays, float distanceDriven, float totalBill) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDays = numberOfDays;
        this.distanceDriven = distanceDriven;
        this.totalBill = totalBill;
    }
}
