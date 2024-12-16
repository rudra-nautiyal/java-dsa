package com.assignmentTwo;

public class August {
    public static void main(String[] args) {
        int days = 0;

        for (int i = 1; i < 31; i++) {
            if (i % 2 == 0){
                days++;
            }
        }

        System.out.println("In the month of August, he can be out for only " + days);
    }
}
