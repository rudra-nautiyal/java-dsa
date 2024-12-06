package com.assignmentTwo;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the parallelogram: ");
        double height = in.nextDouble();
        System.out.print("Enter the base of the parallelogram: ");
        double base = in.nextDouble();

        double area = height * base;

        System.out.print("Area of parallelogram: " + area);

        in.close();
    }
}
