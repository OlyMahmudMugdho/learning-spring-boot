package com.mahmud.jpahibernate.repository;

import com.mahmud.jpahibernate.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
