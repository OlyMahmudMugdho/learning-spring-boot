package com.mahmud.spring_data_mongo_db.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDtoRequest {
    private String name;
    private Integer roll;
}
