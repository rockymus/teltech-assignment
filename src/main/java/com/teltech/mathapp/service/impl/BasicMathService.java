package com.teltech.mathapp.service.impl;

import com.teltech.mathapp.factory.MathOperationFactory;
import com.teltech.mathapp.model.MathResponse;
import com.teltech.mathapp.operation.MathOperation;
import com.teltech.mathapp.service.MathService;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class BasicMathService implements MathService {

    private final MathOperationFactory factory;
    private final Cache cache;

    public BasicMathService(MathOperationFactory factory, CacheManager cacheManager) {
        this.factory = factory;
        this.cache = cacheManager.getCache("results");
    }

    @Override
    public MathResponse calculate(String operation, Double x, Double y) {
        String id = x + operation + y;
        var obj = cache.get(id);
        if (obj != null) {
            MathResponse response = (MathResponse) obj.get();
            if (response != null) {
                response.setCached(true);
            }
            return response;
        } else {
            MathOperation mathOperation = factory.create(operation);
            MathResponse mathResponse = new MathResponse(operation, x, y, mathOperation.calculate(x, y));
            cache.put(id,mathResponse);
            return mathResponse;
        }

    }

}
