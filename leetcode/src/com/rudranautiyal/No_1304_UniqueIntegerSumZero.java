package com.rudranautiyal;

public class No_1304_UniqueIntegerSumZero {
    public int[] sumZero(int n) {
        int[] res = new int[n];

        if(n % 2 == 0) {
            int v = - (n/2);
            for(int i = 0; i < n; i++) {
                if(v == 0) {
                    v++;
                }
                res[i] = v;
                v++;
            }
        }

        if(n % 2 != 0) {
            int v = -((n-1)/2);
            for(int i = 0; i < n; i++) {
                if(i == n/2) {
                    res[i] = 0;
                    v++;
                    continue;
                }
                res[i] = v;
                v++;
            }
        }

        return res;
    }
}
