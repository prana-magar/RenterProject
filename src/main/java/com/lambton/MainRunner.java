package com.lambton;

import java.time.LocalDate;

public class MainRunner {
    public static void main(String[] args) {
        Customer c1 = new Customer("1","Prakash","Rana",Gender.MALE, LocalDate.now(),"98123123","prakash@gmail.com","ranaprakash","asdq321e1231231",new Address());
        //c1.display();

    }
}
