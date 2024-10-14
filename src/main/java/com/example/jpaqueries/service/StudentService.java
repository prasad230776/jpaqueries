package com.example.jpaqueries.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jpaqueries.entity.Student;
import com.example.jpaqueries.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface{
    StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "deleted successfully";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findByCourse(String course) {
        return studentRepository.findByCourse(course);
    }

    @Override
    public List<Student> findByGender(String gender) {
       return studentRepository.findByGender(gender);
    }
    
}
