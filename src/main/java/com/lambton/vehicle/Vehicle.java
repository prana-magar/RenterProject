package com.lambton.vehicle;
// vehicle package contains the Bus,Car,FuelType and MotorCycle classes
import com.lambton.person.Driver;
import com.lambton.util.IDisplay;


/**
 * Abstract class containing attributes to be inherited by any vehicle
 */

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
    private float perKmRate;
    private Driver driver;

    public float getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(float perKmRate) {
        this.perKmRate = perKmRate;
    }


     Vehicle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate,float perKmRate, Driver driver) {
        this.vehicleId = vehicleId;
        this.description = description;
        this.manufacturer = manufacturer;
        this.isSelfDrive = isSelfDrive;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.numberOfSeat = numberOfSeat;
        this.fuelType = fuelType;
        this.baseRate = baseRate;
        this.driver = driver;
        this.perKmRate = perKmRate;
    }

     Vehicle(String vehicleId, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, FuelType fuelType, float baseRate, float perKmRate) {
        this.vehicleId = vehicleId;
        this.description = description;
        this.manufacturer = manufacturer;
        this.isSelfDrive = isSelfDrive;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.numberOfSeat = numberOfSeat;
        this.fuelType = fuelType;
        this.baseRate = baseRate;
        this.perKmRate = perKmRate;
    }

    @Override
    public int hashCode() {
        return vehicleId.hashCode();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getSelfDrive() {
        return isSelfDrive;
    }

    public void setSelfDrive(Boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
    }

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
                ", driver=" + driver +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
