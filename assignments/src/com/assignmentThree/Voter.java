package com.assignmentThree;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        Eligible(age);

        in.close();
    }

    static void Eligible(int age) {
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
