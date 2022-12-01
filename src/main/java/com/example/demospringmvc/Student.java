package com.example.demospringmvc;

import jakarta.persistence.*;
import lombok.Data;

//student id, student name
@Data
@Entity
@Table(name = "student")
public class Student {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // 0 1 2 3
    private Long id;

    @Column(name = "name")
    private String name;
    public Student(){}
    public Student(String name){
        this.name=name;
    }
}
