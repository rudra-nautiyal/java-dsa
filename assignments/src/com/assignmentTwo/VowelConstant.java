package com.assignmentTwo;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        char letter = word.toLowerCase().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a constant");
            }
        } else {
            System.out.println("Please give a valid alphabet");
        }
    }
}
