package com.mahmud.basicinventoryapi.services;

import com.mahmud.basicinventoryapi.domains.entities.ProductEntity;

import java.util.List;
import java.util.Optional;


public interface ProductService  {
    Optional<ProductEntity> findById(long id);
    List<ProductEntity> findAll();
    ProductEntity addProduct(ProductEntity productEntity);
}
