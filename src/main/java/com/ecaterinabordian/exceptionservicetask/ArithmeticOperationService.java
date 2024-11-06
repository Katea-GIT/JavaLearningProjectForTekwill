package com.ecaterinabordian.exceptionservicetask;

public class ArithmeticOperationService {
    public static int divideDataWithoutTryAndCatch(int a, int b){
        return a/b;
    }

    public static int divideDaaWithTryAndCatch(int a, int b){
        try {
            return a/b;
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return 0;
        }
    }



}
