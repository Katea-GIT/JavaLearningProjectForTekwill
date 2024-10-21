package com.ecaterinabordian.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car0001 = new Car( "BMW", "X7", "white", 2023, "Petrol");
        Car car0002 = new Car( "BMW", "X5", "blue", 2019, "Diesel");
        Car car0003 = new Car("BMW", "X3", "black", 2020, "Diesel");

        System.out.println(car0001.make + " " + car0001.model + " " + car0001.color + " " +car0001.year + " " + car0001.fuelType);

        Mechanic mechanic01 = new Mechanic( "Max", 3);
        Mechanic mechanic02 = new Mechanic(  "Sergiu",   7);

        System.out.println("Available mechanic:" + " " + mechanic01.name + " " + mechanic01.experienceYears);
        System.out.println("Available mechanic:" + " " + mechanic02.name + " " + mechanic02.experienceYears);
    }
}
