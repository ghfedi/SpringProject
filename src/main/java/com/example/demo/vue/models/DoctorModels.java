package com.example.demo.vue.models;

import java.util.Date;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DoctorModels {
	
    private String firstName;

    private String lastName;

   
    private String gender;


    private String telephoneNumber;

    private Date dateOfBirth;

    private Date startPracticeDate;


    private String address;

    private String description;

    private String picturePath;

}
