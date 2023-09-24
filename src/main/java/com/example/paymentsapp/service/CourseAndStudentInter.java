package com.example.paymentsapp.service;

import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseAndStudents;
import com.example.paymentsapp.model.CourseModel;

import java.util.List;

public interface CourseAndStudentInter {
    CourseAndStudents saveCourseAndStudent(Long studentId,Long courseId);

    void deleteById(Long id);
    List<CourseAndStudents> allCourseAndStudents();

    CourseModel updateStudentCount(Long id, Long sum);
}