package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "prescriptions")
@Getter@Setter
public class Prescription {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String dosage;


}
