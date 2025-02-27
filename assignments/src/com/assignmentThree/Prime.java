package com.assignmentThree;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(Determine(num));
    }

    static String Determine(int num) {
        if (num <= 1) {
            return "Not PRIME";
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "Not PRIME";
            }
        }
        return "PRIME";
    }
}
