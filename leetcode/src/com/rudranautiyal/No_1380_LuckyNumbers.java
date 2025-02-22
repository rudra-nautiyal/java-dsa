package com.rudranautiyal;

public class No_1380_LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for(int row = 0; row < matrix.length; row++) {
            int minIndex = 0;
            boolean lucky = true;
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] < matrix[row][minIndex]) {
                    minIndex = col;
                }
            }
            for(int sec = 0; sec < matrix.length; sec++) {
                if(matrix[sec][minIndex] > matrix[row][minIndex]) {
                    lucky = false;
                    break;
                }
            }

            if(lucky) {
                res.add(matrix[row][minIndex]);
            }
        }
        return res;
    }
}
