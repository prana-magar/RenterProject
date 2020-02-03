package com.lambton.vehicle;

import com.lambton.person.Driver;

/**
 * This class is to hold car attributes
 */

public class Car extends Vehicle {

    private String carType;
    private String carColor;

    public Car(String vehicleId, String description, String manufacturer, String carType, String carColor, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,5.0f);
        this.carType = carType;
        this.carColor = carColor;
    }


    public Car(String vehicleId, String description, String manufacturer, String carType, String carColor, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate,Driver driver) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate, 5.0f,driver);
        this.carType = carType;
        this.carColor = carColor;
    }


    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                " carType='" + carType + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}


