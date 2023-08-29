package com.example.paymentsapp.service;

import com.example.paymentsapp.dto.CreateDto;
import com.example.paymentsapp.dto.UpdateDTO;
import com.example.paymentsapp.model.StudentModel;

import java.util.List;
import java.util.Set;

public interface PA_Interface {
    StudentModel createUser(CreateDto user);

    Set<StudentModel> getAllUsers();

    StudentModel updateStudent(UpdateDTO updateDTO, Long id);

    Set<StudentModel> getUserByNumber(String number);
}
