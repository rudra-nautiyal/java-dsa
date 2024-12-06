package com.assignmentTwo;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of side: ");
        double side = in.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.print("Area of triangle: " + area);

        in.close();
    }
}
