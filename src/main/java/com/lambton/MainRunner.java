package com.lambton;

import com.lambton.person.*;
import com.lambton.rent.IllegalRentParamException;
import com.lambton.rent.VehicleRent;
import com.lambton.person.Address;
import com.lambton.util.IDisplay;
import com.lambton.util.PasswordUtil;
import com.lambton.vehicle.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


/**
 * Contains all object initializations as well as methods to display owner,
driver and customer information along with their bookings
 */
public class MainRunner {

    private static ArrayList<Customer> customers;
    private static ArrayList<Driver> drivers;
    private static ArrayList<Owner> owners;

    private static ArrayList<Car> cars;
    private static ArrayList<Bus> buses;
    private static ArrayList<MotorCycle> motorCycles;

    private static ArrayList<VehicleRent> vehicleRents;

    /**
     * Method to initialize all objects
     */
    static void init(){

        //Customer 1
        Address address1 = new Address("Canada","Ontario","Toronto","M3B3A1","43.7615","79.4111"," graydon hall drive");
        Contact contact1 = new Contact("(437) 9908989","prakash@gmail.com",address1);
        String password = "asdq321e1231231";
        String salt = PasswordUtil.getSalt(password.length());
        String securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Customer c1 = new Customer("C1",
                "Prakash",
                "Rana",
                Gender.MALE,
                LocalDate.of(1995,4,27),
                "ranaprakash",
                securePassword,
                salt,
                contact1);
        boolean isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);
        System.out.println("Is validated pw " + isPasswordValid);


        //Customer 2
        Address address2 = new Address("Canada","Ontario","Toronto","M3B3A2","46.7615","86.4111"," cosburn avenue");
        Contact contact2 = new Contact("(437) 9807865","abhisheksj@gmail.com",address2);
        password = "abhishek199566";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Customer c2 = new Customer("C2",
                "Abhishek",
                "Jaya",
                Gender.MALE,
                LocalDate.of(1995,4,18),
                "abysj",
                securePassword,
                salt,
                contact2);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Customer 3
        Address address3 = new Address("Canada","Ontario","Toronto","M3B3A3","42.7615","85.4111"," cosburn avenue");
        Contact contact3 = new Contact("(437) 6784597", "raghav21@gmail.com",address3);
        password = "raghav77";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword("raghav77", salt);
        Customer c3 = new Customer("C3",
                "Raghav",
                "Bobal",
                Gender.MALE,
                LocalDate.of(1997,07,21),
                "raghav22",
                securePassword,
                salt,
                contact3);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Customer 4
        Address address4 = new Address("Canada","Ontario","Toronto","M4B3A4","41.7616","84.4112","down town");
        Contact contact4 = new Contact("(437) 9807678","therealozzy@gmail.com",address4);
        password = "ozzy@1249";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Customer c4 = new Customer("C4",
                "Ozzy",
                "Osbourne",
                Gender.MALE,
                LocalDate.of(1948,12,03),
                "OzzyOsbourne",
                securePassword,
                salt,
                contact4);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Customer 5
        Address address5 = new Address("Canada","Ontario","Toronto","C3A2V2","41.7617","66.4156","eron avenue");
        Contact contact5 = new Contact("(989) 9805690","alicia@gmail.com",address5);
        password = "alicia22";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Customer c5 = new Customer("C5",
                "Alicia",
                "Keys",
                Gender.FEMALE,
                LocalDate.of(1981,01,25),
                "AlKeys",
                securePassword,
                salt
                , contact5);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Driver 1
        password = "rananana11";
        Contact driverContact1 = new Contact("(989) 9076891",
                "ramrana@yahoo.com");
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d1 = new Driver("D1",
                "Ram",
                "Rana",
                Gender.MALE,
                LocalDate.of(1991,03,21),
                "RamRana",
                securePassword,
                salt,
                "677-43-0205",
                Boolean.TRUE,
                32332.6F,
                driverContact1);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);


        //Driver2
        Contact driverContact2=  new Contact("(437) 9870091",
                "scottadkins@asd.com");
        password = "sctt77";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d2 = new Driver("D2",
                "Scott",
                "Adkins",
                Gender.MALE,
                LocalDate.of(1996,04,11),
                "Scotty",
                securePassword,
                salt,
                "885-66-0755",
                Boolean.TRUE,
                28099.6F,
                driverContact2);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Driver 3
        Contact driverContact3 = new Contact("(437) 8790991",
                "charlesmanson@asd.com");
        password = "charles44";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d3 = new Driver("D3",
                "Charles",
                "Manson",
                Gender.MALE,
                LocalDate.of(1999,01,27),
                "CharlesManson",
                securePassword,
                salt,
                "796-04-3290",
                Boolean.FALSE,
                19090.0F,
                driverContact3);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Driver 4
        Contact driverContact4 = new Contact("(878) 7670009",
                "cmacnee@asd.com");
        password = "cmanee090";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d4 = new Driver("D4",
                "Caria",
                "MacNamee",
                Gender.FEMALE,
                LocalDate.of(1996,05,22),
                "CMac",
                securePassword,
                salt,
                "255-69-1229",
                Boolean.TRUE,
                32019.0F,
                driverContact4);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Driver 5
        Contact driverContact5 = new Contact("(863) 2253855",
                "lumoxine@asd.com");
        password = "lumox1992";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d5 = new Driver("D5",
                "Eveline",
                "Lumox",
                Gender.FEMALE,
                LocalDate.of(1990, 11,25),
                "Elumonin",
                securePassword,
                salt,
                "335-87-9680",
                Boolean.TRUE,
                32231.0F,
                driverContact5);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);


        //Driver 6
        Contact driverContact6 = new Contact("(863) 2253855",
                "lumoxaaine@asd.com");
        password = "lumox1992";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Driver d6 = new Driver("D6",
                "Eveline",
                "rente",
                Gender.FEMALE,
                LocalDate.of(1994,07,18),
                "Elumonin34",
                securePassword,
                salt,
                "335-87-9620",
                Boolean.TRUE,
                32231.0F,
                driverContact6);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //Creation of different vehicle objects BEGIN here
        //Car Objects
        Car car1 = new Car("WAUMF98K09A690525",
                "2019 Honda Accord",
                "Honda",
                "Sedan",
                "Purple",
                false,
                true,
                "Saferoads Insurance",
                4,
                FuelType.PETROL,
                100,
                d1);

        Car car2 = new Car("1GYS3HEF6ER890299",
                "2020 Porsche 911",
                "Porsche",
                "Sports",
                "Red",
                true,
                true,
                "VHAVURBACK Inc.",
                2,
                FuelType.PETROL,
                100);

        Car car3 = new Car("1D7RB1CP8AS240571",
                "2018 Prius V",
                "Toyota",
                "Hatchback",
                "Black",
                false,
                true,
                "Digit Insurance",
                4,
                FuelType.ELECTRIC,
                100,d2);

        Car car4 = new Car("WBAWL1C57AP711666",
                "1969 Ford Mustang",
                "Ford",
                "Sedan",
                "White",
                true,
                true,
                "Digit Insurance",
                4,
                FuelType.DIESEL,
                100);

        Car car5 = new Car("5TDBKRFH4ES020941",
                "2020 Mercedes-Benz GLE SUV",
                "Mercedes",
                "SUV",
                "Blue",
                true,
                true,
                "Digit Insurance",
                6,
                FuelType.DIESEL,
                100);

        //Bus Objects
        Bus bus1 = new Bus("SALVN2BG3DH848046",
                "Low-floor",
                "None",
                "Dion",
                false,
                true,
                "BigBus Insurance",
                48,
                32,
                true,
                true,
                FuelType.DIESEL,
                250,
                d3);

        Bus bus2 = new Bus("1B3BD2FB3BN077941",
                "Coach",
                "great bus",
                "Dion",
                false,
                true,
                "Good Fortune Insurance",
                54,
                36,
                true,
                false,
                FuelType.DIESEL,
                250,
                d4);

        Bus bus3 = new Bus("JM3KE2BE1F0888904",
                "Minibus",
                "awesome bus",
                "Intas",
                true,
                true,
                "LittleBus Insurance",
                12,
                14,
                false,
                false,
                FuelType.DIESEL,
                250);

        Bus bus4 = new Bus("1G6YV34A945415578",
                "Double-decker",
                "Realigned object-oriented interface",
                "Nissan",
                false,
                true,
                "Aviva",
                32,
                14,
                true,
                true,
                FuelType.DIESEL,
                250,
                d5);

        Bus bus5 = new Bus("SCBGU3ZA2FC057391",
                "Double-decker",
                "Assimilated eco-centric process improvement",
                "BMW",
                true,
                true,
                "Intact Insurance",
                34,
                14,
                true,
                false,
                FuelType.DIESEL,
                250);

        //MotorCycle Objects
        MotorCycle mc1 = new MotorCycle("WAUKF98E78A943050",
                "2018 Ducati Multistrada",
                "Ducati",
                false,
                true,
                "Good Fortune Insurance",
                2,
                FuelType.PETROL,
                45,
                150,
                50,
                d6);

        MotorCycle mc2 = new MotorCycle("2C3CDZAG8FH338790",
                "2019 Scrambler",
                "Triumph",
                true,
                true,
                "Saferoads Insurance",
                2,
                FuelType.PETROL,
                26,
                135,
                50);

        MotorCycle mc3 = new MotorCycle("1FTEW1E82AF943821",
                "2004 Thundercat YZF600R",
                "Yamaha",
                true,
                true,
                "Bikesareus Insurance",
                2,
                FuelType.PETROL,
                43,
                145,
                50);
        //Vehicle objects END here

        //List of vehicles and information of first owner
        ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();
        vehicles1.add(car1);
        vehicles1.add(car2);

        Contact ownerContact1 = new Contact("(463) 6723367",
                "odetta@gmail.com");
        password = "ode22";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Owner o1 = new Owner("1",
                "Odetta",
                "Vlasov",
                Gender.FEMALE,
                LocalDate.of(1991,03,21),
                "odettavlasov",
                securePassword,
                salt,
                "Quick Motors",
                "8127289453",
                "quickmotors.com",
                vehicles1,
                ownerContact1);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //List of vehicles and information of second owner
        ArrayList<Vehicle> vehicles2 = new ArrayList<Vehicle>();
        vehicles2.add(car3);
        vehicles2.add(bus1);

        Contact ownerContact2 = new Contact("(463) 4263352",
                "emiliac@gmail.com");
        password = "emilia7%66";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Owner o2 = new Owner("2",
                "Emilia",
                "Clarke",
                Gender.FEMALE,
                LocalDate.of(1998,03,21),
                "emc",
                securePassword,
                salt,
                "Independent",
                "8127456713",
                "emiliascars.com", vehicles2,
                ownerContact2);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //List of vehicles and information of third owner
        ArrayList<Vehicle> vehicles3 = new ArrayList<Vehicle>();
        vehicles3.add(car4);
        vehicles3.add(bus2);

        Contact ownerContact3 = new Contact("(689) 51263458",
                "simontheman@gmail.com");
        password = "password";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Owner o3 = new Owner("3",
                "Simon",
                "Cowell",
                Gender.MALE,
                LocalDate.of(1990,03,21),
                "SimonCl",
                securePassword,
                salt,
                "Indus Dealers",
                "812245789",
                "indusdealers.com", vehicles3,
                ownerContact3);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //List of vehicles and information of fourth owner
        ArrayList<Vehicle> vehicles4 = new ArrayList<Vehicle>();
        vehicles4.add(car5);
        vehicles4.add(bus3);
        vehicles4.add(bus4);
        vehicles4.add(mc2);

        Contact ownerContact4 = new Contact("(689) 36763478",
                "queen@gmail.com");
        password = "qwerty";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Owner o4 = new Owner("4",
                "Frederick",
                "Mercury",
                Gender.MALE,
                LocalDate.of(1986,05,21),
                "Fmerc",
                securePassword,
                salt,
                "Feels on Wheels",
                "907645909",
                "feelsonwheels.com", vehicles4,
                ownerContact4);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //List of vehicles and information of fifth owner
        ArrayList<Vehicle> vehicles5 = new ArrayList<Vehicle>();
        vehicles5.add(mc1);
        vehicles5.add(bus5);

        Contact ownerContact5 = new Contact("(689) 44665590",
                "jeffcavaliere@gmail.com");
        password = "abc123";
        salt = PasswordUtil.getSalt(password.length());
        securePassword = PasswordUtil.generateSecurePassword(password, salt);
        Owner o5 = new Owner("5",
                "Jeff",
                "Cavaliere",
                Gender.MALE,
                LocalDate.of(1983,12,21),
                "Jeff",
                securePassword,
                salt,
                "AthleanX Motors",
                "890459789",
                "athleanx.com",
                vehicles5,
                ownerContact5);
        isPasswordValid =  PasswordUtil.validatePassword(password, securePassword ,salt);

        //VehicleRents objects and addition to customer
        LocalDate startDate = LocalDate.of(2019,11,5);
        LocalDate endDate = startDate.plusDays(3);
        VehicleRent vehicleRent1 = new VehicleRent(startDate,endDate, car1);

        try {
            vehicleRent1.setKmDriven(-5);
        }
        catch (IllegalRentParamException e){
            System.out.println(e);
        }


        try {
            vehicleRent1.setRentEndDate(LocalDate.now().minusDays(3));
        }
        catch (IllegalRentParamException e){
            System.out.println(e);
        }

        c1.addVehicleRents(vehicleRent1);

        LocalDate startDate2 = LocalDate.of(2020,1,15);
        LocalDate endDate2 = startDate2.plusDays(1);
        VehicleRent vehicleRent2 = new VehicleRent(startDate2,endDate2, car3);
        try {
            vehicleRent2.setKmDriven(20);
        }
        catch (IllegalRentParamException e){
            System.out.println(e.getMessage());
        }
        c2.addVehicleRents(vehicleRent2);

        LocalDate startDate3 = LocalDate.of(2020,1,5);
        LocalDate endDate3 = startDate3.plusDays(1);
        VehicleRent vehicleRent3 = new VehicleRent(startDate3,endDate3, bus1);
        c2.addVehicleRents(vehicleRent3);

        LocalDate startDate4 = LocalDate.of(2019,1,15);
        LocalDate endDate4 = startDate4.plusDays(1);
        VehicleRent vehicleRent4 = new VehicleRent(startDate4,endDate4,  car5);
        try {
            vehicleRent4.setKmDriven(10);
        }
        catch (IllegalRentParamException e){
            System.out.println(e.getMessage());
        }
        c3.addVehicleRents(vehicleRent4);

        LocalDate startDate5 = LocalDate.of(2020,1,5);
        LocalDate endDate5 = startDate5.plusDays(1);
        VehicleRent vehicleRent5 = new VehicleRent(startDate5,endDate5, mc1);
        c4.addVehicleRents(vehicleRent5);

        LocalDate startDate6 = LocalDate.of(2020,1,25);
        LocalDate endDate6 = LocalDate.now();
        VehicleRent vehicleRent6 = new VehicleRent(startDate6,endDate6, mc3);
        c4.addVehicleRents(vehicleRent6);

        customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        drivers = new ArrayList<>();
        drivers.add(d1);
        drivers.add(d2);
        drivers.add(d3);
        drivers.add(d4);
        drivers.add(d5);

        owners = new ArrayList<>();
        owners.add(o1);
        owners.add(o2);
        owners.add(o3);
        owners.add(o4);
        owners.add(o5);

        buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);
        buses.add(bus5);

        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        motorCycles = new ArrayList<>();
        motorCycles.add(mc1);
        motorCycles.add(mc2);
        motorCycles.add(mc3);

        vehicleRents = new ArrayList<>();
        vehicleRents.add(vehicleRent1);
        vehicleRents.add(vehicleRent2);
        vehicleRents.add(vehicleRent3);
        vehicleRents.add(vehicleRent4);
        vehicleRents.add(vehicleRent5);
        vehicleRents.add(vehicleRent6);

    }


    public static void main(String[] args) {


        /**
         * Storing original output and providing new output as text file
         * @param originalOut Saving original out stream
         * @param originalErr Saving original err stream
         */
        try {
            PrintStream originalOut = System.out;
            PrintStream originalErr = System.err;

            PrintStream fileOut = new PrintStream("./output_vehicle_renting_system.txt");
            PrintStream fileErr = new PrintStream("./renterProject_errors.txt");
            System.setOut(fileOut);
            System.setErr(fileErr);

            init();

            /**
             * Displaying relevant information
             * @param display() Implementing interface method
             */

            // Print all owners
            System.out.println("\n*LIST OF ALL OWNERS*\n");
            for (Owner owner : owners) {
                owner.display();
            }

            // Print all customers with their bookings
            System.out.println("\n*CUSTOMERS AND THEIR BOOKINGS*\n");
            for (Customer customer : customers) {
                customer.display();
                for (VehicleRent vehicleRent : vehicleRents) {
                    vehicleRent.display();
                }
            }

            // all customers with some bookings
            System.out.println("\n*CUSTOMERS WITH SOME BOOKINGS*\n");
            for (Customer customer : customers) {
                if (customer.hasBookings()) {
                    customer.display();
                }
            }

            // all customers with some live/current bookings vehicle
            System.out.println("\n*CUSTOMERS WITH LIVE/CURRENT BOOKINGS*\n");
            for (Customer customer : customers) {
                customer.display();
                ArrayList<VehicleRent> vehicleRents = (ArrayList<VehicleRent>) customer.getVehicleRents();
                if (customer.getVehicleRents() != null) {
                    for (VehicleRent vehicleRent : vehicleRents) {
                        if (vehicleRent.isLive()) {
                            vehicleRent.display();
                        }
                    }
                }
            }

            // overloading addVehicles in customer class
            System.out.println("\n*Overloading example*\n");
            Customer customer = customers.get(0);
            ArrayList<VehicleRent> vehicleRentsBackup = (ArrayList<VehicleRent>) customer.getVehicleRents();

            // before adding objects
            System.out.println(customer.getVehicleRents().size());

            VehicleRent singleVehicleRent = vehicleRents.get(0);

            // takes single vehicle rent object
            customer.addVehicleRents(singleVehicleRent);
            System.out.println(customer.getVehicleRents().size());

            // same interface but takes list of vehicle rent
            customer.addVehicleRents(vehicleRents);
            System.out.println(customer.getVehicleRents().size());




            // Dynamic dispatch

            System.out.println("\n*Dynamic DISPATCH WITH PARENT REF*\n");

            Person person;
            Customer customerObj = customers.get(0);
            Owner ownerObj = owners.get(0);

            person = customerObj;
            person.display();

            person = ownerObj;
            person.display();


            System.out.println("\n*Dynamic DISPATCH WITH INTERFACE REF*\n");
            // using interface
            IDisplay iDisplay;
            iDisplay = customerObj;
            iDisplay.display();

            iDisplay = ownerObj;
            iDisplay.display();



            // All rents with price
            System.out.println("\n*All RENTS WITH BILL INFO*\n");
            for(VehicleRent vehicleRent: vehicleRents){
                System.out.printf("Km driven: %d , No of days: %d, vehicle_type: %s--> total_bill: %f %n",
                        vehicleRent.getKmDriven(),vehicleRent.getNumberOfDays(),vehicleRent.getVehicle().getClass(),vehicleRent.getTotalBill()
                );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("The specified file could not be found " + e.getMessage());
        }




    }
}
