package com.teltech.mathapp.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOperationTest {

    private final MathOperation operation = new AddOperation();

    @Test
    void positiveValues() {
        //assertEquals(Double.valueOf(7), operation.calculate(4, 3));
        //assertEquals(Double.valueOf(25), operation.calculate(13, 12));
    }

    @Test
    void negativeValues() {
        //assertEquals(Double.valueOf(-32), operation.calculate(-53, 21));
        //assertEquals(Double.valueOf(-10), operation.calculate(-7, -3));
    }

    @Test
    void zeroValues() {
        //assertEquals(Double.valueOf(3), operation.calculate(0, 3));
        //assertEquals(Double.valueOf(5), operation.calculate(5, 0));
        //assertEquals(Double.valueOf(0), operation.calculate(0, 0));
    }

    @Test
    void nullValues() {
        //assertThrows(NullPointerException.class, () ->operation.calculate(null, 23));
        //assertThrows(NullPointerException.class, () -> operation.calculate(3, null));
        //assertThrows(NullPointerException.class, () ->  operation.calculate(null, null));
    }
}