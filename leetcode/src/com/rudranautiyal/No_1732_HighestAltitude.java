package com.rudranautiyal;

public class No_1732_HighestAltitude {
    public int largestAltitude(int[] gain) {
        int highest = 0;

        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i] + gain[i - 1];
        }

        for(int i : gain){
            if(i > highest){
                highest = i;
            }
        }

        return highest;
    }
}
