package com.example.paymentsapp.repository;

import com.example.paymentsapp.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<CourseModel,Long> {
}
