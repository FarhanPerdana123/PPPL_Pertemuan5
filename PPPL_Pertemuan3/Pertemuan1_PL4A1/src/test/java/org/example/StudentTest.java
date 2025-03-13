package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {
    @Test
    void testIsDoingMBKM1() {
        Student student = new Student("Alice", 6, true);
        assertTrue(student.isDoingMBKM());
    }

    @Test
    void testIsDoingMBKM2() {
        Student student = new Student("Bob", 5, true);
        assertFalse(student.isDoingMBKM());
    }

    @Test
    void testIsDoingMBKM3() {
        Student student = new Student("Charlie", 6, false);
        assertFalse(student.isDoingMBKM());
    }

    @Test
    void testIsDoingMBKM4() {
        Student student = new Student("David", 7, false);
        assertFalse(student.isDoingMBKM());
    }

    @Test
    public void testIsDoingMBKM5() {
        Student student = new Student("Eve", 7, true);
        assertTrue(student.isDoingMBKM());
    }
}
