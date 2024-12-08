package com.assignmentTwo;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;
        int i = 2;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        System.out.print(a + " " + b); // Print the first two numbers for n >= 2

        while (i < n) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
            i++;
        }
    }
}
