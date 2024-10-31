package com.ecaterinabordian.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat("Oscar", 1);
        Dog dog001 = new Dog("Leonard", 3);
        Monkey monkey001 = new Monkey("Sia", 6);

        System.out.println(cat001.getName());
        System.out.println(cat001.getAge());
        cat001.makeSound();
        System.out.println();

        System.out.println("Our Zoo Super Star:" + " " + monkey001.getName()+ " " + monkey001.getAge());
        monkey001.makeSound();
    }
}
