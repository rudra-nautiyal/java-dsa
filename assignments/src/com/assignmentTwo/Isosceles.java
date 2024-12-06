package com.assignmentTwo;

import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = in.nextDouble();

        double area = 0.5 * height * base;

        System.out.print("Area of triangle: " + area);

        in.close();
    }
}
