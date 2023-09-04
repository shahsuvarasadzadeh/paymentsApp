package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fileTest")
@NoArgsConstructor
public class FileDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private byte[] data;
    public FileDb(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}