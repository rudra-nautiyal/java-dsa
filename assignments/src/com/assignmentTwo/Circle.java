package com.assignmentTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.print("Area of circle: " + area);

        in.close();
    }
}
