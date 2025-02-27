package com.assignmentTwo;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;

            n = n / 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
