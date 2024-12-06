package com.rudra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = sum();

        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2:");
        num2 = in.nextInt();

        sum = num1 + num2;

        return sum;

//      Nothing executes after returning the value of the said method.
    }
}