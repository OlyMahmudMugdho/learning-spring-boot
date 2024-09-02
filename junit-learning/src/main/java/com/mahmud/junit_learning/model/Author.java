package com.mahmud.junit_learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private Long id;
    private String name;
    private List<Book> books;
}
