package com.teltech.mathapp.operation;

public class SubtractOperation implements MathOperation{
    @Override
    public Integer calculate(Integer x, Integer y) {
        try {
            return Math.subtractExact(x, y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("The result is out of bounds.");
        }
    }
}
