package com.teltech.mathapp.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOperationTest {

    private final MathOperation operation = new AddOperation();

    @Test
    void positiveValues() {
        assertEquals(Double.valueOf(7), operation.calculate(4D, 3D));
        assertEquals(Double.valueOf(25), operation.calculate(13D, 12D));
    }

    @Test
    void negativeValues() {
        assertEquals(Double.valueOf(-32), operation.calculate(-53D, 21D));
        assertEquals(Double.valueOf(-10), operation.calculate(-7D, -3D));
    }

    @Test
    void zeroValues() {
        assertEquals(Double.valueOf(3), operation.calculate(0D, 3D));
        assertEquals(Double.valueOf(5), operation.calculate(5D, 0D));
        assertEquals(Double.valueOf(0), operation.calculate(0D, 0D));
    }

    @Test
    void minMaxValues() {
        assertTrue(operation.calculate(Double.MAX_VALUE, Double.MAX_VALUE).isInfinite());
        assertTrue(operation.calculate(-Double.MAX_VALUE, -Double.MAX_VALUE).isInfinite());
    }
}