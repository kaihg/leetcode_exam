package com.kk.leetcode;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @org.junit.Test
    public void convert() {

        ZigZagConversion zzc = new ZigZagConversion();
        String result = zzc.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", result);
    }
}