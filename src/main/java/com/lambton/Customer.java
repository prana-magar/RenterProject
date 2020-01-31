package com.lambton;

import java.time.LocalDate;

public class Customer extends Person implements IDisplay{

    private Address address;

    Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password,Address address) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;

    }

    public void display(){
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                " address=" + address +
                '}';
    }
}
