package com.teltech.mathapp.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    private final MathOperation operation = new SubtractOperation();

    @Test
    void positiveValues() {
        assertEquals(Double.valueOf(1), operation.calculate(4D, 3D));
        assertEquals(Double.valueOf(1), operation.calculate(13D, 12D));
    }

    @Test
    void negativeValues() {
        assertEquals(Double.valueOf(-74), operation.calculate(-53D, 21D));
        assertEquals(Double.valueOf(-4), operation.calculate(-7D, -3D));
    }

    @Test
    void zeroValues() {
        assertEquals(Double.valueOf(-3), operation.calculate(0D, 3D));
        assertEquals(Double.valueOf(5), operation.calculate(5D, 0D));
        assertEquals(Double.valueOf(0), operation.calculate(0D, 0D));
    }

    @Test
    void minMaxValues() {
        assertEquals(0D,operation.calculate(Double.MAX_VALUE, Double.MAX_VALUE));
        assertEquals(0D,operation.calculate(-Double.MAX_VALUE, -Double.MAX_VALUE));
        assertEquals(Double.MAX_VALUE,operation.calculate(0D, -Double.MAX_VALUE));

    }

}