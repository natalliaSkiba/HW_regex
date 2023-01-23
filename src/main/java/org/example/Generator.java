package org.example;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.Random;

public class Generator {
    static Random rnd = new Random();
    static Faker faker = new Faker();

    public static String generateNumber() {
        String s = "";
        for (int i = 0; i < 16; i++) {
            int n = rnd.nextInt(0, 10);
            s = s + n;
        }
        return s;
    }
    public static String generateCVV() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            int n = rnd.nextInt(0, 10);
            s = s + n;
        }
        return s;
    }
    public static String generateData() {
        String month_s;
        String year_s;
        int m = rnd.nextInt(1, 13);
        if (m < 10) {
            month_s = "0" + m;
        } else {
            month_s = "" + m;
        }
        int year = rnd.nextInt(LocalDate.now().getYear(), LocalDate.now().getYear() + 5);
        year_s = "" + year;
        String s = month_s + "/" + year_s.substring(2, 4);
         return s;
    }
    public static String generateFirstName() {
        return faker.name().firstName();
    }
    public static String generateLastName() {
        return faker.name().lastName();
    }
}
