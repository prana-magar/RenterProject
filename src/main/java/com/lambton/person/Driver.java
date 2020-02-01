package com.lambton.person;

import com.lambton.util.IDisplay;

import java.time.LocalDate;

public class Driver extends Person implements IDisplay {

    private String drivingLicenceNumber;
    private Boolean isDrivingHistoryClean;
    private Float salary;


    public Driver(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, int age, String mobileNumber, String emailId, String userName, String password, String drivingLicenceNumber, Boolean isDrivingHistoryClean, Float salary) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryClean = isDrivingHistoryClean;
        this.salary = salary;
    }

    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Driver{" +
                super.toString()+
                " drivingLicenceNumber='" + drivingLicenceNumber + '\'' +
                ", isDrivingHistoryClean=" + isDrivingHistoryClean +
                ", salary=" + salary +
                '}';
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public Boolean getDrivingHistoryClean() {
        return isDrivingHistoryClean;
    }

    public void setDrivingHistoryClean(Boolean drivingHistoryClean) {
        isDrivingHistoryClean = drivingHistoryClean;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
