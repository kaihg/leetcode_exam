package com.kk.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PalindromeNumberTest {

    private final int inputNumber;
    private final boolean expectedResult;
    private PalindromeNumber solution;

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {121, true},
                {-121, false},
                {10, false}
        });
    }

    public PalindromeNumberTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        this.solution = new PalindromeNumber();
    }

    @Test
    public void testReverseInteger() {

        Assert.assertEquals(this.expectedResult, this.solution.isPalindrome(inputNumber));

    }
}
