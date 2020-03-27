package com.kk.leetcode;

public class ReverseInteger {

    public int reverse(int x) {

        String intStr = String.valueOf(Math.abs(x));
        StringBuilder builder = new StringBuilder();
        for (int i = intStr.length() - 1; i >= 0; i--) {
            builder.append(intStr.charAt(i));
        }
        try {
            int result = Integer.parseInt(builder.toString());
            return x >= 0 ? result : -result;
        }catch (Exception e){
            return 0;
        }



    }
}
