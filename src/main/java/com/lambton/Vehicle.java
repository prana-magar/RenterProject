package com.lambton;

enum FuelType{
    PETROL,
    DIESEL,
    ELECTRIC
}

public abstract class Vehicle {
    private String vehicleId;
    private String description;
    private String manufacturer;
    private Boolean isSelfDrive;
    private Boolean isInsured;
    private String insuranceProviderName;
    private int numberOfSeat;
    private FuelType fuelType;
    private float baseRate;

    public Vehicle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate) {
        this.vehicleId = vehicleId;
        this.description = description;
        this.manufacturer = manufacturer;
        this.isSelfDrive = isSelfDrive;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.numberOfSeat = numberOfSeat;
        this.fuelType = fuelType;
        this.baseRate = baseRate;
    }
}
