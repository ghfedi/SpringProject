package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Set;

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

	 @ManyToOne
	    @JoinColumn(name = "consultation_id")
	    private Consultation consultation_ordannance;
	 
	 @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;
	 @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor;
	 
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    private Set<Prescription> prescriptions;
	 

}
