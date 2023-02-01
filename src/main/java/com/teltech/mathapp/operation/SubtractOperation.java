package com.teltech.mathapp.operation;

public class SubtractOperation implements MathOperation {
    @Override
    public Double calculate(Double x, Double y) {
        return x - y;
    }
}
