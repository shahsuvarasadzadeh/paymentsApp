package com.example.paymentsapp.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "cr_st_t")
public class CourseAndStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long studentId;
    private Long courseId;
    private String courseName;
    public CourseAndStudents(Long studentId,Long courseId,String courseName){
        this.studentId=studentId;
        this.courseId=courseId;
        this.courseName=courseName;
    }
}