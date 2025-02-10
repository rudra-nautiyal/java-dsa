package com.rudranautiyal;
public class No_1295_EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        int even = 0;
        for(int element : nums){
            while(element > 0) {
                element = element / 10;
                count++;
            }
            if(count % 2 == 0) {
                even++;
            }

            count = 0;
        }

        return even;
    }
}
