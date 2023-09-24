package com.example.paymentsapp.repository;

import com.example.paymentsapp.model.CourseAndStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CourseAndStudentRepository extends JpaRepository<CourseAndStudents,Long> {
    List<CourseAndStudents> findAllByCourseName(String name);
}