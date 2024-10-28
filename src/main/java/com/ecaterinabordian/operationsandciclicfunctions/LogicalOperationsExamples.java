package com.ecaterinabordian.operationsandciclicfunctions;

public class LogicalOperationsExamples {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //Displaying a and b:
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        //Logic and (&&):
        boolean result = a && b;
        System.out.println("(&&) logic operation:" + result);

        //Logic or (||):
        boolean result2 = a || b;
        System.out.println("(||) logic operation:" + result2);

        //Negation (!):
        boolean result3 = !a;
        System.out.println("(!) logic operation:" + result3);
    }
}
