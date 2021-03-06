# RENTER PROJECT

## PROJECT CONTRIBUTORS

Abhishek Santhosh Jaya (C0769778)<br>
Prakash Rana (C0773839)<br>
Raghav Bobal (C0780996)<br>

## PROJECT DESCRIPTION
Our project is a vehicle renting system which contains a detailed list of customers, drivers, owners and their vehicles. Customers are allowed to rent vehicles with or without a driver. The total is calculated depending on the type of vehicle rented and the number of days for which it was rented.

## PROJECT STRUCTURE
<img src="https://i93.servimg.com/u/f93/18/45/29/87/struct10.jpg" alt="Class hierarchy" style="float: left; margin-right: 10px;"/>
We have used the following packages and classes to implement the above given structure:<br>

### *Person Package*<br>
* **Person Class**: Abstract class containing attributes to be inherited by Customer, Driver and Owner Classes
* **Customer Class**: Holds details of customer as well as the vehicles they have rented
* **Driver Class**: Holds information about the drivers that are available
* **Owner Class**: Holds information about owners and the vehicles they own
* **Gender Class**: Enum class to hold gender (Male, Female, Other)
* **Contact Class**: Stores all contact information about a person
* **Address Class**: Class containing address information used in MainRunner

### *Vehicle Package*<br>
* **Vehicle Class**: Abstract class containing attributes to be inherited by Bus, Car, MotorCycle
* **Car Class**: Contains attributes inherited from Vehicle as well as carColor and carType
* **Bus Class**: Contains attributes inherited from Vehicle as well as busType, wifi and accessibility services
* **MotorCycle Class**: Contains attributes inherited from Vehicle as well as mileage and topSpeed
* **FuelType Class**: Enum class to hold the type of fuel used (Petrol, Diesel, Electric)

### *Utility Package*<br>
* **IDisplay Class**: Interface containing one method public void display()
* **PasswordUtil Class**: Class used for encrption and decryption of passwords

### *Rent Package*
* **VehicleRent Class**: Contains rental information such as startDate, endDate, kmsDriven, totalBill etc.
* **IllegalRentParamException Class**: Class for custom exception


### *MainRunner Class*
* Contains all object initializations as well as methods to display owner, driver and customer information along with their bookings


## REFERENCES
* [Apps Developer Blog](http://www.appsdeveloperblog.com/encrypt-user-password-example-java/) - Used to create the encryption/decryption method
* [DEV2QA](https://www.dev2qa.com/how-to-write-console-output-to-text-file-in-java/) - Used to write output to .txt file
* [Geeks for Geeks](https://www.geeksforgeeks.org/check-email-address-valid-not-java/) - Used for email validation regex
