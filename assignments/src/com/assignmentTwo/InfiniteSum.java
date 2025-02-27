package com.assignmentTwo;

import java.util.Scanner;

public class InfiniteSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {
            sum = sum + n;
            n = in.nextInt();
        }

        System.out.println("The total sum of the numbers is: " + sum);
    }
}
