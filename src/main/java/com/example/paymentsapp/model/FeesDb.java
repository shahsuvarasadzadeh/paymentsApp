package com.example.paymentsapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
public class FeesDb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CostValue;
    private Date date;
    private String feeName;
    private String cardOwner;
    @OneToOne
    @JoinColumn(name = "file_id")
    private FileDb image;

    public FeesDb() {
    }

    public FeesDb(String costValue, Date date, String feeName, String cardOwner, FileDb image) {
        CostValue = costValue;
        this.date = date;
        this.feeName = feeName;
        this.cardOwner = cardOwner;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCostValue() {
        return CostValue;
    }

    public void setCostValue(String costValue) {
        CostValue = costValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public FileDb getImage() {
        return image;
    }

    public void setImage(FileDb image) {
        this.image = image;
    }

}
