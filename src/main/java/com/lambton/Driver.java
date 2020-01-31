package com.lambton;

import java.time.LocalDate;

public class Driver extends Person implements IDisplay {

    private String drivingLicenceNumber;
    private Boolean isDrivingHistoryClean;
    private Float salary;


    Driver(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, int age, String mobileNumber, String emailId, String userName, String password, String drivingLicenceNumber, Boolean isDrivingHistoryClean, Float salary) {
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
}
