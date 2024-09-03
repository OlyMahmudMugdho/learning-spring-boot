package com.mahmud.junit_learning.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private Long id;
    private String name;
    private List<Book> books;
}
