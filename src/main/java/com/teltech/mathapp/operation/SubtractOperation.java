package com.teltech.mathapp.operation;

public class SubtractOperation implements MathOperation{
    @Override
    public Double calculate(Double x, Double y) {
        try {
            return x - y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("The result is out of bounds.");
        }
    }
}
