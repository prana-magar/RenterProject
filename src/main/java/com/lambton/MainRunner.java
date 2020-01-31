package com.lambton;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {

        ArrayList<VehicleRent> vehicleRents = new ArrayList<>();
        Customer c1 = new Customer("1","Prakash","Rana",Gender.MALE, LocalDate.now(),"98123123","prakash@gmail.com","ranaprakash","asdq321e1231231",new Address(),vehicleRents);
        c1.display();

        Car car1 = new Car("WAUMF98K09A690525","Brakes don't always work, good luck","Honda","Sedan","Purple",true,true,"Lambton",4,FuelType.PETROL,100);
         car1.display();
    }
}
