package com.example.paymentsapp.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "Course_TB")
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private Long studentCount;
    public CourseModel(String name,Long studentCount) {
        this.name = name;
        this.studentCount=studentCount;
    }
}