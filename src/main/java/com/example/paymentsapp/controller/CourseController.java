package com.example.paymentsapp.controller;

import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseAndStudents;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.service.CourseAndStudentInter;
import com.example.paymentsapp.service.CourseInter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api3")
public class CourseController {
    private final CourseInter courseInter;
    private final CourseAndStudentInter courseAndStudentInter;
    public CourseController(CourseInter courseInter, CourseAndStudentInter courseAndStudentInter) {
        this.courseInter = courseInter;
        this.courseAndStudentInter = courseAndStudentInter;
    }
    @PostMapping(path = "/create")
    public CourseModel creatUser(@RequestBody CreateCourseDTO courseDTO){
        return courseInter.createCourse(courseDTO);
    }
    @PostMapping(path = "/create/{studentId}/{courseId}")
    public CourseAndStudents
    creatUser(@PathVariable Long studentId, @PathVariable Long courseId){
        return courseAndStudentInter.saveCourseAndStudent(studentId,courseId);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteById(@PathVariable Long id){
        courseAndStudentInter.deleteById(id);
    }
    @GetMapping(path = "/allCourse")
    public List<CourseModel> allCourse(){
        return courseInter.allCourse();
    }
    @GetMapping(path = "/allCourseAdStudents")
    public List<CourseAndStudents> allCourseAndStudents(){
        return courseAndStudentInter.allCourseAndStudents();
    }
    @PutMapping(path = "/update")
    public CourseModel updateCourse(Long id,CreateCourseDTO courseDTO){
        return courseInter.updateCourse(id,courseDTO);
    }
    @PutMapping(path = "/updateStudentCountInCourse")
    public CourseModel updateStudentCountInCourse(Long id,Long sum){
        return courseAndStudentInter.updateStudentCount(id,sum);
    }
}
