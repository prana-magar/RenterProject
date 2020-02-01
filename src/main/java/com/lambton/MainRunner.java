package com.lambton;

import com.lambton.person.Customer;
import com.lambton.person.Driver;
import com.lambton.person.Gender;
import com.lambton.person.Owner;
import com.lambton.util.Address;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.FuelType;
import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {

        ArrayList<VehicleRent> vehicleRents = new ArrayList<>();
        Customer c1 = new Customer("1","Prakash","Rana", Gender.MALE, LocalDate.now(),"98123123","prakash@gmail.com","ranaprakash","asdq321e1231231",new Address(),vehicleRents);
        c1.display();

        Driver d1 = new Driver("1","Ram","Rana",Gender.MALE,LocalDate.now(),"120938123","asda@asd.com","wwwas_as","asdas","23123da",Boolean.TRUE,32332.6F);
        d1.display();

        Car car1 = new Car("WAUMF98K09A690525","Brakes don't always work, good luck","Honda","Sedan","Purple",true,true,"Lambton",4, FuelType.PETROL,100);
         car1.display();

        Car car2 = new Car("asAUMF98asK09A690525","Brakes don't always work, good luck","Honda","Sedan","Purple",true,true,"Lambton",4, FuelType.PETROL,100);
        car2.display();

        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(car1);
        vehicles1.add(car2);
        Owner o1 = new Owner("1","reo","eet",Gender.MALE,LocalDate.now(),"1231298","asdas@gmail.com","wewew_ad","asdas","Hello","8127289","asdas.com",vehicles1);
        o1.display();
    }
}
