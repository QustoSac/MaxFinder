package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MaxFinderTest {

    @Test
    public void testFindMax_FirstNumberIsMax() {
        assertEquals(5, MaxFinder.findMax(5, 3, 4));
    }

    @Test
    public void testFindMax_SecondNumberIsMax() {
        assertEquals(6, MaxFinder.findMax(3, 6, 4));
    }

    @Test
    public void testFindMax_ThirdNumberIsMax() {
        assertEquals(7, MaxFinder.findMax(3, 4, 7));
    }

    @Test
    public void testFindMax_AllNumbersAreEqual() {
        assertEquals(8, MaxFinder.findMax(8, 8, 8));
    }

    @Test
    public void testFindMax_NegativeNumbers() {
        assertEquals(-1, MaxFinder.findMax(-1, -2, -3));
    }
}
