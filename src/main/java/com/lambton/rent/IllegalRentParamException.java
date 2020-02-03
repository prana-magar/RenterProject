package com.lambton.rent;

public class IllegalRentParamException extends Exception {

    private String message;
    public IllegalRentParamException() {
    }

    public IllegalRentParamException(String message) {
        super(message);
        this.message = message;

    }


    @Override
    public String toString() {
        return "IllegalRentParamException["+this.message+"]";
    }
}
