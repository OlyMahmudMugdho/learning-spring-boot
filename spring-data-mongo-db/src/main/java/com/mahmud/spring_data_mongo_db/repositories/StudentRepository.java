package com.mahmud.spring_data_mongo_db.repositories;

import com.mahmud.spring_data_mongo_db.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
