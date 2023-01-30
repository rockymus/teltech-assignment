package com.teltech.mathapp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private Integer status;
    private String title;
    private String detail;
    private LocalDateTime timestamp;
}
