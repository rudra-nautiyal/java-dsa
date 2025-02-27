package com.rudra;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String stream = in.next();

        switch (empID) {
            case 1 -> System.out.println("Rudra Nautiyal");
            case 2 -> System.out.println("Rudy");
            case 3 -> {
                System.out.println("Unknown Employee");
                switch (stream) {
                    case "IT" -> System.out.println("Engineering");
                    case "HR" -> System.out.println("Commerce");
                    case "Manager" -> System.out.println("MBA");
                    default -> System.out.println("Enter the correct department");
                }
            }
            default -> System.out.println("Enter the correct EMPid");
        }
    }
}
