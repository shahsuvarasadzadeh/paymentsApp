package com.example.paymentsapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class CreateCourseDTO {
    private Long id;
    private String name;
    private Long studentsCount;
}
