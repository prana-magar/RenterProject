package com.lambton.person;

import com.lambton.util.Address;

import java.util.regex.Pattern;

/**
 * Stores all contact information about a person.
 */
public class Contact {

    private String mobileNumber;
    private String emailId;
    private Address address;


    @Override
    public String toString() {
        return "Contact{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address=" + address +
                '}';
    }

    public Contact(String mobileNumber, String emailId, Address address) {


        if(!this.validatePhoneNumber(mobileNumber))
        {
            throw new IllegalArgumentException("PhoneNumbe not proper.Should have length 7<= phoneNumber >=16");
        }
        this.mobileNumber = mobileNumber;

        if(!this.validateEmailId(emailId)){
            throw new IllegalArgumentException("Email not proper");
        }
        this.emailId = emailId;
        this.address = address;
    }

    public Contact(String mobileNumber, String emailId) {
        if(!this.validatePhoneNumber(mobileNumber))
        {
            throw new IllegalArgumentException("PhoneNumbe not proper.Should have length 7<= phoneNumber >=16");
        }
        this.mobileNumber = mobileNumber;

        if(!this.validateEmailId(emailId)){
            throw new IllegalArgumentException("Email not proper");
        }
        this.emailId = emailId;
    }


    /**
     * Checks for email patter and returns false if not proper
     * @param emailId
     * @return
     */
    private boolean validateEmailId(String emailId){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (emailId == null)
            return false;
        return pat.matcher(emailId).matches();
    }

    /**
     * simple validate mobile number with length >=7 and <=16
     * @param mobileNumber
     * @return
     */
    private boolean validatePhoneNumber(String mobileNumber){
        return (mobileNumber.length()>=7 && mobileNumber.length()<=16);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public Address getAddress() {
        return address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
