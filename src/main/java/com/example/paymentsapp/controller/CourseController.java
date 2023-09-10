package com.example.paymentsapp.controller;

import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.dto.CreateDto;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.model.StudentModel;
import com.example.paymentsapp.service.CourseInter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api3")
public class CourseController {
    private final CourseInter courseInter;

    public CourseController(CourseInter courseInter) {
        this.courseInter = courseInter;
    }

    @PostMapping(path = "/create")
    public CourseModel creatUser(@RequestBody CreateCourseDTO courseDTO){
        return courseInter.createCourse(courseDTO);
    }
}
