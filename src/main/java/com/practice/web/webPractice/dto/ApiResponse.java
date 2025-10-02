package com.practice.web.webPractice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Builder
@Data
public class ApiResponse {
    private String msg;
    private HttpStatus status;
}
