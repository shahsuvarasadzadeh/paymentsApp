package com.example.paymentsapp.service;
import com.example.paymentsapp.model.CourseAndStudents;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.repository.CourseAndStudentRepository;
import com.example.paymentsapp.repository.CourseRepository;
import com.example.paymentsapp.repository.PA_Repository;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
@Service
public class CourseAndStudentImpl implements CourseAndStudentInter {
    private final CourseRepository courseRepository;
    private final PA_Repository paRepository;
    private final CourseAndStudentRepository courseAndStudentRepository;
    public CourseAndStudentImpl(CourseRepository courseRepository, PA_Repository paRepository, CourseAndStudentRepository courseAndStudentRepository) {
        this.courseRepository = courseRepository;
        this.paRepository = paRepository;
        this.courseAndStudentRepository = courseAndStudentRepository;
    }

    @Override
    public CourseAndStudents saveCourseAndStudent(Long studentId, Long courseId) {
        List<CourseAndStudents> courseName = courseAndStudentRepository.findAllByCourseName(courseRepository.findById(courseId).orElseThrow().getName());
        List<Long> studentsId = courseName.stream().map(CourseAndStudents::getStudentId).collect(Collectors.toList());
        Long sum = 0L;
        if (!studentsId.contains(studentId)) {
            for (int i = 0; i < studentsId.size(); i++) {
                sum = sum + 1;
            }
            updateStudentCount(courseId, sum);
            return courseAndStudentRepository.save(new CourseAndStudents(paRepository
                    .findById(studentId).orElseThrow().getId(), courseRepository.findById(courseId).orElseThrow().getId(),
                    courseRepository.findById(courseId).orElseThrow().getName()));

        } else {
            return null;
        }
    }
    @Override
    public void deleteById(Long id) {
        courseAndStudentRepository.deleteById(courseAndStudentRepository.findById(id).orElseThrow().getId());
    }
    @Override
    public List<CourseAndStudents> allCourseAndStudents() {
        return courseAndStudentRepository.findAll();
    }
    @Override
    public CourseModel updateStudentCount(Long id, Long sum) {
        CourseModel courseModel = courseRepository.findById(id).orElseThrow();
        courseModel.setStudentCount(sum);
        return courseRepository.save(courseModel);
    }
}