package com.ecaterinabordian.accessmodifiers;

import com.ecaterinabordian.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person person1 = new Person("David", "Strong", 20030002, "Male", 32, "Colorado", false);
        Person person2 = new Person("Marry", "White", 200300045, "Female", 74,  "New Mexico", true);
        Person person3 = new Person("John", "Stemel", 200455634, "Male", 24, "New York", false);
        Person person4 = new Person("Larry", "Trum", 20045678, "Male", 35, "Ohio", false);
        Person person5 = new Person("Kate", "Kuppchelea", 20045678, "Female", 80, "Las Vegas", true);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);


        if (person1.isRetired) {
            System.out.println("The person" + " " + person1.getFirst_name() + " " + "is retired");
        } else {
            System.out.println("The person" + " " + person1.getFirst_name() + " " + "is not retired");
        }

        if (person2.isRetired) {
            System.out.println("The person" + " " + person2.getFirst_name() + " " + "is retired");
        } else {
            System.out.println("The person" + " " + person2.getFirst_name() + " " + "is not retired");
        }

        if (person3.isRetired) {
            System.out.println("The person" + " " + person3.getFirst_name() + " " + "is retired");
        } else {
            System.out.println("The person" + " " + person3.getFirst_name() + " " + "is not retired");
        }

        if (person4.isRetired) {
            System.out.println("The person" + " " + person4.getFirst_name() + " " + "is retired");
        } else {
            System.out.println("The person" + " " + person4.getFirst_name() + " " + "is not retired");
        }

        if (person5.isRetired) {
            System.out.println("The person" + " " + person5.getFirst_name() + " " + "is retired");
        } else {
            System.out.println("The person" + " " + person5.getFirst_name() + " " + "is not retired");
        }

    }
}
