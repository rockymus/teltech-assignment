package com.teltech.mathapp.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOperationTest {

    private final MathOperation operation = new AddOperation();

    @Test
    void positiveValues() {
        assertEquals(Integer.valueOf(7), operation.calculate(4, 3));
        assertEquals(Integer.valueOf(25), operation.calculate(13, 12));
    }

    @Test
    void negativeValues() {
        assertEquals(Integer.valueOf(-32), operation.calculate(-53, 21));
        assertEquals(Integer.valueOf(-10), operation.calculate(-7, -3));
    }

    @Test
    void zeroValues() {
        assertEquals(Integer.valueOf(3), operation.calculate(0, 3));
        assertEquals(Integer.valueOf(5), operation.calculate(5, 0));
        assertEquals(Integer.valueOf(0), operation.calculate(0, 0));
    }

    @Test
    void nullValues() {
        assertThrows(NullPointerException.class, () ->operation.calculate(null, 23));
        assertThrows(NullPointerException.class, () -> operation.calculate(3, null));
        assertThrows(NullPointerException.class, () ->  operation.calculate(null, null));
    }
}