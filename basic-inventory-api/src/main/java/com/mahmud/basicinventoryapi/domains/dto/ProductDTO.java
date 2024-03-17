package com.mahmud.basicinventoryapi.domains.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
    @JsonIgnore
    private Long id;
    private String name;
    private String description;
    private Double price;
}
