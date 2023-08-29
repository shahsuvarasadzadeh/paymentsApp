package com.example.paymentsapp.controller;

import com.example.paymentsapp.dto.CreateDto;
import com.example.paymentsapp.dto.UpdateDTO;
import com.example.paymentsapp.model.StudentModel;
import com.example.paymentsapp.service.PA_Interface;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/api")
public class PaymentsApp {
    private final PA_Interface paInterface;
    public PaymentsApp(PA_Interface paInterface) {
        this.paInterface = paInterface;
    }
    @PostMapping(path = "/create")
    public StudentModel creatUser(@RequestBody CreateDto user){
        return paInterface.createUser(user);
    }
    @GetMapping(path = "allStudents")
    public Set<StudentModel> allUsers(){
        return paInterface.getAllUsers();
    }
    @PutMapping(path = "/update/{id}")
    public StudentModel updateStudent(@RequestBody UpdateDTO updateDTO,@PathVariable Long id){
        return paInterface.updateStudent(updateDTO,id);
    }
    @GetMapping(path = "/searchByNumber/{number}")
    public Set<StudentModel> searchByNumber(@PathVariable String number){
        return paInterface.getUserByNumber(number);
    }
}
