package com.kk.leetcode;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        StringBuilder[] sbAry = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbAry[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            int row = i % (numRows+1);
            StringBuilder sb = sbAry[row];

            sb.append(s.charAt(i));
        }

        StringBuilder ttlSb = new StringBuilder();
        for (StringBuilder sb : sbAry) {
            ttlSb.append(sb);
        }

        return ttlSb.toString();
    }

}
