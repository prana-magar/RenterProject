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

        Car car1 = new Car("WAUMF98K09A690525","Brakes don't always work, good luck","Honda","Sedan","Purple",true,true,"Saferoads Insurance",4, FuelType.PETROL,100);
         car1.display();

        Car car2 = new Car("1GYS3HEF6ER890299","None","Porshe","Sports","Red",true,true,"VHAVURBACK Inc.",2, FuelType.PETROL,100);
        car2.display();

        Car car3 = new Car("1D7RB1CP8AS240571","Low kMs driven","Toyota","Hatchback","Black",true,true,"Digit Insurance",4,FuelType.DIESEL,100);
        car3.display();
        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(car1);
        vehicles1.add(car2);
        Owner o1 = new Owner("1","Odetta","Vlasov",Gender.FEMALE,LocalDate.now(),"(463) 6723367","odetta@gmail.com","odettavlasov","asdas","Quick Motors","8127289453","quickmotors.com",vehicles1);
        o1.display();
    }
}
