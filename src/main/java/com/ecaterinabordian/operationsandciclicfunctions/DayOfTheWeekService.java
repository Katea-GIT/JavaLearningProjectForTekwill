package com.ecaterinabordian.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "FRIDAY";

        System.out.println(dayName.toUpperCase());

        switch (dayName) {
            case "MONDAY":
                dayNumber = 1;
                break;
            case "TUESDAY":
                dayNumber = 2;
                break;
            case "WEDNESDAY":
                dayNumber = 3;
                break;
            case "THURSDAY":
                dayNumber = 4;
                break;
            case "FRIDAY":
                dayNumber = 5;
                break;
            case "SATURDAY":
                dayNumber = 6;
                break;
            case "SUNDAY":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
              System.out.println("Wrong day");
        }
        System.out.println("Day number for" + " " + dayName + " " + "is" + " " + dayNumber);
    }
}
