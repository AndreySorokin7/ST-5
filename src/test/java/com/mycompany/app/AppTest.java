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
    public void testSqrt5() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), DELTA);
        assertEquals(5.5, sqrt.average(5.0, 6.0), DELTA);
    }
    
    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
        assertFalse(sqrt.good(3.9, 16.0));
    }
    
    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(2.25, sqrt.improve(2.0, 5.0), DELTA);
    }
    
    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.iter(4.0, 16.0), DELTA);
        assertEquals(4.0, sqrt.iter(3.9, 16.0), DELTA * 10);
    }
    
    @Test
    public void testCalc() {
        Sqrt sqrt3 = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt3.calc(), DELTA);
    }
    
    @Test
    public void testConstructor() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(9.0, sqrt.arg, DELTA);
    }

    @Test
    public void testSqrtNegative() {

        assertThrows(IllegalArgumentException.class, () -> {
        Sqrt sqrt = new Sqrt(-1.0);});

    }

     @Test
    public void testSqrt3() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(Math.sqrt(3.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrt10() {
        Sqrt sqrt = new Sqrt(10.0);
        assertEquals(Math.sqrt(10.0), sqrt.calc(), DELTA);
    }
}
