package com.lambton.person;


import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Owner class inherits person class and holds information about owners and the vehicles they own

public class Owner extends Person {
    private String companyTitle;
    private String landLineNumber;
    private String url;
    private List<Vehicle> vehicles;

    public Owner(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String userName, String password, String companyTitle, String landLineNumber, String url, ArrayList<Vehicle> vehicles,Contact contact) {
        super(id, firstName, lastName, gender, birthDate, userName, password,contact);
        this.companyTitle = companyTitle;
        this.landLineNumber = landLineNumber;
        this.url = url;
        this.vehicles = vehicles;
    }


    @Override
    public String toString() {
        return "Owner{" +
                super.toString()+
                " companyTitle='" + companyTitle + '\'' +
                ", landLineNumber='" + landLineNumber + '\'' +
                ", Vehicles='" + vehicles + '\'' +
                ", url='" + url + '\'' +
                '}';
    }


    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles =  vehicles;
    }
}
