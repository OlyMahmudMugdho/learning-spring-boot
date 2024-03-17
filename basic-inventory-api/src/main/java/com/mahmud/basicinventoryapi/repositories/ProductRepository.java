package com.mahmud.basicinventoryapi.repositories;

import com.mahmud.basicinventoryapi.domains.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
