package com.kk.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ContainerWithMostWaterTest {

    private final int[] inputNumber;
    private final int expectedResult;
    private ContainerWithMostWater solution;

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49}
        });
    }

    public ContainerWithMostWaterTest(int[] inputNumber, int expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        this.solution = new ContainerWithMostWater();
    }

    @Test
    public void testSolution() {

        Assert.assertEquals(this.expectedResult, this.solution.maxArea(inputNumber));

    }
}
