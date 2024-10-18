package com.mahmud.jpa_relationship.models.mappers;

import com.mahmud.jpa_relationship.models.Student;
import com.mahmud.jpa_relationship.models.dto.StudentDto;

public class StudentMapper {
    public StudentDto maptoStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setDepartment(student.getDepartment());
        return studentDto;
    }

    public Student maptoStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentId(null);
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setDepartment(studentDto.getDepartment());
        return student;
    }
}
