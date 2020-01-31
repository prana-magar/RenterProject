package com.lambton;


import java.time.LocalDate;
import java.util.ArrayList;

public class Owner extends Person {
    private String companyTitle;
    private String landLineNumber;
    private String url;
    private ArrayList<Vehicle> vehicles;

    public Owner(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password, String companyTitle, String landLineNumber, String url, ArrayList<Vehicle> vehicles) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
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
}
