package com.rudranautiyal;

public class No_1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
