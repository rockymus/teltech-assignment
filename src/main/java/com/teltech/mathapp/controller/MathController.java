package com.teltech.mathapp.controller;

import com.teltech.mathapp.model.MathResponse;
import com.teltech.mathapp.service.MathService;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService, CacheManager cacheManager) {
        this.mathService = mathService;
    }

    @GetMapping("add")
    public ResponseEntity<MathResponse> add(@RequestParam Integer x, @RequestParam Integer y) {
        MathResponse mathResponse = mathService.calculate("add", x, y);
        return new ResponseEntity<>(mathResponse, HttpStatus.OK);
    }

    @GetMapping("subtract")
    public ResponseEntity<MathResponse> subtract(@RequestParam Integer x, @RequestParam Integer y) {
        return new ResponseEntity<>(mathService.calculate("subtract", x, y), HttpStatus.OK);
    }

    @GetMapping("multiply")
    public ResponseEntity<MathResponse> multiply(@RequestParam Integer x, @RequestParam Integer y) {
        return new ResponseEntity<>(mathService.calculate("multiply", x, y), HttpStatus.OK);
    }

    @GetMapping("divide")
    public ResponseEntity<MathResponse> divide(@RequestParam Integer x, @RequestParam Integer y) {
        return new ResponseEntity<>(mathService.calculate("divide", x, y), HttpStatus.OK);
    }

}
