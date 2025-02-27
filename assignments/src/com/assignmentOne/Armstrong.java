package com.assignmentOne;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int compare = num;
        int sum = 0;

        while (num > 0) {
            int temp = num % 10;
            sum = temp*temp*temp + sum;

            num = num / 10;
        }

        if (compare == sum) {
            System.out.println("It is a Armstrong number.");
        } else {
            System.out.println("It is not a Armstrong number.");
        }

        in.close();
    }
}
