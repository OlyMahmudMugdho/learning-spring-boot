package com.mahmud.REST.API.learning.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "author")
public class AuthorEntity {
    @Id @GeneratedValue
    @JsonIgnore
    private long id;
    private String name;
    private int age;
}
