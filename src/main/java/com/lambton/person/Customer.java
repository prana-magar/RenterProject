package com.lambton.person;

import com.lambton.util.Address;
import com.lambton.VehicleRent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private ArrayList<VehicleRent> vehicleRents;

    public Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String userName, String password, Contact contact) {
        super(id, firstName, lastName, gender, birthDate, userName, password,contact);
    }

    public Customer(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String userName, String password, Address address, ArrayList<VehicleRent> vehicleRents,Contact contact) {
        super(id, firstName, lastName, gender, birthDate, userName, password,contact);
        this.vehicleRents = vehicleRents;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                " vehicleRents=" + vehicleRents +
                '}';
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


    public List<VehicleRent> getVehicleRents() {
        return vehicleRents;
    }

    public void setVehicleRents(List<VehicleRent> vehicleRents) {
        this.vehicleRents = (ArrayList<VehicleRent>)vehicleRents;
    }


}
