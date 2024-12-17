package com.assignmentThree;

public class MaxMin {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        Maximum(num1, num2, num3);
        Minimum(num1, num2, num3);
    }

    static void Maximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the greatest.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the greatest.");
        } else if (c > a && c > b) {
            System.out.println(c + " is the greatest.");
        }
    }

    static void Minimum(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is the smallest.");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest.");
        } else if (c < a && c < b) {
            System.out.println(c + " is the smallest.");
        }
    }
}