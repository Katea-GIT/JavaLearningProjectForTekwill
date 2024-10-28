package com.ecaterinabordian.operationsandciclicfunctions;

public class ArithmeticOperationsExamples {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Displaying a and b:
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        //Sum:
        int sum = a + b;
        System.out.println("Sum =" + sum);
        System.out.println("Sum =" + (a+b));

        //Dif:
        int dif = a - b;
        System.out.println("Difference =" + dif);
        System.out.println("Difference =" + (a-b));

        //Multiply:
        int result = a * b;
        System.out.println("Multiplication =" + result);
        System.out.println("Multiplication =" + (a*b));

        //Division:
        float div = (float) a / b;
        System.out.println("Division =" + div);
        System.out.println("Division =" + (a/b));

        //Modulus (rest):
        int rest = a % b;
        System.out.println("Rest =" + rest);
        System.out.println("Rest =" + a%b);
    }
}
