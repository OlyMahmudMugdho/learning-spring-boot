package com.mahmud.jpa_relationship.repositories;

import com.mahmud.jpa_relationship.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
