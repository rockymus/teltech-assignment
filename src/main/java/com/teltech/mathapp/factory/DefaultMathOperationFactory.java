package com.teltech.mathapp.factory;

import com.teltech.mathapp.operation.*;
import org.springframework.stereotype.Component;

@Component
public class DefaultMathOperationFactory implements MathOperationFactory{
    @Override
    public MathOperation create(String operation) {
        return switch (operation) {
            case "add" -> new AddOperation();
            case "subtract" -> new SubtractOperation();
            case "multiply" -> new MultiplyOperation();
            case "divide" -> new DivideOperation();
            default -> null;
        };
    }
}
