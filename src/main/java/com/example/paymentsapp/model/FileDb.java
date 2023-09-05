package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "test1")
@Data
public class FileDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    @Lob
    @Column(name = "data", columnDefinition = "LONGBLOB") // butun problem bu balacadaymis
    private byte[] data;
    @OneToOne(mappedBy = "image",cascade = CascadeType.ALL)
    private FeesDb fee;
    public FileDb() {
    }
    public FileDb(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public byte[] getData() {
        return data;
    }
    public void setData(byte[] data) {
        this.data = data;
    }

    public FeesDb getFee() {
        return fee;
    }

    public void setFee(FeesDb fee) {
        this.fee = fee;
    }
}