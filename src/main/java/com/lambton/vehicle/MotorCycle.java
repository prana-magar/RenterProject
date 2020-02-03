package com.lambton.vehicle;

import com.lambton.person.Driver;

/**
 * This class is to hold motorcycle attributes
 */

public class MotorCycle extends Vehicle {

    private int topSpeed;
    private int mileage;

    public MotorCycle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, int Mileage, int topSpeed, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,1);
        this.topSpeed = topSpeed;
        this.mileage = Mileage;

    }

    public MotorCycle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, int Mileage, int topSpeed, float baseRate, Driver driver) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,1.0f,driver);
        this.topSpeed = topSpeed;
        this.mileage = Mileage;

    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                super.toString()+
                " topSpeed=" + topSpeed +
                ", mileage=" + mileage +
                '}';
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
