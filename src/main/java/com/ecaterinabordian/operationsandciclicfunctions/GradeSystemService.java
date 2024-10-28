package com.ecaterinabordian.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 78;

        if (testResult >= 90) {
            System.out.println("Grade A");
        } else if (testResult >= 80) {
            System.out.println("Grade B");
        } else if (testResult >= 70) {
            System.out.println("Grade C");
        } else if (testResult >= 60) {
            System.out.println("Grade D");
        } else if (testResult < 60 && testResult >= 0) {
            System.out.println("Grade F");
        } else
            System.out.println("There is no grade defined");
    }

    }

