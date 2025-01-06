package com.rudranautiyal;
// https://leetcode.com/problems/shuffle-the-array/

public class No_1480_RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i =0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}