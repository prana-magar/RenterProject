package com.lambton.person;

import com.lambton.util.Address;
import com.lambton.util.IDisplay;
import com.lambton.VehicleRent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class Customer extends Person implements IDisplay {

    private Address address;
    private ArrayList<VehicleRent> vehicleRents;


    public Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String password, Address address) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<VehicleRent> getVehicleRents() {
        return vehicleRents;
    }

    public void setVehicleRents(ArrayList<VehicleRent> vehicleRents) {
        this.vehicleRents = vehicleRents;
    }

    public Boolean addVehicleRent(VehicleRent vehicleRent){
        if(vehicleRent == null){
            return false;
        }
        if(this.vehicleRents == null){
            this.vehicleRents = new ArrayList<>();
        }

        if(this.vehicleRents.contains(vehicleRent)){
            System.out.println("Already Present");
            return false;
        }
        this.vehicleRents.add(vehicleRent);
        return true;
    }
}
