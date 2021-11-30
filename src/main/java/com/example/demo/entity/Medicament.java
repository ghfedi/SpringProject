package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "medicaments")
@Getter@Setter
public class Medicament {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String nom_medicament;
	private String dci;
	
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    private Set<Prescription> prescriptions;
	 

}
