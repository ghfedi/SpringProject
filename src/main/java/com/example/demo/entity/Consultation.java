package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "consultations")
@Getter@Setter
public class Consultation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private LocalDateTime datedebut;
	private LocalDateTime datefin;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "appointment_id", referencedColumnName = "id") 
	private Appointment appointment;
	
	
}
