package com.rudranautiyal;

import java.util.ArrayList;

public class No_1389_TargetArrayOfGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Object> targetList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            targetList.add(index[i], nums[i]);
        }

        int[] target = new int[targetList.size()];
        for(int i = 0; i < targetList.size(); i++){
            target[i] = (int) targetList.get(i);
        }

        return target;
    }
}
