package com.teltech.mathapp.operation;

public class AddOperation implements MathOperation{
    @Override
    public Integer calculate(Integer x, Integer y) {
        try {
            return Math.addExact(x, y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("The result is out of bounds.");
        }
    }
}
