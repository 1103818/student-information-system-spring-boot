package com.example.studentinfosys.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {
    private int id;

    @NotBlank(message = "Your name is required")
    @Size(min = 2, max = 30, message = "Your name must be between 2 and 30 characters")
    private String name;
    
    @Min(value = 18)
    private int age;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}