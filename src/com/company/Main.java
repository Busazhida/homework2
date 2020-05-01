package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateRandomAge());
        System.out.println(sum(generateRandomAge(), 18));
        System.out.println(sum(generateRandomAge(), 34));
        System.out.println(sum(generateRandomAge(), 12));
        System.out.println(sum(generateRandomAge(), -34));
        System.out.println(sum(generateRandomAge(), 25));
    }

    public static String sum(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "You can walk";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "You can walk";
        } else if (age > 45 && (temperature > -10 && temperature <= 25)) {
            return "You can walk";
        } else {
            return "Stay home!";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(80) + 1;
        return age;
    }
}