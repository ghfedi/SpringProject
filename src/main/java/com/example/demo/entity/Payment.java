package com.example.demo.entity;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Payment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	 	@Enumerated(value = EnumType.STRING)
	    private CardType cardType;
	 	
	 	private int numero;
	 	private int cvv;
	 	private Date dateexpiration;
	 	
	 	@ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;
}
