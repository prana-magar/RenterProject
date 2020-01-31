package com.lambton;


import java.time.LocalDate;

public class Owner extends Person {
    private String companyTitle;
    private String landLineNumber;
    private String url;

    public Owner(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password, String companyTitle, String landLineNumber, String url) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.companyTitle = companyTitle;
        this.landLineNumber = landLineNumber;
        this.url = url;
    }
}
