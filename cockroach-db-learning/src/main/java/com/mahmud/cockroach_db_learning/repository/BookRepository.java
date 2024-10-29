package com.mahmud.cockroach_db_learning.repository;

import com.mahmud.cockroach_db_learning.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
