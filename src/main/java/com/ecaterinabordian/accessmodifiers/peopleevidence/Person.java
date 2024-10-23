package com.ecaterinabordian.accessmodifiers.peopleevidence;

public class Person {

   private String first_name;

   private String last_name;

   int ID;

   String sex;

   int age;

   protected String residence;

   public boolean isRetired;

    // Constructor 1: all the details about Person are known.
    public Person(String first_name, String last_name, int ID,String sex, int age, String residence, boolean isRetired) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ID = ID;
        this.sex = sex;
        this.age = age;
        this.residence = residence;
        this.isRetired = isRetired;

        System.out.println("A new person has been registered with all the details:");

    }

    // Constructor 2:
    public void setAge(int enteredAge) {
        if (enteredAge > 0 && enteredAge < 100) {
            this.age = enteredAge;
        } else {
            System.out.println("The entered age is not valid, the property age is still empty");
        }

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
