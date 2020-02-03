package com.lambton.rent;

import com.lambton.util.IDisplay;
import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class VehicleRent implements IDisplay {
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
    private long numberOfDays;
    private int kmDriven;
    private float totalBill;
    private Vehicle vehicle;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, Vehicle vehicle) {
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.numberOfDays = this.calculateNumberOfDays();
        this.vehicle = vehicle;
        this.calculateTotalBill();
    }

    @Override
    public String toString() {
        return "VehicleRent{" +
                "rentStartDate=" + rentStartDate +
                ", rentEndDate=" + rentEndDate +
                ", numberOfDays=" + numberOfDays +
                ", kmDriven=" + kmDriven +
                ", totalBill=" + totalBill +
                ", vehicle=" + vehicle +
                '}';
    }


    @Override
    public void display() {
        System.out.println(this.toString());
    }


    /**
     * returns the number of days current rent was booked
     * @return
     */
    private long calculateNumberOfDays(){
        return DAYS.between(this.rentStartDate,this.rentEndDate);
    }


    /**
     * returns the total bill of current rent
     * @return
     */
    private void calculateTotalBill(){
        float baseRate = this.vehicle.getBaseRate();
        float perKmRate = this.vehicle.getPerKmRate();
        int kmDrived = this.getKmDriven();
        this.totalBill =  baseRate + perKmRate * kmDrived;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
        this.calculateNumberOfDays();
        this.calculateTotalBill();
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
        this.calculateNumberOfDays();
        this.calculateTotalBill();
    }

    public long getNumberOfDays() {
        return numberOfDays;
    }


    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) throws IllegalRentParamException{
        if(kmDriven < 0){
            throw new IllegalRentParamException(" Km driven shouldn't be negative.");
        }
        this.kmDriven = kmDriven;
        this.calculateTotalBill();
    }

    public float getTotalBill() {
        this.calculateTotalBill();
        return totalBill;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.calculateTotalBill();
    }

    public boolean isLive(){
        return !this.rentEndDate.isBefore(LocalDate.now());
    }
}
