package com.mahmud.junit_learning.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String title;
    private Author author;
}
