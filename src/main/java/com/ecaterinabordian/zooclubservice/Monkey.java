package com.ecaterinabordian.zooclubservice;

public class Monkey extends Animal {

    public Monkey(String nameOfTheMonkey, int age){
        super(nameOfTheMonkey, age);
    }

    @Override
    public void eat() {
        System.out.println("Bananas");
    }

    @Override
    public void makeSound() {
        System.out.println("Hoo-hoo-hah");
    }
}
