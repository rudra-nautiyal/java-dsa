package com.rudranautiyal;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Number1295_EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
