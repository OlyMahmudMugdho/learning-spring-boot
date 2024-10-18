package com.mahmud.jpa_relationship.controllers;

import com.mahmud.jpa_relationship.models.Student;
import com.mahmud.jpa_relationship.models.dto.StudentDto;
import com.mahmud.jpa_relationship.models.mappers.StudentMapper;
import com.mahmud.jpa_relationship.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api/student/", "/api/student"})
public class StudentController {

    private final StudentService studentService;
    private final StudentMapper studentMapper;

    public StudentController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @PostMapping
    public Student createStudent(@RequestBody StudentDto studentDto) {
        Student student = studentMapper.maptoStudent(studentDto);
        return studentService.createStudent(student);
    }
}
