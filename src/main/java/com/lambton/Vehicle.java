package com.lambton;

enum FuelType{
    PETROL,
    DIESEL,
    ELECTRIC
}

public abstract class Vehicle implements IDisplay {
    private String vehicleId;
    private String description;
    private String manufacturer;
    private Boolean isSelfDrive;
    private Boolean isInsured;
    private String insuranceProviderName;
    private int numberOfSeat;
    private FuelType fuelType;
    private float baseRate;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", isSelfDrive=" + isSelfDrive +
                ", isInsured=" + isInsured +
                ", insuranceProviderName='" + insuranceProviderName + '\'' +
                ", numberOfSeat=" + numberOfSeat +
                ", fuelType=" + fuelType +
                ", baseRate=" + baseRate +
                '}';
    }

    Vehicle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate) {
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


    public void display(){
        System.out.println(this.toString());
    }


}
