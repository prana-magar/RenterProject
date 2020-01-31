package com.lambton;

public class MotorCycle extends Vehicle{

    int topSpeed;
    int Mileage;

    public MotorCycle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, int Mileage, int topSpeed, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);

        this.topSpeed = topSpeed;
        this.Mileage = Mileage;

    }
}
