package com.teltech.mathapp.operation;

public class DivideOperation implements MathOperation {
    @Override
    public Double calculate(Double x, Double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        return x / y;
    }
}
