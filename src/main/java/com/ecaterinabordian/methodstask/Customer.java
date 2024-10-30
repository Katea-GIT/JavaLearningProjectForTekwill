package com.ecaterinabordian.methodstask;

public class Customer {
    private String name;
    private String email;
    private int age;

    public Customer(String name, String email, int age){
        this.name = name;
        this.email = email;
        if (age >= 18 && age <=100){
            this.age = age;
        }
    }

    public Customer() {

    }

public void setName(String enteredName) {
    name = enteredName;
}
public String getName() {
    return name;
}
public void setEmail(String email) {
    this.email = email;
}
public String getEmail() {
    return email;
}
public void setAge(int age){
    if (age > 100 || age <= 18){
        age = 0;
        System.out.println("The enteredAge is not valid");
    }else {
        this.age = age;
    }
}
public int getAge() {
    return age;
}

public String getTheObjectInformation(){
       return "The name of the customer is: [" + this.name + "] with email [" + this.email + "] and age [" + age+ "]";

}


}
