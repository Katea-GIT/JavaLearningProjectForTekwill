package com.ecaterinabordian.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
       int start = 0;
       int stop = 180;

       int whileCounter = start;
       while (whileCounter < stop) {
           System.out.print(whileCounter + ",");
           whileCounter++; // whileCounter = whileCounter +1 or whileCounter += 1;
       }

       //Valoarea dupa ce iese din cilcu While este 0

        System.out.println();

       do {
           System.out.print( whileCounter + ",");
           whileCounter--; //whileCounter = whileCounter -1 or whileCounter -= 1;
       } while (whileCounter > start);
        System.out.println();
    }


}
