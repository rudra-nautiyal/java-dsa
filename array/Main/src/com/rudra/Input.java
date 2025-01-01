package com.rudra;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int j : arr) { // for every element of the array, print the element
//            System.out.print(j + " "); // here 'j' represents the element of the array
//        }

        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = in.next();
        }

        System.out.print(Arrays.toString(str));
    }
}
