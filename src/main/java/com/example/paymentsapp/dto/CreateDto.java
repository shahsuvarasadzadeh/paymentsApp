package com.example.paymentsapp.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class CreateDto {
    private String name;
    private String surname;
    private String email;
    private String number;
    public CreateDto(String name,String surname,String email,String number){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.number=number;
    }
}