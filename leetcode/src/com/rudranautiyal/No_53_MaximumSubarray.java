package com.rudranautiyal;

public class No_53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int arrSum = 0;

        for (int num : nums) {
            arrSum = Math.max(arrSum + num, num);
            sum = Math.max(sum, arrSum);
        }

        return sum;
    }
}
