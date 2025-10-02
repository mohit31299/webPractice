package com.practice.web.webPractice.controller;

import com.practice.web.webPractice.entity.Employee;
import com.practice.web.webPractice.service.EmployeeSvc;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/employee")
@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeSvc empSvc;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
        return ResponseEntity.status(HttpStatus.CREATED).body(empSvc.addEmployee(emp));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.status(HttpStatus.OK).body(empSvc.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(empSvc.getEmployeeById(id));
    }

}
