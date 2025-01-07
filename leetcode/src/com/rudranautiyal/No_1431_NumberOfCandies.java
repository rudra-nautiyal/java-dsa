package com.rudranautiyal;

import java.util.ArrayList;
import java.util.List;

public class No_1431_NumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int candy : candies) {
            int tempCandies = candy + extraCandies;

            if (tempCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
