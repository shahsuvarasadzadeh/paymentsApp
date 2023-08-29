package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@Table(name = "paymentsApp")
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String number;
    public StudentModel(String name, String surname, String email,String number){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.number=number;
    }
}