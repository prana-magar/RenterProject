package com.lambton.vehicle;

import com.lambton.util.IDisplay;

public class MotorCycle extends Vehicle implements IDisplay {

    private int topSpeed;
    private int Mileage;

    public MotorCycle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, int Mileage, int topSpeed, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.topSpeed = topSpeed;
        this.Mileage = Mileage;

    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                super.toString()+
                " topSpeed=" + topSpeed +
                ", Mileage=" + Mileage +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
