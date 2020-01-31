package com.lambton;

import java.time.LocalDate;

 public abstract class Person {
    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private int age;
    private String mobileNumber;
    private String emailId;
    private String userName;
    private String password;


     Person(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
        this.setAge();
    }

     String getFullName(){
        return this.firstName + " " + this.lastName;
    }


    private void setAge(){
        this.age = LocalDate.now().getYear() - this.birthDate.getYear();
    }


    @Override
    public String toString() {
        return String.format("\nPerson(\nid= %s,\nfirstName= %s,\nlastName=%s\n)",id,firstName,lastName);
    }
}
