package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "students")
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String number;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name="Student_Course_Tb",
    joinColumns={
            @JoinColumn(name = "student_id",referencedColumnName = "id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "course_id",referencedColumnName = "id")
    })
    private List<CourseModel> courseModels;
    public StudentModel(String name, String surname, String email, String number){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.number=number;
    }
}