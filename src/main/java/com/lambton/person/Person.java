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

    public String getId() {
       return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public String getFirstName() {
       return firstName;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getLastName() {
       return lastName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public Gender getGender() {
       return gender;
    }

    public void setGender(Gender gender) {
       this.gender = gender;
    }

    public LocalDate getBirthDate() {
       return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
       this.birthDate = birthDate;
    }

    public int getAge() {
       return age;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public String getMobileNumber() {
       return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
       this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
       return emailId;
    }

    public void setEmailId(String emailId) {
       this.emailId = emailId;
    }

    public String getUserName() {
       return userName;
    }

    public void setUserName(String userName) {
       this.userName = userName;
    }

    public String getPassword() {
       return password;
    }

    public void setPassword(String password) {
       this.password = password;
    }
 }