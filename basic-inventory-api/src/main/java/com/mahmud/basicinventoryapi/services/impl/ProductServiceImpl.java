package com.mahmud.basicinventoryapi.services.impl;

import com.mahmud.basicinventoryapi.domains.entities.ProductEntity;
import com.mahmud.basicinventoryapi.repositories.ProductRepository;
import com.mahmud.basicinventoryapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Optional<ProductEntity> findById(long id) {
        Optional<ProductEntity> foundProductEntity = productRepository.findById(id);
        return foundProductEntity;
    }

    @Override
    public List<ProductEntity> findAll() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return productEntities;
    }

    @Override
    public ProductEntity addProduct(ProductEntity productEntity) {
        System.out.println(productEntity);
        return productRepository.save(productEntity);
    }
}
