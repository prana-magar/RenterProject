package com.lambton.util;
//The util package contains the address and passwordUtil classes and an IDisplay interface
//Address class contains the address information that is used in MainRunner

public class Address {
    private String country;
    private String province;
    private String city;
    private String pincode;
    private String latitude;
    private String longitude;
    private String streetName;

    public Address(String country, String province, String city, String pincode, String latitude, String longitude, String streetName) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.pincode = pincode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.streetName = streetName;
    }
}
