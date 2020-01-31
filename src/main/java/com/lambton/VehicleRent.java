package com.lambton;

import java.time.LocalDate;

public class VehicleRent implements IDisplay{
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
    private int numberOfDays;
    private int kmDrived;
    private float totalBill;
    private Vehicle vehicle;

    @Override
    public String toString() {
        return "VehicleRent{" +
                "rentStartDate=" + rentStartDate +
                ", rentEndDate=" + rentEndDate +
                ", numberOfDays=" + numberOfDays +
                ", kmDrived=" + kmDrived +
                ", totalBill=" + totalBill +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
