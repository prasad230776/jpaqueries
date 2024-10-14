package com.example.jpaqueries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaqueries.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByGender(String gender);
    public List<Student> findByCourse(String course);

}
