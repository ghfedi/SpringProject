package com.example.demo.models.dto;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.entity.AppointmentType;

import lombok.Data;

@Data
public class AppointmentReservation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 private LocalDateTime date;
	 
	 private long patientId;
	 
	 private long doctorId;
	 
	 private String description;
	 
	 private AppointmentType appointmentType;

}
