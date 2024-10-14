package com.example.jpaqueries.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaqueries.entity.Student;
import com.example.jpaqueries.service.StudentServiceInterface;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    StudentServiceInterface studentService;

    StudentController(StudentServiceInterface studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/findbycourse/{course}")
    public List<Student> findByCourse(@PathVariable String course){
        return studentService.findByCourse(course);
    }

    @GetMapping("/findbygender/{gender}")
    public List<Student> findByGender(@PathVariable String gender){
        return studentService.findByCourse(gender);
    }


}
