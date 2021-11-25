package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ordonnances")
@Getter@Setter
public class Ordonnance {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String prescription;
	private String medicament;
	 @ManyToOne
	    @JoinColumn(name = "consultation_id")
	    private Consultation consultation_ordannance;
	 
	 @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;

}
