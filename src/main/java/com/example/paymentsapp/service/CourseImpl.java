package com.example.paymentsapp.service;

import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.model.StudentModel;
import com.example.paymentsapp.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseImpl implements CourseInter {
    private final CourseRepository courseRepository;

    public CourseImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseModel createCourse(CreateCourseDTO courseDTO) {
        return courseRepository.save(new CourseModel(courseDTO.getName()));
    }
}
