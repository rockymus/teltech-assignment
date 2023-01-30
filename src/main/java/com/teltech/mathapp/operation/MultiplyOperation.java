package com.teltech.mathapp.operation;

public class MultiplyOperation implements MathOperation{
    @Override
    public Integer calculate(Integer x, Integer y) {
        try {
            return Math.multiplyExact(x, y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("The result is out of bounds.");
        }
    }
}
