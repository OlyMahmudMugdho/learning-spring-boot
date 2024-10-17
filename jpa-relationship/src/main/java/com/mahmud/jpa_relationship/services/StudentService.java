package com.mahmud.jpa_relationship.services;

import com.mahmud.jpa_relationship.models.Student;
import com.mahmud.jpa_relationship.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
