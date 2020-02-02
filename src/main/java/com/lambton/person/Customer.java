package com.lambton.person;

import com.lambton.util.Address;
import com.lambton.util.IDisplay;
import com.lambton.VehicleRent;

import javax.xml.stream.FactoryConfigurationError;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public List<VehicleRent> getVehicleRents() {
        return vehicleRents;
    }

    public void setVehicleRents(List<VehicleRent> vehicleRents) {
        this.vehicleRents = (ArrayList<VehicleRent>)vehicleRents;
    }

    public void addVehicleRent(VehicleRent vehicleRent){

        if(this.vehicleRents == null){
            this.vehicleRents = new ArrayList<>();
        }

        if(this.vehicleRents.contains(vehicleRent)){
            System.out.println("Already Present");
        }
        this.vehicleRents.add(vehicleRent);
    }

    public void addVehicleRents(List<VehicleRent> vehicleRents){
        for(VehicleRent vehicleRent: vehicleRents){
            this.addVehicleRent(vehicleRent);
        }
    }

    public Boolean hasBookings(){
        return this.vehicleRents != null;
    }

    public Boolean hasLiveBookings(){

        for(VehicleRent vehicleRent: this.vehicleRents){
            if(vehicleRent.isLive()){
                return true;
            }
        }
        return false;
    }

}
