package com.assignmentThree;

import java.util.Scanner;

public class SumOfNaturalNumber {
    static int naturalSum(int n) {
        return (n * (n + 1))/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int finalNumber = in.nextInt();

        System.out.println(naturalSum(finalNumber));
    }
}
