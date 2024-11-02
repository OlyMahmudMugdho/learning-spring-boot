package com.mahmud.spring_data_mongo_db.services;

import com.mahmud.spring_data_mongo_db.models.Student;
import com.mahmud.spring_data_mongo_db.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentByRoll(Integer roll) {
        return studentRepository.findFirstByRoll(roll);
    }

    public Optional<Student> addStudent(Student student) {
        Student fetchedStudent =  studentRepository.findFirstByRoll(student.getRoll());
        if (fetchedStudent == null) {
            return Optional.of(studentRepository.save(student));
        }
        return Optional.empty();
    }
}
