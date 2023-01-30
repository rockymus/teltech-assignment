package com.teltech.mathapp.factory;

import com.teltech.mathapp.operation.MathOperation;

public interface MathOperationFactory {
    MathOperation create(String operation);
}
