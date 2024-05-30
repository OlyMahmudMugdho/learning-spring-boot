package com.mahmud.reactiveapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private String id;
    private String title;
    private String description;
}
