package com.lambton;

import com.lambton.util.IDisplay;
import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {
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

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getKmDrived() {
        return kmDrived;
    }

    public void setKmDrived(int kmDrived) {
        this.kmDrived = kmDrived;
    }

    public float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(float totalBill) {
        this.totalBill = totalBill;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
