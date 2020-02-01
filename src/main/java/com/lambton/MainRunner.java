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

        ArrayList<VehicleRent> vehicleRents = new ArrayList<>();
        Customer c1 = new Customer("1","Prakash","Rana", Gender.MALE, LocalDate.now(),"98123123","prakash@gmail.com","ranaprakash","asdq321e1231231",new Address(),vehicleRents);
        c1.display();

        Driver d1 = new Driver("1","Ram","Rana",Gender.MALE,LocalDate.now(),"120938123","asda@asd.com","wwwas_as","asdas","23123da",Boolean.TRUE,32332.6F);
        d1.display();

        //Creation of different vehicle objects BEGIN here
        Car car1 = new Car("WAUMF98K09A690525","2019 Honda Accord","Honda","Sedan","Purple",false,true,"Saferoads Insurance",4, FuelType.PETROL,100);
         car1.display();

        Car car2 = new Car("1GYS3HEF6ER890299","2020 Porsche 911","Porsche","Sports","Red",true,true,"VHAVURBACK Inc.",2, FuelType.PETROL,100);
        car2.display();

        Car car3 = new Car("1D7RB1CP8AS240571","2018 Prius V","Toyota","Hatchback","Black",false,true,"Digit Insurance",4,FuelType.ELECTRIC,100);
        car3.display();

        Car car4 = new Car("WBAWL1C57AP711666","1969 Ford Mustang","Ford","Sedan","White",true,true,"Digit Insurance",4,FuelType.DIESEL,100);
        car3.display();

        Bus bus1 = new Bus("SALVN2BG3DH848046","Low-floor","None","Dion",false,true,"BigBus Insurance",48,32, true,true,FuelType.DIESEL,250);
        bus1.display();

        Bus bus2 = new Bus("1B3BD2FB3BN077941","Coach","None","Dion",false,true,"Good Fortune Insurance",54,36, true,false,FuelType.DIESEL,250);
        bus2.display();

        Bus bus3 = new Bus("JM3KE2BE1F0888904","Minibus","None","Intas",true,true,"LittleBus Insurance",12,14, false,false,FuelType.DIESEL,250);
        bus3.display();

        MotorCycle mc1 = new MotorCycle("WAUKF98E78A943050","2018 Ducati Multistrada","Ducati",false,true,"Good Fortune Insurance",2,FuelType.PETROL,45,150,50);
        mc1.display();

        MotorCycle mc2 = new MotorCycle("2C3CDZAG8FH338790","2019 Scrambler","Triumph",true,true,"Saferoads Insurance",2,FuelType.PETROL,26,135,50);
        mc2.display();

        MotorCycle mc3 = new MotorCycle("2C3CDZAG8FH338790","2004 Thundercat YZF600R","Yamaha",true,true,"Bikesareus Insurance",2,FuelType.PETROL,43,145,50);
        mc3.display();

        //Vehicle objects END here
        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(car1);
        vehicles1.add(car2);
        Owner o1 = new Owner("1","Odetta","Vlasov",Gender.FEMALE,LocalDate.now(),"(463) 6723367","odetta@gmail.com","odettavlasov","asdas","Quick Motors","8127289453","quickmotors.com",vehicles1);
        o1.display();
    }
}
