package com.assignmentThree;

import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(int num) {
        int temp = 0;
        int original = num;

        while (num > 0) {
            temp = (temp * 10) + (num % 10);
            num = num / 10;
        }

        return temp == original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(palindrome(num));
    }
}
