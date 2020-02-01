package com.lambton;

import com.google.gson.Gson;
import com.lambton.person.Customer;
import com.lambton.person.Driver;
import com.lambton.person.Gender;
import com.lambton.person.Owner;
import com.lambton.util.Address;
import com.lambton.vehicle.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {

        //Customer 1
        ArrayList<VehicleRent> vehicleRents1 = new ArrayList<>();
        Customer c1 = new Customer("C1", "Prakash", "Rana", Gender.MALE, LocalDate.now(), "(437) 9908989 ", "prakash@gmail.com", "ranaprakash", "asdq321e1231231", new Address(), vehicleRents1);
        c1.display();

        //Customer 2
        ArrayList<VehicleRent> vehicleRents2 = new ArrayList<>();
        Customer c2 = new Customer("C2", "Abhishek", "Jaya", Gender.MALE, LocalDate.now(), "(437) 9807865", "abhisheksj@gmail.com", "abysj", "abhishek199566", new Address(), vehicleRents2);
        c2.display();

        //Customer 3
        ArrayList<VehicleRent> vehicleRents3 = new ArrayList<>();
        Customer c3 = new Customer("C2", "Raghav", "Bobal", Gender.MALE, LocalDate.now(), "(437) 6784595", "raghav21@gmail.com", "raghav22", "raghav77", new Address(), vehicleRents3);
        c2.display();


        //Driver 1
        Driver d1 = new Driver("1", "Ram", "Rana", Gender.MALE, LocalDate.now(), "120938123", "asda@asd.com", "wwwas_as", "asdas", "23123da", Boolean.TRUE, 32332.6F);
        d1.display();

        //Creation of different vehicle objects BEGIN here
        //Car Objects
        Car car1 = new Car("WAUMF98K09A690525", "2019 Honda Accord", "Honda", "Sedan", "Purple", false, true, "Saferoads Insurance", 4, FuelType.PETROL, 100);
        car1.display();

        Car car2 = new Car("1GYS3HEF6ER890299", "2020 Porsche 911", "Porsche", "Sports", "Red", true, true, "VHAVURBACK Inc.", 2, FuelType.PETROL, 100);
        car2.display();

        Car car3 = new Car("1D7RB1CP8AS240571", "2018 Prius V", "Toyota", "Hatchback", "Black", false, true, "Digit Insurance", 4, FuelType.ELECTRIC, 100);
        car3.display();

        Car car4 = new Car("WBAWL1C57AP711666", "1969 Ford Mustang", "Ford", "Sedan", "White", true, true, "Digit Insurance", 4, FuelType.DIESEL, 100);
        car4.display();

        Car car5 = new Car("5TDBKRFH4ES020941", "2020 Mercedes-Benz GLE SUV", "Mercedes", "SUV", "Blue", true, true, "Digit Insurance", 6, FuelType.DIESEL, 100);
        car5.display();

        Bus bus1 = new Bus("SALVN2BG3DH848046", "Low-floor", "None", "Dion", false, true, "BigBus Insurance", 48, 32, true, true, FuelType.DIESEL, 250);
        bus1.display();

        //Bus Objects
        Bus bus2 = new Bus("1B3BD2FB3BN077941", "Coach", "None", "Dion", false, true, "Good Fortune Insurance", 54, 36, true, false, FuelType.DIESEL, 250);
        bus2.display();

        Bus bus3 = new Bus("JM3KE2BE1F0888904", "Minibus", "None", "Intas", true, true, "LittleBus Insurance", 12, 14, false, false, FuelType.DIESEL, 250);
        bus3.display();

        Bus bus4 = new Bus("1G6YV34A945415578", "Double-decker", "Realigned object-oriented interface", "Nissan", false, true, "Aviva", 32, 14, true, true, FuelType.DIESEL, 250);

        Bus bus5 = new Bus("SCBGU3ZA2FC057391","Double-decker", "Assimilated eco-centric process improvement", "BMW", false, true, "Intact Insurance", 34, 14, true, false, FuelType.DIESEL, 250);

        //MotorCycle Objects
        MotorCycle mc1 = new MotorCycle("WAUKF98E78A943050", "2018 Ducati Multistrada", "Ducati", false, true, "Good Fortune Insurance", 2, FuelType.PETROL, 45, 150, 50);
        mc1.display();

        MotorCycle mc2 = new MotorCycle("2C3CDZAG8FH338790", "2019 Scrambler", "Triumph", true, true, "Saferoads Insurance", 2, FuelType.PETROL, 26, 135, 50);
        mc2.display();

        MotorCycle mc3 = new MotorCycle("1FTEW1E82AF943821", "2004 Thundercat YZF600R", "Yamaha", true, true, "Bikesareus Insurance", 2, FuelType.PETROL, 43, 145, 50);
        mc3.display();
        //Vehicle objects END here

        //List of vehicles and information of first owner
        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(car1);
        vehicles1.add(car2);
        Owner o1 = new Owner("1", "Odetta", "Vlasov", Gender.FEMALE, LocalDate.now(), "(463) 6723367", "odetta@gmail.com", "odettavlasov", "ode22", "Quick Motors", "8127289453", "quickmotors.com", vehicles1);
        o1.display();

        //List of vehicles and information of second owner
        ArrayList<Vehicle> vehicles2 = new ArrayList<Vehicle>();
        vehicles2.add(car3);
        vehicles2.add(bus1);
        Owner o2 = new Owner("2", "Emilia", "Clarke", Gender.FEMALE, LocalDate.now(), "(463) 4263352", "emiliac@gmail.com", "emc", "emilia7%66", "Independent", "8127456713", "emiliascars.com", vehicles2);
        o2.display();

        //List of vehicles and information of third owner
        ArrayList<Vehicle> vehicles3 = new ArrayList<Vehicle>();
        vehicles3.add(car4);
        vehicles3.add(bus2);
        Owner o3 = new Owner("3", "Simon", "Cowell", Gender.MALE, LocalDate.now(), "(689) 51263458", "simontheman@gmail.com", "SimonCl", "password", "Indus Dealers", "812245789", "indusdealers.com", vehicles3);
        o3.display();

        //List of vehicles and information of fourth owner
        ArrayList<Vehicle> vehicles4 = new ArrayList<Vehicle>();
        vehicles4.add(car5);
        vehicles4.add(bus3);
        vehicles4.add(bus4);
        vehicles4.add(mc2);
        Owner o4 = new Owner("4", "Frederick", "Mercury", Gender.MALE, LocalDate.now(), "(689) 36763478", "queen@gmail.com", "Fmerc", "qwerty", "Feels on Wheels", "907645909", "feelsonwheels.com", vehicles4);
        o4.display();

        //List of vehicles and information of fifth owner
        ArrayList<Vehicle> vehicles5 = new ArrayList<Vehicle>();
        vehicles5.add(mc1);
        vehicles5.add(bus5);
        Owner o5 = new Owner("5", "Jeff", "Cavaliere", Gender.MALE, LocalDate.now(), "(689) 44665590", "jeffcavaliere@gmail.com", "Jeff", "abc123", "AthleanX Motors", "890459789", "athleanx.com", vehicles5);
        o5.display();
    }
}
