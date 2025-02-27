package com.assignmentTwo;

import java.util.Scanner;

public class InfiniteCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int largest = n;

         if (n == 0) {
             System.out.println("Program exited!");
             System.exit(0);
         }

         while(n != 0) {
             if (n > largest) {
                 largest = n;
             }
             n = in.nextInt();
         }

         System.out.println("The largest number among all the entered digits is: " + largest);
    }
}
