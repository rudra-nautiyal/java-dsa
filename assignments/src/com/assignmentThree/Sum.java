package com.assignmentThree;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = Add(num1, num2);

        System.out.println(ans);
    }

    static int Add(int a, int b) {
        return a + b;
    }
}
