package com.example.paymentsapp.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PaymentDTO {
    private Long id;
    private Long amount;
    private LocalDate checkDate;
    private Long monthOfCourse;
    private String course;
    private String student;
    private String cardholder;
}