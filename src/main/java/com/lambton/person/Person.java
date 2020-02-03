package com.lambton.person;

import com.lambton.util.IDisplay;
import com.lambton.util.PasswordUtil;

import java.time.LocalDate;

 public abstract class Person implements IDisplay {
    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private int age;
    private String userName;
    private String password;
    private String salt;
    private Contact contact;

     Person(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String userName,
            String password,Contact contact) {
        String salt = PasswordUtil.getSalt(password.length());
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contact = contact;
        this.userName = userName;
        this.password = PasswordUtil.generateSecurePassword(password, salt);
        this.age = setAge();
    }

     String getFullName(){
        return this.firstName + " " + this.lastName;
    }


    private int setAge(){
        this.age = LocalDate.now().getYear() - this.birthDate.getYear();
        return this.age;
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
               ", userName='" + userName + '\'' +
               ", password='" + password + '\'' +
               ", contact='" + contact + '\'' +
               '}';
    }




    @Override
    public void display() {
       System.out.println(this.toString());
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

     public String getSalt() {
         return salt;
     }

     public void setSalt(String salt) {
         this.salt = salt;
     }

     public Contact getContact() {
         return contact;
     }

     public void setContact(Contact contact) {
         this.contact = contact;
     }
 }
