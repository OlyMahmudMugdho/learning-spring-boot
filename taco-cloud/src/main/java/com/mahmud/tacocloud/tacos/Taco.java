package com.mahmud.tacocloud.tacos;

import lombok.Data;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;

}
