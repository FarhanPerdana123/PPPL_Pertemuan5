package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTest {

    @Test
    public void testLargest1() {
        int[] list = {7, 8, 9};
        assertEquals(9, Largest.largest(list));
    }

    @Test
    public void testLargest2() {
        int[] list = {9, 8, 7};
        assertEquals(7, Largest.largest(list));
    }

    @Test
    public void testLargest3() {
        int[] list = {7, 9, 7};
        assertEquals(7, Largest.largest(list));
    }

    @Test
    public void testLargest4() {
        int[] list = {7, 8, 9};
        assertEquals(9, Largest.largest(list));
    }
}