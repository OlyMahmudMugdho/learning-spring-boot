package com.mahmud.spring_data_mongo_db.models.dto;

import lombok.Data;

@Data
public class StudentDtoResponse {
    private String _id;
    private String name;
    private Integer roll;
}
