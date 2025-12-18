package com.example.project.entity;

import java.time.LocalDate;

public class StudentEntity {
    @id
    @GeneratedValue(Strategy= GenerationType.IDENTITY)
    private int id;
     @GeneratedValue(Strategy= GenerationType.Auto)
    private String name;
    @column(name=unique)
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public StudentEntity(String name, int id, LocalDate date, float cgpa) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.cgpa = cgpa;
    }
    public StudentEntity() {
    }
   
    
}
