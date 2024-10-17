package com.mahmud.jpa_relationship.services;

import com.mahmud.jpa_relationship.models.Department;
import com.mahmud.jpa_relationship.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
