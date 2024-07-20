package com.mahmud.mastering_spring_data_jpa.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mahmud.mastering_spring_data_jpa.teacher.Teacher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;
    private String courseName;
    @ManyToOne()
    @JsonIgnore
    private Teacher teacher;
}
