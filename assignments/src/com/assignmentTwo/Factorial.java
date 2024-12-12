package com.assignmentTwo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long factorial = 1;
        if (n == 0) {
            System.out.println("The factorial is " + 1);
            System.exit(0);
        }

        while (n < 0) {
            System.out.println("Please enter a valid number!");
            n = in.nextLong();
        }

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("The factorial is " + factorial);
    }
}
