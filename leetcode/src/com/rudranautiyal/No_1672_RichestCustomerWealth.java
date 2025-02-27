package com.rudranautiyal;
public class No_1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3, 4},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > wealth) {
                wealth = sum;
            }
        }
        return wealth;
    }
}
