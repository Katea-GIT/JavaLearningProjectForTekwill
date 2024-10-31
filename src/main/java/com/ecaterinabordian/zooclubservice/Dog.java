package com.ecaterinabordian.zooclubservice;

public class Dog extends Animal {

    public Dog (String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Ham-ham");
    }
}
