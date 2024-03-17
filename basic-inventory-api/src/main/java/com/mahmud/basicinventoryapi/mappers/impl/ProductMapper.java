package com.mahmud.basicinventoryapi.mappers.impl;

import com.mahmud.basicinventoryapi.domains.dto.ProductDTO;
import com.mahmud.basicinventoryapi.domains.entities.ProductEntity;
import com.mahmud.basicinventoryapi.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<ProductEntity, ProductDTO> {

    private ModelMapper modelMapper;

    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public ProductDTO mapTo(ProductEntity productEntity) {
        return modelMapper.map(productEntity, ProductDTO.class);
    }

    @Override
    public ProductEntity mapFrom(ProductDTO productDTO) {
        return modelMapper.map(productDTO, ProductEntity.class);
    }
}
