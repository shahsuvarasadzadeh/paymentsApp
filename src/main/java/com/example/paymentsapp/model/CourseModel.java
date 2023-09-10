package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "courseModels",fetch = FetchType.LAZY)
    private List<StudentModel> studentModels;
    public CourseModel(String name) {
        this.name = name;
    }
}