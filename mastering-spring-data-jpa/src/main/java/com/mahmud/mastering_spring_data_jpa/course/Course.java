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
    @Column(
            nullable = false,
            name = "courseName"
    )
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JsonIgnore
    private Teacher teacher;
}
