package com.rudra;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        max(arr, 4, 0);
    }
    static void max(int[] arr, int ind1, int ind2) {
        if (arr[ind1] > arr[ind2]) {
            System.out.println(arr[ind1] + " is greater.");
        } else {
            System.out.println(arr[ind2] + " is greater.");
        }
    }
}
