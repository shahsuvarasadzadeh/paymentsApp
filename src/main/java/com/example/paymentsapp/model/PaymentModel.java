package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@NoArgsConstructor
@Table(name = "paymentsApp")
@Data
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long amount;
    private LocalDate checkDate;
    private Long monthOfCourse;
    private String course;
    private String cardholder;
    public PaymentModel(Long amount, LocalDate checkDate, Long monthOfCourse, String course, String cardholder) {
        this.amount = amount;
        this.checkDate = checkDate;
        this.monthOfCourse = monthOfCourse;
        this.course = course;
        this.cardholder = cardholder;
    }
}