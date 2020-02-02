package com.lambton.vehicle;

import com.lambton.person.Driver;
import com.lambton.util.IDisplay;

public class Bus extends Vehicle implements IDisplay {

    private String busType;
    private Boolean accessibilityServices;
    private Boolean wifiAvailability;
    private int StandingCapacity;

    public Bus(String vehicleId, String busType, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, int StandingCapacity, Boolean wifiAvailability, Boolean accessibilityServices, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.busType = busType;
        this.StandingCapacity = StandingCapacity;
        this.accessibilityServices = accessibilityServices;
        this.wifiAvailability = wifiAvailability;
    }

    public Bus(String vehicleId, String busType, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, int StandingCapacity, Boolean wifiAvailability, Boolean accessibilityServices, FuelType fuelType, float baseRate, Driver driver) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,driver);
        this.busType = busType;
        this.StandingCapacity = StandingCapacity;
        this.accessibilityServices = accessibilityServices;
        this.wifiAvailability = wifiAvailability;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString()+
                "busType='" + busType + '\'' +
                ", accessibilityServices=" + accessibilityServices +
                ", wifiAvailability=" + wifiAvailability +
                '}';
    }

    public void display(){
        System.out.println(this.toString());
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getStandingCapacity() {  return StandingCapacity; }

    public void setStandingCapacity(int standingCapacity) {
        StandingCapacity = standingCapacity;
    }

    public Boolean getAccessibilityServices() {
        return accessibilityServices;
    }

    public void setAccessibilityServices(Boolean accessibilityServices) {
        this.accessibilityServices = accessibilityServices;
    }

    public Boolean getWifiAvailability() {
        return wifiAvailability;
    }

    public void setWifiAvailability(Boolean wifiAvailability) {
        this.wifiAvailability = wifiAvailability;
    }
}
