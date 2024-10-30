package com.ecaterinabordian.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    static Random random = new Random();

    public static int getRandomInt(int startLimit, int endLimit){
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;

        return randomNumber;
    }

    public static int getRandomInt(int limit){
        return random.nextInt(limit);
    }

    public static String getRandomEmail(String prefix, String emailDomain){
        return prefix + DataGeneratorUtil.getRandomInt(9999999) + emailDomain;
    }

}
