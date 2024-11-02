package com.mahmud.spring_data_mongo_db.controllers;

import com.mahmud.spring_data_mongo_db.models.Student;
import com.mahmud.spring_data_mongo_db.models.dto.StudentDtoRequest;
import com.mahmud.spring_data_mongo_db.models.dto.StudentDtoResponse;
import com.mahmud.spring_data_mongo_db.repositories.StudentRepository;
import com.mahmud.spring_data_mongo_db.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = {"","/"})
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{roll}")
    public StudentDtoResponse getStudentByRoll(@PathVariable Integer roll) {
        Student student = studentService.getStudentByRoll(roll);
        StudentDtoResponse studentDtoResponse = new StudentDtoResponse();
        studentDtoResponse.set_id(student.get_id());
        studentDtoResponse.setName(student.getName());
        studentDtoResponse.setRoll(student.getRoll());
        return studentDtoResponse;
    }

    @PostMapping()
    public Optional<StudentDtoResponse> addStudent(@RequestBody StudentDtoRequest studentDtoRequest) {
        Student student = new Student();
        student.setName(studentDtoRequest.getName());
        student.setRoll(studentDtoRequest.getRoll());
        System.out.println(student.getRoll());
        System.out.println(studentDtoRequest.getRoll());
        Optional<Student> studentOptional  = this.studentService.addStudent(student);

        if (studentOptional.isPresent()) {
            StudentDtoResponse studentDtoResponse = new StudentDtoResponse();
            studentDtoResponse.set_id(student.get_id());
            studentDtoResponse.setName(studentOptional.get().getName());
            studentDtoResponse.setRoll(studentOptional.get().getRoll());
            return Optional.of(studentDtoResponse);
        }
        return Optional.empty();
    }
}
