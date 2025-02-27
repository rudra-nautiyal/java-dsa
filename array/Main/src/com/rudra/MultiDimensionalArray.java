package com.rudra;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      int[][] arr = new int[3][];  Hard way!
        int[][] arr = {
                {1, 2, 3}, // 0th Index
                {4, 5}, // 1st Index
                {6, 7, 8, 9} // 2nd Index, arr[2]
        };

        int[][] newArr = new int[3][3];

        for (int row = 0; row < newArr.length; row++) {
            // for each col in every row, we need to take an input
            for (int col = 0; col < newArr[row].length; col++) {
                newArr[row][col] = in.nextInt();
            }
        }

//        for (int row = 0; row < newArr.length; row++) {
//            System.out.println(Arrays.toString(newArr[row]));
//        }

        for (int[] a : newArr) { // It means that inside newArr, the elements, say a, itself are a set of arrays, hence, int[].
            System.out.println(Arrays.toString(a));
        }
    }
}
