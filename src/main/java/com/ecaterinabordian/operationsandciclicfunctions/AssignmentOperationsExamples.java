package com.ecaterinabordian.operationsandciclicfunctions;

public class AssignmentOperationsExamples {

    public static void main(String[] args) {
        int a = 6;
        int b = 1;

        //Displaying a and b:
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        //(=) operator:
        int result = a;
        System.out.println("(=) operator:" + result);

        //(+=) operator:
        result +=b; //result = result + b
        System.out.println("(+=) operator:" + result);

        //(-=) operator:
        result -=b; //result = result - b
        System.out.println("(-=) operator:" + result);

        //(*=) operator:
        result *=b; //result = result * b
        System.out.println("(*=) operator:" + result);

        //(/=) operator:
        result /=b; //result = result / b
        System.out.println("(/=) operator:" + result);

        //(%=) operator:
        result %=b; //result = result % b
        System.out.println("(%=) operator:" + result);
    }
}
