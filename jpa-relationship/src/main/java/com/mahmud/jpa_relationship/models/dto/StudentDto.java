package com.mahmud.jpa_relationship.models.dto;

import com.mahmud.jpa_relationship.models.Department;
import lombok.Data;

@Data
public class StudentDto {
    private String firstName;
    private String lastName;
    private Department department;
}
