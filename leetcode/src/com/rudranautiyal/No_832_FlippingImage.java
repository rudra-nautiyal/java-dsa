package com.rudranautiyal;

// Flipping an image = invert and XOR it

public class No_832_FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[0].length; col++) {
                res[row][col] = image[row][image[0].length - col - 1] ^ 1;
            }
        }

        return res;
    }
}
