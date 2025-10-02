package com.practice.web.webPractice.entity;


import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
    private String name;
    private String email;
    private String address;
    private String gender;
    private String company;
    private String designation;
    private long phoneNo;
    private long salary;
    private long age;
    private List<String> hobbies;
}
