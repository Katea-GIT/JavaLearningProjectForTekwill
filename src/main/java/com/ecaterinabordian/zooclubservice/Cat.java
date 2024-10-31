package com.ecaterinabordian.zooclubservice;

public class Cat extends Animal {

    public Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("Fish food");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
