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

}
