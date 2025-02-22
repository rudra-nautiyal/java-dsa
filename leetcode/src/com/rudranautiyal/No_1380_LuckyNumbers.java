package com.rudranautiyal;

import java.util.ArrayList;
import java.util.List;

public class No_1380_LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for (int[] ints : matrix) {
            int minIndex = 0;
            boolean lucky = true;
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] < ints[minIndex]) {
                    minIndex = col;
                }
            }
            for (int[] value : matrix) {
                if (value[minIndex] > ints[minIndex]) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                res.add(ints[minIndex]);
            }
        }
        return res;
    }
}
