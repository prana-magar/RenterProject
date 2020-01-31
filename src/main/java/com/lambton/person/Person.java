package com.lambton.person;

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
       return "Person{" +
               "id='" + id + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", gender=" + gender +
               ", birthDate=" + birthDate +
               ", age=" + age +
               ", mobileNumber='" + mobileNumber + '\'' +
               ", emailId='" + emailId + '\'' +
               ", userName='" + userName + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
 }
