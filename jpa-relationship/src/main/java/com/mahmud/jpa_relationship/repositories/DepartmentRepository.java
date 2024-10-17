package com.mahmud.jpa_relationship.repositories;

import com.mahmud.jpa_relationship.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
