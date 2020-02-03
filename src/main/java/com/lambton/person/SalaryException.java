package com.lambton.person;

public class SalaryException extends Exception {

    private String message;
    public SalaryException(String message) {
        super(message);
        this.message = message;
    }

    public SalaryException() {
    }

    @Override
    public String toString() {
        return "SalaryException["+message+"]";
    }
}
