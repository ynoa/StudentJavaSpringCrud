package com.example.StudentCrud.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long studentId;


    private String firstname;


    private String lastname;

    @Column(name = "email_address",unique = true, nullable = false)
    private String email;

}
