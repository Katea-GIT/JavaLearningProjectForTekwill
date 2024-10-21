package com.ecaterinabordian.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car0001 = new Car( "BMW", "X7", "white");
        Car car0002 = new Car( "BMW", "X5", "blue");
        Car car0003 = new Car("BMW", "X3", "black");

        System.out.println("Cars in Auto Service:");
        System.out.println(car0001.make + " " + car0001.model + " " + car0001.color);
        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color);
        System.out.println(car0003.make + " " + car0003.model + " " + car0003.color);

        Car car0004 = new Car("BMW", "X1", "RAI 2", 2024, "grey", "Diesel");
        System.out.println(car0004.make + " " + car0004.model + " " + car0004.color + " " + car0004.plateNumber + " " + car0004.year + " " + car0004.fuelType);
        System.out.println();


        Mechanic mechanic01 = new Mechanic( "Max", 3, "Check car");
        Mechanic mechanic02 = new Mechanic(  "Sergiu",   7, "Repair car");
        Mechanic mechanic03 = new Mechanic ("Alex", 1, "Perform maintenance car");

        System.out.println("Available mechanic:" + " " + mechanic01.name + " " + "with" + " " + mechanic01.experienceYears + " " + "years experience" + " " + "in" + " " + mechanic01.speciality);
        System.out.println("Available mechanic:" + " " + mechanic02.name + " " + "with" + " " + mechanic02.experienceYears + " " + "years experience" + " " + "in" + " " + mechanic02.speciality);
        System.out.println("Available mechanic:" + " " + mechanic03.name + " " + "with" + " " + mechanic03.experienceYears + " " + "years experience" + " " + "in" + " " + mechanic03.speciality);
        System.out.println();

        Garage garage1 = new Garage();
        garage1.name = "Auto_BMW_Service1";
        garage1.location = "Bucuriei 18a";
        garage1.availableSlots = true;
        System.out.println("Available service:" + " " + garage1.name + " " + garage1.location + " " + garage1.availableSlots);
        System.out.println();

       Customer customer1 = new Customer("Ion Rotaru", "Stefan Cel Mare");
       Customer customer2 = new Customer("Stefan Balan", "CTO 123", "Viilor, 21");

       ServiceInvoice invoice1 = new ServiceInvoice();
    }
}
