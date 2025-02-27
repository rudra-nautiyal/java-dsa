package com.rudranautiyal;
import java.util.Arrays;

public class No_1920_ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(arr))); // remember Arrays.toString
    }

    static int[] buildArray(int[] nums) {
        int[] newarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newarr[i] = nums[nums[i]];
        }

        return newarr;
    }
}
