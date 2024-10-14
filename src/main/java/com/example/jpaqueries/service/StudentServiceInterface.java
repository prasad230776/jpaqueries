package com.example.jpaqueries.service;

import java.util.List;

import com.example.jpaqueries.entity.Student;

public interface StudentServiceInterface {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student updateStudent(Student student);
    public String deleteStudent(Integer id);
    public List<Student> findByGender(String gender);
    public List<Student> findByCourse(String course);
}
