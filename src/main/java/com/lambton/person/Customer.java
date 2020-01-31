package com.lambton.person;

import com.lambton.util.Address;
import com.lambton.util.IDisplay;
import com.lambton.VehicleRent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person implements IDisplay {

    private Address address;
    private ArrayList<VehicleRent> vehicleRents;

    public Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password, Address address, ArrayList<VehicleRent> vehicleRents) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
        this.vehicleRents = vehicleRents;
    }


    public void display(){
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                " address=" + address +
                " vehicleRents=" + vehicleRents +
                '}';
    }
}
