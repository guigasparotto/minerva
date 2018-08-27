package com.automationpractice.util;

import java.util.Random;

public class TestUtil {

    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;

    public static String createRandomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        return "testEmail" + randomInt + "@gmail.com";
    }

}
