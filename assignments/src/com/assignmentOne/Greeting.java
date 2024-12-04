package com.assignmentOne;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("hello, " + name);

        in.close();
    }
}
