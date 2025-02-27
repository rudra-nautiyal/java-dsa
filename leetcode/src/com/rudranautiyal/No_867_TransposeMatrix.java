package com.rudranautiyal;

public class No_867_TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                transpose[col][row] = matrix[row][col];
            }
        }
        return transpose;
    }
}
