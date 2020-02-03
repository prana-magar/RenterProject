package com.lambton.vehicle;

//Bus class contains attributes inherited from Vehicle as well as busType, wifi and accessibility services

import com.lambton.person.Driver;
import com.lambton.util.IDisplay;

/**
 * This class is to hold bus attributes
 */

public class Bus extends Vehicle {

    private String busType;
    private Boolean accessibilityServices;
    private Boolean wifiAvailability;
    private int standingCapacity;

    public Bus(String vehicleId, String busType, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, int StandingCapacity, Boolean wifiAvailability, Boolean accessibilityServices, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,7.0f);
        this.busType = busType;
        this.standingCapacity = StandingCapacity;
        this.accessibilityServices = accessibilityServices;
        this.wifiAvailability = wifiAvailability;
    }

    public Bus(String vehicleId, String busType, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, int StandingCapacity, Boolean wifiAvailability, Boolean accessibilityServices, FuelType fuelType, float baseRate, Driver driver) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate,7.0f,driver);
        this.busType = busType;
        this.standingCapacity = StandingCapacity;
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


    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getStandingCapacity() {  return standingCapacity; }

    public void setStandingCapacity(int standingCapacity) {
        standingCapacity = standingCapacity;
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
