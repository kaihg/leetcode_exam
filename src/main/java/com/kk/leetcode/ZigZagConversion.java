package com.kk.leetcode;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }

        StringBuilder[] sbAry = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbAry[i] = new StringBuilder();
        }

        int mod = 2 * (numRows - 1);
        StringBuilder sb;
        for (int i = 0; i < s.length(); i++) {
            int row_mod = i % mod;
            int row = row_mod % numRows;

            if (row_mod >= numRows){
                sb = sbAry[mod - row_mod ];
            }else{
                sb = sbAry[row];
            }

//            if (row_mod != 0 && row == 0){
//                sb = sbAry[numRows-2];
//            } else{
//                sb = sbAry[row];
//            }


            sb.append(s.charAt(i));
        }

        StringBuilder ttlSb = new StringBuilder();
        for (StringBuilder row_sb : sbAry) {
            ttlSb.append(row_sb);
        }

        return ttlSb.toString();
    }

}
