package com.rudranautiyal;

public class No_1252_OddValuesMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        int count = 0;

        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            for (int j = 0; j < n; j++) {
                array[row][j]++;
            }

            for (int k = 0; k < m; k++) {
                array[k][col]++;
            }
        }

        for(int l = 0; l < array.length; l++){
            for(int o = 0; o < array[l].length; o++){
                if(array[l][o] % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    }
}
