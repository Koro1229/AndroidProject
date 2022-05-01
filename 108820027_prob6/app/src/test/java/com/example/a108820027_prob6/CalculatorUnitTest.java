package com.example.a108820027_prob6;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import androidx.test.filters.SmallTest;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorUnitTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative(){
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertEquals(2.222, resultAdd, 0.01);
    }

    /*sub*/

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    @Test
    public void subWorksWithNegativeResults(){
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    /*mul*/

    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

    @Test
    public void mulTwoNumbersZero(){
        double resultAdd = mCalculator.mul(32d, 0);
        assertThat(resultAdd, is(equalTo(0.0)));
    }

    /*div*/

    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d, 2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    @Test
    public void divTwoNumbersZero(){
        double resultDiv = mCalculator.div(32d, 0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powTwoPositiveInteger(){
        double resultPow = mCalculator.pow(5, 3);
        assertEquals(125, resultPow, 0);
    }

    @Test
    public void powTwoIntegerWithNegativeFirstOperand(){
        double resultPow = mCalculator.pow(-5, 3);
        assertEquals(-125, resultPow, 0);
    }

    @Test
    public void powTwoIntegerWithNegativeSecondOperand(){
        double resultPow = mCalculator.pow(3, -3);
        assertEquals(0.037, resultPow, 0.0001);
    }

    @Test
    public void powZeroWithPositiveOperand(){
        double resultPow = mCalculator.pow(0, 3d);
        assertEquals(0, resultPow, 0);
    }

    @Test
    public void powNumberWithZero(){
        double resultPow = mCalculator.pow(0, 0);
        assertEquals(1, resultPow, 0);
    }

    @Test
    public void powZeroWithNegativeInteger(){
        double resultPow = mCalculator.pow(0, -1);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powNegativeZeroWithNegativeNumber(){
        double resultPow = mCalculator.pow(-0, -1);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }


    @Test
    public void powTestForProblemSixNumber1(){
        double resultPow = mCalculator.pow(0, 2);
        assertEquals(0, resultPow, 0);
    }

    @Test
    public void powTestForProblemSixNumber2(){
        double resultPow = mCalculator.pow(1, 3);
        assertEquals(1, resultPow, 0);
    }

    @Test
    public void powTestForProblemSixNumber3(){
        double resultPow = mCalculator.pow(-4, 0);
        assertEquals(1, resultPow, 0);
    }

    @Test
    public void powTestForProblemSixNumber4(){
        double resultPow = mCalculator.pow(-2, 1);
        assertEquals(-2, resultPow, 0);
    }

    @Test
    public void powTestForProblemSixNumber5(){
        double resultPow = mCalculator.pow(2, -2);
        assertEquals(0.25, resultPow, 0);
    }

}