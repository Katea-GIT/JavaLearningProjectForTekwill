package com.ecaterinabordian.operationsandciclicfunctions;

public class ComparisonOperationsExamples {

    public static void main(String[] args) {
        int a = 6;
        int b = 2;

        //Displaying a and b:
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        //(==) operator ('equal to'):
        boolean isEqual = a == b;
        System.out.println("a==b:" + isEqual);

        //(!=) operator ('not equal to'):
        boolean isNotEqual = a != b;
        System.out.println("a!=b:" + isNotEqual);

        //(>) operator ('greater than'):
        boolean greater = a > b;
        System.out.println("a>b:" + greater);

        //(<) operator ('less than'):
        boolean less = a < b;
        System.out.println("a<b:" + less);

        //(>=) operator ('greater than or equal to'):
        boolean greaterOrEqual = a >= b;
        System.out.println("a>=b:" + greaterOrEqual);

        //(<=) operator ('less than'):
        boolean lessOrEqual = a <= b;
        System.out.println("a<=b:" + lessOrEqual);
    }

}
