package com.lambton;

public class Car extends Vehicle {

    public String carType;
    public String carColor;

    public Car(String vehicleId, String description, String manufacturer, String carType, String carColor, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.carType = carType;
        this.carColor = carColor;
    }
}

