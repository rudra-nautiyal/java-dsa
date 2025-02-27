package com.assignmentTwo;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the breath of the rectangle: ");
        double breath = in.nextDouble();

        double area = length * breath;

        System.out.print("Area of rectangle: " + area);

        in.close();
    }
}
