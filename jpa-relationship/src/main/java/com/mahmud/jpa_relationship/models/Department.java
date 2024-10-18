package com.mahmud.jpa_relationship.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Integer departmentId;
    private String departmentName;
}
