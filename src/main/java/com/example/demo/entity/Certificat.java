package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "certificats")
@Getter@Setter
public class Certificat {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String description;
	
	 @ManyToOne
	    @JoinColumn(name = "consultation_id")
	    private Consultation consultation_certificat;

}
