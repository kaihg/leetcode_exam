package com.kk.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReverseIntegerTest {

    private final int inputNumber;
    private final int expectedResult;
    private ReverseInteger reverse;

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {123, 321},
                {-123, -321},
                {120, 21},
                {1534236469,0}
        });
    }

    public ReverseIntegerTest(Integer inputNumber, Integer expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        this.reverse = new ReverseInteger();
    }

    @Test
    public void testReverseInteger() {

        Assert.assertEquals(this.expectedResult, this.reverse.reverse(inputNumber));

    }
}
