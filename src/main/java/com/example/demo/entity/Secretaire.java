package com.example.demo.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="secretaire")
@Data
public class Secretaire extends User{

	 
	 	private String firstName;

	    private String lastName;

	    
	    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "secretaire")
	    private Set<Doctor> doctor;
	    
	    public Secretaire() {}

}
