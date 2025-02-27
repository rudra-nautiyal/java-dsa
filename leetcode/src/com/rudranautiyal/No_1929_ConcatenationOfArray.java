package com.rudranautiyal;

public class No_1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}
