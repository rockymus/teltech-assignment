package com.teltech.mathapp.operation;

public class MultiplyOperation implements MathOperation {
    @Override
    public Double calculate(Double x, Double y) {
        return x * y;
    }
}
