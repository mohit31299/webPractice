package com.practice.web.webPractice.service;

import com.practice.web.webPractice.entity.Employee;

import java.util.List;

public interface EmployeeSvc {
    Employee addEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);
}
