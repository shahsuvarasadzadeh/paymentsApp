package com.example.paymentsapp.service;

import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.model.StudentModel;

public interface CourseInter {

    CourseModel createCourse(CreateCourseDTO courseDTO);
}
