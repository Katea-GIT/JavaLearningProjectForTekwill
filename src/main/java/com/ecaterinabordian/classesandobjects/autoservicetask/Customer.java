package com.ecaterinabordian.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class Customer {

    String name;

    String contactInfo;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        System.out.println("The new customer has been registered");
    }
}
