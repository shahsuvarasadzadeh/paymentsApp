package com.example.paymentsapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateCourseDTO {
    private Long id;
    private String name;

    public CreateCourseDTO(String name) {
        this.name = name;
    }
}
