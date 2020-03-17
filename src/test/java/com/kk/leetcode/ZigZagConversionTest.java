package com.kk.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {


    @org.junit.Test
    public void convert() {

        ZigZagConversion zzc = new ZigZagConversion();

        String result = zzc.convert("0123456", 3);
        Assert.assertEquals("0413526", result);

        result = zzc.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", result);

        result = zzc.convert("0123456789", 4);
        Assert.assertEquals("0615724839", result);

        result = zzc.convert("PAYPALISHIRING", 5);
        Assert.assertEquals("PHASIYIRPLIGAN", result);

    }

    @Test
    public void testOne(){
        ZigZagConversion zzc = new ZigZagConversion();

        String result = zzc.convert("A", 1);
        Assert.assertEquals("A", result);
    }
}