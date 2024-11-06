package com.ecaterinabordian.exceptionservicetask;

public class RunTask {
    public static void main(String[] args) {

        int stringLenght = TextManager.getTheTextLengthWithoutTryAndCatch("Sternocleidomastoidian");
        System.out.println(stringLenght);

        String data = null;
        System.out.println(TextManager.getTheTextLengthWithTryAndCatch(data));
        System.out.println("Nothing happens");

        System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10, 5));
        System.out.println(ArithmeticOperationService.divideDaaWithTryAndCatch(10, 0));
        System.out.println("The code is fine, the execution is good");
    }
}
