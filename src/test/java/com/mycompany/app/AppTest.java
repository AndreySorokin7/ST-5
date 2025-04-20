package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {
    private static final double DELTA = 0.00000001;
    
    @Test
    public void testSquareRootOfPerfectSquare() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSquareRootOfAnotherPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testAverageWithPositiveNegativeAndDecimalValues() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), DELTA);
        assertEquals(5.5, sqrt.average(5.0, 6.0), DELTA);
    }
    
    @Test
    public void testGuessWithinToleranceRange() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
        assertFalse(sqrt.good(3.9, 16.0));
    }
    
    @Test
    public void testImproveGuessAccuracy() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(2.25, sqrt.improve(2.0, 5.0), DELTA);
    }
    
    @Test
    public void testIterationConvergesToExactRoot() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.iter(4.0, 16.0), DELTA);
        assertEquals(4.0, sqrt.iter(3.9, 16.0), DELTA * 10);
    }
    
    @Test
    public void testCalculateIrrationalSquareRoot() {
        Sqrt sqrt3 = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt3.calc(), DELTA);
    }
    
    @Test
    public void testConstructorInitializesArgument() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(9.0, sqrt.arg, DELTA);
    }

    @Test
    public void testNegativeArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sqrt(-1.0);
        });
    }

    @Test
    public void testSquareRootOfNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(Math.sqrt(3.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSquareRootOfDoubleDigitNumber() {
        Sqrt sqrt = new Sqrt(10.0);
        assertEquals(Math.sqrt(10.0), sqrt.calc(), DELTA);
    }
}
