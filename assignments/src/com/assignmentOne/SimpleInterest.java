package com.assignmentOne;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter time: ");
        double time = in.nextDouble();
        System.out.print("Enter rate: ");
        double rate = in.nextDouble();

        double simpleinterest = (principal*rate*time)/100;

        System.out.print("The simple interest is : " + simpleinterest);

        in.close();
    }
}
