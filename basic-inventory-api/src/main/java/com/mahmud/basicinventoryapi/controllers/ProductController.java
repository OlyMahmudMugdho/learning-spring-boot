package com.mahmud.basicinventoryapi.controllers;

import com.mahmud.basicinventoryapi.domains.dto.ProductDTO;
import com.mahmud.basicinventoryapi.domains.entities.ProductEntity;
import com.mahmud.basicinventoryapi.mappers.Mapper;
import com.mahmud.basicinventoryapi.mappers.impl.ProductMapper;
import com.mahmud.basicinventoryapi.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    private ProductService productService;
    private Mapper<ProductEntity,ProductDTO> productMapper;

    ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("productId") Long productId) {
        Optional<ProductEntity> foundProductEntity = productService.findById(productId);
        ProductDTO productDTO = productMapper.mapTo(foundProductEntity.get());
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

    @PostMapping(path = "/products")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        System.out.println("executed 1");
        ProductEntity productEntity = productMapper.mapFrom(productDTO);
        System.out.println(productEntity);
        ProductEntity savedProductEntity = productService.addProduct(productEntity);
        ProductDTO savedProductDTO = productMapper.mapTo(savedProductEntity);
        return new ResponseEntity<ProductDTO>(savedProductDTO, HttpStatus.CREATED);
    }
}
