package com.teltech.mathapp.operation;

public class MultiplyOperation implements MathOperation{
    @Override
    public Integer calculate(Integer x, Integer y) {
        return x * y;
    }
}
