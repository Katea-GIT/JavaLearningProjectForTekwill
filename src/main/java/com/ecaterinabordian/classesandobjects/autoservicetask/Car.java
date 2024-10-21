package com.ecaterinabordian.classesandobjects.autoservicetask;

public class Car {

    String make;

    String model;

    String plateNumber;

    int year;

    String color;

    String fuelType;

    public Car(String makeOfTheCar, String modelOfTheCar, String colorOfTheCar) {
        make = makeOfTheCar;
        model = modelOfTheCar;
        color = colorOfTheCar;
    }

    public Car(String make, String model, String plateNumber, int year, String color, String fuelType) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.plateNumber = plateNumber;
        this.fuelType = fuelType;

        System.out.println("The car in progress with the following details:");
    }

}