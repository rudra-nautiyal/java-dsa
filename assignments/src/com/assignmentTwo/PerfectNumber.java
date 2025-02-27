package com.assignmentTwo;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("This is a perfect number.");
        } else {
            System.out.println("This is not a perfect number.");
        }
    }
}
