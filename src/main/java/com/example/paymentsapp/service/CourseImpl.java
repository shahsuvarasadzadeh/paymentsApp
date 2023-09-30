package com.example.paymentsapp.service;
import com.example.paymentsapp.dto.CreateCourseDTO;
import com.example.paymentsapp.model.CourseModel;
import com.example.paymentsapp.repository.CourseAndStudentRepository;
import com.example.paymentsapp.repository.CourseRepository;
import com.example.paymentsapp.repository.PA_Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseImpl implements CourseInter {
    private final CourseRepository courseRepository;
    private final PA_Repository students;
    private final CourseAndStudentRepository courseAndStudentRepository;
    public CourseImpl(CourseRepository courseRepository, PA_Repository students, CourseAndStudentRepository courseAndStudentRepository) {
        this.courseRepository = courseRepository;
        this.students = students;
        this.courseAndStudentRepository = courseAndStudentRepository;
    }
    @Override
    public CourseModel createCourse(CreateCourseDTO courseDTO) {

        return courseRepository.save(new CourseModel(courseDTO.getName(), 0L));
    }
    @Override
    public List<CourseModel> allCourse() {
        return courseRepository.findAll();
    }
    @Override
    public CourseModel updateCourse(Long id, CreateCourseDTO courseDTO) {
        CourseModel courseModel = courseRepository.findById(id).orElseThrow();
        courseModel.setName(courseDTO.getName());
        return courseRepository.save(courseModel);
    }

    @Override
    public CourseModel searchByName(String name) {
        return courseRepository.findByName(name);
    }
}