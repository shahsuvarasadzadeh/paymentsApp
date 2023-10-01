package com.example.paymentsapp.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Course_TB")
public class EnterTheCost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String amount;
    private Date date;
    private String name;
    private String cardholder;

}
