package com.assignmentThree;

import java.util.Scanner;

public class PythagoreanTriplet {
    static boolean pythagoras(int a, int b, int c) {
        if (a * a == b * b + c * c) {
            return true;
        } else if (b * b == a * a + c * c) {
            return true;
        } else return c * c == a * a + b * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height = in.nextInt();
        int base = in.nextInt();
        int hypotenuse = in.nextInt();

        System.out.println(pythagoras(height, base, hypotenuse));
    }
}
