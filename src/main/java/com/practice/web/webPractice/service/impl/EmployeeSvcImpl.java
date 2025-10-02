package com.practice.web.webPractice.service.impl;

import com.practice.web.webPractice.entity.Employee;
import com.practice.web.webPractice.exception.EmployeeNotFound;
import com.practice.web.webPractice.repo.EmployeeRepo;
import com.practice.web.webPractice.service.EmployeeSvc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeSvcImpl implements EmployeeSvc {

    private final EmployeeRepo empRepo;

    @Override
    public Employee addEmployee(Employee emp) {
        return empRepo.save(emp);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> emp = empRepo.findById(id);


        if(emp.isEmpty())
            throw new EmployeeNotFound("Employee with id "+id+" not found");

        return emp.get();
    }
}
