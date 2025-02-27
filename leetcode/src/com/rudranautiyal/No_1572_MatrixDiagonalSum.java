package com.rudranautiyal;

public class No_1572_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int overlap = (mat.length - 1) / 2;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i] + mat[i][(mat.length - 1) - i];
        }

        if (mat.length % 2 != 0) {
            sum = sum - mat[overlap][overlap];
        }

        return sum;
    }
}
