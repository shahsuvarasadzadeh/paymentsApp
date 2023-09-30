package com.example.paymentsapp.service;
import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseModel;
import java.util.List;
public interface CourseInter {
    CourseModel createCourse(CreateCourseDTO courseDTO);
    List<CourseModel> allCourse();
    CourseModel updateCourse(Long id,CreateCourseDTO courseDTO);

    CourseModel searchByName(String name);
}