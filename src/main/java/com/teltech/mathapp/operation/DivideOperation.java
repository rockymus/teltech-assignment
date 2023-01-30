package com.teltech.mathapp.operation;

public class DivideOperation implements MathOperation {
    @Override
    public Integer calculate(Integer x, Integer y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        return x / y;
    }
}
