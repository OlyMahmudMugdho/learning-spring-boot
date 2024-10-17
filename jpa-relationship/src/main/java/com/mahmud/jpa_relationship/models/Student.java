package com.mahmud.jpa_relationship.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
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
