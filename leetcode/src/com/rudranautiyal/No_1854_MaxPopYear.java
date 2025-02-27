package com.rudranautiyal;

public class No_1854_MaxPopYear {
    public int maximumPopulation(int[][] logs) {
        int maxPopulation = 0;
        int resultYear = 0;

        for (int year = 1950; year <= 2050; year++) {
            int count = 0;
            for (int[] log : logs) {
                if (log[0] <= year && year < log[1]) {
                    count++;
                }
            }
            if (count > maxPopulation) {
                maxPopulation = count;
                resultYear = year;
            }
        }

        return resultYear;
    }
}
