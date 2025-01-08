package com.rudranautiyal;

public class No_1365_NumberSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int smaller = 0;
            for (int num : nums) {
                if (nums[i] == num) {
                    continue;
                }
                if (num < nums[i]) {
                    smaller++;
                }
            }
            smallerArray[i] = smaller;
        }
        return smallerArray;
    }
}
