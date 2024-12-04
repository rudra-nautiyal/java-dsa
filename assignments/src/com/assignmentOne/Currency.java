package com.assignmentOne;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("INR: ₹");
        double inr = in.nextDouble();

        double dollar = inr/81.85;
        System.out.print("USD: $" + dollar);

        in.close();
    }
}
