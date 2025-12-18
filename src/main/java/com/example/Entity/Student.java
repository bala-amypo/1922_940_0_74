package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class Student {
    
    @Id //Unique identity and makes the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name filed cannot be empty")
    @Size(min = 3 , max = 20 , message = "The username must be between 3 and 20 characters")
    private String name;
    @NotBlank(message = "Invaild email id")
    @Column(unique = true)
    private String email;
    
    //@Notnull
    //@Size(min,max)
    //@Min
    //@Max
    //@Pattern(reg)
    //@Postive
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    
    }
    public Student(Long id, String name, String email, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public Student() {
    }

    
}

