package com.assignmentTwo;

import java.util.Scanner;

public class SubtractProductandSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int product = 1;
        int sum = 0;
        int difference = 0;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;
            product = product * temp;

            n = n / 10;
        }

        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The product of the digits is: " + product);

        if (sum > product) {
            difference = sum - product;
        } else {
            difference = product - sum;
        }

        System.out.println("The difference of the product and sum is: " + difference);
    }
}
