package com.kk.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

//        for (int i = 0; i < height.length; i++) {
//            indexMap.put(height[i], i);
//        }
        int max = 0;

        for (int i = 0; i < height.length - 1; i++) {


            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, putWater(height, i, j));


            }
        }
        return max;
    }

    private int putWater(int[] height, int left, int right) {
        int lH = height[left];
        int rH = height[right];
        return (right - left) * Math.min(lH, rH);
    }
}
