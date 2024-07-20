package com.mahmud.mastering_spring_data_jpa.teacher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mahmud.mastering_spring_data_jpa.course.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer id;
    private String name;
    private String username;
    @OneToMany(mappedBy = "teacher")
    @JsonIgnore
    private List<Course> courses;
}
