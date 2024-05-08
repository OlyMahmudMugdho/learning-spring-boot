package com.mahmud.datarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface BookRepository extends JpaRepository<Book,Long> {
}
