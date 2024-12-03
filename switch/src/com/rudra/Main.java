package com.rudra;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next().toLowerCase(Locale.ROOT);

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit.");
            case "banana" -> System.out.println("The most popular fruit.");
            default -> System.out.println("Please enter a valid fruit.");
        }
    }
}