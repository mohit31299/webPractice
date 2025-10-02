package com.practice.web.webPractice.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String gender;
    private String company;
    private String designation;
    private long phoneNo;
    private long salary;
    private long age;
    @ElementCollection
    @CollectionTable(name = "employee_hobbies", joinColumns = @JoinColumn(name = "employee_id"))
    @Column(name = "hobby")
    private List<String> hobbies;
}
