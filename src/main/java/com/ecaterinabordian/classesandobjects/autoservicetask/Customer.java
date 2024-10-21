package com.ecaterinabordian.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class Customer {

    String name;

    String contactInfo;

    String plateNumber;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        System.out.println("The new customer has been registered");

    }

    public Customer(String nameOfCustomer, String plateNumber, String contactInfo) {
        name = nameOfCustomer;
        this.plateNumber = plateNumber;
        System.out.println("Client:" + "\n" + nameOfCustomer + "\n" + plateNumber + "\n" +  contactInfo);
        System.out.println();
    }
}
