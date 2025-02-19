package com.rudranautiyal;

public class No_1886_MatrixRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(check(mat, target)) {
                return true;
            }

            mat = rotate(mat);
        }
        return false;
    }

    int[][] rotate(int[][] arr) {
        int[][] rotate = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                rotate[j][(arr.length - 1 - i)] = arr[i][j];
            }
        }

        return rotate;
    }

    boolean check(int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target[i][j] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
