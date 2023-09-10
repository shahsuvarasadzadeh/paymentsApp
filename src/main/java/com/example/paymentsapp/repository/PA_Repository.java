package com.example.paymentsapp.repository;

import com.example.paymentsapp.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PA_Repository extends JpaRepository<StudentModel,Long> {
    List<StudentModel> findByNumber(String number);
    List<StudentModel> findByNameContaining(String name);
}
