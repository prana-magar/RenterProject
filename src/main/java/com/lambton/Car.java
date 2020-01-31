package com.lambton;

public class Car extends Vehicle {

    private String carType;
    private String carColor;

    public Car(String vehicleId, String description, String manufacturer, String carType, String carColor, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.carType = carType;
        this.carColor = carColor;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                " carType='" + carType + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}


