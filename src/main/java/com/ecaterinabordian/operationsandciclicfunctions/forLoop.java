package com.ecaterinabordian.operationsandciclicfunctions;

public class forLoop {
    public static void main(String[] args) {

        //Count to 100 by ten:
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }

        //Print values between 0 and 10:
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ",");
        }

        System.out.println();

        //Print the multiplication table for a specified number:
        int number = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}
