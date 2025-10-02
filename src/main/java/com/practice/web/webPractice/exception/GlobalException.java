package com.practice.web.webPractice.exception;

import com.practice.web.webPractice.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<ApiResponse> employeeNotFound(EmployeeNotFound ex){
        System.out.println("Inside Global Exception Handler");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiResponse.builder().msg(ex.getMessage()).status(HttpStatus.NOT_FOUND).build());
    }
}
