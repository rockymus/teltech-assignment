package com.teltech.mathapp.service;

import com.teltech.mathapp.model.MathResponse;

public interface MathService {
    MathResponse calculate(String operation, Double x, Double y);

}
