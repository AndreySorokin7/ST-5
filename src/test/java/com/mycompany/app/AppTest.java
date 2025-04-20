package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {
private static final double DELTA = 0.00000001;
    
    @Test
    public void testSqrt4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testConstructor() {
        double arg = 25.0;
        Sqrt sqrt = new Sqrt(arg);
        assertEquals(arg, sqrt.arg, DELTA);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
        assertEquals(0.0, sqrt.average(-5.0, 5.0), DELTA);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(0.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(2.0001, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(2.0, sqrt.improve(2.0, 4.0), DELTA);
        assertEquals(3.0, sqrt.improve(3.0, 9.0), DELTA);
    }

    @Test
    public void testIterImmediateReturn() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.iter(3.0, 9.0), DELTA);
    }

    @Test
    public void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcPrecision() {
        Sqrt sqrt = new Sqrt(2.0);
        double expected = Math.sqrt(2.0);
        assertEquals(expected, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSmallNumber() {
        Sqrt sqrt = new Sqrt(0.000001);
        double expected = Math.sqrt(0.000001);
        assertEquals(expected, sqrt.calc(), DELTA);
    }

    @Test
    public void testIterImprovementProcess() {
        Sqrt sqrt = new Sqrt(16.0);
        double initialGuess = 10.0;
        double improved = sqrt.improve(initialGuess, 16.0);
        assertNotEquals(initialGuess, improved, DELTA);
    }
}
