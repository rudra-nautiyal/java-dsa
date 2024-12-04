package com.assignmentOne;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Enter the operation to be performed");
        char operation = in.next().trim().charAt(0);

        if (operation == '+') {
            int ans = num1 + num2;
            System.out.println(ans);
        } else if (operation == '-') {
            int ans = num1 - num2;
            System.out.println(ans);
        } else if (operation == '*') {
            int ans = num1 * num2;
            System.out.println(ans);
        } else if (operation == '/') {
            int ans = num1 / num2;
            System.out.println(ans);
        } else {
            System.out.println("Please enter a valid operation!");
        }

        in.close();
    }
}
