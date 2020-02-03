package com.lambton.person;

import com.lambton.util.IDisplay;

import java.time.LocalDate;

//Driver class inherits person class and it holds information about the drivers that are available

public class Driver extends Person {

    private String drivingLicenceNumber;
    private Boolean isDrivingHistoryClean;
    private Float salary;


    public Driver(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String userName, String password, String drivingLicenceNumber, Boolean isDrivingHistoryClean, Float salary,Contact contact) {
        super(id, firstName, lastName, gender, birthDate, userName, password,contact);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryClean = isDrivingHistoryClean;
        this.salary = salary;
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

    public void setSalary(Float salary) throws SalaryException{

        if(salary < 500){
            throw new SalaryException("Salary can't be below 500");
        }
        this.salary = salary;
    }
}
