package com.assignmentThree;

import java.util.Scanner;

public class Factorial {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println("The factorial of the given number is: " + factorial(num));
    }
}
