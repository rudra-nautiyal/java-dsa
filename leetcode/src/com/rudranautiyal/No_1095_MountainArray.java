package com.rudranautiyal;

public class No_1095_MountainArray {
    public int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int peak = start;

        start = 0;
        end = peak;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = peak + 1;
        end = mountainArr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
