package com.assignmentThree;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(Multiply(num1, num2));
    }

    static int Multiply(int a, int b) {
        return a * b;
    }
}
