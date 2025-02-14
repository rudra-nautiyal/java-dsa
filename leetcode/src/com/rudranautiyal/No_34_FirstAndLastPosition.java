package com.rudranautiyal;

public class No_34_FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        // Binary Search
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        res[0] = start;
        res[1] = end;
        return res;
    }

    // this function returns the value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        // Binary Search

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if(target < nums[mid]){
                end = mid - 1;
            } else {
                // potential answer
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
