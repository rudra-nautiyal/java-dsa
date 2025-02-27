package com.assignmentOne;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palindrome = in.nextLine().trim().toLowerCase();
        String reverse = "";
        char letter;

        for (int i = 0; i < palindrome.length(); i++){
            letter = palindrome.charAt(i);

            reverse = letter + reverse;
        }

        System.out.println(reverse.equals(palindrome));

        in.close();
    }
}
