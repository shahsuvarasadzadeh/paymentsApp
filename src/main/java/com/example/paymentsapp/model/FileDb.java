package com.example.paymentsapp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Table(name = "fileTest")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class FileDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private byte[] data;
//    @OneToMany(targetEntity = CourseModel.class,cascade = CascadeType.ALL)
//    @JoinColumn(name ="cm_fk",referencedColumnName = "id")
//    private List<CourseModel> courseModel;
    public FileDb(String name,String type,byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}