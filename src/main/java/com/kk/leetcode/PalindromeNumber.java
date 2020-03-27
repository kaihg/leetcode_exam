package com.kk.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        } else {
            String strX = String.valueOf(x);
            int len = strX.length();

            for (int i = 0; i < len / 2d; i++) {
                if (strX.charAt(i) != strX.charAt(len - i - 1)){
                    return false;
                }
            }

            return true;
        }

    }
}
