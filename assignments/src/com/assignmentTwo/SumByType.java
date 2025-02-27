package com.assignmentTwo;

import java.util.Scanner;

public class SumByType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        while (num != 0) {
            if (num < 0) {
                negativeSum = negativeSum + num;
            } if (num > 0 && num % 2 == 0) {
                positiveEvenSum = positiveEvenSum + num;
            } if (num > 0 && num % 2 != 0) {
                positiveOddSum = positiveOddSum + num;
            }

            num = in.nextInt();
        }

        System.out.println("The sum of negative numbers is " + negativeSum);
        System.out.println("The sum of positive even numbers is " + positiveEvenSum);
        System.out.println("The sum of positive odd numbers is " + positiveOddSum);
    }
}
