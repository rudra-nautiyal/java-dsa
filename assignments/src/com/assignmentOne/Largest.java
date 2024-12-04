package com.assignmentOne;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num2 == num1) {
            System.out.println("Both are equal");
        } else if (num2 > num1) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num1);
        }

        in.close();
    }
}
