package com.example.jpaqueries.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    Integer id;
    String  name;
    String gender;
    String course;
}
