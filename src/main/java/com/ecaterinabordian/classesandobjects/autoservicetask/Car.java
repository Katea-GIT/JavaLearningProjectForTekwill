package com.ecaterinabordian.classesandobjects.autoservicetask;

public class Car {

    String make;

    String model;

    String plateNumber;

    int year;

    String color;

    String fuelType;

    public Car(String makeOfTheCar, String modelOfTheCar, String colorOfTheCar, int yearOfTheCar, String fuelType) {
        make = makeOfTheCar;
        model = modelOfTheCar;
        color = colorOfTheCar;
        year = yearOfTheCar;
        this.fuelType = fuelType;
    }

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}