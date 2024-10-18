package com.mahmud.jpa_relationship.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "student_id")
    private Integer studentId;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(
            name = "student_department",
            referencedColumnName = "department_id"
    )
    private Department department;
}
